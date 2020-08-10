
package Formulario;

import javax.swing.JOptionPane;

public class Procedimiento extends javax.swing.JFrame {

    public Procedimiento() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Estadistico_prueba = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Hipotesis = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        Rpta = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Conclusion = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Dregion = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 512));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 575));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 5750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(35, 201, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 201, 255));
        jLabel10.setText("Conclusión:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, 40));

        Estadistico_prueba.setEditable(false);
        Estadistico_prueba.setColumns(20);
        Estadistico_prueba.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        Estadistico_prueba.setForeground(new java.awt.Color(28, 48, 65));
        Estadistico_prueba.setRows(5);
        Estadistico_prueba.setBorder(null);
        jScrollPane2.setViewportView(Estadistico_prueba);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 790, 70));

        jLabel11.setBackground(new java.awt.Color(35, 201, 255));
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 201, 255));
        jLabel11.setText("Hipótesis:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        Hipotesis.setEditable(false);
        Hipotesis.setColumns(20);
        Hipotesis.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Hipotesis.setForeground(new java.awt.Color(28, 48, 65));
        Hipotesis.setRows(5);
        Hipotesis.setBorder(null);
        Hipotesis.setMaximumSize(new java.awt.Dimension(320, 2147483647));
        jScrollPane3.setViewportView(Hipotesis);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 790, 70));

        jLabel12.setBackground(new java.awt.Color(35, 201, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 201, 255));
        jLabel12.setText("Estadístico de prueba:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 40));

        Rpta.setEditable(false);
        Rpta.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        Rpta.setForeground(new java.awt.Color(28, 48, 65));
        Rpta.setBorder(null);
        jPanel1.add(Rpta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 150, 30));

        Conclusion.setEditable(false);
        Conclusion.setColumns(20);
        Conclusion.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Conclusion.setForeground(new java.awt.Color(28, 48, 65));
        Conclusion.setRows(5);
        Conclusion.setBorder(null);
        jScrollPane4.setViewportView(Conclusion);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 790, 90));

        jLabel13.setBackground(new java.awt.Color(35, 201, 255));
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 201, 255));
        jLabel13.setText("Datos de la región crítica: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Multiply_32px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 40));

        Dregion.setEditable(false);
        Dregion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        Dregion.setForeground(new java.awt.Color(28, 48, 65));
        Dregion.setBorder(null);
        jPanel1.add(Dregion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 310, 40));

        Regresar.setText("Regresar");
        Regresar.setBorder(null);
        Regresar.setBorderPainted(false);
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.setState(VentanaPrincipal.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación","Salir",dialog);
        if(result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        VentanaPrincipal main = new VentanaPrincipal();
        main.setVisible(true);
        this.setVisible(false);

        
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Procedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procedimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procedimiento().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea Conclusion;
    public static javax.swing.JTextField Dregion;
    public static javax.swing.JTextArea Estadistico_prueba;
    public static javax.swing.JTextArea Hipotesis;
    private javax.swing.JButton Regresar;
    public static javax.swing.JTextField Rpta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
