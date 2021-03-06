package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import VIEW.LoginUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroUsuario extends javax.swing.JFrame {

    public CadastroUsuario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCadUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        btnCadUsuario = new javax.swing.JButton();
        btnGoLogin = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel9 = new javax.swing.JLabel();
        txtCadUserSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nome de Usuário:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Senha:");

        jLabel7.setText("Já possui uma conta? Faça o Login!");

        panel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("@CopyRight 2020");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(227, 227, 227))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnCadUsuario.setBackground(new java.awt.Color(0, 153, 51));
        btnCadUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadUsuario.setText("CADASTRAR");
        btnCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadUsuarioActionPerformed(evt);
            }
        });

        btnGoLogin.setBackground(new java.awt.Color(51, 102, 255));
        btnGoLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGoLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnGoLogin.setText("LOGIN");
        btnGoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoLoginActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(0, 204, 51));
        panel1.setPreferredSize(new java.awt.Dimension(360, 70));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("JukeTime");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(238, 238, 238))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtCadUserSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadUserSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel4)))
                            .addComponent(txtCadUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(btnCadUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCadUserSenha))))
                .addContainerGap(166, Short.MAX_VALUE))
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadUserSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadUsuarioActionPerformed
        String nome, senha;
        /*CAPTURA O NOME E A SENHA NO CAMPO DE TEXTO.*/
        nome = txtCadUserName.getText();
        senha = txtCadUserSenha.getText();
        
        UsuarioDTO objusuariodto = new UsuarioDTO();
        /*ARMAZENA O NOME E A SENHA NA VARIÁVEL DA CLASSE UsuarioDTO.*/
        objusuariodto.setNome_usuario(nome);
        objusuariodto.setSenha_usuario(senha);
        /*O OBJETO CHAMA O MÉTODO cadastrarUsuario NA CLASSE USUARIODAO.*/
        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.cadastrarUsuario(objusuariodto);
        
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        LoginUsuario form1 = new LoginUsuario();
        form1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadUsuarioActionPerformed

    private void btnGoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoLoginActionPerformed
        LoginUsuario form1 = new LoginUsuario();
        form1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGoLoginActionPerformed

    private void txtCadUserSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadUserSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadUserSenhaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadUsuario;
    private javax.swing.JButton btnGoLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField txtCadUserName;
    private javax.swing.JPasswordField txtCadUserSenha;
    // End of variables declaration//GEN-END:variables
    

}
