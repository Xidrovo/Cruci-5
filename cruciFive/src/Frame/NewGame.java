/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import crucifive.Diccionario;
import crucifive.Palabra;
import crucifive.Tablero;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
/**
 *
 * @author JorLuis
 */
public class NewGame extends javax.swing.JFrame {
    private Exception ButtonException;
    private LittleInmortal InmortalWindows = new LittleInmortal();
    final int _NumMax = 14;
    final int _NumMin = 4;
    private HashMap< String, String > nombresDiccionario = new HashMap();
    private Diccionario Dictionary = new Diccionario();
    /**
     * Creates new form NewGame
     */
    public NewGame() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        Normal.setSelected(true);
        nombresDiccionario.put("GC", "GeneralCulture");
        nombresDiccionario.put("Ad", "Adjetives");
        nombresDiccionario.put("Bio", "Biology");
        nombresDiccionario.put("Pro", "Programation");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DictionarySelect = new javax.swing.ButtonGroup();
        CrucigramClass = new javax.swing.ButtonGroup();
        Everything = new javax.swing.JPanel();
        MiddleLeft = new javax.swing.JPanel();
        UpperTittle = new javax.swing.JPanel();
        Tittle = new javax.swing.JTextField();
        DiccionariosLay = new javax.swing.JPanel();
        CGeneral = new javax.swing.JRadioButton();
        Adjetivos = new javax.swing.JRadioButton();
        Biologia = new javax.swing.JRadioButton();
        Programacion = new javax.swing.JRadioButton();
        CreateLayout = new javax.swing.JPanel();
        Create = new javax.swing.JButton();
        MiddleRight = new javax.swing.JPanel();
        ClassSection = new javax.swing.JPanel();
        CruciClass = new javax.swing.JPanel();
        Normal = new javax.swing.JCheckBox();
        Cascada = new javax.swing.JCheckBox();
        CruciImage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HorizontalVerticalPanel = new javax.swing.JPanel();
        Horizontal = new java.awt.Label();
        HorizontalText = new java.awt.TextField();
        Vertical = new java.awt.Label();
        VerticalText = new java.awt.TextField();
        CreateLayout1 = new javax.swing.JPanel();
        AutoGen = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Back = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diction");
        setPreferredSize(new java.awt.Dimension(1141, 662));

        Everything.setPreferredSize(new java.awt.Dimension(1141, 613));

        Tittle.setBackground(new java.awt.Color(238, 238, 238));
        Tittle.setFont(new java.awt.Font("Earth", 0, 36)); // NOI18N
        Tittle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tittle.setText("New Game Set Up");
        Tittle.setEnabled(false);
        Tittle.setRequestFocusEnabled(false);

        javax.swing.GroupLayout UpperTittleLayout = new javax.swing.GroupLayout(UpperTittle);
        UpperTittle.setLayout(UpperTittleLayout);
        UpperTittleLayout.setHorizontalGroup(
            UpperTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );
        UpperTittleLayout.setVerticalGroup(
            UpperTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
        );

        DiccionariosLay.setLayout(new java.awt.GridLayout(4, 3, 0, 20));

