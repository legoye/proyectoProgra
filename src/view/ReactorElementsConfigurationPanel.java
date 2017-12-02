/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class ReactorElementsConfigurationPanel extends JPanel implements ItemListener {
    
    private  JCheckBox stateAllCheck;
    private  JCheckBox stateSolidCheck;
    private  JCheckBox stateGasCheck;
    private  JCheckBox stateLiquidCheck;
    
    private  JCheckBox typeMetalCheck;
    private  JCheckBox typeMetalAlcalinoterreosCheck;
    private  JCheckBox typeMetalAlalinosCheck;
    private  JCheckBox typeMetalLantanidosCheck;
    private  JCheckBox typeMetalActinidosCheck;
    private  JCheckBox typeMetalTransicionCheck;
    private  JCheckBox typeMetalBloquePCheck;
    
    private  JCheckBox typeMetaloidesCheck;
    
    private  JCheckBox typeHalogenosCheck;
    
    private  JCheckBox typePnictogenosNoblesCheck;
    
    private  JCheckBox typeChalcogenosCheck;    
    
    private  JCheckBox typeNoMetalCheck;
    private  JCheckBox typeNoMetalOtrosCheck;
    private  JCheckBox typeNoMetalGasesNoblesCheck;

    
    private final JLabel stateLabel;
    private JLabel typeLabel;
    private JLabel marginLabel;

    public ReactorElementsConfigurationPanel() {
       
        // init first elements       
        this.stateLabel = new JLabel("Estado: ");        
        this.marginLabel = new JLabel("");
        this.stateAllCheck = new JCheckBox("Todos");
        this.stateAllCheck.setMnemonic(KeyEvent.VK_C);
        this.stateAllCheck.setSelected(true);        
        this.stateSolidCheck  = new JCheckBox("Sólidos");
        this.stateSolidCheck.setMnemonic(KeyEvent.VK_C);
        this.stateSolidCheck.setEnabled(false);
        this.stateGasCheck = new JCheckBox("Gases");
        this.stateGasCheck.setMnemonic(KeyEvent.VK_C);
        this.stateGasCheck.setEnabled(false);
        this.stateLiquidCheck= new JCheckBox("Líquidos");
        this.stateLiquidCheck.setMnemonic(KeyEvent.VK_C);
        this.stateLiquidCheck.setEnabled(false);
        
        // init second elements 

        this.typeLabel = new JLabel("Tipo: ");
        
        this.typeMetalCheck = new JCheckBox("Metales");
        this.typeMetalCheck.setMnemonic(KeyEvent.VK_C);
        this.typeMetalCheck.setSelected(true);
        this.typeMetalAlcalinoterreosCheck = new JCheckBox("Acalinotérreos");
        this.typeMetalAlcalinoterreosCheck.setMnemonic(KeyEvent.VK_C);
        this.typeMetalAlcalinoterreosCheck.setSelected(true);    
        this.typeMetalAlalinosCheck = new JCheckBox("Alcalinos");
        this.typeMetalAlalinosCheck.setMnemonic(KeyEvent.VK_C);
        this.typeMetalAlalinosCheck.setSelected(true);    
        this.typeMetalLantanidosCheck = new JCheckBox("Lantanidos");
        this.typeMetalLantanidosCheck.setMnemonic(KeyEvent.VK_C);
        this.typeMetalLantanidosCheck.setSelected(true); 
        this.typeMetalActinidosCheck = new JCheckBox("Actínidos");
        this.typeMetalActinidosCheck.setMnemonic(KeyEvent.VK_C);
        this.typeMetalActinidosCheck.setSelected(true); 
        this.typeMetalTransicionCheck = new JCheckBox("De transición");
        this.typeMetalTransicionCheck.setMnemonic(KeyEvent.VK_C);
        this.typeMetalTransicionCheck.setSelected(true);
        this.typeMetalBloquePCheck = new JCheckBox("Bloque p");
        this.typeMetalBloquePCheck.setMnemonic(KeyEvent.VK_C);
        this.typeMetalBloquePCheck.setSelected(true); 
        
        //Register a listener for the check boxes.
        
        // first form elements
        stateAllCheck.addItemListener(this);
        stateSolidCheck.addItemListener(this);
        stateGasCheck.addItemListener(this);
        stateLiquidCheck.addItemListener(this);
        
         // second form elements
        typeMetalCheck.addItemListener(this);
        typeMetalAlalinosCheck.addItemListener(this);
        typeMetalAlcalinoterreosCheck.addItemListener(this);
        typeMetalLantanidosCheck.addItemListener(this);
        typeMetalActinidosCheck.addItemListener(this);
        typeMetalTransicionCheck.addItemListener(this);
        typeMetalBloquePCheck.addItemListener(this);
        
        createFormPanel();
        

  
        
    }
    
    /** Listens to the check boxes. */
    @Override
    public void itemStateChanged(ItemEvent e) {

        Object source = e.getItemSelectable();
        
        JCheckBox checked =  (JCheckBox) source;
        

        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (source == stateAllCheck) {
                this.stateGasCheck.setEnabled(false);
                this.stateSolidCheck.setEnabled(false);
                this.stateLiquidCheck.setEnabled(false);
                this.stateGasCheck.setSelected(true);
                this.stateSolidCheck.setSelected(true); 
                this.stateLiquidCheck.setSelected(true); 
                

            } else if (source == stateSolidCheck) {
              
            } else if (source == stateGasCheck) {
              
            } else if (source == stateLiquidCheck) {
            
            }
        
        }

        if (e.getStateChange() == ItemEvent.DESELECTED) {
            if (source == stateAllCheck) {
                this.stateGasCheck.setEnabled(true);
                this.stateSolidCheck.setEnabled(true);
                this.stateLiquidCheck.setEnabled(true);

            } else if (source == stateSolidCheck) {
              
            } else if (source == stateGasCheck) {
               
            } else if (source == stateLiquidCheck) {
              
            }
            
            
           
        }


    }
    
    
      private void createFormPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 50;
        setPreferredSize(dim);
        Border innerBorder = BorderFactory.createTitledBorder("Elementos");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        
        GridBagLayout grid = new GridBagLayout();
        

        setLayout(grid);

        GridBagConstraints gc = new GridBagConstraints();
        
        
        ////////////Second row ///////////////////////////////////

        gc.weightx = 0;
        gc.weighty = 0;
        gc.gridy = 0;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(stateLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(stateAllCheck, gc);

        gc.weightx = 0;

        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(stateGasCheck, gc);

        gc.gridx = 3;
        gc.anchor = GridBagConstraints.LINE_START;
        add(stateLiquidCheck, gc);
        gc.gridx = 4;
        gc.anchor = GridBagConstraints.LINE_START;
        add(stateSolidCheck, gc);
        
        
//        gc.weightx = 1;
//        gc.gridx = 5;
//        gc.anchor = GridBagConstraints.LINE_START;
//        add(marginLabel, gc);

      

        //////////// Third row ///////////////////////////////////
        gc.gridy++;
        gc.weightx = 0;
        gc.weighty = 0.1;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.NORTHEAST;
        add(typeLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.NORTHEAST;
        add(typeMetalCheck, gc);
        
        gc.gridx = 2;
        gc.anchor = GridBagConstraints.NORTHEAST;
        add(typeMetalAlalinosCheck, gc);
        
        gc.gridx = 3;
        gc.anchor = GridBagConstraints.NORTHEAST;
        add(typeMetalAlcalinoterreosCheck, gc);
        
        gc.gridx = 4;
        gc.anchor = GridBagConstraints.NORTHEAST;
        add(typeMetalLantanidosCheck, gc);
        
        gc.gridx = 5;
        gc.anchor = GridBagConstraints.NORTHEAST;
        add(typeMetalActinidosCheck, gc);
        
        gc.gridx = 6;
        gc.anchor = GridBagConstraints.NORTHEAST;
        add(typeMetalTransicionCheck, gc);
        
        gc.gridx = 7;
        gc.anchor = GridBagConstraints.NORTHEAST;
        add(typeMetalBloquePCheck, gc);



        

    }
    
    

}
