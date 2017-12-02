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
import javax.swing.JTextField;
import view.ElementGeneratorPanel;

public class ElementGeneratorController {

    private JTextField quantityField;

    public ElementGeneratorController(JTextField quantityField) {
        this.quantityField = quantityField;
    }

    public void initContoller() {

        this.quantityField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)){
                  e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if(!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)){
                  e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if(!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE)){
                  e.consume();
                }
            }

        });
        
        
        
        
    }


}
