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
    
    private  JCheckBox typeNoMetalCheck;
    private  JCheckBox typeNoMetalOtrosCheck;
    private  JCheckBox typeNoMetalGasesNoblesCheck;
  
    

    
    private final JLabel stateLabel;
    private JLabel typeLabel;
    private JLabel marginLabel;

    public ReactorElementsConfigurationPanel() {
       
        
        this.stateLabel = new JLabel("Estado: ");
        this.typeLabel = new JLabel("Tipo: ");
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

        
        
        //Register a listener for the check boxes.
        stateAllCheck.addItemListener(this);
        stateSolidCheck.addItemListener(this);
        stateGasCheck.addItemListener(this);
        stateLiquidCheck.addItemListener(this);
        
        createFormPanel();
        
//        //Put the check boxes in a column in a panel
//        JPanel checkPanel = new JPanel();
//        GridLayout grid = new GridLayout(2,0);
//        grid.addLayoutComponent("", checkPanel);
//        checkPanel.add(stateLabel);
//        checkPanel.add(stateAllCheck);
//        checkPanel.add(stateSolidCheck);
//        checkPanel.add(stateGasCheck);
//        checkPanel.add(stateLiquidCheck);
//        checkPanel.add(typeLabel);
//       
//        add(checkPanel, BorderLayout.LINE_START);
////        //Put the check boxes in a column in a panel
//        JPanel checkPanel2 = new JPanel(new GridLayout(1, 0));
//        checkPanel2.add(typeLabel);
//        add(checkPanel2, BorderLayout.LINE_START);
//        
//        Border innerBorder = BorderFactory.createTitledBorder("Configuración Elementos");
//        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
//        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
  
        
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
        
        
        gc.weightx = 1;
        gc.gridx = 5;
        gc.anchor = GridBagConstraints.LINE_START;
        add(marginLabel, gc);

      

        //////////// Third row ///////////////////////////////////
        gc.gridy++;
        gc.weightx = 0;
        gc.weighty = 0.1;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.NORTHEAST;
        add(typeLabel, gc);



        

    }
    
    

}
