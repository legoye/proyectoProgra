/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.DataTableReactorModel;
import Model.MoleculaListModel;
import Model.ReactorData;
import Model.ReactorTableListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableModel;

public final class ReactorPanel extends JPanel {

    private JPanel reactorPanel;
    private JPanel moleculasPanel;
    private JTable table;
    private DataTableReactorModel tableModel;
    private GridBagLayout mainLayout;
    private GridBagConstraints mainCons;
    private JButton importBtn;
    private JButton exportBtn;
    private JButton reactBtn;
    private JButton clearBtn;
    private JButton addReactorBtn;
    private JList booklist;
    private JLabel jlabel;
    private MoleculaListModel moleculaListModel;
    private ReactorTableListener reactorTableListener;
    private JPopupMenu popup;

    private JFileChooser fileChooser;
    private JMenuItem removeItem;

    public ReactorPanel() {
        mainLayout = new GridBagLayout();
        mainCons = new GridBagConstraints();
        this.setLayout(mainLayout);

        this.exportBtn = new JButton("Exportar");
        this.importBtn = new JButton("Importar");
        this.reactBtn = new JButton("Raccionar");
        this.clearBtn = new JButton("Vaciar Reactor");
        this.addReactorBtn = new JButton("Agregar al Reactor");
        this.jlabel = new JLabel("Mis Elementos");
        this.fileChooser = new JFileChooser();
        tableModel = new DataTableReactorModel();
        table = new JTable(tableModel);

        popup = new JPopupMenu();

        removeItem = new JMenuItem("Borrar");
        popup.add(removeItem);

        moleculaListModel = new MoleculaListModel();
        booklist = new JList(moleculaListModel);

        mainCons.gridy = 1;
        mainCons.gridx = 0;
        mainCons.anchor = GridBagConstraints.BASELINE;
        mainCons.insets = new Insets(1, 0, 0, 0);
        this.add(createReactorFormPanel(), mainCons);
        mainCons.gridy = 2;
        mainCons.gridx = 1;
        mainCons.anchor = GridBagConstraints.BASELINE;
        mainCons.insets = new Insets(1, 0, 1, 0);
        this.add(createReactorTable(), mainCons);
        mainCons.gridy = 3;
        mainCons.gridx = 0;
        mainCons.anchor = GridBagConstraints.WEST;
        mainCons.insets = new Insets(1, 0, 0, 0);
        this.add(createControlsFormMoleculasPanel(), mainCons);
        mainCons.gridy = 4;
        mainCons.gridx = 1;
        mainCons.anchor = GridBagConstraints.BASELINE;
        mainCons.insets = new Insets(1, 0, 0, 0);
        this.add(createMoleculasPanel(), mainCons);

    }

    public JPanel createReactorTable() {

        reactorPanel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();
        reactorPanel.setLayout(gbl);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(400, 200));

        gc.weightx = .5;
        gc.weighty = 0.5;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(15, 0, 0, 0);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.anchor = GridBagConstraints.WEST;
        add(scrollPane, gc);

//        gc.gridy = 0;
//        gc.gridx = 2;
//        gc.anchor = GridBagConstraints.WEST;
//        add(importBtn, gc);
//
//
//        gc.gridy = 0;
//        gc.gridx = 0;
//        gc.anchor = GridBagConstraints.WEST;;
//        add(reactBtn, gc);
//
//        gc.gridy = 0;
//        gc.gridx = 1;
//        gc.anchor = GridBagConstraints.WEST;
//        add(clearBtn, gc);
//        gc.weighty = .2;
//        gc.gridy = 2;
//        gc.gridx = 0;
//        gc.anchor = GridBagConstraints.FIRST_LINE_START;
//        add(jlabel, gc);
//
//        gc.weighty = .6;
//        gc.gridy = 3;
//        gc.gridx = 0;
//        gc.anchor = GridBagConstraints.FIRST_LINE_START;
//        JScrollPane sp = new JScrollPane(booklist);
//        booklist.setPreferredSize(new Dimension(200, 200));
//        add(sp, gc);
        Border b = BorderFactory.createTitledBorder("Reactor");

        reactorPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        reactorPanel.validate();
        return reactorPanel;
    }

    private JPanel createControlsFormMoleculasPanel() {
        JPanel moleculasPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        moleculasPanel.add(addReactorBtn);
        moleculasPanel.add(importBtn);
        moleculasPanel.add(exportBtn);
        moleculasPanel.setBorder(BorderFactory.createTitledBorder("Mis Moleculas"));

        return moleculasPanel;
    }

    private JPanel createReactorFormPanel() {
        JPanel moleculasPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        moleculasPanel.add(reactBtn);
        moleculasPanel.add(clearBtn);
        moleculasPanel.setBorder(BorderFactory.createTitledBorder("Reactor"));

        return moleculasPanel;
    }

    private JPanel createMoleculasPanel() {

        moleculasPanel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();
        moleculasPanel.setLayout(gbl);
        JScrollPane sp = new JScrollPane(booklist);
        booklist.setPreferredSize(new Dimension(200, 200));

        gc.weightx = .5;
        gc.weighty = 0.1;
        gc.gridy = 4;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.WEST;
        add(sp, gc);

        moleculasPanel.setBorder(BorderFactory.createTitledBorder("Mis Moleculas"));

        return moleculasPanel;
    }

    public DataTableReactorModel getModel() {
        return tableModel;
    }

    public void setData(List<ReactorData> data) {
        tableModel.setData(data);
    }

    public void refresh() {
        tableModel.fireTableDataChanged();
    }
//	public void setPersonTableListener(PersonTableListener listener){
//		this.personTableListener = listener;
//	}

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public DataTableReactorModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DataTableReactorModel tableModel) {
        this.tableModel = tableModel;
    }

    public JButton getImportBtn() {
        return importBtn;
    }

    public JButton getExportBtn() {
        return exportBtn;
    }

    public JButton getReactBtn() {
        return reactBtn;
    }

    public JFileChooser getFileChooser() {
        return fileChooser;
    }

    public JButton getClearBtn() {
        return clearBtn;
    }

    public void setClearBtn(JButton clearBtn) {
        this.clearBtn = clearBtn;
    }

    public MoleculaListModel getMoleculaListModel() {
        return moleculaListModel;
    }

    public void setReactorTableListener(ReactorTableListener listener) {
        System.out.println("definido el panel reactor listener");
        this.reactorTableListener = listener;
    }

    public JPopupMenu getPopup() {
        return popup;
    }

    public JMenuItem getRemoveItem() {
        return removeItem;
    }

    public void setRemoveItem(JMenuItem removeItem) {
        this.removeItem = removeItem;
    }

    public ReactorTableListener getReactorTableListener() {
        
        return reactorTableListener;
    }

        
}
