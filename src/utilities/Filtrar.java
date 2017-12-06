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

    Object[][] elements = ElementoConstant.elementos;

    public Object[][] getElementsByFilters(Object[][] elements, String family, String subFamily, String state) {

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                System.out.println(elements[i][j]);
                if (!family.equals("todos") && j == 1) {
                    if (!family.equals(elements[i][j])) {
                        getElementsByFilters(removeRowFromdArray(elements, i), family, subFamily, state);

                    }

                }
            }
        }

        return elements;

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

        int valency [] = null ;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {

                if (j == 0) {
                    if(elements[i][j].equals(element)){
                        valency = (int[]) elements[i][4];
                        
                    }
                }

            }
        }

        return valency;
    }

    public Object[][] removeRowFromdArray(Object[][] array, int row) {
        List list = Arrays.asList(array);
        list.remove(row);
        return (Object[][]) list.toArray(new Object[][]{});
    }

}
