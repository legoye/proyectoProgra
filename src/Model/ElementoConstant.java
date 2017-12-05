/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Arrays;
import java.util.List;

public final class ElementoConstant {

    private String name;
    private String familia;
    private String subFamilia;
    private String estado;
    private int[] valencias;

    public ElementoConstant() {
    }

    public ElementoConstant(String name, String familia, String subFamilia, String estado, int[] valencias) {
        this.name = name;
        this.familia = familia;
        this.subFamilia = subFamilia;
        this.estado = estado;
        this.valencias = valencias;
    }

    public String getName() {
        return name;
    }

    public String getFamilia() {
        return familia;
    }

    public String getSubFamilia() {
        return subFamilia;
    }

    public String getEstado() {
        return estado;
    }

    public int[] getValencias() {
        return valencias;
    }

    public class Constants {

        public final Object[][] elementos = {
            {"Ac", "Metal", "Actinido", "Solido", new int[]{3}},
            {"Ag", "Metal", "DeTransicion", "Solido", new int[]{1, 2, 3, 4}},
            {"Al", "Metal", "DelBloqueP", "Solido", new int[]{3}},
            {"Am", "Metal", "Actinido", "Solido", new int[]{3}},
            {"Ar", "NoMetal", "GasNoble", "Gaseoso", new int[]{3}},};

    }

}
