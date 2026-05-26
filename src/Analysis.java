/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Analysis extends javax.swing.JFrame {
    int index = 0;
    String[] analysisTexts = {
        
        // 1
        "The Always-On Microphone is unethical because the\n"
        + "company recorded private conversations without \n"
        + "user permission. This violates privacy rights \n"
        + "and users did not consent to employees \n"
        + "listening to their recordings.",

        // 2
        "The Biased Hiring Bot is unethical because the AI\n"
        + "unfairly ranked male applicants higher than \n"
        + "equally qualified female applicants. This creates\n"
        + " gender discrimination and unequal opportunities.",

        // 3
        "The Deepfake Politician is unethical because fake \n"
        + "videos can spread misinformation and manipulate \n"
        + "voters. People may believe false information before \n"
        + "the truth is discovered.",

        // 4
        "AI Trained on Artist Work is unethical because \n"
        + "artists’ work was used without permission, credit, \n"
        + "or payment. This disrespects intellectual property \n"
        + "rights and creative ownership.",

        // 5
        "The Constant Tracker is unethical because the weather \n"
        + "app tracked users’ locations even when the app was \n"
        + "closed. Users were not fully aware that their personal \n"
        + "location data was being collected.",

        // 6
        "The Judge is unethical because the facial recognition AI \n"
        + "was trained mostly on light-skinned individuals. This \n"
        + "can create racial bias and unfair treatment in the justice\n"
        + "system.",

        // 7
        "The Deepfake Doctor is unethical because fake medical \n"
        + "videos can spread dangerous health misinformation. \n"
        + "People may trust false medical advice and make \n"
        + "harmful decisions.",

        // 8
        "Stealing Art Work is unethical because the company used \n"
        + "an artist’s drawing without permission. Creators should \n"
        + "have control over how their work is used."
    };

    public Analysis() {
        initComponents();

        txtAnalysis.setText(analysisTexts[index]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnalysis = new javax.swing.JTextArea();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Analysis");

        txtAnalysis.setColumns(20);
        txtAnalysis.setRows(5);
        jScrollPane1.setViewportView(txtAnalysis);

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNext)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnNext)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        index++;
        if (index < analysisTexts.length) {
            txtAnalysis.setText(analysisTexts[index]);
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "No more analysis.",
                    "Finished",
                    JOptionPane.PLAIN_MESSAGE
            );
            btnNext.setEnabled(false);
        }
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAnalysis;
    // End of variables declaration//GEN-END:variables
}
