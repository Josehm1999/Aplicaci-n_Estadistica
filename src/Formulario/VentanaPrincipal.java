package Formulario;
import Clases.estadistico_prueba;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaPrincipal extends javax.swing.JFrame {

    Procedimiento abrir = new Procedimiento();
    public VentanaPrincipal() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        scale_image();
        
    }
    
    public void scale_image(){
        ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/Tabla_chi_cuadrada.jpg")));
        Image img1  = icon.getImage();
        Image img2 = img1.getScaledInstance(Region_critica.getWidth(), Region_critica.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon (img2);
        Region_critica.setIcon(i);
        
        ImageIcon limpiar = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons8_Idea_96px.png")));
        Image imagen1 = limpiar.getImage();
        Image imagen2 = imagen1.getScaledInstance(asass.getWidth(), asass.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon p= new ImageIcon(imagen2);
        asass.setIcon(p);
        
    }
   public void tabla(long[][] coincidencias){
       String data[][]= new String[3][3];
       for (int n = 0; n < coincidencias.length; n++) { //Columnas
            for (int i =0; i < coincidencias.length; i++) {//Filas
                data[i][n]= Double.toString(coincidencias[n][i]);
            }
       String nomColumnas[]={P1Carac1.getText(),P1Carac2.getText(),P1Carac3.getText()};
       TablaDatos.setModel(new DefaultTableModel(data,nomColumnas));
       Carac1.setText(P2Carac1.getText());
       Carac2.setText(P2Carac2.getText());
       Carac3.setText(P2Carac3.getText());
   }}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jPIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        P1Carac3 = new javax.swing.JTextField();
        P2Carac3 = new javax.swing.JTextField();
        P1Carac1 = new javax.swing.JTextField();
        P1Carac2 = new javax.swing.JTextField();
        Poblacion1 = new javax.swing.JTextField();
        Poblacion2 = new javax.swing.JTextField();
        P2Carac1 = new javax.swing.JTextField();
        P2Carac2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        Ruta = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        asass = new javax.swing.JButton();
        Abrir = new javax.swing.JButton();
        Calcular1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        NomP1 = new javax.swing.JLabel();
        Carac3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Estadistico_prueba = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        Region_critica = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        grados_libertad = new javax.swing.JTextField();
        Mostrar_Procedimiento = new javax.swing.JButton();
        Carac1 = new javax.swing.JLabel();
        Carac2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jPIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(35, 201, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 201, 255));
        jLabel1.setText("Ingrese el nombre de la segunda población:");
        jPIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 40));

        jLabel2.setBackground(new java.awt.Color(35, 201, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 201, 255));
        jLabel2.setText("Ingrese los valores de las encuestas:");
        jPIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 250, 30));

        jLabel3.setBackground(new java.awt.Color(35, 201, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 201, 255));
        jLabel3.setText("Ingrese el nombre de la primera población:");
        jPIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        jLabel4.setBackground(new java.awt.Color(35, 201, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 201, 255));
        jLabel4.setText("Ingrese las características:");
        jPIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        P1Carac3.setForeground(new java.awt.Color(28, 48, 65));
        P1Carac3.setBorder(null);
        jPIngreso.add(P1Carac3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, 30));

        P2Carac3.setForeground(new java.awt.Color(28, 48, 65));
        P2Carac3.setBorder(null);
        jPIngreso.add(P2Carac3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 250, 30));

        P1Carac1.setForeground(new java.awt.Color(28, 48, 65));
        P1Carac1.setBorder(null);
        jPIngreso.add(P1Carac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 30));

        P1Carac2.setForeground(new java.awt.Color(28, 48, 65));
        P1Carac2.setBorder(null);
        jPIngreso.add(P1Carac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 30));

        Poblacion1.setForeground(new java.awt.Color(28, 48, 65));
        Poblacion1.setBorder(null);
        jPIngreso.add(Poblacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 30));

        Poblacion2.setForeground(new java.awt.Color(28, 48, 65));
        Poblacion2.setBorder(null);
        jPIngreso.add(Poblacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, 30));

        P2Carac1.setForeground(new java.awt.Color(28, 48, 65));
        P2Carac1.setBorder(null);
        jPIngreso.add(P2Carac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 250, 30));

        P2Carac2.setForeground(new java.awt.Color(28, 48, 65));
        P2Carac2.setBorder(null);
        jPIngreso.add(P2Carac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, 30));
        jPIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 250, 20));
        jPIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 20));
        jPIngreso.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 250, 20));
        jPIngreso.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, 20));
        jPIngreso.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, 20));
        jPIngreso.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 250, 20));
        jPIngreso.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 250, 20));
        jPIngreso.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 250, 20));

        jLabel5.setBackground(new java.awt.Color(35, 201, 255));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 201, 255));
        jLabel5.setText("Ingrese las características:");
        jPIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        Ruta.setForeground(new java.awt.Color(28, 48, 65));
        Ruta.setBorder(null);
        jPIngreso.add(Ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 170, 30));
        jPIngreso.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 170, 20));

        asass.setBorder(null);
        asass.setBorderPainted(false);
        asass.setContentAreaFilled(false);
        asass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar(evt);
            }
        });
        jPIngreso.add(asass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 60, 50));

        Abrir.setText("Abrir");
        Abrir.setBorder(null);
        Abrir.setBorderPainted(false);
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        jPIngreso.add(Abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 80, 30));

        Calcular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_OFF.png"))); // NOI18N
        Calcular1.setBorder(null);
        Calcular1.setBorderPainted(false);
        Calcular1.setContentAreaFilled(false);
        Calcular1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Calcular1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_ON.png"))); // NOI18N
        Calcular1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_ON.png"))); // NOI18N
        Calcular1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_ON.png"))); // NOI18N
        Calcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPIngreso.add(Calcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 100, 40));

        getContentPane().add(jPIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(200, 300));

        TablaDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaDatos.setPreferredSize(new java.awt.Dimension(300, 97));
        TablaDatos.setRowHeight(24);
        jScrollPane1.setViewportView(TablaDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, 120));

        jLabel9.setBackground(new java.awt.Color(35, 201, 255));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 201, 255));
        jLabel9.setText("Grados de libertad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 140, 40));

        NomP1.setBackground(new java.awt.Color(35, 201, 255));
        NomP1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        NomP1.setForeground(new java.awt.Color(35, 201, 255));
        jPanel1.add(NomP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 160, 40));

        Carac3.setBackground(new java.awt.Color(35, 201, 255));
        Carac3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Carac3.setForeground(new java.awt.Color(35, 201, 255));
        jPanel1.add(Carac3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Multiply_32px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 60));

        jLabel10.setBackground(new java.awt.Color(35, 201, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 201, 255));
        jLabel10.setText("Tabla de datos:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        Estadistico_prueba.setEditable(false);
        Estadistico_prueba.setForeground(new java.awt.Color(28, 48, 65));
        Estadistico_prueba.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Estadistico_prueba.setBorder(null);
        jPanel1.add(Estadistico_prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 160, 30));

        jLabel11.setBackground(new java.awt.Color(35, 201, 255));
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 201, 255));
        jLabel11.setText("Estadístico de prueba:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 40));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 160, 10));
        jPanel1.add(Region_critica, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 190, 110));

        jLabel12.setBackground(new java.awt.Color(35, 201, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 201, 255));
        jLabel12.setText("Conclusión:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 90, 40));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 190, 20));

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        TextArea.setForeground(new java.awt.Color(28, 48, 65));
        TextArea.setRows(5);
        TextArea.setBorder(null);
        jScrollPane2.setViewportView(TextArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 397, 570, 140));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 570, 20));

        jLabel14.setBackground(new java.awt.Color(35, 201, 255));
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 201, 255));
        jLabel14.setText("Región crítica:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 120, 40));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 160, 10));

        grados_libertad.setEditable(false);
        grados_libertad.setForeground(new java.awt.Color(28, 48, 65));
        grados_libertad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grados_libertad.setBorder(null);
        jPanel1.add(grados_libertad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 160, 30));

        Mostrar_Procedimiento.setText("Mostrar Procedimiento");
        Mostrar_Procedimiento.setBorder(null);
        Mostrar_Procedimiento.setBorderPainted(false);
        Mostrar_Procedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_ProcedimientoActionPerformed(evt);
            }
        });
        jPanel1.add(Mostrar_Procedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 150, 30));

        Carac1.setBackground(new java.awt.Color(35, 201, 255));
        Carac1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Carac1.setForeground(new java.awt.Color(35, 201, 255));
        jPanel1.add(Carac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 20));

        Carac2.setBackground(new java.awt.Color(35, 201, 255));
        Carac2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Carac2.setForeground(new java.awt.Color(35, 201, 255));
        jPanel1.add(Carac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        JFileChooser jf = new JFileChooser ();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if(archivo != null){
            Ruta.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void Limpiar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar
         Poblacion1.setText("");
         P1Carac1.setText("");
         P1Carac2.setText("");
         P1Carac3.setText("");
         Poblacion2.setText("");
         P2Carac1.setText("");
         P2Carac2.setText("");
         P2Carac3.setText("");
         Ruta.setText("");
    }//GEN-LAST:event_Limpiar

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación","Salir",dialog);
        if(result==0){
            System.exit(0);
        }

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.setState(VentanaPrincipal.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void Mostrar_ProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_ProcedimientoActionPerformed
    abrir.setVisible(true);
    this.setVisible(false);
    
    Procedimiento.Hipotesis.setText("-Hipótesis Nula(H0): "+Poblacion1.getText()+" es independiente a "+Poblacion2.getText()+"."
                                    +"\n-Hipótesis Alternativa(H1): "+Poblacion1.getText()+" y "+Poblacion2.getText()+"están relacionados.");
    Procedimiento.Conclusion.setText(TextArea.getText());
    Procedimiento.Dregion.setText("X² = ("+grados_libertad.getText()+", 0.05)");
    Procedimiento.Rpta.setText("X²= "+Estadistico_prueba.getText());
    }//GEN-LAST:event_Mostrar_ProcedimientoActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        if(Poblacion1.getText().isEmpty()||P1Carac1.getText().isEmpty()||P1Carac2.getText().isEmpty()||P1Carac3.getText().isEmpty()
           ||Poblacion2.getText().isEmpty()||P2Carac1.getText().isEmpty()||P2Carac2.getText().isEmpty()||P2Carac3.getText().isEmpty()||Ruta.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Complete los campos para poder realizar los calculos");
        }else{
        estadistico_prueba calc = new estadistico_prueba(Ruta.getText());
        List<String> LdatosP1 = Arrays.asList( Poblacion1.getText(), P1Carac1.getText(), P1Carac2.getText(),P1Carac3.getText());
        ArrayList<String> DatosP1 = new ArrayList();
        DatosP1.addAll(LdatosP1);
        List<String> LdatosP2 = Arrays.asList( Poblacion2.getText(), P2Carac1.getText(), P2Carac2.getText(),P2Carac3.getText());
        ArrayList<String> DatosP2 = new ArrayList();
        DatosP2.addAll(LdatosP2);
        tabla(calc.getMatriz());
        Estadistico_prueba.setText(calc.determinarEstadisticoP());
        Procedimiento.Estadistico_prueba.setText(calc.Procedimiento());
        grados_libertad.setText(Double.toString(calc.gradosLibertad()));
        TextArea.setText(calc.conclusion(DatosP1,DatosP2));  
        }
    }//GEN-LAST:event_CalcularActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JButton Calcular1;
    private javax.swing.JLabel Carac1;
    private javax.swing.JLabel Carac2;
    private javax.swing.JLabel Carac3;
    private javax.swing.JTextField Estadistico_prueba;
    private javax.swing.JButton Mostrar_Procedimiento;
    private javax.swing.JLabel NomP1;
    private javax.swing.JTextField P1Carac1;
    private javax.swing.JTextField P1Carac2;
    private javax.swing.JTextField P1Carac3;
    private javax.swing.JTextField P2Carac1;
    private javax.swing.JTextField P2Carac2;
    private javax.swing.JTextField P2Carac3;
    private javax.swing.JTextField Poblacion1;
    private javax.swing.JTextField Poblacion2;
    private javax.swing.JLabel Region_critica;
    private javax.swing.JTextField Ruta;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton asass;
    private javax.swing.JTextField grados_libertad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPIngreso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
