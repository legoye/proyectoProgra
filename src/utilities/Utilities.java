/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import elementos.Elemento;

public class Utilities {

    public Elemento generarElemento(Elemento e, boolean valenciaAleatoria, String valencia) {

        if (valenciaAleatoria) {
            return e;
        } else {
            e.setValencia();
        }
        return e;
    }
    
    
    

}
