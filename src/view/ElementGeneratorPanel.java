/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.ElementoConstant;
import controller.AppController;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import utilities.Filtrar;

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
    private DefaultComboBoxModel<String> familyModel = new DefaultComboBoxModel<String>();
    private DefaultComboBoxModel<String> subFamilyModel = new DefaultComboBoxModel<String>();
    private DefaultComboBoxModel<String> estateModel = new DefaultComboBoxModel<String>();
    private DefaultComboBoxModel<String> valencyModel = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> elementModel ;
    
    
    private JTextField quantityField;
    private JButton createBtn;
    private JButton serialize;
    private AppController elementGeneratorController;
    private GridBagLayout mainLayout;
    private GridBagConstraints mainCons; 
    private JFileChooser fileChooserSerialize;
    
    

    public ElementGeneratorPanel() {

        this.stateLabel = new JLabel("Estado: ");
        this.familyLabel = new JLabel("Familia: ");
        this.valencyLabel = new JLabel("Valencia: ");
        this.subfamilyLabel = new JLabel("Subfamilia:");
        this.elementLabel = new JLabel("Elemento:");
        this.quantityLabel = new JLabel("Cantidad:");
        this.quantityField = new JTextField(10);
        this.createBtn = new JButton("Enviar al reactor");
        this.serialize = new JButton("Serializar");
        this.fileChooserSerialize = new JFileChooser();
        mainLayout = new GridBagLayout();
        mainCons = new GridBagConstraints();
        this.setLayout(mainLayout);

        createStateComboBox();
        createFamilyComboBox();
        createSubFamilyComboBox();
        createValencyComboBox();
        createElementComboBox();
        mainCons.gridy = 1;
        mainCons.gridx = 1;
         
        
        mainCons.anchor = GridBagConstraints.NORTH;
        this.add(createImagePanel(),mainCons);
        mainCons.gridy = 2;
        mainCons.gridx = 1;
        mainCons.anchor = GridBagConstraints.CENTER;
        mainCons.insets = new Insets(40,0,0,0);
        this.add(createCenterPanel(),mainCons);
       
        

    }

    private void createStateComboBox() {
        stateComboBox = new JComboBox<String>();
        DefaultComboBoxModel<String> empModel = new DefaultComboBoxModel<String>();
        empModel.addElement("Todos");
        empModel.addElement("Solido");
        empModel.addElement("Liquido");
        empModel.addElement("Gaseoso");
        stateComboBox.setModel(empModel);
        stateComboBox.setSelectedIndex(0);

    }

    private void createFamilyComboBox() {
        familyComboBox = new JComboBox<String>();
        familyModel = new DefaultComboBoxModel<String>();
        familyModel.addElement("Todos");
        familyModel.addElement("Chalcogeno");
        familyModel.addElement("Halogeno");
        familyModel.addElement("Metal");
        familyModel.addElement("Metaloide");
        familyModel.addElement("No Metal");
        familyModel.addElement("Pnictogeno");
        
        familyComboBox.setModel(familyModel);
        familyComboBox.setSelectedIndex(0);

    }

    private void createSubFamilyComboBox() {
        subfamilyComboBox = new JComboBox<String>();
        subFamilyModel = new DefaultComboBoxModel<String>();
        subFamilyModel.addElement("Todos");
      
        subfamilyComboBox.setModel(subFamilyModel);
        subfamilyComboBox.setSelectedIndex(0);

    }

    private void createValencyComboBox() {
        valencyComboBox = new JComboBox<String>();
        valencyModel = new DefaultComboBoxModel<String>();
        valencyModel.addElement("Aleatoria");
   
        valencyComboBox.setModel(valencyModel);
        
        valencyComboBox.setSelectedIndex(0);

    }

    private void createElementComboBox() {
        elementComboBox = new JComboBox<String>();
        elementModel = new DefaultComboBoxModel<String>();

        Object[][] elementos = ElementoConstant.elementos;
        Object[] elementsByFilters = Filtrar.getElementsByFilters(elementos);

        for (int i = 0; i < elementsByFilters.length; i++) {

            elementModel.addElement((String) elementsByFilters[i]);
        }

        elementComboBox.setModel(elementModel);
        elementComboBox.setSelectedIndex(0);

    }
    
     private JPanel createCenterPanel()
    {
        JPanel centerPanel = new JPanel();

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        centerPanel.setLayout(gbl);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,0,0,0);
        centerPanel.add(familyLabel,gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,0,0,0);
        centerPanel.add(familyComboBox,gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,10,0,0);
        centerPanel.add(subfamilyLabel,gbc);

        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,10,0,0);
        centerPanel.add(subfamilyComboBox,gbc);

        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.WEST;
        gbc.insets = new Insets(20,0,0,0);
        centerPanel.add(stateLabel,gbc);

        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,0,0,0);
        centerPanel.add(stateComboBox,gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,0,0,0);
        centerPanel.add(elementLabel,gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,10,0,0);
        centerPanel.add(elementComboBox,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,10,0,0);
        centerPanel.add(valencyLabel,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,10,0,0);
        centerPanel.add(valencyComboBox,gbc);
        
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,10,0,0);
        centerPanel.add(quantityLabel,gbc);
        
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,10,0,0);
        centerPanel.add(quantityField,gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,7,0,0);
        centerPanel.add(createBtn,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20,7,0,0);
        centerPanel.add(serialize,gbc);



        centerPanel.setBorder(BorderFactory.createTitledBorder("Crear elementos"));
        centerPanel.validate();

        return centerPanel;

    }

    private JPanel createFormPanel() {


        Border innerBorder = BorderFactory.createTitledBorder("Elementos");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        JPanel northPanel = new JPanel();
        
        northPanel.setLayout(new GridBagLayout());

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
        add(new JLabel(" "), gc);

        gc.weightx = 400;
        gc.weighty = 200;
        gc.gridy = 3;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.SOUTH;
        
     
        return northPanel;

    }
    
     private JPanel createImagePanel() {
           
            JPanel imagePanel = new JPanel();

            imagePanel = new JPanel();
            imagePanel.setLayout(new GridLayout());

            JLabel logoLabel = new JLabel();
            logoLabel.setIcon(new ImageIcon(getClass().getResource("/images/tabla.png")));
            logoLabel.setPreferredSize(new Dimension(500, 300));
            imagePanel.add(logoLabel);
            

            return imagePanel;
         
     }

    public JComboBox<String> getElementComboBox() {
        return elementComboBox;
    }

    public JComboBox<String> getValencyComboBox() {
        return valencyComboBox;
    }

    public JComboBox<String> getStateComboBox() {
        return stateComboBox;
    }

    public void setStateComboBox(JComboBox<String> stateComboBox) {
        this.stateComboBox = stateComboBox;
    }

    public JComboBox<String> getFamilyComboBox() {
        return familyComboBox;
    }

    public void setFamilyComboBox(JComboBox<String> familyComboBox) {
        this.familyComboBox = familyComboBox;
    }

    public JComboBox<String> getSubfamilyComboBox() {
        return subfamilyComboBox;
    }

    public void setSubfamilyComboBox(JComboBox<String> subfamilyComboBox) {
        this.subfamilyComboBox = subfamilyComboBox;
    }

    public DefaultComboBoxModel<String> getElementModel() {
        return elementModel;
    }
    
    
    

    public void setElementComboBox(JComboBox<String> elementComboBox) {
        this.elementComboBox = elementComboBox;
    }

    public JTextField getQuantityField() {
        return quantityField;
    }

    public void setQuantityField(JTextField quantityField) {
        this.quantityField = quantityField;
    }

    public JButton getCreateBtn() {
        return createBtn;
    }

    public void setCreateBtn(JButton createBtn) {
        this.createBtn = createBtn;
    }

    public JButton getSerialize() {
        return serialize;
    }

    public void setFileChooserSerialize(JFileChooser fileChooserSerialize) {
        this.fileChooserSerialize = fileChooserSerialize;
    }

    public JFileChooser getFileChooserSerialize() {
        return fileChooserSerialize;
    }

    public JLabel getStateLabel() {
        return stateLabel;
    }

    public void setStateLabel(JLabel stateLabel) {
        this.stateLabel = stateLabel;
    }

    public JLabel getFamilyLabel() {
        return familyLabel;
    }

    public void setFamilyLabel(JLabel familyLabel) {
        this.familyLabel = familyLabel;
    }

    public JLabel getSubfamilyLabel() {
        return subfamilyLabel;
    }

    public void setSubfamilyLabel(JLabel subfamilyLabel) {
        this.subfamilyLabel = subfamilyLabel;
    }

    public JLabel getValencyLabel() {
        return valencyLabel;
    }

    public void setValencyLabel(JLabel valencyLabel) {
        this.valencyLabel = valencyLabel;
    }

    public JLabel getQuantityLabel() {
        return quantityLabel;
    }

    public void setQuantityLabel(JLabel quantityLabel) {
        this.quantityLabel = quantityLabel;
    }

    public JLabel getElementLabel() {
        return elementLabel;
    }

    public void setElementLabel(JLabel elementLabel) {
        this.elementLabel = elementLabel;
    }

    public DefaultComboBoxModel<String> getFamilyModel() {
        return familyModel;
    }

    public void setFamilyModel(DefaultComboBoxModel<String> familyModel) {
        this.familyModel = familyModel;
    }

    public DefaultComboBoxModel<String> getSubFamilyModel() {
        return subFamilyModel;
    }

    public void setSubFamilyModel(DefaultComboBoxModel<String> subFamilyModel) {
        this.subFamilyModel = subFamilyModel;
    }

    public DefaultComboBoxModel<String> getEstateModel() {
        return estateModel;
    }

    public void setEstateModel(DefaultComboBoxModel<String> estateModel) {
        this.estateModel = estateModel;
    }

    public DefaultComboBoxModel<String> getValencyModel() {
        return valencyModel;
    }

    public void setValencyModel(DefaultComboBoxModel<String> valencyModel) {
        this.valencyModel = valencyModel;
    }

    public AppController getElementGeneratorController() {
        return elementGeneratorController;
    }

    public void setElementGeneratorController(AppController elementGeneratorController) {
        this.elementGeneratorController = elementGeneratorController;
    }

    public GridBagLayout getMainLayout() {
        return mainLayout;
    }

    public void setMainLayout(GridBagLayout mainLayout) {
        this.mainLayout = mainLayout;
    }

    public GridBagConstraints getMainCons() {
        return mainCons;
    }

    public void setMainCons(GridBagConstraints mainCons) {
        this.mainCons = mainCons;
    }
    
    
    

}
