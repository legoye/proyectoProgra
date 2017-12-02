/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ElementGeneratorController;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ElementGeneratorPanel extends JPanel {

    private JLabel stateLabel;
    private JLabel familyLabel;
    private JLabel subfamilyLabel;
    private JLabel valencyLabel;
    private JLabel quantityLabel;
    private JLabel elementLabel;
    private JComboBox<String> stateComboBox;
    private JComboBox<String> valencyComboBox;
    private JComboBox<String> familyComboBox;
    private JComboBox<String> subfamilyComboBox;
    private JComboBox<String> elementComboBox;
    private JTextField quantityField;
    private JButton createBtn;
    private ElementGeneratorController elementGeneratorController;
    
    

    public ElementGeneratorPanel() {

        this.stateLabel = new JLabel("Estado: ");
        this.familyLabel = new JLabel("Familia: ");
        this.valencyLabel = new JLabel("Valencia: ");
        this.subfamilyLabel = new JLabel("Subfamilia:");
        this.elementLabel = new JLabel("Elemento:");
        this.quantityLabel = new JLabel("Cantidad:");
        this.quantityField = new JTextField(10);
        this.createBtn = new JButton("Generar");
        
        
        createStateComboBox();
        createFamilyComboBox();
        createSubFamilyComboBox();
        createValencyComboBox();
        createElementComboBox();        
        createFormPanel();
        elementGeneratorController = new ElementGeneratorController(quantityField,createBtn);
        elementGeneratorController.initContoller();
        
    }

    private void createStateComboBox() {
        stateComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Todos");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        stateComboBox.setModel(empModel);
        stateComboBox.setSelectedIndex(0);

    }
    
    private void createFamilyComboBox() {
        familyComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Todos");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        familyComboBox.setModel(empModel);
        familyComboBox.setSelectedIndex(0);

    }
    
    private void createSubFamilyComboBox() {
        subfamilyComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Todos");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        subfamilyComboBox.setModel(empModel);
        subfamilyComboBox.setSelectedIndex(0);

    }
    
    private void createValencyComboBox() {
        valencyComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Todos");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        valencyComboBox.setModel(empModel);
        valencyComboBox.setSelectedIndex(0);

    }
    
    private void createElementComboBox() {
        elementComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Ac");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        elementComboBox.setModel(empModel);
        elementComboBox.setSelectedIndex(0);

    }

    private void createFormPanel() {
        
        Dimension dim = getPreferredSize();
        dim.width = 100;
        setPreferredSize(dim);
        Border innerBorder = BorderFactory.createTitledBorder("Generar");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        ////////////first row ///////////////////////////////////;
        gc.weightx = .5;
        gc.weighty = 0.1;
        gc.gridy = 0;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(familyLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(familyComboBox, gc);

        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(subfamilyLabel, gc);

        gc.gridx = 3;
        gc.anchor = GridBagConstraints.LINE_START;
        add(subfamilyComboBox, gc);
        
        gc.gridy = 1;
        
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(elementLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(elementComboBox, gc);

        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(valencyLabel, gc);

        gc.gridx = 3;
        gc.anchor = GridBagConstraints.LINE_START;
        add(valencyComboBox, gc);

        gc.gridx = 4;
        gc.anchor = GridBagConstraints.LINE_START;
        add(quantityLabel, gc);

        gc.gridx = 5;
        gc.anchor = GridBagConstraints.LINE_START;
        add(quantityField, gc);

        gc.gridx = 6;
        gc.anchor = GridBagConstraints.LINE_START;
        add(createBtn, gc);
        
        
        gc.weightx = .5;
        gc.weighty = 1;
        gc.gridy = 2;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel(" ") , gc);

    }

}
