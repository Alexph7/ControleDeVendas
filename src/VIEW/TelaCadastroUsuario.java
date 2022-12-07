/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import java.awt.Color;

/**
 *
 * @author ph757
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    int xMouse, yMouse;
    Menu objMenu = new Menu();

    /**
     * Creates new form TelaCadastroUsuario
     */
    public TelaCadastroUsuario() {
        initComponents();
        panCombobox.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize
     * the form. WARNING: Do NOT modify this code. The content of this
     * method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroUsuario = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblFone = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        sepFone = new javax.swing.JSeparator();
        sepNome = new javax.swing.JSeparator();
        sepLogin = new javax.swing.JSeparator();
        panCombobox = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAdmin = new javax.swing.JLabel();
        lblAdmin1 = new javax.swing.JLabel();
        lblBarraSuperior = new javax.swing.JLabel();
        txtIdCadUser = new javax.swing.JTextField();
        txtNomeCadUser = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblNivelAcess = new javax.swing.JLabel();
        txtSenhaCadUser = new javax.swing.JTextField();
        lblCampoObrig = new javax.swing.JLabel();
        txtLoginCadUser = new javax.swing.JTextField();
        txtFoneCadUser = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadUser = new javax.swing.JTable();
        sepSenha = new javax.swing.JSeparator();
        SepSenha = new javax.swing.JSeparator();
        SepFone = new javax.swing.JSeparator();
        SepLogin = new javax.swing.JSeparator();
        sepSenha1 = new javax.swing.JSeparator();
        CmbNivelAcesso = new javax.swing.JLabel();
        setaCombobox = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JLabel();
        btnCadastroClose = new javax.swing.JLabel();
        lblBarraTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Usuarios");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(760, 450));
        setName("frameTelaCadastroUsuario"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        panelCadastroUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelCadastroUsuario.setMinimumSize(new java.awt.Dimension(760, 450));
        panelCadastroUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLateral.setBackground(new java.awt.Color(0, 204, 204));
        panelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("*Nome");
        panelLateral.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 60, 30));

        lblFone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblFone.setText("Fone");
        panelLateral.add(lblFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 50, 30));

        lblLogin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("*Login");
        panelLateral.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 60, 30));

        sepFone.setBackground(new java.awt.Color(255, 255, 255));
        sepFone.setForeground(new java.awt.Color(255, 255, 255));
        panelLateral.add(sepFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, 20));

        sepNome.setBackground(new java.awt.Color(255, 255, 255));
        sepNome.setForeground(new java.awt.Color(255, 255, 255));
        panelLateral.add(sepNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 20));

        sepLogin.setBackground(new java.awt.Color(255, 255, 255));
        sepLogin.setForeground(new java.awt.Color(255, 255, 255));
        panelLateral.add(sepLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 157, 100, -1));

        panelCadastroUsuario.add(panelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 450));

        panCombobox.setBackground(new java.awt.Color(255, 255, 255));
        panCombobox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), null));
        panCombobox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jSeparator1.setOpaque(true);
        panCombobox.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 0));

        lblAdmin.setBackground(new java.awt.Color(153, 255, 204));
        lblAdmin.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblAdmin.setText("User");
        lblAdmin.setOpaque(true);
        panCombobox.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 30));

        lblAdmin1.setBackground(new java.awt.Color(153, 255, 204));
        lblAdmin1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lblAdmin1.setText("Admin");
        lblAdmin1.setFocusable(false);
        lblAdmin1.setOpaque(true);
        panCombobox.add(lblAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        panelCadastroUsuario.add(panCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 140, 62));

        lblBarraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        lblBarraSuperior.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        lblBarraSuperior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBarraSuperiorMouseDragged(evt);
            }
        });
        lblBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBarraSuperiorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBarraSuperiorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBarraSuperiorMousePressed(evt);
            }
        });
        panelCadastroUsuario.add(lblBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

        txtIdCadUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtIdCadUser.setBorder(null);
        panelCadastroUsuario.add(txtIdCadUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 110, 30));

        txtNomeCadUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNomeCadUser.setBorder(null);
        panelCadastroUsuario.add(txtNomeCadUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 410, 30));

        lblId.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblId.setText("*ID");
        panelCadastroUsuario.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 30, 30));

        lblNivelAcess.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblNivelAcess.setText("*Nível Acesso");
        panelCadastroUsuario.add(lblNivelAcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 120, 30));

        txtSenhaCadUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtSenhaCadUser.setBorder(null);
        panelCadastroUsuario.add(txtSenhaCadUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 220, 30));

        lblCampoObrig.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCampoObrig.setText("*Campos Obrigatórios");
        panelCadastroUsuario.add(lblCampoObrig, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        txtLoginCadUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtLoginCadUser.setBorder(null);
        panelCadastroUsuario.add(txtLoginCadUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 260, 30));

        txtFoneCadUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFoneCadUser.setBorder(null);
        panelCadastroUsuario.add(txtFoneCadUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 260, 30));

        lblSenha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblSenha.setText("*Senha");
        panelCadastroUsuario.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 60, 30));

        tblCadUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCadUser.setOpaque(false);
        jScrollPane1.setViewportView(tblCadUser);

        panelCadastroUsuario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 560, 160));
        panelCadastroUsuario.add(sepSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 110, 10));
        panelCadastroUsuario.add(SepSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 410, 10));
        panelCadastroUsuario.add(SepFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 260, 10));
        panelCadastroUsuario.add(SepLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 260, 10));
        panelCadastroUsuario.add(sepSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 220, 10));

        CmbNivelAcesso.setBackground(new java.awt.Color(255, 255, 255));
        CmbNivelAcesso.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        CmbNivelAcesso.setText("Selecione");
        CmbNivelAcesso.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        CmbNivelAcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmbNivelAcessoMouseClicked(evt);
            }
        });
        panelCadastroUsuario.add(CmbNivelAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 140, 30));

        setaCombobox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/acento circuf pra baixo 20.png"))); // NOI18N
        panelCadastroUsuario.add(setaCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 185, 20, 20));

        btnAlterar.setBackground(new java.awt.Color(0, 204, 204));
        btnAlterar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAlterar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlterar.setText("ALTERAR");
        btnAlterar.setOpaque(true);
        panelCadastroUsuario.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 405, 120, 30));

        btnExcluir.setBackground(new java.awt.Color(0, 204, 204));
        btnExcluir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setOpaque(true);
        panelCadastroUsuario.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 405, 120, 30));

        btnAdicionar.setBackground(new java.awt.Color(0, 204, 204));
        btnAdicionar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAdicionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.setOpaque(true);
        panelCadastroUsuario.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 405, 120, 30));

        btnPesquisar.setBackground(new java.awt.Color(0, 204, 204));
        btnPesquisar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.setOpaque(true);
        panelCadastroUsuario.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 405, 120, 30));

        btnCadastroClose.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastroClose.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnCadastroClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCadastroClose.setText("x");
        btnCadastroClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastroCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastroCloseMouseExited(evt);
            }
        });
        panelCadastroUsuario.add(btnCadastroClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 0, 42, 30));

        lblBarraTitulo.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblBarraTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBarraTitulo.setText("Cadastro de Usuários");
        panelCadastroUsuario.add(lblBarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 540, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(760, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CmbNivelAcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmbNivelAcessoMouseClicked
        if (!panCombobox.isVisible()) {
            panCombobox.setVisible(true);
        } else {
            panCombobox.setVisible(false);
        }
    }//GEN-LAST:event_CmbNivelAcessoMouseClicked

    private void lblBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblBarraSuperiorMouseDragged

    private void lblBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblBarraSuperiorMousePressed

    private void lblBarraSuperiorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSuperiorMouseEntered
        objMenu.mouseEntered(lblBarraTitulo, true, 204, 204, 204, 255);
    }//GEN-LAST:event_lblBarraSuperiorMouseEntered

    private void lblBarraSuperiorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraSuperiorMouseExited
        lblBarraTitulo.setBackground(Color.white);
    }//GEN-LAST:event_lblBarraSuperiorMouseExited

    private void btnCadastroCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroCloseMouseEntered
        objMenu.mouseEntered(btnCadastroClose, true, 255, 4, 0, 255);
    }//GEN-LAST:event_btnCadastroCloseMouseEntered

    private void btnCadastroCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroCloseMouseExited
        btnCadastroClose.setBackground(Color.white);
    }//GEN-LAST:event_btnCadastroCloseMouseExited

    private void btnCadastroCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCadastroCloseMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CmbNivelAcesso;
    private javax.swing.JSeparator SepFone;
    private javax.swing.JSeparator SepLogin;
    private javax.swing.JSeparator SepSenha;
    private javax.swing.JLabel btnAdicionar;
    private javax.swing.JLabel btnAlterar;
    private javax.swing.JLabel btnCadastroClose;
    private javax.swing.JLabel btnExcluir;
    private javax.swing.JLabel btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAdmin1;
    private javax.swing.JLabel lblBarraSuperior;
    private javax.swing.JLabel lblBarraTitulo;
    private javax.swing.JLabel lblCampoObrig;
    private javax.swing.JLabel lblFone;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNivelAcess;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel panCombobox;
    private javax.swing.JPanel panelCadastroUsuario;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JSeparator sepFone;
    private javax.swing.JSeparator sepLogin;
    private javax.swing.JSeparator sepNome;
    private javax.swing.JSeparator sepSenha;
    private javax.swing.JSeparator sepSenha1;
    private javax.swing.JLabel setaCombobox;
    private javax.swing.JTable tblCadUser;
    private javax.swing.JTextField txtFoneCadUser;
    private javax.swing.JTextField txtIdCadUser;
    private javax.swing.JTextField txtLoginCadUser;
    private javax.swing.JTextField txtNomeCadUser;
    private javax.swing.JTextField txtSenhaCadUser;
    // End of variables declaration//GEN-END:variables

}
