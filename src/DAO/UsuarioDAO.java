package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ph757
 */
public class UsuarioDAO {

   Connection conexao;
   PreparedStatement pstm;
   ResultSet rs;
   ArrayList<UsuarioDTO> lista = new ArrayList<>();

   public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
      conexao = ConexaoDAO.conector();

      try {
         String sql = "select * from usuario where login =? and senha =?";
         pstm = conexao.prepareStatement(sql);
         pstm.setString(1, objUsuarioDTO.getLogin());
         pstm.setString(2, objUsuarioDTO.getSenha());
         rs = pstm.executeQuery();
         return rs;

      } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Classe UsuarioDao: " + e);
         return null;
      }
   }

   public void cadastrarUsuario(UsuarioDTO objUsuarioDTO) {
      try {
         String sql = "insert into usuario (nome, login, senha, fone, nivel_acesso) values (?,?,?,?,?)";

         conexao = ConexaoDAO.conector();
         pstm = conexao.prepareStatement(sql);
         pstm.setString(1, objUsuarioDTO.getNome());
         pstm.setString(2, objUsuarioDTO.getLogin());
         pstm.setString(3, objUsuarioDTO.getSenha());
         pstm.setString(4, objUsuarioDTO.getFone());
         pstm.setString(5, objUsuarioDTO.getNivelDeAcesso());

         pstm.execute();
         pstm.close();

      } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "UsuariDAO Metodo Cadastrar: " + e);
      }
   }
}
