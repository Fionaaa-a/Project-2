/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 * Analysis JFrame used to display explanations for why each ethics scenario is considered unethical.
 * Users can press the Next button to move through all 8 scenario analyses.
 * @author Fiona and Ivy
 */
public class Analysis extends javax.swing.JFrame {
    // Keeps track of the current analysis being displayed
    int index = 0;
    // Array storing all analysis explanations
    String[] analysisTexts = {
        // Analysis for case 1
        "Q1: The Always-On Microphone is unethical because the\n"
        + "company recorded private conversations without \n"
        + "user permission. This violates privacy rights \n"
        + "and users did not consent to employees \n"
        + "listening to their recordings.",
        // Analysis for case 2
        "Q2: The Biased Hiring Bot is unethical because the AI\n"
        + "unfairly ranked male applicants higher than \n"
        + "equally qualified female applicants. This creates\n"
        + "gender discrimination and unequal opportunities.",
        // Analysis for case 3
        "Q3: The Deepfake Politician is unethical because fake \n"
        + "videos can spread misinformation and manipulate \n"
        + "voters. People may believe false information before \n"
        + "the truth is discovered.",
        // Analysis for case 4
        "Q4: AI Trained on Artist Work is unethical because \n"
        + "artists’ work was used without permission, credit, \n"
        + "or payment. This disrespects intellectual property \n"
        + "rights and creative ownership.",
        // Analysis for case 5
        "Q5: The Constant Tracker is unethical because the weather \n"
        + "app tracked users’ locations even when the app was \n"
        + "closed. Users were not fully aware that their personal \n"
        + "location data was being collected.",
        // Analysis for case 6
        "Q6: The Judge is unethical because the facial recognition AI \n"
        + "was trained mostly on light-skinned individuals. This \n"
        + "can create racial bias and unfair treatment in the justice\n"
        + "system.",
        // Analysis for case 7
        "Q7: The Deepfake Doctor is unethical because fake medical \n"
        + "videos can spread dangerous health misinformation. \n"
        + "People may trust false medical advice and make \n"
        + "harmful decisions.",
        // Analysis for case 8
        "Q8: Stealing Art Work is unethical because the company used \n"
        + "an artist’s drawing without permission. Creators should \n"
        + "have control over how their work is used."
    };

    /**
     * Creates new form Analysis
     * Displays the first analysis when the frame opens.
     */
    public Analysis() {
        initComponents();
        // Display the first analysis text
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnNext)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(jLabel1)
                            .addGap(120, 120, 120)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
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
       // Move to the next analysis
       index++;
       // Check if there are still analyses remaining
       if (index < analysisTexts.length) {
           // Display the next analysis text
           txtAnalysis.setText(analysisTexts[index]);
       } else {
           // Display message when all analyses are finished
           JOptionPane.showMessageDialog(
                   this,
                   "No more analysis.",
                   "Finished",
                   JOptionPane.PLAIN_MESSAGE
           );
           // Disable the button so it cannot be pressed again
           btnNext.setEnabled(false);
       }
    }//GEN-LAST:event_btnNextActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAnalysis;
    // End of variables declaration//GEN-END:variables
}
