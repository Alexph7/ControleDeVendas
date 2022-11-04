package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ph757
 */
public class FrmLoginUsuario extends javax.swing.JFrame {

   /**
    * Creates new form TelaLogin
    */
   public FrmLoginUsuario() {
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      txtLogUsuario = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      txtLogSenha = new javax.swing.JPasswordField();
      jLabel3 = new javax.swing.JLabel();
      btnLogEntrar = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("LOGIN");
      setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      setName("LOGIN"); // NOI18N
      setResizable(false);

      jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      jLabel1.setText("Usuário");

      txtLogUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
      txtLogUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            txtLogUsuarioKeyPressed(evt);
         }
      });

      jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      jLabel2.setText("Senha");

      txtLogSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      txtLogSenha.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            txtLogSenhaKeyPressed(evt);
         }
      });

      jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
      jLabel3.setText("Água Mineral");

      btnLogEntrar.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
      btnLogEntrar.setText("Entrar");
      btnLogEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnLogEntrar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLogEntrarActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(161, Short.MAX_VALUE)
            .addComponent(jLabel3)
            .addGap(103, 103, 103))
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(35, 35, 35)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jLabel1)
                     .addComponent(jLabel2))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(txtLogSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                     .addComponent(txtLogUsuario)))
               .addGroup(layout.createSequentialGroup()
                  .addGap(122, 122, 122)
                  .addComponent(btnLogEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtLogUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel1))
            .addGap(21, 21, 21)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtLogSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addComponent(btnLogEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(18, Short.MAX_VALUE))
      );

      setSize(new java.awt.Dimension(413, 237));
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

    private void btnLogEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogEntrarActionPerformed
      logar();
    }//GEN-LAST:event_btnLogEntrarActionPerformed

   private void txtLogSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLogSenhaKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         logar();
      }
   }//GEN-LAST:event_txtLogSenhaKeyPressed

   private void txtLogUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLogUsuarioKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         txtLogSenha.requestFocus();
      }
   }//GEN-LAST:event_txtLogUsuarioKeyPressed

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(FrmLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(FrmLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(FrmLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(FrmLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new FrmLoginUsuario().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnLogEntrar;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JPasswordField txtLogSenha;
   private javax.swing.JTextField txtLogUsuario;
   // End of variables declaration//GEN-END:variables

   private void logar() {
      try {
         String login, senha;

         login = txtLogUsuario.getText();
         senha = new String(txtLogSenha.getPassword());

         UsuarioDTO objUsuarioDto = new UsuarioDTO();
         objUsuarioDto.setLogin(login);
         objUsuarioDto.setSenha(senha);
         UsuarioDAO objUsuarioDao = new UsuarioDAO();
         ResultSet rsUsuarioDao = objUsuarioDao.autenticacaoUsuario(objUsuarioDto);

         if (rsUsuarioDao.next()) {
            String perfil = rsUsuarioDao.getString(4);
            FrmTelaPrincipal telaPrincipal = new FrmTelaPrincipal();

            if (perfil.equals("Administrador")) {
               telaPrincipal.setVisible(true);
               dispose();
            } else {
               telaPrincipal.setVisible(true);
               dispose();
            }
         } else {
            JOptionPane.showMessageDialog(null, "UsuÃ¡rio ou Senha Incorreto");
         }
      } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "VIEW/btnLoginEntrar: " + e);
      }
   }
}