        DictionarySelect.add(CGeneral);
        CGeneral.setText("General Culture");
        CGeneral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CGeneralActionPerformed(evt);
            }
        });
        DiccionariosLay.add(CGeneral);

        DictionarySelect.add(Adjetivos);
        Adjetivos.setText("Adjetives");
        Adjetivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiccionariosLay.add(Adjetivos);

        DictionarySelect.add(Biologia);
        Biologia.setText("Biology");
        Biologia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiccionariosLay.add(Biologia);

        DictionarySelect.add(Programacion);
        Programacion.setText("Programation");
        Programacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Programacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgramacionActionPerformed(evt);
            }
        });
        DiccionariosLay.add(Programacion);

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        CreateLayout.setLayout(flowLayout1);

        Create.setFont(new java.awt.Font("Earth", 1, 18)); // NOI18N
        Create.setText("CREATE!!");
        Create.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateMouseClicked(evt);
            }
        });
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        CreateLayout.add(Create);

        javax.swing.GroupLayout MiddleLeftLayout = new javax.swing.GroupLayout(MiddleLeft);
        MiddleLeft.setLayout(MiddleLeftLayout);
        MiddleLeftLayout.setHorizontalGroup(
            MiddleLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MiddleLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MiddleLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(DiccionariosLay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );
        MiddleLeftLayout.setVerticalGroup(
            MiddleLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleLeftLayout.createSequentialGroup()
                .addComponent(UpperTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375)
                .addComponent(CreateLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
            .addGroup(MiddleLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MiddleLeftLayout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(DiccionariosLay, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(648, Short.MAX_VALUE)))
        );

        CruciClass.setLayout(new java.awt.GridLayout(2, 1, 0, 50));

        CrucigramClass.add(Normal);
        Normal.setText("Normal");
        Normal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NormalActionPerformed(evt);
            }
        });
        CruciClass.add(Normal);

        CrucigramClass.add(Cascada);
        Cascada.setText("Cascada");
        Cascada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CascadaActionPerformed(evt);
            }
        });
        CruciClass.add(Cascada);

        CruciImage.setLayout(new java.awt.GridLayout(2, 1, 0, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Normal.png"))); // NOI18N
        CruciImage.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprites/Cascada.png"))); // NOI18N
        CruciImage.add(jLabel2);

        javax.swing.GroupLayout ClassSectionLayout = new javax.swing.GroupLayout(ClassSection);
        ClassSection.setLayout(ClassSectionLayout);
        ClassSectionLayout.setHorizontalGroup(
            ClassSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClassSectionLayout.createSequentialGroup()
                .addComponent(CruciClass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CruciImage, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClassSectionLayout.setVerticalGroup(
            ClassSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClassSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClassSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CruciClass, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ClassSectionLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(CruciImage, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        HorizontalVerticalPanel.setLayout(new java.awt.GridLayout(2, 2, 50, 100));

        Horizontal.setAlignment(java.awt.Label.CENTER);
        Horizontal.setName("Horizontal"); // NOI18N
        Horizontal.setText("Horizontal Words");
        Horizontal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                HorizontalPropertyChange(evt);
            }
        });
        HorizontalVerticalPanel.add(Horizontal);

        HorizontalText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HorizontalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorizontalTextActionPerformed(evt);
            }
        });
        HorizontalVerticalPanel.add(HorizontalText);

        Vertical.setAlignment(java.awt.Label.CENTER);
        Vertical.setName("Vertical"); // NOI18N
        Vertical.setText("Vertical Words");
        HorizontalVerticalPanel.add(Vertical);
        HorizontalVerticalPanel.add(VerticalText);

        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout();
        flowLayout2.setAlignOnBaseline(true);
        CreateLayout1.setLayout(flowLayout2);

        AutoGen.setFont(new java.awt.Font("Earth", 1, 18)); // NOI18N
        AutoGen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AutoGen.setLabel("Auto motherfucking gen!");
        AutoGen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AutoGenMouseClicked(evt);
            }
        });
        AutoGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoGenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MiddleRightLayout = new javax.swing.GroupLayout(MiddleRight);
        MiddleRight.setLayout(MiddleRightLayout);
        MiddleRightLayout.setHorizontalGroup(
            MiddleRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClassSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MiddleRightLayout.createSequentialGroup()
                .addComponent(HorizontalVerticalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(CreateLayout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MiddleRightLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(AutoGen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MiddleRightLayout.setVerticalGroup(
            MiddleRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleRightLayout.createSequentialGroup()
                .addComponent(ClassSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HorizontalVerticalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(AutoGen)
                .addGap(18, 18, 18)
                .addComponent(CreateLayout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout EverythingLayout = new javax.swing.GroupLayout(Everything);
        Everything.setLayout(EverythingLayout);
        EverythingLayout.setHorizontalGroup(
            EverythingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EverythingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MiddleLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MiddleRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        EverythingLayout.setVerticalGroup(
            EverythingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EverythingLayout.createSequentialGroup()
                .addComponent(MiddleLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EverythingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MiddleRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        File.setText("File");

        Back.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        File.add(Back);

        MenuBar.add(File);

        Exit.setText("Edit");
        MenuBar.add(Exit);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Everything, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Everything, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        
    }//GEN-LAST:event_CreateActionPerformed

    private void AutoGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutoGenActionPerformed

    private void ProgramacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgramacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProgramacionActionPerformed

    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked
        // TODO add your handling code here:
        int y;
        try
        {
            CanDoIt();
            YesYouCan();
            putDictionaryName();
            readingDictionary();
            Tablero holi = new Tablero();
            holi.h=Integer.parseInt(HorizontalText.getText());
            holi.v=Integer.parseInt(VerticalText.getText());
            holi.setDictionary(Dictionary);
            


            Game juego=new Game();
               this.setVisible(false);
               this.dispose();
               juego.setVisible(true);
        }
            catch (JaminsonException Je)
            {
                InmortalWindows.setVisible(true);
            }
            catch (java.lang.NumberFormatException e)
                    {
                    int x = JOptionPane.showConfirmDialog(this, "MASSIVE ERROR!!", "OH MY GOSH!", JOptionPane.OK_CANCEL_OPTION);
                    }
            catch(OverNumberException OnE)
            {
                    int x = JOptionPane.showConfirmDialog(this, "Unsupported number!", "OH MY GOSH!", JOptionPane.OK_CANCEL_OPTION);
            }
            catch(UnderNumberException UnE)
            {
                    int x = JOptionPane.showConfirmDialog(this, "Unsopported number!", "OH MY GOSH!", JOptionPane.OK_CANCEL_OPTION);
            }
        catch(ButtonException Be)
        {
            int x = JOptionPane.showConfirmDialog(this, "whats wrong with you!!!", "OH MY GOSH!", JOptionPane.OK_CANCEL_OPTION );
        }
    }//GEN-LAST:event_CreateMouseClicked

    private void CGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CGeneralActionPerformed

    private void AutoGenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AutoGenMouseClicked
        // TODO add your handling code here:
        int y;
        try
        {
            CanDoIt();
            YesYouCan();
            putDictionaryName();
            readingDictionary();
            Tablero holi = new Tablero();
            holi.setPalabras(new LinkedList());
            holi.setPalabras1(new LinkedList());
            holi.setDictionary(Dictionary);
            holi.h=Integer.parseInt(HorizontalText.getText());
            holi.v=Integer.parseInt(VerticalText.getText());
            holi.AutoGenCascada();
            
            Game juego=new Game();
               this.setVisible(false);
               juego.setVisible(true);
               this.dispose();
               
        }
            catch (JaminsonException Je)
            {
                LittleInmortal InmortalWindows = new LittleInmortal();
                InmortalWindows.setVisible(true);
                System.out.println("Debe salir");
            }
            catch (java.lang.NumberFormatException e)
            {
                    int x = JOptionPane.showConfirmDialog(this, "MASSIVE ERROR!!", "OH MY GOSH!", JOptionPane.OK_CANCEL_OPTION);
            }
            catch(OverNumberException OnE)
            {
                    int x = JOptionPane.showConfirmDialog(this, "Unsupported number!", "OH MY GOSH!", JOptionPane.OK_CANCEL_OPTION);
            }
                catch(UnderNumberException UnE)
            {
                    int x = JOptionPane.showConfirmDialog(this, "Unsopported number!", "OH MY GOSH!", JOptionPane.OK_CANCEL_OPTION);
            }
                catch(ButtonException Be)
            {
                    int x = JOptionPane.showConfirmDialog(this, "whats wrong with you!!!", "OH MY GOSH!", JOptionPane.OK_CANCEL_OPTION );
            }
    }//GEN-LAST:event_AutoGenMouseClicked

    private void NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalActionPerformed
        // TODO add your handling code here:        
        if (Normal.isSelected() )
        {
            Horizontal.setText("Number of row");
            Vertical.setText("Number of Column");
        }
    }//GEN-LAST:event_NormalActionPerformed

    private void HorizontalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_HorizontalPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_HorizontalPropertyChange

    private void CascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CascadaActionPerformed
        // TODO add your handling code here:
        if (Cascada.isSelected() )
        {
            Horizontal.setText("Number of words");
            Vertical.setText("Number of words");
        }
    }//GEN-LAST:event_CascadaActionPerformed

    private void HorizontalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorizontalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorizontalTextActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        IconFrame inicio = new IconFrame();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    public void CanDoIt() throws java.lang.NumberFormatException, OverNumberException, UnderNumberException, JaminsonException
    {
            int Horizontal = Integer.parseInt(HorizontalText.getText());
            int Vertical = Integer.parseInt(VerticalText.getText());
            
            if (Horizontal == 1995 || Vertical == 1995)
                throw new JaminsonException("La Jamincepción");
            if (Horizontal >_NumMax || Vertical > _NumMax || Vertical < _NumMin)
                throw new OverNumberException("Numero mayor a 14");
            if (Horizontal < _NumMin || Vertical < _NumMin)
                throw new UnderNumberException("Numero menor a 1");
    }
    
    public void YesYouCan() throws ButtonException
            {
                            if (CGeneral.isSelected() == false && Adjetivos.isSelected() == false && Biologia.isSelected() == false && Programacion.isSelected() == false)
                                throw new ButtonException("No Todos los botones elegidos");
                            if(Normal.isSelected() == false && Cascada.isSelected() == false)
                                throw new ButtonException("No Todos los botones elegidos");
            }
    
    public void putDictionaryName()
    {
        Diccionario Dictionary = new Diccionario();
        if( CGeneral.isSelected() )
            Dictionary.setName(nombresDiccionario.get("GC"));
        else if ( Adjetivos.isSelected() )
            Dictionary.setName(nombresDiccionario.get("Ad"));
        else if ( Biologia.isSelected() )
            Dictionary.setName(nombresDiccionario.get("Bio"));
        else if ( Programacion.isSelected() )
            Dictionary.setName(nombresDiccionario.get("Pro"));
    }
    
    public void readingDictionary()
    {
        Diccionario Dictionary = new Diccionario();
        Palabra word;
        String palabra;
        String pista;
        String nombreFile = Dictionary.getName() + ".txt";
        File file = new File(nombreFile);
        try{
        FileReader Fr = new FileReader(file);
        BufferedReader Br = new BufferedReader (Fr);
        while ( (palabra = Br.readLine() ) != null)
            {
                pista = Br.readLine();
                word = new Palabra(palabra, pista);
                
                Dictionary.putWord(word);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Adjetivos;
    private javax.swing.JButton AutoGen;
    private javax.swing.JMenuItem Back;
    private javax.swing.JRadioButton Biologia;
    private javax.swing.JRadioButton CGeneral;
    private javax.swing.JCheckBox Cascada;
    private javax.swing.JPanel ClassSection;
    private javax.swing.JButton Create;
    private javax.swing.JPanel CreateLayout;
    private javax.swing.JPanel CreateLayout1;
    private javax.swing.JPanel CruciClass;
    private javax.swing.JPanel CruciImage;
    private javax.swing.ButtonGroup CrucigramClass;
    private javax.swing.JPanel DiccionariosLay;
    private javax.swing.ButtonGroup DictionarySelect;
    private javax.swing.JPanel Everything;
    private javax.swing.JMenu Exit;
    private javax.swing.JMenu File;
    private java.awt.Label Horizontal;
    private java.awt.TextField HorizontalText;
    private javax.swing.JPanel HorizontalVerticalPanel;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel MiddleLeft;
    private javax.swing.JPanel MiddleRight;
    private javax.swing.JCheckBox Normal;
    private javax.swing.JRadioButton Programacion;
    private javax.swing.JTextField Tittle;
    private javax.swing.JPanel UpperTittle;
    private java.awt.Label Vertical;
    private java.awt.TextField VerticalText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private static class OverNumberException extends Exception {

        public OverNumberException(String Mensaje) {
            super(Mensaje);
        }
    }

    private static class UnderNumberException extends Exception {

        public UnderNumberException(String Mensaje) {
            super(Mensaje);
        }
    }

    private static class ButtonException extends Exception {

        public ButtonException(String Mensaje) {
            super(Mensaje);
        }
    }

    private static class JaminsonException extends Exception {

        public JaminsonException(String Mensaje) {
            super(Mensaje);
        }
    }
}
