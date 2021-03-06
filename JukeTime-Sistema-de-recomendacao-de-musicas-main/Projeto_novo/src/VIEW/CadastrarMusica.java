/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.MusicaDAO;
import DTO.MusicaDTO;
import javax.swing.JOptionPane;
import DTO.GeneroDTO;
import DAO.GeneroDAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CadastrarMusica extends javax.swing.JFrame {

    public CadastrarMusica() {
        initComponents();
    }
    
    int id;
    public CadastrarMusica(int userId){
        initComponents();
        txtUser.setText(Integer.toString(userId)); 
        id = Integer.parseInt(txtUser.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeMusica = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGeneros = new javax.swing.JTable();
        btnCadastrarMusica = new javax.swing.JButton();
        btnListarGeneros = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("@CopyRight 2020");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nome da M??sica:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cadastro de M??sicas");

        txtNomeMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMusicaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Selecionar G??nero:");

        tabelaGeneros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "G??nero"
            }
        ));
        jScrollPane1.setViewportView(tabelaGeneros);

        btnCadastrarMusica.setBackground(new java.awt.Color(0, 153, 51));
        btnCadastrarMusica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrarMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarMusica.setText("CADASTRAR M??SICA");
        btnCadastrarMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMusicaActionPerformed(evt);
            }
        });

        btnListarGeneros.setBackground(new java.awt.Color(51, 102, 255));
        btnListarGeneros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnListarGeneros.setForeground(new java.awt.Color(255, 255, 255));
        btnListarGeneros.setText("G??NEROS DISPON??VEIS");
        btnListarGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarGenerosActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(0, 204, 51));
        panel1.setPreferredSize(new java.awt.Dimension(360, 70));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("JukeTime");

        btnVoltar.setBackground(new java.awt.Color(0, 204, 0));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("<");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(jLabel6)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnVoltar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txtUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUser.setText("Usu??rio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(txtNomeMusica)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnCadastrarMusica, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                    .addComponent(txtUser))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListarGeneros, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(btnCadastrarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMusicaActionPerformed
            
    }//GEN-LAST:event_txtNomeMusicaActionPerformed

    private void btnCadastrarMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMusicaActionPerformed
        /*O M??TODO DO BOT??O CHAMA O OUTRO M??TODO ABAIXO pegarId()*/
        cadastrarMusica();
      
    }//GEN-LAST:event_btnCadastrarMusicaActionPerformed

    private void btnListarGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarGenerosActionPerformed
        /*O M??TODO DO BOT??O CHAMA O OUTRO M??TODO ABAIXO listarGeneros().*/
        listarGeneros();
      
    }//GEN-LAST:event_btnListarGenerosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        DashBoard dashboard = new DashBoard(id);
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarMusica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarMusica;
    private javax.swing.JButton btnListarGeneros;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTable tabelaGeneros;
    private javax.swing.JTextField txtNomeMusica;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables

    private void listarGeneros(){
        try {
            GeneroDAO objGeneroDAO = new GeneroDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaGeneros.getModel();
            model.setNumRows(0);
            
            ArrayList<GeneroDTO> lista = objGeneroDAO.PesquisarGenero();
            
            for(int num = 0; num < lista.size(); num ++){
                model.addRow(new Object[]{
            /*ENQUANTO HOUVER DADOS NO ARRAYLIST MOSTRAR NA TABELA.*/
                    lista.get(num).getId(),
                    lista.get(num).getNome_genero()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listas valores VIEW: " + erro);
        }
    }

    private void cadastrarMusica (){
        String nome;
        int setar;
        /*A VARI??VEL setar ARMAZENA O N??MERO DA LINHA CLICADA ATRAV??S DO M??TODO getSelectRow()*/
        setar = tabelaGeneros.getSelectedRow();
        int genderId;
        /*CAPTURA O NOME DA M??SICA DIGITADA NO CAMPO DE TEXTO.*/
        nome = txtNomeMusica.getText();
        
        MusicaDTO objmusicadto = new MusicaDTO();
        objmusicadto.setNome_musica(nome);
        
        /*A VARI??VEL genderId ARMAZENA O N??MERO QUE REFERENCIA A LINHA E COLUNA CLICADA PELO USU??RIO.*/
        genderId = Integer.parseInt(tabelaGeneros.getModel().getValueAt(setar, 0).toString());
        
        /*A QUERY IR?? ARMAZENAR O NOME DA M??SICA E O IDENTIFICADOR DO G??NERO QUE PERTENCE A M??SICA.*/
        String sql = "insert into musicas (nome_Musica, genderId) values (?,?)";      
        Connection con = new ConexaoDAO().conectaBD();
        PreparedStatement pstm;
        
        try {
            pstm = con.prepareStatement(sql);
            /*SUBSTITUI O NOME DA M??SICA NA QUERY ATRAV??S DO M??TODO getNome_musica.*/
            pstm.setString(1,  objmusicadto.getNome_musica());
            pstm.setInt(2, genderId);
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o identificador do genero" + erro);
        }
        
        JOptionPane.showMessageDialog(null, "Musica cadastrada com sucesso!");
       
    }
 
}
