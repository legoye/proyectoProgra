/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import Model.ElementoConstant;
import Model.ReactorData;
import elementos.Elemento;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.ClassMake;
import utilities.Filtrar;
import Model.Molecula;
import utilities.Utilities;


public class testRun {
    
    public static void main(String[] args) {
        
        Filtrar f = new Filtrar();
        List<String> l = f.getElementsByAllFilters(ElementoConstant.elementos, "NoMetal", "OtroNoMetal", "Solido");
        System.out.println("fafadfasfasdfasfafafasdfadffadsf "+f.getElementsByFilters(ElementoConstant.elementos, "NoMetal", "OtroNoMetal", "Solido").toString()); 
      
        List<ReactorData> data = new ArrayList();
        ReactorData rm = new ReactorData(0,"O",-2);
        ReactorData rm2 = new ReactorData(0,"H",1);
        ReactorData rm3 = new ReactorData(0,"H",1);
        data.add(rm);
        data.add(rm2);
        data.add(rm3);
        
        if(utilities.Utilities.moleculaOctecto(data)){
            try { 
               List<Elemento> elementos = Utilities.reaccionarElementos(data);
               Molecula m =  Utilities.generarMolecula(elementos);
               System.out.println("valencia molecula " + m.getValencia());
               System.out.println("obteniendo elementos de la molecula : " +ClassMake.getArrElementosConstructores(m));
                
             //  System.out.println(utilities.Utilities.generarMolecula(utilities.Utilities.reaccionarElementos(data))); ;
            } catch (ClassNotFoundException | NoSuchFieldException ex) {
                Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

}
