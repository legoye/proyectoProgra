/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import view.*;
import elementos.Elemento;
import java.util.List;


public class MoleculaContentList {
    
    private Molecula molecula;
    private List<Elemento> elementos;
    private String textToDislayM;

    public MoleculaContentList() {
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public String getTextToDislayM() {
        return textToDislayM;
    }

    public void setTextToDislayM(String textToDislayM) {
        this.textToDislayM = textToDislayM;
    }

    public Molecula getMolecula() {
        return molecula;
    }

    public void setMolecula(Molecula molecula) {
        this.molecula = molecula;
    }
    
    

    @Override
    public String toString() {
        return  textToDislayM  ;
    }
    
    
    
            
    
    

}
