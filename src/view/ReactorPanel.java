/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.DataTableReactorModel;
import Model.ReactorData;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableModel;

public class ReactorPanel extends JPanel {

    private JTable table;
    private DataTableReactorModel tableModel;
    private GridBagLayout mainLayout;
    private GridBagConstraints mainCons;
    private JButton importBtn;
    private JButton exportBtn;
    private JButton reactBtn;
    private JButton clearBtn;
    private JList booklist;
    private JLabel jlabel;

    private JFileChooser fileChooser;

    public ReactorPanel() {
        mainLayout = new GridBagLayout();
        mainCons = new GridBagConstraints();
        this.setLayout(mainLayout);

        Border innerBorder = BorderFactory.createTitledBorder("Reactor");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        this.exportBtn = new JButton("Exportar");
        this.importBtn = new JButton("Importar");
        this.reactBtn = new JButton("Raccionar");
        this.clearBtn = new JButton("Vaciar Reactor");
        this.jlabel = new JLabel("Mis Elementos");
        this.fileChooser = new JFileChooser();        
        tableModel = new DataTableReactorModel();
        table = new JTable(tableModel);
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        booklist = new JList(listModel);
        
        mainCons.gridy = 1;
        mainCons.gridx = 1;
        mainCons.anchor = GridBagConstraints.NORTH;
        this.add(createReactorTable(),mainCons);
        mainCons.gridy = 2;
        mainCons.gridx = 1;
        mainCons.anchor = GridBagConstraints.CENTER;
        mainCons.insets = new Insets(20,0,0,0);
        this.add(createMoleculasPanel(),mainCons);
        

    }

    public JPanel createReactorTable() {

        JPanel rectorPanel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();        
        rectorPanel.setLayout(gbl);
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(200, 200));

        gc.weightx = .5;
        gc.weighty = 0.1;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.WEST;
        add(scrollPane, gc);

        gc.gridy = 0;
        gc.gridx = 2;
        gc.anchor = GridBagConstraints.WEST;
        add(importBtn, gc);


        gc.gridy = 0;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.WEST;;
        add(reactBtn, gc);

        gc.gridy = 0;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.WEST;
        add(clearBtn, gc);

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

        return rectorPanel;
    }
    
    private  JPanel createMoleculasPanel(){
    
        JPanel meleculasPanel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();        
        meleculasPanel.setLayout(gbl);
        JScrollPane sp = new JScrollPane(booklist);
        booklist.setPreferredSize(new Dimension(200, 200));

        gc.weightx = .5;
        gc.weighty = 0.1;
        gc.gridy = 2;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.WEST;
        add(sp, gc);

       
    
        return meleculasPanel;
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

}
