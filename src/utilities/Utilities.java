/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import Model.DataTableReactorModel;
import Model.ElementoConstant;
import Model.ReactorData;
import elementos.Elemento;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Laboratorio;

public final class Utilities {

    public Elemento generarElemento(Elemento e, boolean valenciaAleatoria, String valencia) {

        if (valenciaAleatoria) {
            return e;
        } else {
            e.setValencia();
        }
        return e;
    }

    public static String getFileExtension(String name) {

        int pointIndex = name.lastIndexOf(".");

        if (pointIndex == -1) {
            return null;
        }

        if (pointIndex == name.length() - 1) {
            return null;
        }

        return name.substring(pointIndex + 1, name.length());
    }

    public static List<Elemento> reaccionarElementos(List<ReactorData> data) throws ClassNotFoundException, NoSuchFieldException {

        List<Elemento> elementos = new ArrayList();
        Elemento newInstance = null;

        for (ReactorData d : data) {

            String e = d.getElement();
            int valencia = d.getValencia();
            Class clas = null;
           

            try {
                clas = Class.forName("elementos." + e);
                System.out.println(clas);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                newInstance = (Elemento) clas.newInstance();
                System.out.println("instancia:" + newInstance);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Field f = Class.forName("elementos." + e).getSuperclass().getDeclaredField("valencias");
                f.setAccessible(true);
                f.set(newInstance,Filtrar.getValencyByElement(e, ElementoConstant.elementos));

            } catch (SecurityException | IllegalAccessException x) {
                x.printStackTrace();
            }

            while (newInstance.getValencia() != valencia) {
                newInstance.setValencia();
            }

            elementos.add(newInstance);

            System.out.println(newInstance.getValencia());

        }

        return elementos;
    }

    public static Molecula generarMolecula(List<Elemento> e) {
        Molecula m = new Molecula(e);

        return m;
    }

    public static boolean moleculaOctecto(List<ReactorData> data) {
        if (data.size() == 0) {
            System.out.println("no hay elementos");
            return false;
        }

        int valenciaBase = data.get(0).getValencia();
        for (int i = 0; i < data.size(); i++) {
            if (i == 0) {
                continue;
            }

            valenciaBase = valenciaBase + data.get(i).getValencia();

        }

        if (valenciaBase == 0) {
            return true;
        } else {
            return false;
        }
    }

//    public static List<ReactorData> readElementsInList(DataTableReactorModel data){
//    
//        int rows = data.getRowCount();
//        List list = new ArrayList();
//        
//        for(int i = 0 ; i <= rows ; i++){
//        
//            
//            data.getValueAt(rows, i)
//            
//        }
//    
//    
//    }
}
