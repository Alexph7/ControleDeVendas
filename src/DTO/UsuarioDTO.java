package DTO;

/**
 *
 * @author ph757
 */
public class UsuarioDTO {

   private String nome, login, senha, fone, nivelDeAcesso;
   private int idUser;

   public int getIdUser() {
      return idUser;
   }

   public void setIdUser(int idUser) {
      this.idUser = idUser;
   }

   public String getFone() {
      return fone;
   }

   public void setFone(String fone) {
      this.fone = fone;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

   public String getNivelDeAcesso() {
      return nivelDeAcesso;
   }

   public void setNivelDeAcesso(String nivelDeAcesso) {
      this.nivelDeAcesso = nivelDeAcesso;
   }
}
