/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

/**
 *
 * @author Acer
 */
public class telaTraingulo extends javax.swing.JFrame {

    /**
     * Creates new form telaTraingulo
     */
    public telaTraingulo() {
        initComponents();
        painel.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliderA = new javax.swing.JSlider();
        sliderB = new javax.swing.JSlider();
        txtA = new javax.swing.JLabel();
        sliderC = new javax.swing.JSlider();
        txtASegmento = new javax.swing.JLabel();
        txtBSegmento = new javax.swing.JLabel();
        txtCSegmento = new javax.swing.JLabel();
        txtB = new javax.swing.JLabel();
        txtC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        txtForma = new javax.swing.JLabel();
        txtTriangulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Segmento a");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Segmento b");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Segmento c");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        sliderA.setMaximum(20);
        sliderA.setValue(0);
        sliderA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAStateChanged(evt);
            }
        });
        getContentPane().add(sliderA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 150, -1));

        sliderB.setMaximum(20);
        sliderB.setValue(0);
        sliderB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBStateChanged(evt);
            }
        });
        getContentPane().add(sliderB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, -1));

        txtA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtA.setForeground(new java.awt.Color(102, 0, 255));
        txtA.setText("A");
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        sliderC.setMaximum(20);
        sliderC.setValue(0);
        sliderC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCStateChanged(evt);
            }
        });
        getContentPane().add(sliderC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 150, -1));

        txtASegmento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtASegmento.setForeground(new java.awt.Color(153, 153, 153));
        txtASegmento.setText("0");
        getContentPane().add(txtASegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        txtBSegmento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBSegmento.setForeground(new java.awt.Color(153, 153, 153));
        txtBSegmento.setText("0");
        getContentPane().add(txtBSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        txtCSegmento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCSegmento.setForeground(new java.awt.Color(153, 153, 153));
        txtCSegmento.setText("0");
        getContentPane().add(txtCSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        txtB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtB.setForeground(new java.awt.Color(102, 0, 255));
        txtB.setText("B");
        getContentPane().add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        txtC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtC.setForeground(new java.awt.Color(102, 0, 255));
        txtC.setText("C");
        getContentPane().add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png-transparent-equilateral-triangle-drawing-equilateral-polygon-triangle-angle-text-rectangle.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 240, 220));

        btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn.setForeground(new java.awt.Color(102, 0, 255));
        btn.setText("Verificar");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 194, 47));

        txtForma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtForma.setForeground(new java.awt.Color(0, 51, 204));
        txtForma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtForma.setText("Forma ou não?");

        txtTriangulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTriangulo.setForeground(new java.awt.Color(255, 51, 51));
        txtTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTriangulo.setText("Tipo de triângulo");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtForma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtForma)
                .addGap(18, 18, 18)
                .addComponent(txtTriangulo)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 430, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
        int a = sliderA.getValue();
        int b = sliderB.getValue();
        int c = sliderC.getValue();
        
        if(a < b+c && b<a+c && c<a+b)
        {
            txtForma.setText("Formam um Triângulo!");
            if(a==b && b==c)
            {
                txtTriangulo.setText("Triângulo Equilátero!");
            }else if(a!=b && b!=c && a!=c)
            {
                txtTriangulo.setText("Triângulo Escaleno!");
            }else
            {
                txtTriangulo.setText("Triângulo Isósceles!");
            }
        }else{
            txtForma.setText("Não Formam um Triângulo!");
            txtTriangulo.setText("---");
        }
        
        
        
        
        painel.setVisible(true);
    }//GEN-LAST:event_btnActionPerformed

    private void sliderAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAStateChanged
        // TODO add your handling code here:
        txtA.setText(Integer.toString(sliderA.getValue()));
        txtASegmento.setText(Integer.toString(sliderA.getValue()));
    }//GEN-LAST:event_sliderAStateChanged

    private void sliderCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCStateChanged
        // TODO add your handling code here:
        txtC.setText(Integer.toString(sliderC.getValue()));
        txtCSegmento.setText(Integer.toString(sliderC.getValue()));
    }//GEN-LAST:event_sliderCStateChanged

    private void sliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBStateChanged
        // TODO add your handling code here:
        txtB.setText(Integer.toString(sliderB.getValue()));
        txtBSegmento.setText(Integer.toString(sliderB.getValue()));
    }//GEN-LAST:event_sliderBStateChanged

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
            java.util.logging.Logger.getLogger(telaTraingulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaTraingulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaTraingulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaTraingulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaTraingulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel painel;
    private javax.swing.JSlider sliderA;
    private javax.swing.JSlider sliderB;
    private javax.swing.JSlider sliderC;
    private javax.swing.JLabel txtA;
    private javax.swing.JLabel txtASegmento;
    private javax.swing.JLabel txtB;
    private javax.swing.JLabel txtBSegmento;
    private javax.swing.JLabel txtC;
    private javax.swing.JLabel txtCSegmento;
    private javax.swing.JLabel txtForma;
    private javax.swing.JLabel txtTriangulo;
    // End of variables declaration//GEN-END:variables
}
