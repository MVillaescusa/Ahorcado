
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ahorcado extends javax.swing.JFrame {
    String texto, textoVacio, textoActual;
    int fallos;
    String[] palabras = {"Ahorcado","Aborrecer","Bordear","Buceador","Binocular","Bimestral","Central","Cañaveral","Compilador",
    "Depositar","Fanfarronear","Ingenuidad","Lesionar","Mencionar","Motel","Patinar","Sobrenatural","Neutral","Sacar","Soldar",
    "Traicionar", "Valorar"};
    
    public Ahorcado() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        initLabels(palabras[(int) (Math.random() * (0-palabras.length) + palabras.length)]);
    }
    
    private void initLabels (String palabra){
        lblPalabra.setHorizontalAlignment(SwingConstants.CENTER);
        texto = ""; 
        textoVacio = "";
        for (int x = 0; x < palabra.length(); x++){
            texto = texto + palabra.charAt(x) + " ";
            if (palabra.charAt(x) != ' '){
                textoVacio = textoVacio + "_ ";
            }
            else{
                textoVacio = textoVacio + "  ";
            }
        }
        lblPalabra.setText(textoVacio);
        textoActual = textoVacio;
        fallos = 0;
        lblFallos.setText("Fallos: " + fallos);
        lblEnhorabuena.setText(" ");
        lblEnhorabuena2.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnNY = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        lblPalabra = new javax.swing.JLabel();
        lblFallos = new javax.swing.JLabel();
        lblEnhorabuena = new javax.swing.JLabel();
        lblEnhorabuena2 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ahorcado Gráfico");
        setMinimumSize(new java.awt.Dimension(650, 480));
        setName("jFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnG.setText("G");
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnH.setText("H");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnI.setText("I");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnJ.setText("J");
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnK.setText("K");
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnL.setText("L");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnM.setText("M");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnN.setText("N");
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnNY.setText("Ñ");
        btnNY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnO.setText("O");
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnQ.setText("Q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnR.setText("R");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnS.setText("S");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnT.setText("T");
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnU.setText("U");
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnV.setText("V");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnW.setText("W");
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnY.setText("Y");
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        btnZ.setText("Z");
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClicked(evt);
            }
        });

        lblPalabra.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabra.setText("_________");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnW)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZ))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnN)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(lblPalabra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPalabra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA)
                    .addComponent(btnB)
                    .addComponent(btnC)
                    .addComponent(btnD)
                    .addComponent(btnE)
                    .addComponent(btnF)
                    .addComponent(btnG)
                    .addComponent(btnH)
                    .addComponent(btnI)
                    .addComponent(btnJ)
                    .addComponent(btnK)
                    .addComponent(btnL)
                    .addComponent(btnM)
                    .addComponent(btnN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNY)
                    .addComponent(btnO)
                    .addComponent(btnP)
                    .addComponent(btnQ)
                    .addComponent(btnR)
                    .addComponent(btnS)
                    .addComponent(btnT)
                    .addComponent(btnU)
                    .addComponent(btnV)
                    .addComponent(btnW)
                    .addComponent(btnX)
                    .addComponent(btnY)
                    .addComponent(btnZ))
                .addGap(21, 21, 21))
        );

        lblFallos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFallos.setText("Fallos: 0");

        lblEnhorabuena.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEnhorabuena.setText("¡ENHORABUENA!");

        lblEnhorabuena2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblEnhorabuena2.setText("Has acertado la palabra");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ahorcado0.png"))); // NOI18N

        btnReset.setText("Volver a empezar");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFallos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblEnhorabuena)
                                        .addGap(12, 12, 12))
                                    .addComponent(lblEnhorabuena2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReset)
                                .addGap(46, 46, 46)))
                        .addGap(0, 0, 0)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFallos)
                            .addComponent(lblImagen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lblEnhorabuena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEnhorabuena2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClicked
        char boton = evt.getActionCommand().charAt(0); //Obtiene la letra del boton pulsado
        botonPulsado(evt, boton);
    }//GEN-LAST:event_btnClicked

    private void reset(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset
        texto = "";
        textoVacio = "";
        textoActual= "";
        fallos = 0;
        
        initLabels(palabras[(int) (Math.random() * (0-palabras.length) + palabras.length)]);
        cambiarImagen(0);
        
        for (int x=0; x<jPanel1.getComponentCount();x++){
            if (jPanel1.getComponent(x) instanceof JButton){
                ((JButton) jPanel1.getComponent(x)).setEnabled(true);
            }
        }
    }//GEN-LAST:event_reset

    private void botonPulsado(java.awt.event.ActionEvent evt, char boton){
        StringBuilder textoBuilder = new StringBuilder (textoActual);
        boolean fallo = true;
        for (int x = 0; x < textoVacio.length(); x++){
            if (texto.charAt(x) == Character.toUpperCase(boton)){
                textoBuilder.setCharAt(x, boton);
                fallo = false;
            }
            else if (texto.charAt(x) == Character.toLowerCase(boton)){
                textoBuilder.setCharAt(x, Character.toLowerCase(boton));
                fallo = false;
            }
        }
        if (fallo){
            fallos++;
            lblFallos.setText("Fallos: " + fallos);
        }
        lblPalabra.setText(textoBuilder.toString());
        //System.out.println(textoBuilder);
        textoActual = textoBuilder.toString();
        JButton myButton = (JButton)evt.getSource();
        myButton.setEnabled(false);
        comprobarFin();
    }
    
    private void comprobarFin(){
        if (textoActual.equals(texto) || fallos == 10){
            // Recorro el panel y desactivo los botones
            for (int x=0; x<jPanel1.getComponentCount();x++){
                if (jPanel1.getComponent(x) instanceof JButton){
                    ((JButton) jPanel1.getComponent(x)).setEnabled(false);
                }
            }
            if (fallos != 10){
                lblEnhorabuena.setText("¡ENHORABUENA!");
                lblEnhorabuena2.setText("Has acertado la palabra");
            }
            else{
                lblEnhorabuena.setText("¡LO SIENTO!");
                lblEnhorabuena2.setText("La palabra era: " + texto);
            }
        }
        if (fallos <= 10){
            cambiarImagen(fallos);
        }
    }
    
    private void cambiarImagen(int fallos){
        String path = "/imagenes/Ahorcado"+fallos+".png";
        URL url = this.getClass().getResource(path);   
        ImageIcon icono = new ImageIcon(url);  
        lblImagen.setIcon(icono);
    }
    
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
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ahorcado().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnNY;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEnhorabuena;
    private javax.swing.JLabel lblEnhorabuena2;
    private javax.swing.JLabel lblFallos;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPalabra;
    // End of variables declaration//GEN-END:variables
}
