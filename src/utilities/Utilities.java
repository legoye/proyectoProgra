/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import elementos.Elemento;
import java.util.List;

public class Utilities {

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
    
    
     public List<Elemento> reaccionarElementos(List<Elemento> elementos){
        
        
    
        return elementos;
    }
    

}
