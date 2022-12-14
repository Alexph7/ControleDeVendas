/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ph757
 */
public class TelaLogin extends javax.swing.JFrame {

   int xMouse, yMouse;
   String mensagemUser = "Digite o Nome do Usuário";

   /**
    * Creates new form TelaLogin
    */
   public TelaLogin() {
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

      pnFundo = new javax.swing.JPanel();
      lblBarraSup = new javax.swing.JLabel();
      lblNomeEmpresa = new javax.swing.JLabel();
      lblIconUser = new javax.swing.JLabel();
      lblIniciarSessao = new javax.swing.JLabel();
      lblFundoAzul = new javax.swing.JLabel();
      panBtnClose = new javax.swing.JPanel();
      btnClose = new javax.swing.JLabel();
      txtLogin = new javax.swing.JTextField();
      sepUsuario = new javax.swing.JSeparator();
      lblUsuario = new javax.swing.JLabel();
      lblSenha = new javax.swing.JLabel();
      sepSenha = new javax.swing.JSeparator();
      lblBemVindo = new javax.swing.JLabel();
      txtSenha = new javax.swing.JPasswordField();
      panBtnLogar = new javax.swing.JPanel();
      btnLogin = new javax.swing.JLabel();
      sepBemVindo = new javax.swing.JSeparator();
      panBarraSup = new javax.swing.JPanel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setUndecorated(true);
      setResizable(false);
      getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      pnFundo.setBackground(new java.awt.Color(255, 255, 255));
      pnFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      lblBarraSup.setBackground(new java.awt.Color(255, 255, 255));
      lblBarraSup.setToolTipText("Arrastar Janela");
      lblBarraSup.setMaximumSize(new java.awt.Dimension(100, 100));
      lblBarraSup.setMinimumSize(new java.awt.Dimension(100, 100));
      lblBarraSup.setPreferredSize(new java.awt.Dimension(100, 100));
      lblBarraSup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
         public void mouseDragged(java.awt.event.MouseEvent evt) {
            lblBarraSupMouseDragged(evt);
         }
      });
      lblBarraSup.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            lblBarraSupMousePressed(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            lblBarraSupMouseExited(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            lblBarraSupMouseEntered(evt);
         }
      });
      pnFundo.add(lblBarraSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

      lblNomeEmpresa.setBackground(new java.awt.Color(255, 255, 255));
      lblNomeEmpresa.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
      lblNomeEmpresa.setForeground(new java.awt.Color(255, 255, 255));
      lblNomeEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblNomeEmpresa.setText("EMPRESA X7");
      pnFundo.add(lblNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 30));

      lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/user2.png"))); // NOI18N
      pnFundo.add(lblIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

      lblIniciarSessao.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
      lblIniciarSessao.setForeground(new java.awt.Color(255, 255, 255));
      lblIniciarSessao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblIniciarSessao.setText("Iniciar Sessão");
      pnFundo.add(lblIniciarSessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 170, 50));

      lblFundoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/fundo1.jpg"))); // NOI18N
      pnFundo.add(lblFundoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 380));

      panBtnClose.setBackground(new java.awt.Color(255, 255, 255));
      panBtnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

      btnClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      btnClose.setText("x");
      btnClose.setToolTipText("Fechar");
      btnClose.setVerticalAlignment(javax.swing.SwingConstants.TOP);
      btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            btnCloseMouseClicked(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btnCloseMouseExited(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnCloseMouseEntered(evt);
         }
      });

      javax.swing.GroupLayout panBtnCloseLayout = new javax.swing.GroupLayout(panBtnClose);
      panBtnClose.setLayout(panBtnCloseLayout);
      panBtnCloseLayout.setHorizontalGroup(
         panBtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnCloseLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
      panBtnCloseLayout.setVerticalGroup(
         panBtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnCloseLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      pnFundo.add(panBtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 40, 30));

      txtLogin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
      txtLogin.setBorder(null);
      txtLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
      txtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            txtLoginFocusGained(evt);
         }
      });
      txtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            txtLoginMousePressed(evt);
         }
      });
      txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            txtLoginKeyPressed(evt);
         }
      });
      pnFundo.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 350, 30));
      pnFundo.add(sepUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 350, 30));

      lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      lblUsuario.setText("USUÁRIO");
      pnFundo.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

      lblSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      lblSenha.setText("SENHA");
      pnFundo.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));
      pnFundo.add(sepSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 350, 30));

      lblBemVindo.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
      lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblBemVindo.setText("BEM-VINDO");
      pnFundo.add(lblBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 420, -1));

      txtSenha.setForeground(new java.awt.Color(153, 153, 153));
      txtSenha.setText("Field");
      txtSenha.setBorder(null);
      txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            txtSenhaFocusGained(evt);
         }
      });
      txtSenha.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mousePressed(java.awt.event.MouseEvent evt) {
            txtSenhaMousePressed(evt);
         }
      });
      txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            txtSenhaKeyPressed(evt);
         }
      });
      pnFundo.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 350, 30));

      panBtnLogar.setBackground(new java.awt.Color(9, 22, 39));

      btnLogin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
      btnLogin.setForeground(new java.awt.Color(255, 255, 255));
      btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      btnLogin.setText("Entrar");
      btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            btnLoginMouseClicked(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btnLoginMouseExited(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnLoginMouseEntered(evt);
         }
      });

      javax.swing.GroupLayout panBtnLogarLayout = new javax.swing.GroupLayout(panBtnLogar);
      panBtnLogar.setLayout(panBtnLogarLayout);
      panBtnLogarLayout.setHorizontalGroup(
         panBtnLogarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnLogarLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
      panBtnLogarLayout.setVerticalGroup(
         panBtnLogarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBtnLogarLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      pnFundo.add(panBtnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 130, 40));
      pnFundo.add(sepBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 180, 20));

      panBarraSup.setBackground(new java.awt.Color(255, 255, 255));

      javax.swing.GroupLayout panBarraSupLayout = new javax.swing.GroupLayout(panBarraSup);
      panBarraSup.setLayout(panBarraSupLayout);
      panBarraSupLayout.setHorizontalGroup(
         panBarraSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 380, Short.MAX_VALUE)
      );
      panBarraSupLayout.setVerticalGroup(
         panBarraSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 30, Short.MAX_VALUE)
      );

      pnFundo.add(panBarraSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 380, 30));

      getContentPane().add(pnFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

      setSize(new java.awt.Dimension(682, 381));
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
      //Quando o Mouse Entrar Na área de um componente
      //neste caso quando entrar na area do x para fechar a janela o label ficara vermelho
      panBtnClose.setBackground(Color.red);
   }//GEN-LAST:event_btnCloseMouseEntered

   private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
      //Disparado quando o mouse sai da área de um componente.
      panBtnClose.setBackground(Color.white);
   }//GEN-LAST:event_btnCloseMouseExited

   private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
      //Disparado quando o botão do mouse é clicado (pressionado e liberado) em um componente.
      System.exit(0);
   }//GEN-LAST:event_btnCloseMouseClicked

   private void lblBarraSupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSupMousePressed
      xMouse = evt.getX();
      yMouse = evt.getY();
   }//GEN-LAST:event_lblBarraSupMousePressed

   private void lblBarraSupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSupMouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x - xMouse, y - yMouse);
   }//GEN-LAST:event_lblBarraSupMouseDragged

   private void lblBarraSupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSupMouseEntered

      panBarraSup.setBackground(new Color(204, 204, 204));
   }//GEN-LAST:event_lblBarraSupMouseEntered

   private void lblBarraSupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSupMouseExited
      panBarraSup.setBackground(new Color(255, 255, 255));
   }//GEN-LAST:event_lblBarraSupMouseExited

   private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
      panBtnLogar.setBackground(new Color(39, 54, 86));
   }//GEN-LAST:event_btnLoginMouseEntered

   private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
      panBtnLogar.setBackground(new Color(9, 22, 39));
   }//GEN-LAST:event_btnLoginMouseExited

   private void txtSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMousePressed
      if (txtLogin.getText().isEmpty()) {
         txtLogin.setText(mensagemUser);
         txtLogin.setForeground(new Color(153, 153, 153));
      }
      txtSenha.setText(null);
      txtSenha.setForeground(new Color(0, 0, 0));
   }//GEN-LAST:event_txtSenhaMousePressed

   private void txtLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginMousePressed
      if (txtLogin.getText().equals(mensagemUser)) {
         txtLogin.setText(null);
      }

      if (String.valueOf(txtSenha.getPassword()).isEmpty()) {
         txtSenha.setText("*****");
         txtSenha.setForeground(new Color(153, 153, 153));
      }
   }//GEN-LAST:event_txtLoginMousePressed

   private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
      logar();
   }//GEN-LAST:event_btnLoginMouseClicked

   private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
      //Quando o Componente Ganha Foco
      if (txtLogin.getText().isEmpty()) {
         txtLogin.setText(mensagemUser);
         txtLogin.setForeground(new Color(153, 153, 153));
      }
      txtSenha.setText(null);
      txtSenha.setForeground(new Color(0, 0, 0));
   }//GEN-LAST:event_txtSenhaFocusGained

   private void txtLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginFocusGained
      if (txtLogin.getText().equals(mensagemUser)) {
         txtLogin.setText(null);
      }

      if (String.valueOf(txtSenha.getPassword()).isEmpty()) {
         txtSenha.setText("*****");
         txtSenha.setForeground(new Color(153, 153, 153));
      }
   }//GEN-LAST:event_txtLoginFocusGained

   private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         txtSenha.requestFocus();
      }
   }//GEN-LAST:event_txtLoginKeyPressed

   private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
         logar();
      }
   }//GEN-LAST:event_txtSenhaKeyPressed

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
         java.util.logging.Logger.getLogger(TelaLogin.class
               .getName()).log(java.util.logging.Level.SEVERE, null, ex);

      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(TelaLogin.class
               .getName()).log(java.util.logging.Level.SEVERE, null, ex);

      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(TelaLogin.class
               .getName()).log(java.util.logging.Level.SEVERE, null, ex);

      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(TelaLogin.class
               .getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {

         public void run() {
            new TelaLogin().setVisible(true);
         }

      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel btnClose;
   private javax.swing.JLabel btnLogin;
   private javax.swing.JLabel lblBarraSup;
   private javax.swing.JLabel lblBemVindo;
   private javax.swing.JLabel lblFundoAzul;
   private javax.swing.JLabel lblIconUser;
   private javax.swing.JLabel lblIniciarSessao;
   private javax.swing.JLabel lblNomeEmpresa;
   private javax.swing.JLabel lblSenha;
   private javax.swing.JLabel lblUsuario;
   private javax.swing.JPanel panBarraSup;
   private javax.swing.JPanel panBtnClose;
   private javax.swing.JPanel panBtnLogar;
   private javax.swing.JPanel pnFundo;
   private javax.swing.JSeparator sepBemVindo;
   private javax.swing.JSeparator sepSenha;
   private javax.swing.JSeparator sepUsuario;
   private javax.swing.JTextField txtLogin;
   private javax.swing.JPasswordField txtSenha;
   // End of variables declaration//GEN-END:variables

   private void logar() {
      try {
         String login, senha;

         login = txtLogin.getText();
         senha = new String(txtSenha.getPassword());

         UsuarioDTO objUsuarioDto = new UsuarioDTO();
         objUsuarioDto.setLogin(login);
         objUsuarioDto.setSenha(senha);
         UsuarioDAO objUsuarioDao = new UsuarioDAO();
         ResultSet rsUsuarioDao = objUsuarioDao.autenticacaoUsuario(objUsuarioDto);

         if (rsUsuarioDao.next()) {
            String perfil = rsUsuarioDao.getString(4);
            TelaPrincipal telaPrincipal = new TelaPrincipal();

            if (perfil.equals("Administrador")) {
               telaPrincipal.setVisible(true);
               dispose();
            } else {
               telaPrincipal.setVisible(true);
               dispose();
            }
         } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreto");
         }
      } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "VIEW/TelaLogin: " + e);
      }
   }

}
