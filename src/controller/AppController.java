/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DataTableReactorModel;
import Model.MoleculaContentList;
import Model.MoleculaListModel;
import Model.ReactorData;
import elementos.Elemento;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utilities.Validations;
import view.ElementGeneratorPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import principal.Laboratorio;
import utilities.ClassMake;
import utilities.Molecula;
import utilities.Utilities;
import view.ReactorPanel;

public class AppController {

    private JTextField quantityField;
    private JButton createBtn;
    private JButton loadBtn;
    private JButton exportBtn;
    private JButton clearBtn;
    private JButton reactBtn;
    private JTable table;
    private DataTableReactorModel dataTableReactorModel;
    private ElementGeneratorPanel panelForm;
    private ReactorPanel panelReactor;
    private JComboBox<String> elementComboBox;
    private JComboBox<String> valencyComboBox;
    private JFileChooser fileChooser;
    private DataTableReactorModel tableModel;
    private MoleculaListModel listModelMolecula;


    public AppController(JPanel panelForm, JPanel panelReactor) {

        // panel form 
        this.panelReactor = (ReactorPanel) panelReactor;
        this.panelForm = (ElementGeneratorPanel) panelForm;
        this.quantityField = this.panelForm.getQuantityField();
        this.createBtn = this.panelForm.getCreateBtn();
        this.elementComboBox = this.panelForm.getElementComboBox();
        this.valencyComboBox = this.panelForm.getValencyComboBox();

        // reactor panel
        this.table = this.panelReactor.getTable();
        this.dataTableReactorModel = (DataTableReactorModel) this.table.getModel();
        this.loadBtn = this.panelReactor.getImportBtn();
        this.exportBtn = this.panelReactor.getExportBtn();
        this.fileChooser = this.panelReactor.getFileChooser();
        this.clearBtn = this.panelReactor.getClearBtn();
        this.reactBtn = this.panelReactor.getReactBtn();
        this.dataTableReactorModel = this.panelReactor.getTableModel();
        this.listModelMolecula = this.panelReactor.getMoleculaListModel();
    
    }

    public void initContoller() {

        this.createBtn.addActionListener(e -> generaElemento());
        this.loadBtn.addActionListener(e -> loadFileAction());
        this.exportBtn.addActionListener(e -> generaElemento());
        this.clearBtn.addActionListener(e -> clearReactor());
        this.reactBtn.addActionListener(e -> reaccionar());
         this.panelReactor.setReactorTableListener(a -> reaccionar());
    }

    public void reaccionar() {
        
        List<ReactorData> rd = dataTableReactorModel.getData();
        
        if(utilities.Utilities.moleculaOctecto(rd)){
            try { 
               List<Elemento> elementos = Utilities.reaccionarElementos(rd);
               Molecula m =  Utilities.generarMolecula(elementos);
               System.out.println("valencia molecula " + m.getValencia());
               System.out.println("obteniendo elementos de la molecula : " +ClassMake.getArrElementosConstructores(m));
               MoleculaContentList mcl = new MoleculaContentList();
               mcl.setTextToDislayM(ClassMake.getArrElementosConstructores(m).toString());
               mcl.setElementos(m.getElementos());
               listModelMolecula.addPersona(mcl);
             //  System.out.println(utilities.Utilities.generarMolecula(utilities.Utilities.reaccionarElementos(data))); ;
            } catch (ClassNotFoundException | NoSuchFieldException ex) {
                Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        

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

    public void clearReactor() {

        List<ReactorData> data = new ArrayList();
        panelReactor.setData(data);
        panelReactor.refresh();

    }

    public void loadFileAction() {

        if (fileChooser.showOpenDialog(panelReactor) == JFileChooser.APPROVE_OPTION) {
            try {
                loadFromFile(fileChooser.getSelectedFile());
                panelReactor.refresh();
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(panelReactor, "File not loaded", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void addData() {

        String element = elementComboBox.getSelectedItem().toString();
        Integer quantity = Integer.parseInt(quantityField.getText());
        Integer valency = Integer.parseInt(valencyComboBox.getSelectedItem().toString());

        int i = 1;

        while (i <= quantity) {
            ReactorData reactorData = new ReactorData(quantity, element, valency);
            System.out.println(this.dataTableReactorModel);
            dataTableReactorModel.addRow(reactorData);
            i++;
        }

        panelReactor.refresh();

    }

    public void saveToFile(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //    Person[] persons = people.toArray(new Person[people.size()]);
        //    oos.writeObject(persons);
        oos.close();
    }

    public void loadFromFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            DataTableReactorModel x = new DataTableReactorModel();
            //    Person[] persons = (Person[]) ois.readObject();

            //    people.clear();
            //    people.addAll(Arrays.asList(persons));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ois.close();
    }

}
