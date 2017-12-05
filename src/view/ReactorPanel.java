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
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableModel;

public class ReactorPanel extends JPanel {

    private JTable table;
    private DataTableReactorModel tableModel;
    private JButton importBtn;
    private JButton exportBtn;
    private JButton reactBtn;

    public ReactorPanel() {
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

      
        
        Border innerBorder = BorderFactory.createTitledBorder("Reactor");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        tableModel = new DataTableReactorModel();
        table = new JTable(tableModel);
        
        //      table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        //     table.setFillsViewportHeight(true);

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        
         ////////////first row ///////////////////////////////////;
        gc.weightx = .5;
        gc.weighty = 0.1;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.WEST;
        add(scrollPane, gc);
        
        gc.gridy = 0;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 5);
        
        this.exportBtn = new JButton("Exportar");
        this.importBtn = new JButton("Importar");
        this.reactBtn = new JButton("Raccionar");
        		
        add(exportBtn, gc);
        gc.gridy = 0;
        gc.gridx = 2;
        gc.insets = new Insets(0, 0, 0, 5);
        add(importBtn, gc);
        
        gc.gridy = 0;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 5);        
        add(exportBtn, gc);
        
        gc.gridy = 0;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.WEST;
        gc.insets = new Insets(0, 0, 0, 5);
        add(reactBtn, gc);

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

}
