/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm__interface;

import java.awt.Color;

/**
 *
 * @author dell
 */
public class Transaction extends javax.swing.JFrame {
    String username="";
      
     String pin;
   

    /**
     * Creates new form Menu
     */
    public Transaction(String pin) {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
         this.pin = pin;
    }
    
  

   // Transaction(String pin) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jwithdraw = new javax.swing.JButton();
        jbalance = new javax.swing.JButton();
        jdeposit = new javax.swing.JButton();
        jlogout = new javax.swing.JButton();
        jchangepin = new javax.swing.JButton();
        jl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLEASE SELECT YOUR TRASACTION");

        jwithdraw.setBackground(java.awt.Color.black);
        jwithdraw.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jwithdraw.setForeground(java.awt.Color.white);
        jwithdraw.setText("WITHDRAW ");
        jwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwithdrawActionPerformed(evt);
            }
        });

        jbalance.setBackground(java.awt.Color.black);
        jbalance.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbalance.setForeground(java.awt.Color.white);
        jbalance.setText(" BALANCE ENQUIRY");
        jbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbalanceActionPerformed(evt);
            }
        });

        jdeposit.setBackground(java.awt.Color.black);
        jdeposit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jdeposit.setForeground(java.awt.Color.white);
        jdeposit.setText("DEPOSIT");
        jdeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdepositActionPerformed(evt);
            }
        });

        jlogout.setBackground(java.awt.Color.black);
        jlogout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlogout.setForeground(java.awt.Color.white);
        jlogout.setText("LOG OUT");
        jlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogoutActionPerformed(evt);
            }
        });

        jchangepin.setBackground(java.awt.Color.black);
        jchangepin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jchangepin.setForeground(java.awt.Color.white);
        jchangepin.setText("CHANGE PIN");
        jchangepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchangepinActionPerformed(evt);
            }
        });

        jl1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm__interface/logos/transaction.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jdeposit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jwithdraw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchangepin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl1)
                .addGap(355, 355, 355))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jchangepin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbalanceActionPerformed
        // TODO add your handling code here:
         setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        
    }//GEN-LAST:event_jbalanceActionPerformed

    private void jdepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdepositActionPerformed
        // TODO add your handling code here:
       setVisible(false);
            new Deposit(pin).setVisible(true);
        
    }//GEN-LAST:event_jdepositActionPerformed

    private void jlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogoutActionPerformed
        // TODO add your handling code here:
            System.exit(0);
    }//GEN-LAST:event_jlogoutActionPerformed

    private void jwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwithdrawActionPerformed
        // TODO add your handling code here:
         setVisible(false);
            new Withdraw(pin).setVisible(true);
        
        
    }//GEN-LAST:event_jwithdrawActionPerformed

    private void jchangepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchangepinActionPerformed
        // TODO add your handling code here:
         setVisible(false);
            new ChangePin(pin).setVisible(true);
    }//GEN-LAST:event_jchangepinActionPerformed

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
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbalance;
    private javax.swing.JButton jchangepin;
    private javax.swing.JButton jdeposit;
    private javax.swing.JLabel jl1;
    private javax.swing.JButton jlogout;
    private javax.swing.JButton jwithdraw;
    // End of variables declaration//GEN-END:variables
}
