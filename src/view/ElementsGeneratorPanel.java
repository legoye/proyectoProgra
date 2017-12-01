/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import elementos.Elemento;
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

public class ElementsGeneratorPanel extends JPanel {

    private JLabel chalcogenoLabel;
    private JLabel halogenoLable;
    private JLabel metalLabel;
    private JLabel metaloideLabel;
    private JLabel noMetalLabel;
    private JLabel pnictogenoLabel;
    private JLabel quantityLabel;
    private JLabel valencyLabel;
    private JLabel quantityLabel2;
    private JLabel valencyLabel2;

    private JTextField chalcogenoField;
    private JTextField halogenoField;
    private JTextField metalField;
    private JTextField metaloideField;
    private JTextField noMetalField;
    private JTextField pnictogenoField;
    private JComboBox<String> metalComboBox;
    private JComboBox<String> metalValencyComboBox;
    private JComboBox<String> metaloideComboBox;
    private JComboBox<String> metaloideValencyComboBox;
    private JComboBox<String> noMetalComboBox;
    private JComboBox<String> noMetalValencyComboBox;
    private JComboBox<String> halogenoComboBox;
    private JComboBox<String> halogenolValencyComboBox;
    private JComboBox<String> chalcogenoComboBox;
    private JComboBox<String> chalcogenoValencyComboBox;
    private JComboBox<String> pnictogenoComboBox;
    private JComboBox<String> pnictogenoValencyComboBox;
    private JButton createBtn;

    public ElementsGeneratorPanel() {
        this.chalcogenoLabel = new JLabel("Chalcogeno: ");

        this.halogenoLable = new JLabel("Halogeno: ");
        this.metalLabel = new JLabel("Metal: ");
        this.metaloideLabel = new JLabel("Metaloide: ");
        this.noMetalLabel = new JLabel("No Metal: ");
        this.pnictogenoLabel = new JLabel("Pnictogeno: ");
        this.quantityLabel = new JLabel("Cantidad: ");
        this.valencyLabel = new JLabel("Valencia: ");
        this.quantityLabel2 = new JLabel("Cantidad: ");
        this.valencyLabel2 = new JLabel("Valencia: ");
        this.chalcogenoField = new JTextField(10);
        this.halogenoField = new JTextField(10);
        this.metalField = new JTextField(10);
        this.metaloideField = new JTextField(10);
        this.noMetalField = new JTextField(10);
        this.pnictogenoField = new JTextField(10);
        this.createBtn = new JButton("Generar");
        createMetalComboBox();
        createMetaloideComboBox();
        createHalogenoComboBox();
        createNoMetalComboBox();
        createChalcogenoComboBox();
        createPnictogenoComboBox();

        createValencyMetalComboBox();
        createValencyMetaloideComboBox();
        createValencyChalcogenoComboBox();
        createValencyHalogenoComboBox();
        createValencyPnictogenoComboBox();
        createValencyNoMetalComboBox();

        createFormPanel();

    }

    private void createMetalComboBox() {
        metalComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Metal 1");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        metalComboBox.setModel(empModel);
        metalComboBox.setSelectedIndex(0);

    }

    private void createValencyMetalComboBox() {
        metalValencyComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Aleatoria");
        empModel.addElement("2");
        empModel.addElement("3");
        metalValencyComboBox.setModel(empModel);
        metalValencyComboBox.setSelectedIndex(0);

    }

    private void createMetaloideComboBox() {
        metaloideComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Metal 1");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        metaloideComboBox.setModel(empModel);
        metaloideComboBox.setSelectedIndex(0);

    }

    private void createValencyMetaloideComboBox() {
        metaloideValencyComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Aleatoria");
        empModel.addElement("2");
        empModel.addElement("3");
        metaloideValencyComboBox.setModel(empModel);
        metaloideValencyComboBox.setSelectedIndex(0);

    }

    private void createValencyChalcogenoComboBox() {
        chalcogenoValencyComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("1");
        empModel.addElement("2");
        empModel.addElement("3");
        chalcogenoValencyComboBox.setModel(empModel);
        chalcogenoValencyComboBox.setSelectedIndex(0);

    }

    private void createChalcogenoComboBox() {
        chalcogenoComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Metal 1");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        chalcogenoComboBox.setModel(empModel);
        chalcogenoComboBox.setSelectedIndex(0);

    }

    private void createValencyNoMetalComboBox() {
        noMetalValencyComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("1");
        empModel.addElement("2");
        empModel.addElement("3");
        noMetalValencyComboBox.setModel(empModel);
        noMetalValencyComboBox.setSelectedIndex(0);

    }

