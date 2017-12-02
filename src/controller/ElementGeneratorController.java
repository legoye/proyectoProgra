/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utilities.Validations;
import view.ElementGeneratorPanel;
import javax.swing.JOptionPane;

public class ElementGeneratorController {

    private JTextField quantityField;
    private JButton createBtn;

    public ElementGeneratorController(JTextField quantityField, JButton createBtn) {
        this.quantityField = quantityField;
        this.createBtn = createBtn;
    }

    public void initContoller() {

        this.createBtn.addActionListener(e -> generaElemento());

    }

    public void generaElemento() {

        String quantity = quantityField.getText();
        if (Validations.validateInt(quantity)) {

        } else {

            JOptionPane.showMessageDialog(null, "Cantidad no válida", "", JOptionPane.ERROR_MESSAGE);

        }

    }

}
