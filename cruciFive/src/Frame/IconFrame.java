/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.applet.AudioClip;
import javax.swing.ImageIcon;

/**
 *
 * @author fernando
 */
public class IconFrame extends javax.swing.JFrame {

    /**
     * Creates new form IconFrame
     */
    private AudioClip sonido;
    public IconFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Main Menu");
        try{
        setIconImage ( new ImageIcon(getClass().getResource("../Sprites/Crucify-Icono.png")).getImage());
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("../SoundTrack/NewAcesHigh.wav"));
        sonido.play();
        sonido.loop();}        
        catch (Exception e){
        }

    
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
        Continue = new javax.swing.JButton();
        setLocationRelativeTo(null);
        newGame = new javax.swing.JButton();
        setLocationRelativeTo(null);
        Options = new javax.swing.JButton();
        setLocationRelativeTo(null);
        aboutUs = new javax.swing.JButton();
        setLocationRelativeTo(null);
        exit = new javax.swing.JButton();
        setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cruci5");
        setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Crucify-Logo.png"))); // NOI18N

        Continue.setBackground(new java.awt.Color(153, 153, 255));
        Continue.setText("Continue");
        Continue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Continue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        newGame.setBackground(new java.awt.Color(153, 153, 255));
        newGame.setText("New game");
        newGame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        newGame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        Options.setBackground(new java.awt.Color(153, 153, 255));
        Options.setText("Options");
        Options.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Options.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsActionPerformed(evt);
            }
        });

        aboutUs.setBackground(new java.awt.Color(153, 153, 255));
        aboutUs.setText("About us");
        aboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(153, 153, 255));
        exit.setText("Exit");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1117, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Options, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 501, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Continue)
                .addGap(52, 52, 52)
                .addComponent(newGame)
                .addGap(52, 52, 52)
                .addComponent(Options)
                .addGap(52, 52, 52)
                .addComponent(aboutUs)
                .addGap(52, 52, 52)
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        // TODO add your handling code here:
        Game LinkToGame = new Game();
        LinkToGame.setVisible(true);
        sonido.stop();
        dispose();
        
    }//GEN-LAST:event_ContinueActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        // TODO add your handling code here:
        NewGame LinkToGame = new NewGame();
        LinkToGame.setVisible(true);
        sonido.stop();
        dispose();
    }//GEN-LAST:event_newGameActionPerformed

    private void OptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptionsActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutUsActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IconFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JButton Options;
    private javax.swing.JButton aboutUs;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newGame;
    // End of variables declaration//GEN-END:variables
}
