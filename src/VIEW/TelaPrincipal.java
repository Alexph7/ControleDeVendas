/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.Color;

/**
 *
 * @author ph757
 */
public class TelaPrincipal extends javax.swing.JFrame {

   int xMouse, yMouse;

   /**
    * Creates new form TelaPrincipal
    */
   public TelaPrincipal() {
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

      panPrincipal = new javax.swing.JPanel();
      btnCadastro = new javax.swing.JLabel();
      btnOpcoesSobre = new javax.swing.JLabel();
      lblBarraSup = new javax.swing.JLabel();
      btnOpcoes = new javax.swing.JLabel();
      lblIconUser = new javax.swing.JLabel();
      lblNomeUser = new javax.swing.JLabel();
      btnRelatorios = new javax.swing.JLabel();
      jSeparator1 = new javax.swing.JSeparator();
      jSeparator2 = new javax.swing.JSeparator();
      jSeparator3 = new javax.swing.JSeparator();
      jSeparator4 = new javax.swing.JSeparator();
      btnOpcoesAjuda = new javax.swing.JLabel();
      lblIconFundoAzul = new javax.swing.JLabel();
      panBarraSup = new javax.swing.JPanel();
      panBtnClose = new javax.swing.JPanel();
      BtnClose = new javax.swing.JLabel();
      lblIconLogo = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Tela Principal");
      setBackground(new java.awt.Color(255, 255, 255));
      setUndecorated(true);
      getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      panPrincipal.setBackground(new java.awt.Color(255, 255, 255));
      panPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      btnCadastro.setBackground(new java.awt.Color(153, 153, 153));
      btnCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
      btnCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      btnCadastro.setText("CADASTRO");
      btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btnCadastroMouseExited(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnCadastroMouseEntered(evt);
         }
      });
      panPrincipal.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 60));

      btnOpcoesSobre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
      btnOpcoesSobre.setForeground(new java.awt.Color(255, 255, 255));
      btnOpcoesSobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      btnOpcoesSobre.setText("SOBRE");
      btnOpcoesSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnOpcoesSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      btnOpcoesSobre.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btnOpcoesSobreMouseExited(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnOpcoesSobreMouseEntered(evt);
         }
      });
      panPrincipal.add(btnOpcoesSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 352, 240, 30));

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
      panPrincipal.add(lblBarraSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

      btnOpcoes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      btnOpcoes.setForeground(new java.awt.Color(255, 255, 255));
      btnOpcoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      btnOpcoes.setText("OPÇÕES");
      btnOpcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btnOpcoesMouseExited(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnOpcoesMouseEntered(evt);
         }
      });
      panPrincipal.add(btnOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 60));

      lblIconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icon user Azul.png"))); // NOI18N
      panPrincipal.add(lblIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 240, 80));

      lblNomeUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
      lblNomeUser.setForeground(new java.awt.Color(255, 255, 255));
      lblNomeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblNomeUser.setText("Usuário");
      panPrincipal.add(lblNomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 240, -1));

      btnRelatorios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      btnRelatorios.setForeground(new java.awt.Color(255, 255, 255));
      btnRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      btnRelatorios.setText("RELATÓRIOS");
      btnRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btnRelatoriosMouseExited(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnRelatoriosMouseEntered(evt);
         }
      });
      panPrincipal.add(btnRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 60));

      jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
      panPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 10));

      jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
      panPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, 10));

      jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
      panPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 180, 10));

      jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
      panPrincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 381, 80, 10));

      btnOpcoesAjuda.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
      btnOpcoesAjuda.setForeground(new java.awt.Color(255, 255, 255));
      btnOpcoesAjuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      btnOpcoesAjuda.setText("AJUDA");
      btnOpcoesAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      btnOpcoesAjuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      btnOpcoesAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btnOpcoesAjudaMouseExited(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnOpcoesAjudaMouseEntered(evt);
         }
      });
      panPrincipal.add(btnOpcoesAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 382, 240, 30));

      lblIconFundoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/fundo1.jpg"))); // NOI18N
      lblIconFundoAzul.setText("jLabel3");
      panPrincipal.add(lblIconFundoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 450));

      panBarraSup.setBackground(new java.awt.Color(255, 255, 255));
      panPrincipal.add(panBarraSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 480, 30));

      panBtnClose.setBackground(new java.awt.Color(255, 255, 255));
      panBtnClose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      BtnClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      BtnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      BtnClose.setText("x");
      BtnClose.setVerticalAlignment(javax.swing.SwingConstants.TOP);
      BtnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      BtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            BtnCloseMouseClicked(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            BtnCloseMouseExited(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            BtnCloseMouseEntered(evt);
         }
      });
      panBtnClose.add(BtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

      panPrincipal.add(panBtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 40, 30));

      lblIconLogo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
      lblIconLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblIconLogo.setText("LOGO");
      lblIconLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
      panPrincipal.add(lblIconLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 340, 310));

      getContentPane().add(panPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

      setSize(new java.awt.Dimension(760, 450));
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void lblBarraSupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSupMousePressed
      xMouse = evt.getX();
      yMouse = evt.getY();
   }//GEN-LAST:event_lblBarraSupMousePressed

   private void lblBarraSupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSupMouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x - xMouse, y - yMouse);
   }//GEN-LAST:event_lblBarraSupMouseDragged

   private void BtnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseClicked
      System.exit(0);
   }//GEN-LAST:event_BtnCloseMouseClicked

   private void BtnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseEntered
      panBtnClose.setBackground(Color.red);
   }//GEN-LAST:event_BtnCloseMouseEntered

   private void BtnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseExited
      panBtnClose.setBackground(Color.white);
   }//GEN-LAST:event_BtnCloseMouseExited

   private void lblBarraSupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSupMouseEntered
      panBarraSup.setBackground(new Color(204, 204, 204));
   }//GEN-LAST:event_lblBarraSupMouseEntered

   private void lblBarraSupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSupMouseExited
      panBarraSup.setBackground(Color.white);
   }//GEN-LAST:event_lblBarraSupMouseExited

   private void btnCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseEntered
      btnCadastro.setOpaque(true);
      btnCadastro.setBackground(new Color(7, 37, 156, 120));
      repaint();
   }//GEN-LAST:event_btnCadastroMouseEntered

   private void btnCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseExited
      btnCadastro.setOpaque(false);
      btnCadastro.setBackground(new Color(0, 0, 0, 1));
   }//GEN-LAST:event_btnCadastroMouseExited

   private void btnRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseEntered

      btnRelatorios.setOpaque(true);
      btnRelatorios.setBackground(new Color(7, 37, 156, 120));
      repaint();
   }//GEN-LAST:event_btnRelatoriosMouseEntered

   private void btnRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatoriosMouseExited
      btnRelatorios.setOpaque(false);
      btnRelatorios.setBackground(new Color(0, 0, 0, 1));
   }//GEN-LAST:event_btnRelatoriosMouseExited

   private void btnOpcoesSobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcoesSobreMouseEntered
      btnOpcoesSobre.setOpaque(true);
      btnOpcoesSobre.setBackground(new Color(7, 37, 156, 120));
      repaint();
   }//GEN-LAST:event_btnOpcoesSobreMouseEntered

   private void btnOpcoesSobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcoesSobreMouseExited
      btnOpcoesSobre.setOpaque(false);
      btnOpcoesSobre.setBackground(new Color(0, 0, 0, 1));
   }//GEN-LAST:event_btnOpcoesSobreMouseExited

   private void btnOpcoesAjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcoesAjudaMouseEntered
      btnOpcoesAjuda.setOpaque(true);
      btnOpcoesAjuda.setBackground(new Color(7, 37, 156, 120));
      repaint();
   }//GEN-LAST:event_btnOpcoesAjudaMouseEntered

   private void btnOpcoesAjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcoesAjudaMouseExited
      btnOpcoesAjuda.setOpaque(false);
      btnOpcoesAjuda.setBackground(new Color(0, 0, 0, 1));
   }//GEN-LAST:event_btnOpcoesAjudaMouseExited

   private void btnOpcoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcoesMouseEntered
      btnOpcoes.setOpaque(true);
      btnOpcoes.setBackground(new Color(7, 37, 156, 120));
      repaint();
   }//GEN-LAST:event_btnOpcoesMouseEntered

   private void btnOpcoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcoesMouseExited
      btnOpcoes.setOpaque(false);
      btnOpcoes.setBackground(new Color(0, 0, 0, 1));
   }//GEN-LAST:event_btnOpcoesMouseExited

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
         java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {

         public void run() {
            new TelaPrincipal().setVisible(true);
         }

      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel BtnClose;
   private javax.swing.JLabel btnCadastro;
   private javax.swing.JLabel btnOpcoes;
   private javax.swing.JLabel btnOpcoesAjuda;
   private javax.swing.JLabel btnOpcoesSobre;
   private javax.swing.JLabel btnRelatorios;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JSeparator jSeparator3;
   private javax.swing.JSeparator jSeparator4;
   private javax.swing.JLabel lblBarraSup;
   private javax.swing.JLabel lblIconFundoAzul;
   private javax.swing.JLabel lblIconLogo;
   private javax.swing.JLabel lblIconUser;
   private javax.swing.JLabel lblNomeUser;
   private javax.swing.JPanel panBarraSup;
   private javax.swing.JPanel panBtnClose;
   private javax.swing.JPanel panPrincipal;
   // End of variables declaration//GEN-END:variables
}
