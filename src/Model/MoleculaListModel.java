/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class MoleculaListModel extends AbstractListModel{

    private ArrayList<MoleculaContentList> lista = new ArrayList<>();

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        MoleculaContentList p = lista.get(index);
        return p.getTextToDislayM();
    }
    public void addPersona(MoleculaContentList p){
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    public void eliminarPersona(int index0){
        lista.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    public MoleculaContentList getMolecula(int index){
        return lista.get(index);
    }
}


