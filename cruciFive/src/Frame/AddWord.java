/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class AddWord extends javax.swing.JFrame {
   
    /**
     * Creates new form AddWord
     */
    
    private         File Archivo = new File("Files/GeneralCulture.txt");
    public AddWord() {
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

        Tittle = new javax.swing.JPanel();
        DictionaryName = new javax.swing.JTextField();
        WordPanel = new javax.swing.JPanel();
        Obligador = new javax.swing.JLabel();
        WordAdder = new javax.swing.JTextField();
        CluePanel = new javax.swing.JPanel();
        ClueAdder = new javax.swing.JLabel();
        ClueSection = new javax.swing.JScrollPane();
        MoreClueSection = new javax.swing.JTextArea();
        ButtonPanel = new javax.swing.JPanel();
        AddWord = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Word");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        DictionaryName.setFont(new java.awt.Font("Earth", 0, 14)); // NOI18N
        DictionaryName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DictionaryName.setText("(Diccionario here)");
        DictionaryName.setEnabled(false);

        javax.swing.GroupLayout TittleLayout = new javax.swing.GroupLayout(Tittle);
        Tittle.setLayout(TittleLayout);
        TittleLayout.setHorizontalGroup(
            TittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DictionaryName)
                .addContainerGap())
        );
        TittleLayout.setVerticalGroup(
            TittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DictionaryName, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        Obligador.setText("Ingrese la palabra aquí: ");

        javax.swing.GroupLayout WordPanelLayout = new javax.swing.GroupLayout(WordPanel);
        WordPanel.setLayout(WordPanelLayout);
        WordPanelLayout.setHorizontalGroup(
            WordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Obligador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WordPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(WordAdder, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        WordPanelLayout.setVerticalGroup(
            WordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WordPanelLayout.createSequentialGroup()
                .addComponent(Obligador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WordAdder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        ClueAdder.setText("Ingrese la pista aquí: ");

        MoreClueSection.setColumns(20);
        MoreClueSection.setRows(5);
        ClueSection.setViewportView(MoreClueSection);

        ButtonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 35));

        AddWord.setText("Add Word");
        AddWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddWordMouseClicked(evt);
            }
        });
        ButtonPanel.add(AddWord);

        Cancel.setText("Cancel");
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });
        ButtonPanel.add(Cancel);

        jLabel1.setText("*Recuerda poner una pista que sea fácil de entender");

        javax.swing.GroupLayout CluePanelLayout = new javax.swing.GroupLayout(CluePanel);
        CluePanel.setLayout(CluePanelLayout);
        CluePanelLayout.setHorizontalGroup(
            CluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CluePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CluePanelLayout.createSequentialGroup()
                        .addComponent(ClueAdder)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ClueSection, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CluePanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CluePanelLayout.setVerticalGroup(
            CluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CluePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClueAdder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClueSection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CancelMouseClicked

    private void AddWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddWordMouseClicked
        // TODO add your handling code here:
 
        System.out.println(Archivo.getAbsolutePath());
        System.out.println(Archivo.getName() );

        try{
        File probarEsto = Archivo.getAbsoluteFile();
            
        FileReader fr = new FileReader("Files/GeneralCulture.txt");
        BufferedReader Br = new BufferedReader(fr);
        System.out.println( Br.readLine() );
        
        } catch (FileNotFoundException ex) {
            System.out.println("Hubo un error en el FileReader");
        }
          catch (IOException ex) {
            System.out.println("Hubo un error en el BufferedReader");
        }
    }//GEN-LAST:event_AddWordMouseClicked

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
            java.util.logging.Logger.getLogger(AddWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddWord;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel ClueAdder;
    private javax.swing.JPanel CluePanel;
    private javax.swing.JScrollPane ClueSection;
    private javax.swing.JTextField DictionaryName;
    private javax.swing.JTextArea MoreClueSection;
    private javax.swing.JLabel Obligador;
    private javax.swing.JPanel Tittle;
    private javax.swing.JTextField WordAdder;
    private javax.swing.JPanel WordPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
