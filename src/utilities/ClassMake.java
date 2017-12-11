/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import elementos.Elemento;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtNewConstructor;
import javassist.NotFoundException;

public class ClassMake {

    public static void makeClass(String nombreClase, Molecula molecula) throws NotFoundException, CannotCompileException, IOException {
        String paquete = "elementos";
        //    String ruta = System.getProperty("user.home") + "/elementos/";

        String ruta = new File("").getAbsolutePath();
        System.out.println(ruta);
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.makeClass(nombreClase);
        CtClass CompuestoPadre = pool.get("utilities.Molecula");
        cc.setSuperclass(CompuestoPadre);
        System.out.println("padre " + CompuestoPadre);
        //
        //String cadenaAddElementos = "super.elementos.add(new elementos.H(1));super.elementos.add(new elementos.O(2));super.elementos.add(new elementos.H(1));";
        String cadenaAddElementos = "";
        List<String> arrElementosConstructores = getArrElementosConstructores(molecula);
        for (int i = 0; i < arrElementosConstructores.size(); i++) {
            cadenaAddElementos += "super.elementos.add(new elementos.O());";
        }

        CtConstructor c = CtNewConstructor.make("public " + nombreClase + "(){ " + cadenaAddElementos + "}", cc);
        cc.addConstructor(c);

        System.out.println("cc " + cc);

        cc.writeFile();
        System.out.println(ruta);
        cc.toBytecode(new DataOutputStream(new FileOutputStream(ruta + "/src/" + nombreClase + ".class")));
        cc.writeFile();
    }

    public static List<String> getArrElementosConstructores(Molecula m) {

        ArrayList<String> arrToReturn = new ArrayList<String>();

        for (int i = 0; i < m.getElementos().size(); i++) {

            if (m.getElementos().get(i) instanceof elementos.Elemento) {
                String elemento = m.getElementos().get(i).getClass().getSimpleName();
                String valencia = ((Elemento) m.getElementos().get(i)).getValencia() + "";
                arrToReturn.add(elemento + "(" + valencia + ")");
            }
        }
        return arrToReturn;
    }

    public static String makeMoleculasName(Molecula m) {

        String elements[] = new String[m.getElementos().size()];
        String name = "";
        List<String> elementos = new ArrayList<>();

        for (int i = 0; i < m.getElementos().size(); i++) {

            if (m.getElementos().get(i) instanceof elementos.Elemento) {
                elements[i] = m.getElementos().get(i).getClass().getSimpleName();
                elementos.add(m.getElementos().get(i).getClass().getSimpleName());
            }
        }
       
        Collections.sort(elementos, new Comparator<String>() {
            public int compare(String d1, String d2) {
                return d1.compareTo(d2);
            }
        });
       
        for (int i = 0; i < elementos.size(); i++) {
            String aux = "";
            String auxName = "";
            Integer cont = 2;
            name = name + elementos.get(i);

            for (int j = i + 1; j < elements.length; j++) {
                if (elementos.get(i).equals(elementos.get(j))) {
                    name = name + cont.toString();
                    cont++;
                    i = j;
                }
            }

        }
        
        System.out.println("ordenados " + elementos);        
        return name;         
    }

}
