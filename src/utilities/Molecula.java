/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import elementos.Elemento;
import java.util.HashMap;
import java.util.List;


public class Molecula {
    
    private List<Elemento> elementos;
    
   
    
    public Molecula() {
    }
   
    public Molecula(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    @Override
    public String toString() {
        return "Molecula{" + "elementos=" + elementos + '}';
    }
    
    
    
    public List<Elemento> reaccionarElementos(List<Elemento> elementos){
        
        
    
        return elementos;
    }
    
    
    
}
