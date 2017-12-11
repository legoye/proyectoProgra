/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Arrays;
import java.util.List;

public final class ElementoConstant {



    public static final Object[][] elementos = {
    {"H", "Alcalinos", "", "Gaseoso", new int[]{1}},    
    {"Te", "Chalcogeno", "", "Solido", new int[]{-2, 2, 4, 6}},
    {"O", "Chalcogeno", "", "Gaseoso", new int[]{-2, -1}},
    {"Se", "Chalcogeno", "", "Solido", new int[]{-2, 2, 4, 6}},
    {"S", "Chalcogeno", "", "Solido", new int[]{-2, 2, 4, 6}},
    {"Po", "Chalcogeno", "", "Solido", new int[]{-2, 2, 4}},
    {"Se", "No Metal", "OtroNoMetal", "Solido", new int[]{-2, 2, 4, 6}},
    {"S", "No Metal", "OtroNoMetal", "Solido", new int[]{-2, 2, 4, 6}},
    {"Po", "Metal", "DelBloqueP", "Solido", new int[]{-2, 2, 4}},
    {"Te", "Metal", "Metaloide", "Solido", new int[]{-2, 2, 4, 6}},
    {"Si", "Metal", "Metaloide", "Solido", new int[]{4}},
    {"Sb", "Metal", "Metaloide", "Solido", new int[]{-3, 3, 5}},
    {"Ge", "Metal", "Metaloide", "Solido", new int[]{2, 4}},
    {"B", "Metal", "Metaloide", "Solido", new int[]{3}},
    {"At", "Metal", "Metaloide", "Solido", new int[]{-1, 1}},
    {"As", "Metal", "Metaloide", "Solido", new int[]{-3, 3, 5}},
    {"Ac", "Metal", "Actinido", "Solido", new int[]{3}},
    {"Am", "Metal", "Actinido", "Solido", new int[]{3}},
    {"Bk", "Metal", "Actinido", "Solido", new int[]{3}},
    {"Cf", "Metal", "Actinido", "Solido", new int[]{3}},
    {"Cm", "Metal", "Actinido", "Solido", new int[]{3}},
    {"Es", "Metal", "Actinido", "Solido", new int[]{3}},
    {"Fm", "Metal", "Actinido", "Solido", new int[]{3}},
    {"Lr", "Metal", "Actinido", "Solido", new int[]{3}},
    {"Md", "Metal", "Actinido", "Solido", new int[]{3}},
    {"No", "Metal", "Actinido", "Solido", new int[]{2}},
    {"Np", "Metal", "Actinido", "Solido", new int[]{5}},
    {"Pa", "Metal", "Actinido", "Solido", new int[]{5}},
    {"Pu", "Metal", "Actinido", "Solido", new int[]{4}},
    {"U", "Metal", "Actinido", "Solido", new int[]{6}},
    {"Th", "Metal", "Actinido", "Solido", new int[]{4}},
    {"Ag", "Metal", "DeTransicion", "Solido", new int[]{1, 2, 3, 4}},
    {"Au", "Metal", "DeTransicion", "Solido", new int[]{1, 3}},
    {"Bh", "Metal", "DeTransicion", "Desconocido", new int[]{7}},
    {"Cd", "Metal", "DeTransicion", "Solido", new int[]{2, 1}},
    {"Cn", "Metal", "DeTransicion", "Desconocido", new int[]{0}},
    {"Co", "Metal", "DeTransicion", "Solido", new int[]{2, 3}},
    {"Cr", "Metal", "DeTransicion", "Solido", new int[]{2, 3, 6}},
    {"Cu", "Metal", "DeTransicion", "Solido", new int[]{1, 2, 3, 4}},
    {"Db", "Metal", "DeTransicion", "Desconocido", new int[]{5}},
    {"Fe", "Metal", "DeTransicion", "Solido", new int[]{2, 3}},
    {"Hf", "Metal", "DeTransicion", "Solido", new int[]{2, 3, 4}},
    {"Hg", "Metal", "DeTransicion", "Liquido", new int[]{1, 2}},
    {"Hs", "Metal", "DeTransicion", "Desconocido", new int[]{8}},
    {"Ir", "Metal", "DeTransicion", "Solido", new int[]{3, 4}},
    {"Mn", "Metal", "DeTransicion", "Solido", new int[]{2, 3, 4, 6, 7}},
    {"Mo", "Metal", "DeTransicion", "Solido", new int[]{2, 3, 4, 5, 6}},
    {"Nb", "Metal", "DeTransicion", "Solido", new int[]{2, 3, 4, 5}},
    {"Ni", "Metal", "DeTransicion", "Solido", new int[]{2, 3}},
    {"Os", "Metal", "DeTransicion", "Solido", new int[]{4}},
    {"Pd", "Metal", "DeTransicion", "Solido", new int[]{1, 2, 4, 6}},
    {"Pt", "Metal", "DeTransicion", "Solido", new int[]{2, 4}},
    {"Re", "Metal", "DeTransicion", "Solido", new int[]{4}},
    {"Rf", "Metal", "DeTransicion", "Desconocido", new int[]{4}},
    {"Rh", "Metal", "DeTransicion", "Solido", new int[]{3}},
    {"Ru", "Metal", "DeTransicion", "Solido", new int[]{2, 3, 4, 6, 8}},
    {"Sc", "Metal", "DeTransicion", "Solido", new int[]{3}},
    {"Sg", "Metal", "DeTransicion", "Desconocido", new int[]{6}},
    {"Ta", "Metal", "DeTransicion", "Solido", new int[]{5}},
    {"Tc", "Metal", "DeTransicion", "Solido", new int[]{4, 7}},
    {"Ti", "Metal", "DeTransicion", "Solido", new int[]{4}},
    {"V", "Metal", "DeTransicion", "Solido", new int[]{2, 3, 4, 5}},
    {"W", "Metal", "DeTransicion", "Solido", new int[]{4, 6}},
    {"Ar", "No Metal", "GasNoble", "Gaseoso", new int[]{0}},
    {"He", "No Metal", "GasNoble", "Gaseoso", new int[]{0}},
    {"Kr", "No Metal", "GasNoble", "Gaseoso", new int[]{0}},
    {"Ne", "No Metal", "GasNoble", "Gaseoso", new int[]{0}},
    {"Rn", "No Metal", "GasNoble", "Gaseoso", new int[]{0}},
    {"Xe", "No Metal", "GasNoble", "Gaseoso", new int[]{0}},
    {"Y", "Metal", "DeTransicion", "Solido", new int[]{3}},
    {"Yb", "Metal", "Lantanido", "Solido", new int[]{3}},
    {"Zn", "Metal", "DeTransicion", "Solido", new int[]{2}},
    {"Zr", "Metal", "DeTransicion", "Solido", new int[]{4}}};
    
    
}
