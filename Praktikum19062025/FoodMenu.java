/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum19062025;

public class FoodMenu extends javax.swing.JFrame {

    /**
     * Creates new form FoodMenu
     */
    private MainMenu main;
    
    public FoodMenu() {
        initComponents();
    }
    
    public FoodMenu(MainMenu main){
        this.main = main;
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

        jLabel1 = new javax.swing.JLabel();
        checkApplePie = new javax.swing.JCheckBox();
        comboApplePie = new javax.swing.JComboBox<>();
        checkPizzaP = new javax.swing.JCheckBox();
        textApplePie = new javax.swing.JTextField();
        textPizzaP = new javax.swing.JTextField();
        textTotalApplePie = new javax.swing.JTextField();
        comboPizza = new javax.swing.JComboBox<>();
        textTotalPizza = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textTotalAll = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Foods");

        checkApplePie.setText("Apple Pie");
        checkApplePie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkApplePieActionPerformed(evt);
            }
        });

        comboApplePie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4" }));
        comboApplePie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboApplePieActionPerformed(evt);
            }
        });

        checkPizzaP.setText("Pineapple Pizza");
        checkPizzaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPizzaPActionPerformed(evt);
            }
        });

        textApplePie.setText("0");

        textPizzaP.setText("0");

        textTotalApplePie.setText("0");
        textTotalApplePie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTotalApplePieActionPerformed(evt);
            }
        });

        comboPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4" }));
        comboPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPizzaActionPerformed(evt);
            }
        });

        textTotalPizza.setText("0");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Back");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkApplePie)
                            .addComponent(checkPizzaP))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textApplePie, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(textPizzaP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboApplePie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textTotalApplePie, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textTotalPizza)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(textTotalAll, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addGap(18, 18, 18)
                .addComponent(returnButton)
                .addGap(18, 18, 18)
                .addComponent(doneButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkApplePie)
                    .addComponent(comboApplePie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textApplePie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotalApplePie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(textTotalAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPizzaP)
                    .addComponent(textPizzaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotalPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(doneButton)
                    .addComponent(returnButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPizzaActionPerformed
        int sum = (int) comboPizza.getSelectedIndex();
        double price = Double.parseDouble(textPizzaP.getText());
        double total = price * sum;
        textTotalPizza.setText(Double.toString(total));
    }//GEN-LAST:event_comboPizzaActionPerformed

    private void textTotalApplePieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalApplePieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTotalApplePieActionPerformed

    private void checkApplePieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkApplePieActionPerformed
        textApplePie.setText("25000");
    }//GEN-LAST:event_checkApplePieActionPerformed

    private void checkPizzaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPizzaPActionPerformed
        textPizzaP.setText("40000");
    }//GEN-LAST:event_checkPizzaPActionPerformed

    private void comboApplePieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboApplePieActionPerformed
        int sum = (int) comboApplePie.getSelectedIndex();
        double price = Double.parseDouble(textApplePie.getText());
        double total = price * sum;
        textTotalApplePie.setText(Double.toString(total));
    }//GEN-LAST:event_comboApplePieActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        double applePie = Double.parseDouble(textTotalApplePie.getText());
        double pizza = Double.parseDouble(textTotalPizza.getText());
        double total = applePie + pizza;
        textTotalAll.setText(Double.toString(total));
    }//GEN-LAST:event_doneButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        textApplePie.setText("0");
        textPizzaP.setText("0");
        textTotalApplePie.setText("0");
        textTotalPizza.setText("0");
        textTotalAll.setText("0");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        String total = textTotalAll.getText();
        main.setTotalFood(total);
        this.dispose();
        
    }//GEN-LAST:event_returnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkApplePie;
    private javax.swing.JCheckBox checkPizzaP;
    private javax.swing.JComboBox<String> comboApplePie;
    private javax.swing.JComboBox<String> comboPizza;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField textApplePie;
    private javax.swing.JTextField textPizzaP;
    private javax.swing.JTextField textTotalAll;
    private javax.swing.JTextField textTotalApplePie;
    private javax.swing.JTextField textTotalPizza;
    // End of variables declaration//GEN-END:variables
}
