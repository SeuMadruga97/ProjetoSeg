/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author s.lucas
 */
public class Xablau extends javax.swing.JFrame {

    /**
     * Creates new form Xablau
     */
    public Xablau() {
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

        jLabel3 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lbPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btVerificar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbRResultado = new javax.swing.JLabel();
        lbRNome1 = new javax.swing.JLabel();
        lbRImc1 = new javax.swing.JLabel();
        lbRClass1 = new javax.swing.JLabel();
        lbRNome = new javax.swing.JTextField();
        lbRImc = new javax.swing.JTextField();
        lbRClass = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 51, 255));
        lbTitulo.setText("NUTRIÇÃO");

        lbNome.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 0, 0));
        lbNome.setText("NOME");

        lbAltura.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbAltura.setForeground(new java.awt.Color(0, 51, 204));
        lbAltura.setText("ALTURA");

        lbPeso.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lbPeso.setForeground(new java.awt.Color(255, 0, 0));
        lbPeso.setText("PESO");

        btVerificar.setBackground(new java.awt.Color(0, 0, 204));
        btVerificar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btVerificar.setText("VERIFICAR");
        btVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerificarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 0, 0));
        btLimpar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 250, 154));

        lbRResultado.setText("RESULTADO");

        lbRNome1.setText("NOME:");

        lbRImc1.setText("IMC:");

        lbRClass1.setText("CLASSIFICAÇÃO:");

        lbRNome.setBackground(new java.awt.Color(255, 0, 0));
        lbRNome.setText("???");

        lbRImc.setBackground(new java.awt.Color(255, 0, 0));
        lbRImc.setText("???");

        lbRClass.setBackground(new java.awt.Color(255, 0, 0));
        lbRClass.setText("???");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRImc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbRNome, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbRNome1)
                                .addComponent(lbRImc1)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbRClass1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(lbRResultado))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbRResultado)
                .addGap(43, 43, 43)
                .addComponent(lbRNome1)
                .addGap(10, 10, 10)
                .addComponent(lbRNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lbRImc1)
                .addGap(9, 9, 9)
                .addComponent(lbRImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbRClass1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbRClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btVerificar)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txtAltura)
                            .addComponent(txtPeso)))
                    .addComponent(lbAltura)
                    .addComponent(lbNome)
                    .addComponent(lbPeso))
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addGap(10, 10, 10)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lbPeso)
                        .addGap(10, 10, 10)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtNome.setText(null);
        txtAltura.setText(null);
        txtPeso.setText(null);
        lbNome.setText("---");
        lbRImc1.setText("---");
        lbRClass1.setText("---");
        JOptionPane.showConfirmDialog(null,"campos limpos com sucesso");
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void btVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerificarActionPerformed
       String nome;
       double altura, peso,imc;
        DecimalFormat f= new DecimalFormat("0.0");
      //entrada de dados
       nome=txtNome.getText();
       altura=Double.parseDouble(txtAltura.getText());
       peso= Double.parseDouble(txtPeso.getText());
       imc= Math.pow(altura,2);
       lbRNome.setText(nome);
       lbRImc.setText(String.valueOf(imc));
        if (imc>18) {
            lbRClass.setText("MAGRO:!)");
           jPanel1.setBackground(Color.GREEN);
        }else if (imc>=18 && imc <=25) {
            lbRClass.setText(NORMAL);
            jPanell.setBackground ( Color. ORANGE)
        } else {
            lbRClass1.setText("GORDO;)");
            jPanell.setBackground (Color.RED);
      }
       //saída de dados
       
    }//GEN-LAST:event_btVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(Xablau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Xablau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Xablau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Xablau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Xablau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVerificar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JTextField lbRClass;
    private javax.swing.JLabel lbRClass1;
    private javax.swing.JTextField lbRImc;
    private javax.swing.JLabel lbRImc1;
    private javax.swing.JTextField lbRNome;
    private javax.swing.JLabel lbRNome1;
    private javax.swing.JLabel lbRResultado;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