    private void createNoMetalComboBox() {
        noMetalComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Metal 1");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        noMetalComboBox.setModel(empModel);
        noMetalComboBox.setSelectedIndex(0);

    }

    private void createHalogenoComboBox() {
        halogenoComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Metal 1");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        halogenoComboBox.setModel(empModel);
        halogenoComboBox.setSelectedIndex(0);

    }

    private void createValencyHalogenoComboBox() {
        halogenolValencyComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("1");
        empModel.addElement("2");
        empModel.addElement("3");
        halogenolValencyComboBox.setModel(empModel);
        halogenolValencyComboBox.setSelectedIndex(0);

    }

    private void createValencyPnictogenoComboBox() {
        pnictogenoValencyComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("1");
        empModel.addElement("2");
        empModel.addElement("3");
        pnictogenoValencyComboBox.setModel(empModel);
        pnictogenoValencyComboBox.setSelectedIndex(0);

    }

    private void createPnictogenoComboBox() {
        pnictogenoComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Metal 1");
        empModel.addElement("Metal Largo 2");
        empModel.addElement("Metal 3");
        pnictogenoComboBox.setModel(empModel);
        pnictogenoComboBox.setSelectedIndex(0);

    }

    private void createFormPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 100;
        setPreferredSize(dim);
        Border innerBorder = BorderFactory.createTitledBorder("Elementos");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        //////////// First row ///////////////////////////////////
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 2;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 5);
        add(quantityLabel, gc);

//        gc.gridx = 3;
//        gc.gridy = 0;
//        gc.anchor = GridBagConstraints.LINE_START;
//        add(valencyLabel, gc);
        gc.gridx = 6;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 5);
        add(quantityLabel2, gc);

//        gc.gridx = 7;
//        gc.gridy = 0;
//        gc.anchor = GridBagConstraints.LINE_START;
//        add(valencyLabel2, gc);
        ////////////Second row ///////////////////////////////////
        gc.gridy++;
        gc.weightx = .5;
        gc.weighty = 0.1;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(metalLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(metalComboBox, gc);

        gc.weightx = 0;

        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(metalField, gc);

//        gc.gridx = 3;
//        gc.anchor = GridBagConstraints.LINE_START;
//        add(metalValencyComboBox, gc);
        gc.gridx = 4;
        gc.anchor = GridBagConstraints.LINE_START;
        add(metaloideLabel, gc);

        gc.gridx = 5;
        gc.anchor = GridBagConstraints.LINE_START;
        add(metaloideComboBox, gc);

        gc.gridx = 6;
        gc.anchor = GridBagConstraints.LINE_START;
        add(metaloideField, gc);

        //////////// Third row ///////////////////////////////////
        gc.gridy++;
        gc.weightx = .5;
        gc.weighty = 0.1;
        gc.gridy = 2;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(noMetalLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(noMetalComboBox, gc);

        gc.weightx = 0;

        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(noMetalField, gc);

//        gc.gridx = 3;
//        gc.anchor = GridBagConstraints.LINE_START;
//        add(metalValencyComboBox, gc);
        gc.gridx = 4;
        gc.anchor = GridBagConstraints.LINE_START;
        add(chalcogenoLabel, gc);

        gc.gridx = 5;
        gc.anchor = GridBagConstraints.LINE_START;
        add(chalcogenoComboBox, gc);

        gc.gridx = 6;
        gc.anchor = GridBagConstraints.LINE_START;
        add(chalcogenoField, gc);

//        gc.gridx = 7;
//        gc.anchor = GridBagConstraints.LINE_START;
//        add(metaloideValencyComboBox, gc);

        //////////// Four row ///////////////////////////////////
        gc.gridy++;
        gc.weightx = .5;
        gc.weighty = 0.1;
        gc.gridy = 3;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(halogenoLable, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(halogenoComboBox, gc);

        gc.weightx = 0;

        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(halogenoField, gc);

//        gc.gridx = 3;
//        gc.anchor = GridBagConstraints.LINE_START;
//        add(metalValencyComboBox, gc);
        gc.gridx = 4;
        gc.anchor = GridBagConstraints.LINE_START;
        add(pnictogenoLabel, gc);

        gc.gridx = 5;
        gc.anchor = GridBagConstraints.LINE_START;
        add(pnictogenoComboBox, gc);

        gc.gridx = 6;
        gc.anchor = GridBagConstraints.LINE_START;
        add(pnictogenoField, gc);

//        gc.gridx = 7;
//        gc.anchor = GridBagConstraints.LINE_START;
//        add(metaloideValencyComboBox, gc);
        //////////// Fifth row  the ok button ///////////////////////////////////
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 2.0;

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(createBtn, gc);

    }

}
