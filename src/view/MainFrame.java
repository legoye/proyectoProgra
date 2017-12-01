/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.Action;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class MainFrame extends JFrame {
    
    
    

    public MainFrame() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        //	progressBar.setStringPainted(true);
        //	overviewPanel.setPersonList(personListModel);

        //	setContent(overviewPanel);
        //	getContentPane().add(loadSpeedSimulationPanel, BorderLayout.NORTH);
        //	getContentPane().add(progressBar, BorderLayout.SOUTH);
        JMenuBar jMenuBar = new JMenuBar();
        setJMenuBar(jMenuBar);
        initMenu(jMenuBar);
        //Add content to the window.
        contentPane.add(new TabbedPane(), BorderLayout.CENTER);

        setSize(800, 660);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Proyecto Final");
        setLocationRelativeTo(null);
    }

    private void initMenu(JMenuBar jMenuBar) {
        initFileMenu(jMenuBar);
    }

    private void initFileMenu(JMenuBar jMenuBar) {
        JMenu fileMenu = new JMenu("Menu");
        JMenuItem menuItem;
        
        fileMenu.setMnemonic(KeyEvent.VK_A);
        fileMenu.getAccessibleContext().setAccessibleDescription(
                "Menu principal");
        jMenuBar.add(fileMenu);
        
        //a group of JMenuItems
        menuItem = new JMenuItem("Documentación",KeyEvent.VK_T);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "Documentación del sistema");
        fileMenu.add(menuItem);
        
    }

}
