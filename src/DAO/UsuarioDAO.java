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
}
