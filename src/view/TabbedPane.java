/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.ReactorData;
import Model.ReactorTableListener;
import controller.AppController;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

public class TabbedPane extends JPanel {

    JPanel panelForm;
    JPopupMenu jp;
            
    public TabbedPane() {
        super(new GridLayout(1, 1));

        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = createImageIcon("images/middle.gif");

        JPanel panel1 = (JPanel) MakeElementsContent();
        tabbedPane.addTab("Generar Elementos", icon, panel1,
                "Genera Elementos Químicos");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JPanel panel2 = (JPanel) MakeReactorContent();
        tabbedPane.addTab("Mis Moleculas /  Reactor", icon, panel2,
                "Mis moléculas y elementos");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        JComponent panel3 = MakeConfigurationContent();
        tabbedPane.addTab("Configuración reactor", icon, panel3,
                "Still does nothing");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        //Add the tabbed pane to this panel.
        add(tabbedPane);

        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        AppController controller = new AppController(panel1, panel2);
        controller.initContoller();
    }

    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    protected JComponent MakeElementsContent() {
        
//        Container contentPane = this.;
//        contentPane.setLayout(new GridLayout(0, 1))
//
//        Box horizontalBox;
//        horizontalBox = Box.createHorizontalBox();
//
//        horizontalBox.add(Box.createVerticalStrut(0));
//        panelForm = new ElementGeneratorPanel();
//        horizontalBox.add(panelForm);
//
//        JPanel panelG = new JPanel(new BorderLayout());
//        panelG.add(horizontalBox);
//
//        horizontalBox = Box.createHorizontalBox();
//        panel = new JPanel(new BorderLayout());
//        panel.add(horizontalBox);
//        panel.setBorder(BorderFactory.createTitledBorder("2 Middle Struts"));
//        contentPane.add(panel);

        JPanel panel = new ElementGeneratorPanel();

        return panel;
    }

    protected JComponent MakeConfigurationContent() {

        JPanel panel = new ReactorElementsConfigurationPanel();

        return panel;
    }

    protected JComponent MakeReactorContent() {
//        JPanel panel = new JPanel(false);
//        JLabel filler = new JLabel("Generar Elemetnos");
//        filler.setHorizontalAlignment(JLabel.CENTER);
//        panel.setLayout(new GridLayout(1, 1));
//        panel.add(filler);
        ReactorPanel panel = new ReactorPanel();
        List<ReactorData> data = new ArrayList<>();
        panel.setData(data);
       

        
        return panel;
    }

    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TabbedPane.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}
