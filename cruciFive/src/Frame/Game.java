/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Atxy2k.CustomTextField.RestrictedTextField;
import crucifive.Diccionario;
import crucifive.Palabra;
import crucifive.Tablero;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListDataListener;

/**
 *
 * @author fernando
 */
public class Game extends javax.swing.JFrame {

    private Diccionario Dictionary = new Diccionario();
    private LinkedList<Palabra> listaPalabra = Dictionary.getWordsList();
    private Iterator <Palabra> iterador = listaPalabra.iterator();
    /**
     * Creates new form Game
     */
    private JTextField m[][];
    private  RestrictedTextField r[][];
    private JPanel paneljuego = new JPanel();
    
    public Game() {
        initComponents();
        setResizable(false);
        setPista();
        imprimirTextArea();
        filtrarPalabras();
        TituloDiccionario.setText( Dictionary.getName() );
        Tablero holi=new Tablero();
        crearTablero(14,14);
        jPanel1.add(paneljuego);
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
        TituloDiccionario = new javax.swing.JTextField();
        Filtro = new javax.swing.JTextField();
        Pistas = new javax.swing.JPanel();
        PistaField = new javax.swing.JTextField();
        Botones = new javax.swing.JPanel();
        AddWord = new javax.swing.JButton();
        AutoGen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        palabrasArea = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cruci-5 Game");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        TituloDiccionario.setFont(new java.awt.Font("Earth", 0, 12)); // NOI18N
        TituloDiccionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TituloDiccionario.setText("Aquí Diccionario");
        TituloDiccionario.setEnabled(false);

        Filtro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroActionPerformed(evt);
            }
        });
        Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FiltroKeyTyped(evt);
            }
        });

        PistaField.setEditable(false);
        PistaField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PistaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PistaField.setText("(Aquí va la pista)");
        PistaField.setEnabled(false);

        javax.swing.GroupLayout PistasLayout = new javax.swing.GroupLayout(Pistas);
        Pistas.setLayout(PistasLayout);
        PistasLayout.setHorizontalGroup(
            PistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PistaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
        PistasLayout.setVerticalGroup(
            PistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PistaField, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );

        java.awt.GridBagLayout BotonesLayout = new java.awt.GridBagLayout();
        BotonesLayout.columnWeights = new double[] {5.0, 5.0};
        Botones.setLayout(BotonesLayout);

        AddWord.setText("¡new Word!");
        AddWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddWordMouseClicked(evt);
            }
        });
        AddWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddWordActionPerformed(evt);
            }
        });
        Botones.add(AddWord, new java.awt.GridBagConstraints());

        AutoGen.setText("AutoGen");
        Botones.add(AutoGen, new java.awt.GridBagConstraints());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Lupita.png"))); // NOI18N

        palabrasArea.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(palabrasArea);
        palabrasArea.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Pistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloDiccionario)
                    .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(Filtro))
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TituloDiccionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddWordActionPerformed

    private void AddWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddWordMouseClicked
        // TODO add your handling code here:
        AddWord nuevoJuego = new AddWord();
        nuevoJuego.setVisible(true);
    }//GEN-LAST:event_AddWordMouseClicked

    private void FiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyTyped

    }//GEN-LAST:event_FiltroKeyTyped

    private void FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroActionPerformed
        // TODO add your handling code here:
     
                
    }//GEN-LAST:event_FiltroActionPerformed

    /**
     * @param args the command line arguments
     */
    public void crearTablero(int x, int y)
    {
         m= new JTextField[x][y];
         r= new RestrictedTextField[x][y];
         paneljuego= new JPanel();
         paneljuego.setLayout(new GridLayout (x,y));
         paneljuego.setBackground(Color.red);
         paneljuego.setBounds(50, 50, y*27,x*27);
         
         Tablero holi = new Tablero();


         holi.AutoGenCascada();
         
        for(int i=0;i<x; i++)
        {
            for(int j=0;j<y;j++)
            {
                m[i][j]=new JTextField();
                r[i][j] = new RestrictedTextField(m[i][j]);
                r[i][j].setLimit(1);
                if(holi.matrizSolucion[i][j]=='0')
                    m[i][j].setText(" ");
                else
                {
                    m[i][j].setText(""+holi.matrizSolucion[i][j]);
                    m[i][j].setBackground(Color.yellow);
                }
                
               // m[i][j].setSize(5,10);
                m[i][j].setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
                m[i][j].setHorizontalAlignment(javax.swing.JTextField.CENTER);
                paneljuego.add(m[i][j]);
            }
            
        }
        
    }
    public void filtrarPalabras(){
        
         Filtro.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrado();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrado();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
               filtrado();
               }
             private void filtrado(){
               
               iterador = listaPalabra.iterator();
               DefaultListModel modelo = new DefaultListModel();
            while (iterador.hasNext() )
                {
            Palabra palabra = iterador.next();
            
            if("".equals(Filtro.getText())){
                modelo.addElement(palabra.getWord());
            
            }else if(palabra.getWord().toLowerCase().startsWith(Filtro.getText().toLowerCase())){
                modelo.addElement(palabra.getWord()); 
                     }
                }
            palabrasArea.setModel(modelo);
            }
         }
    );}
    
    public void setPista(){
        MouseListener mouseListener;
        
        mouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                palabrasArea = (JList) mouseEvent.getSource();
                if (mouseEvent.getClickCount() == 1) {
                    int index = palabrasArea.locationToIndex(mouseEvent.getPoint());
                    if (index >= 0) {
                        Diccionario dc= new Diccionario();
                        Object palabra = palabrasArea.getModel().getElementAt(index);
                        PistaField.setText(dc.getPista(palabra.toString()));
                    }
                }
            }
        };
        
    palabrasArea.addMouseListener(mouseListener);
   
    }
    
   public void imprimirTextArea()
    {
        DefaultListModel modelo = new DefaultListModel();
        while (iterador.hasNext() )
        {
            Palabra palabra = iterador.next();
            modelo.addElement(palabra.getWord());
        }
        palabrasArea.setModel(modelo);
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tablero t = new Tablero();
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddWord;
    private javax.swing.JButton AutoGen;
    private javax.swing.JPanel Botones;
    private javax.swing.JTextField Filtro;
    private javax.swing.JTextField PistaField;
    private javax.swing.JPanel Pistas;
    private javax.swing.JTextField TituloDiccionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList palabrasArea;
    // End of variables declaration//GEN-END:variables
}

