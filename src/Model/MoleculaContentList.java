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

    @Override
    public String toString() {
        return  textToDislayM  ;
    }
    
    
    
            
    
    

}
