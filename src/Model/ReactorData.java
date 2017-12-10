/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;


public class ReactorData {
    
    private int count;
    private String element;
    private int valencia;

    public ReactorData(int count, String element, int valencia) {
        this.count = count;
        this.element = element;
        this.valencia = valencia;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getValencia() {
        return valencia;
    }

    public void setValencia(int valencia) {
        this.valencia = valencia;
    }

    @Override
    public String toString() {
        return "ReactorData{" + "count=" + count + ", element=" + element + ", valencia=" + valencia + '}';
    }
    
    
    
    

}
