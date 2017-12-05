/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DataTableReactorModel;
import Model.ReactorData;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utilities.Validations;
import view.ElementGeneratorPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import view.ReactorPanel;

public class ElementGeneratorController {

    private JTextField quantityField;
    private JButton createBtn;
    private JTable table;
    private DataTableReactorModel dataTableReactorModel;
    private ElementGeneratorPanel panelForm;
    private ReactorPanel panelReactor;
    private JComboBox<String> elementComboBox;

    public ElementGeneratorController(JPanel panelForm, JPanel panelReactor) {

        // panel form 
        this.panelReactor = (ReactorPanel) panelReactor;
        this.panelForm = (ElementGeneratorPanel) panelForm;
        this.quantityField = this.panelForm.getQuantityField();
        this.createBtn = this.panelForm.getCreateBtn();
        this.elementComboBox = this.panelForm.getElementComboBox();
        
        
        // reactor panel
        this.table = this.panelReactor.getTable();
        this.dataTableReactorModel = (DataTableReactorModel) this.table.getModel();

    }

    public void initContoller() {

        this.createBtn.addActionListener(e -> generaElemento());

    }

    public void generaElemento() {

        String quantity = quantityField.getText();
        if (Validations.validateInt(quantity)) {
            JOptionPane.showMessageDialog(null, "Elementos generados exítosamente", "Mensaje del sistema", JOptionPane.INFORMATION_MESSAGE);
            addData();
        } else {

            JOptionPane.showMessageDialog(null, "Cantidad no válida", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);

        }

    }

    private HashMap createComponentMapForm(JPanel panel, HashMap componentMap) {
        componentMap = new HashMap<String, Component>();

        Component[] components = panel.getComponents();
        for (int i = 0; i < components.length; i++) {
            componentMap.put(components[i].getName(), components[i]);
        }

        return componentMap;
    }

    public Component getComponentByName(String name, HashMap componentMap) {
        if (componentMap.containsKey(name)) {
            return (Component) componentMap.get(name);
        } else {
            return null;
        }
    }

    public void addData() {
        
        String element = elementComboBox.getSelectedItem().toString();       
        Integer quantity = Integer.parseInt(quantityField.getText());
        
        ReactorData reactorData = new ReactorData(quantity, element, 0);
        System.out.println(this.dataTableReactorModel);
        dataTableReactorModel.addRow(reactorData);
        panelReactor.refresh();

    }

}
