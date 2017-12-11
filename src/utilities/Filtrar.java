/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import Model.ElementoConstant;
import clasificacion.Metal;
import elementos.Elemento;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Filtrar {

    public Object[][] elements = ElementoConstant.elementos;
    public List<String> elementsFound;

    public static void getSubfamiliesByType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> getElementsByFilters(Object[][] elements, String family, String subFamily, String state) {
        elementsFound = new ArrayList();

        for (int i = 0; i < elements.length; i++) {
            boolean found = false;

            for (int j = 0; j < elements[i].length; j++) {

                if (!family.equals("Todos") && j == 1) {
                    if (family.equals(elements[i][j])) {
                        found = true;

                    } else {
                        break;
                    }

                }
                if (!subFamily.equals("Todos") && j == 2) {
                    if (!subFamily.equals(elements[i][j])) {
                        found = true;

                    } else {
                        break;
                    }

                }
                if (!state.equals("Todos") && j == 3) {
                    if (!state.equals(elements[i][j])) {
                        found = true;

                    }

                }

            }

            if (true) {
                elementsFound.add((String) elements[i][0]);

            }
        }

        return elementsFound;

    }

    public static Object[] getElementsByFilters(Object[][] elements) {

        List sElements = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                System.out.println(elements[i][j]);
                if (j == 0) {
                    sElements.add(elements[i][j]);
                }

            }
        }

        return sElements.toArray(new Object[sElements.size()]);
    }

    public static int[] getValencyByElement(String element, Object[][] elements) {

        int valency[] = null;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {

                if (j == 0) {
                    if (elements[i][j].equals(element)) {
                        valency = (int[]) elements[i][4];

                    }
                }

            }
        }

        return valency;
    }
    
    public static Object[] getElementsByFamily(String element, Object[][] elements) {

        List<Object> elementsL = new ArrayList();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {

                if (j == 1) {
                    if (elements[i][j].equals(element)) {
                        elementsL.add((String)elements[i][0]);

                    }
                }

            }
        }

        return elementsL.toArray();
        
    }
    
     public static Object[] getElementsBySubFamily(String element, Object[][] elements) {

        List<Object> elementsL = new ArrayList();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {

                if (j == 2) {
                    if (elements[i][j].equals(element)) {
                        elementsL.add((String)elements[i][0]);

                    }
                }

            }
        }

        return elementsL.toArray();
        
    }
    

    
    public static Object[] getElementsByState(String element, Object[][] elements) {

        List<Object> elementsL = new ArrayList();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {

                if (j == 3) {
                    if (elements[i][j].equals(element)) {
                        elementsL.add((String)elements[i][0]);

                    }
                }

            }
        }

        return elementsL.toArray();
        
    }
    

    public List<String> getElementsByAllFilters(Object[][] elements, String family, String subFamily, String state) {
        elementsFound = new ArrayList();

        Object[][] aux = {};
        Object[] aux2 = {};

        if (!family.equals("Todos")) {
            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[i].length; j++) {
                    System.out.println(elements[i][j]);
                    if (j == 1) {
                        elementsFound.add((String) elements[i][j]);
                        

                    }

                }
            }

        }
        
        if (!subFamily.equals("Todos")) {
            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[i].length; j++) {
                    System.out.println(elements[i][j]);
                    if (j == 2) {
                        elementsFound.add((String) elements[i][j]);
                    }

                }
            }

        }
        
        if (!state.equals("Todos")) {
            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[i].length; j++) {
                    System.out.println(elements[i][j]);
                    if (j == 3) {
                        elementsFound.add((String) elements[i][j]);
                    }

                }
            }

        }

        return elementsFound;
    }

    public Object[] removeRowFromdArray(Object[] array, int row) {
        List list = Arrays.asList(array);
        list.remove(row);
        return (Object[][]) list.toArray(new Object[][]{});
    }

    public static String[] getSubfamiliesByType(String expression) {

        switch (expression) {
            case "Chalcogeno":
                // Statements
                return null;

            case "Halogeno":

                return null;

            case "Metal":
                String arreglo3[] = {"Lantanidos", "Actinidos", "Alcalinoterreos", "Alcalinos", "DeTransicion", "DelBloqueP"};
                return arreglo3;

            case "Metaloide":

                return null;

            case "No Metal":

                String arreglo5[] = {"Otros", "Gases Nobles"};
                return arreglo5;

            case "Pnictogeno":

                return null;

            default:
                return null;

        }

    }

}
