/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DataTableReactorModel extends AbstractTableModel {

 
    private List<ReactorData> data = new ArrayList();


    private String[] colNames = {"Elemento", "Valencia"};

    public DataTableReactorModel() {
           
        
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    public void setData(List<ReactorData>data) {
        this.data = data;
    }
    
    public List<ReactorData> getData() {
        return this.data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        System.out.println(columnIndex);
        System.out.println(rowIndex);
        
        ReactorData reactorData = data.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return reactorData.getElement();
            case 1:
                return reactorData.getValencia();
         

        }
        return null;
    }
    
    public void addRow(ReactorData rowData)
    {
        data.add(rowData);
       // fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
    
    

}
