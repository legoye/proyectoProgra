/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DataTableReactorModel;
import Model.ElementoConstant;
import Model.MoleculaContentList;
import Model.MoleculaListModel;
import Model.ReactorData;
import Model.ReactorTableListener;
import elementos.Elemento;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utilities.Validations;
import view.ElementGeneratorPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import principal.Laboratorio;
import utilities.ClassMake;
import utilities.Filtrar;
import utilities.Molecula;
import utilities.Serializacion;
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
    private JComboBox<String> familyComboBox;
    private JComboBox<String> subFamilyComboBox;
    private JComboBox<String> stateComboBox;
    private JComboBox<String> valencyComboBox;
    private DefaultComboBoxModel<String> familyModel;
    private DefaultComboBoxModel<String> subFamilyModel;
    private DefaultComboBoxModel<String> estateModel;
    private DefaultComboBoxModel<String> valencyModel;
    private DefaultComboBoxModel<String> elementModel;

    private JFileChooser fileChooser;
    private JFileChooser fileChooserSerialize;
    private MoleculaListModel listModelMolecula;
    private JMenuItem removeItem;
    private ReactorTableListener reactorTableListener;
    private JPopupMenu popup;
    private JButton serialize;
    private JButton loadSerializeE;

    public AppController(JPanel panelForm, JPanel panelReactor) {

        // panel form 
        this.panelReactor = (ReactorPanel) panelReactor;
        this.panelForm = (ElementGeneratorPanel) panelForm;
        this.quantityField = this.panelForm.getQuantityField();
        this.createBtn = this.panelForm.getCreateBtn();
        this.elementComboBox = this.panelForm.getElementComboBox();
        this.valencyComboBox = this.panelForm.getValencyComboBox();
        this.serialize = this.panelForm.getSerialize();
        this.familyComboBox = this.panelForm.getFamilyComboBox();
        this.subFamilyComboBox = this.panelForm.getSubfamilyComboBox();
        this.stateComboBox = this.panelForm.getStateComboBox();
        this.familyModel = this.panelForm.getFamilyModel();
        this.subFamilyModel = this.panelForm.getSubFamilyModel();
        this.elementModel = this.panelForm.getElementModel();
        this.valencyModel = this.panelForm.getValencyModel();

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
        this.removeItem = this.panelReactor.getRemoveItem();
        this.popup = this.panelReactor.getPopup();
        this.fileChooserSerialize = this.panelReactor.getFileChooserSerializeElement();
        this.loadSerializeE = this.panelReactor.getLoadSerializeBtn();

    }

    public void initContoller() {

        this.createBtn.addActionListener(e -> generaElemento());
        this.familyComboBox.addItemListener((ItemEvent event) -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                String item = (String) event.getItem();
                changeSubfamilyContent(item);
                fillElementsByFamily(item);

            }
        });
        this.subFamilyComboBox.addItemListener((ItemEvent event) -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                String item = (String) event.getItem();

                fillElementsBySubFamily(item);

            }
        });

        this.stateComboBox.addItemListener((ItemEvent event) -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                String item = (String) event.getItem();

                fillElementsByState(item);

            }
        });

        this.elementComboBox.addItemListener((ItemEvent event) -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                String item = (String) event.getItem();

                fillValenciasByElement(item);

            }
        });

        this.serialize.addActionListener(e -> {
            try {
                saveFileElementSerializeRuta();
            } catch (ClassNotFoundException | NoSuchFieldException ex) {
                Logger.getLogger(AppController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        this.loadSerializeE.addActionListener(e -> {
            loadFileElementSerialize();
        });

        this.loadBtn.addActionListener(e -> loadFileMolecula());

        this.exportBtn.addActionListener(e -> generaElemento());
        this.clearBtn.addActionListener(e -> clearReactor());
        this.reactBtn.addActionListener(e -> reaccionar());
        this.panelReactor.setReactorTableListener(new ReactorTableListener() {

            @Override
            public void rowDeleted(int row) {
                System.out.println("definiendo row delete");
                deleteRowTableReactor(row);
            }
        });
        this.removeItem.addActionListener(e -> leftClickDelete());
        this.table.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                table.getSelectionModel().setSelectionInterval(row, row);
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popup.show(table, e.getX(), e.getY());
                }
            }

        });
    }

    public void leftClickDelete() {
        System.out.println("click delete event");
        this.reactorTableListener = this.panelReactor.getReactorTableListener();
        int row = table.getSelectedRow();
        if (reactorTableListener != null) {
            reactorTableListener.rowDeleted(row);
            dataTableReactorModel.fireTableRowsDeleted(row, row);
        }
    }

    public void deleteRowTableReactor(int row) {
        System.out.println("entra a borrar tabla");
        List<ReactorData> rd = dataTableReactorModel.getData();
        System.out.println(rd);
        rd.remove(row);
        System.out.println(rd);
        panelReactor.refresh();

    }

    public void reaccionar() {

        List<ReactorData> rd = dataTableReactorModel.getData();

        if (utilities.Utilities.moleculaOctecto(rd)) {
            try {
                List<Elemento> elementos = Utilities.reaccionarElementos(rd);
                Molecula m = Utilities.generarMolecula(elementos);
                System.out.println("valencia molecula " + m.getValencia());
                System.out.println("obteniendo elementos de la molecula : " + ClassMake.getArrElementosConstructores(m));
                MoleculaContentList mcl = new MoleculaContentList();
                mcl.setTextToDislayM(ClassMake.makeMoleculasName(m) + " " + ClassMake.getArrElementosConstructores(m).toString());
                mcl.setElementos(m.getElementos());

                listModelMolecula.addPersona(mcl);
                clearReactor();
                JOptionPane.showMessageDialog(null, "Molecula generada exítosamente", "Mensaje del sistema", JOptionPane.INFORMATION_MESSAGE);
                //  System.out.println(utilities.Utilities.generarMolecula(utilities.Utilities.reaccionarElementos(data))); ;
            } catch (ClassNotFoundException | NoSuchFieldException ex) {
                Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            JOptionPane.showMessageDialog(null, "No se puede cumplir la reacción, revisar regla de octecto.", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
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

    public void fillElementsByFamily(String family) {

        elementModel.removeAllElements();

        if (!family.equals("Todos")) {

            Object[] elements = Filtrar.getElementsByFamily(family, ElementoConstant.elementos);

            if (elements != null) {
                for (int i = 0; i < elements.length; i++) {

                    elementModel.addElement((String) elements[i]);
                }

            }

        } else {

            Object[][] elementos = ElementoConstant.elementos;
            Object[] elementsByFilters = Filtrar.getElementsByFilters(elementos);

            for (int i = 0; i < elementsByFilters.length; i++) {

                elementModel.addElement((String) elementsByFilters[i]);
            }

        }

        elementComboBox.setModel(elementModel);

    }

    public void fillValenciasByElement(String element) {

        valencyModel.removeAllElements();

        int[] valencias = Filtrar.getValencyByElement(element, ElementoConstant.elementos);

        if (valencias != null) {
            for (int i = 0; i < valencias.length; i++) {
                Integer v = null;

                try {
                    v = (Integer) valencias[i];

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                valencyModel.addElement(v.toString());
            }

        }

        valencyComboBox.setModel(valencyModel);

    }

    public void fillElementsBySubFamily(String subFamily) {

        elementModel.removeAllElements();

        if (!subFamily.equals("Todos")) {

            Object[] elements = Filtrar.getElementsBySubFamily(subFamily, ElementoConstant.elementos);

            if (elements != null) {
                for (int i = 0; i < elements.length; i++) {

                    elementModel.addElement((String) elements[i]);
                }

            }

        } else {

            Object[][] elementos = ElementoConstant.elementos;
            Object[] elementsByFilters = Filtrar.getElementsByFilters(elementos);

            for (int i = 0; i < elementsByFilters.length; i++) {

                elementModel.addElement((String) elementsByFilters[i]);
            }

        }

        elementComboBox.setModel(elementModel);

    }

    public void fillElementsByState(String state) {

        elementModel.removeAllElements();

        if (!state.equals("Todos")) {

            Object[] elements = Filtrar.getElementsByState(state, ElementoConstant.elementos);

            if (elements != null) {
                for (int i = 0; i < elements.length; i++) {

                    elementModel.addElement((String) elements[i]);
                }

            }

        } else {

            Object[][] elementos = ElementoConstant.elementos;
            Object[] elementsByFilters = Filtrar.getElementsByFilters(elementos);

            for (int i = 0; i < elementsByFilters.length; i++) {

                elementModel.addElement((String) elementsByFilters[i]);
            }

        }

        elementComboBox.setModel(elementModel);

    }

    public void changeSubfamilyContent(String family) {

        subFamilyModel.removeAllElements();
        String[] elements = Filtrar.getSubfamiliesByType(family);
        subFamilyModel.addElement("Todos");

        if (elements != null) {
            for (int i = 0; i < elements.length; i++) {

                subFamilyModel.addElement(elements[i]);
            }

        }

        subFamilyComboBox.setModel(subFamilyModel);

    }

    public void clearReactor() {

        List<ReactorData> data = new ArrayList();
        panelReactor.setData(data);
        panelReactor.refresh();

    }

    public void saveFileElementSerializeRuta() throws ClassNotFoundException, NoSuchFieldException {

        if (Validations.validateInt(quantityField.getText())) {

            if (fileChooser.showSaveDialog(panelReactor) == JFileChooser.APPROVE_OPTION) {
                try {
                    saveFileElementSerialize(fileChooser.getSelectedFile());

                } catch (IOException e1) {
                    JOptionPane.showMessageDialog(panelReactor, "File not loaded", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

            JOptionPane.showMessageDialog(null, "Elementos serializados exítosamente", "Mensaje del sistema", JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(null, "Cantidad no válida", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void saveFileElementSerialize(File file) throws IOException, ClassNotFoundException, NoSuchFieldException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        String element = elementComboBox.getSelectedItem().toString();
        Integer quantity = Integer.parseInt(quantityField.getText());
        Integer valency = 0;
        try {
            valency = Integer.parseInt(valencyComboBox.getSelectedItem().toString());
        } catch (NumberFormatException e) {

            valency = 999;
        }
        Elemento e;

        int i = 1;
        if (quantity == 1) {

            Elemento ele = Serializacion.generaIntanciaElemento(element, valency);
            oos.writeObject(ele);
            oos.close();

        } else {
            List<Elemento> elementos = new ArrayList();

            while (i <= quantity) {
                Elemento ele = Serializacion.generaIntanciaElemento(element, valency);
                elementos.add(ele);
                i++;
            }
            oos.writeObject(elementos);
            oos.close();

        }

    }

    public void loadFileElementSerialize() {

        if (fileChooser.showOpenDialog(panelReactor) == JFileChooser.APPROVE_OPTION) {
            try {
                FileInputStream fis = new FileInputStream(fileChooser.getSelectedFile());
                ObjectInputStream ois = new ObjectInputStream(fis);

                try {
                    List<Elemento> e =  (List<Elemento>) ois.readObject();
                    
                    for(int i = 0; i< e.size(); i++){
                        
                        String nameElement = e.get(i).getClass().toString();
                        nameElement = nameElement.substring(16);
                        ReactorData reactorData = new ReactorData(0, nameElement, e.get(i).getValencia());
                        System.out.println(this.dataTableReactorModel);
                        dataTableReactorModel.addRow(reactorData);
                    
                    }
                    

                } catch (ClassNotFoundException e) {
                    
                    e.printStackTrace();
                }
                ois.close();
                panelReactor.refresh();
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(panelReactor, "File not loaded", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    public void loadFileMolecula() {

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
        Integer valency = 0;
        try {
            valency = Integer.parseInt(valencyComboBox.getSelectedItem().toString());
        } catch (NumberFormatException e) {

            valency = 999;
        }

        int i = 1;

        while (i <= quantity) {
            ReactorData reactorData = new ReactorData(quantity, element, valency);
            System.out.println(this.dataTableReactorModel);
            dataTableReactorModel.addRow(reactorData);
            i++;
        }

        panelReactor.refresh();

    }

    public void serializeElement() {

    }

    public void saveToFile(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.close();
    }

    public void loadFromFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            DataTableReactorModel x = new DataTableReactorModel();

        } catch (Exception e) {

            e.printStackTrace();
        }
        ois.close();
    }

}
