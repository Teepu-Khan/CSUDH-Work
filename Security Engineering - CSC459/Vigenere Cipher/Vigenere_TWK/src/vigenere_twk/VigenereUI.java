/*
 * Code designed to implement all of the UI elements. Code generated via
 * NetBeans 8.0.2 build in JFrame designer. Only minor even functionality was 
 * manually coded. No menu was implemented due to time constraints. Only 
 * buttons. May be implemented and refined in a future release.
 *
 * Programmer: Teepu Khan
 * Date: May 1, 2016
 * Class: VigenereUI.java
 * Course: CSC 459 @ CSUDH
 *
 */

package vigenere_twk;

public class VigenereUI extends javax.swing.JFrame 
{
    
    Key KEY = new Key();
    Cipher CIPHER = new Cipher();

    /**
     * Creates new form VigenereUI
     */
    public VigenereUI() 
    {
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

        jPanel1 = new javax.swing.JPanel();
        encryptButton = new javax.swing.JButton();
        decryptButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputField = new javax.swing.JTextArea();
        keyField = new javax.swing.JTextField();
        outputLabel = new javax.swing.JLabel();
        keyLabel = new javax.swing.JLabel();
        inputLabel = new javax.swing.JLabel();
        defaultToggle = new javax.swing.JToggleButton();
        instructionsButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vigenere Cipher by Teepu Khan", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setName(""); // NOI18N

        encryptButton.setText("Encrypt");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        decryptButton.setText("Decrypt");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        inputField.setColumns(20);
        inputField.setLineWrap(true);
        inputField.setRows(5);
        jScrollPane1.setViewportView(inputField);

        outputField.setEditable(false);
        outputField.setColumns(20);
        outputField.setLineWrap(true);
        outputField.setRows(5);
        outputField.setText("VIGENERE CIPHER\n\nPlease input the key in the key field. If default key is desired, toggle the DEFAULT button.\n\nPlease input desired message to encrypt or decrypt in the INPUT field. Then click ENCRYPT or DECRYPT depending on your desires.\n\nWARNING: Any white space and non-letters will automatically be removed.");
        outputField.setWrapStyleWord(true);
        jScrollPane2.setViewportView(outputField);

        outputLabel.setText("OUTPUT");

        keyLabel.setText("KEY");

        inputLabel.setText("INPUT");

        defaultToggle.setText("DEFAULT");
        defaultToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultToggleActionPerformed(evt);
            }
        });

        instructionsButton.setText("Instructions");
        instructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionsButtonActionPerformed(evt);
            }
        });

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(defaultToggle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructionsButton)
                            .addComponent(aboutButton)
                            .addComponent(exitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(encryptButton)
                        .addGap(18, 18, 18)
                        .addComponent(decryptButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(keyField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(instructionsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aboutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(outputLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(defaultToggle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptButton)
                    .addComponent(decryptButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed
        if (defaultToggle.isSelected())
        {
            KEY = new Key();
            outputField.setText(CIPHER.encrypt(KEY.getKey(), inputField.getText()));
        }
        else
        {
            outputField.setText(CIPHER.encrypt(keyField.getText(), inputField.getText()));
        }
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        if (defaultToggle.isSelected())
        {
            KEY = new Key();
            outputField.setText(CIPHER.decrypt(KEY.getKey(), inputField.getText()));
        }
        else
        {
            outputField.setText(CIPHER.decrypt(keyField.getText(), inputField.getText()));
        }
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void defaultToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultToggleActionPerformed

    }//GEN-LAST:event_defaultToggleActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void instructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionsButtonActionPerformed
        outputField.setText("VIGENERE CIPHER \n\nPlease input the key in the key field. If default key is desired, toggle the DEFAULT button.\n\nPlease input desired message to encrypt or decrypt in the INPUT field. Then click ENCRYPT or DECRYPT depending on your desires.\n\nWARNING: Any white space and non-letters will automatically be removed.");
    }//GEN-LAST:event_instructionsButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        outputField.setText("Version 1.0 \n\nCopyright \u00a92016 Teepu Khan. All rights reserved. \n\nOriginally created for CSC 459 course for Professor Kowalski at CSUDH (Spring 2016).");
    }//GEN-LAST:event_aboutButtonActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton decryptButton;
    private javax.swing.JToggleButton defaultToggle;
    private javax.swing.JButton encryptButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextArea inputField;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JButton instructionsButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyField;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JTextArea outputField;
    private javax.swing.JLabel outputLabel;
    // End of variables declaration//GEN-END:variables
}
