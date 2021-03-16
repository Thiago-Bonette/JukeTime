package VIEW;

public class DashBoard extends javax.swing.JFrame {

    public DashBoard(){
        initComponents();
    }
    
    /*INICIALIZEI A VARIÁVEL FORA DO CONSTRUTOR PORQUE NÃO ESTAVA CONSEGUINDO PASSAR ELA COMO PARÂMETRO 
    NO CONSTRUTOR DA CLASSE SEGUINTE E NISSO TIVE QUE CRIÁ-LA GLOBALMENTE.*/
    int id;
    public DashBoard(int userId) {
        initComponents();
        jLabel1.setText(Integer.toString(userId));
        id = Integer.parseInt(jLabel1.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnMusicasRecomendadas = new javax.swing.JToggleButton();
        btnGenerosFavoritos = new javax.swing.JToggleButton();
        btnAvaliarMusicas1 = new javax.swing.JToggleButton();
        panel2 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCadMusicas = new javax.swing.JToggleButton();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMusicasRecomendadas.setBackground(new java.awt.Color(51, 102, 255));
        btnMusicasRecomendadas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMusicasRecomendadas.setForeground(new java.awt.Color(255, 255, 255));
        btnMusicasRecomendadas.setText("MÚSICAS RECOMENDADAS");
        btnMusicasRecomendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicasRecomendadasActionPerformed(evt);
            }
        });

        btnGenerosFavoritos.setBackground(new java.awt.Color(51, 102, 255));
        btnGenerosFavoritos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGenerosFavoritos.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerosFavoritos.setText("MEUS GÊNEROS FAVORITOS");
        btnGenerosFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerosFavoritosActionPerformed(evt);
            }
        });

        btnAvaliarMusicas1.setBackground(new java.awt.Color(51, 102, 255));
        btnAvaliarMusicas1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAvaliarMusicas1.setForeground(new java.awt.Color(255, 255, 255));
        btnAvaliarMusicas1.setText("AVALIAR MÚSICAS");
        btnAvaliarMusicas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaliarMusicas1ActionPerformed(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("@CopyRight 2020");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(235, 235, 235))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setText("USUARIO");

        btnCadMusicas.setBackground(new java.awt.Color(0, 153, 51));
        btnCadMusicas.setForeground(new java.awt.Color(255, 255, 255));
        btnCadMusicas.setText("CADASTRAR MUSICAS");
        btnCadMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadMusicasActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(0, 204, 51));
        panel1.setPreferredSize(new java.awt.Dimension(360, 70));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JukeTime");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(242, 242, 242))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnLogout.setBackground(new java.awt.Color(0, 153, 51));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCadMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMusicasRecomendadas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAvaliarMusicas1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(143, 143, 143)))
                    .addComponent(btnGenerosFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerosFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAvaliarMusicas1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMusicasRecomendadas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMusicasRecomendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicasRecomendadasActionPerformed
        MusicasRecomendadas form5 = new MusicasRecomendadas(id);
        form5.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMusicasRecomendadasActionPerformed

    private void btnGenerosFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerosFavoritosActionPerformed
        /*INSTÂNCIA A CLASSE SEGUINTE E PASSA O ID DO USUÁRIO VIA CONSTRUTOR DA CLASSE SEGUINTE.*/
        GenerosFavoritos form3 = new GenerosFavoritos(id);
        form3.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGenerosFavoritosActionPerformed

    private void btnAvaliarMusicas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaliarMusicas1ActionPerformed
        AvaliarMusicas formAvaliarMuscias = new AvaliarMusicas(id);
        formAvaliarMuscias.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAvaliarMusicas1ActionPerformed

    private void btnCadMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadMusicasActionPerformed
        CadastrarMusica form4 = new CadastrarMusica(id);
        form4.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadMusicasActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginUsuario login = new LoginUsuario();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAvaliarMusicas1;
    private javax.swing.JToggleButton btnCadMusicas;
    private javax.swing.JToggleButton btnGenerosFavoritos;
    private javax.swing.JButton btnLogout;
    private javax.swing.JToggleButton btnMusicasRecomendadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
