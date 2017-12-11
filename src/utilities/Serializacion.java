/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import Model.ElementoConstant;
import elementos.Elemento;
import elementos.Li;
import elementos.O;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Laboratorio;

public class Serializacion {



    public static Elemento obtenerElemento(String direccion) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(direccion));
        Elemento e = (Elemento) ois.readObject();
        ois.close();
        System.out.println(e.getEstado());
        System.out.println(e.getValencia());

        return e;

    }

    public static void serializarElemento(Elemento e, String direccion) throws FileNotFoundException, IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(direccion));
        oos.writeObject(e);
        oos.close();
        System.out.println("Objeto serializado");

    }
    
    public static Elemento generaIntanciaElemento(String e , int valencia) throws ClassNotFoundException, NoSuchFieldException{
    
            Elemento newInstance = null;
            Class clas = null;

            try {
                clas = Class.forName("elementos." + e);
                System.out.println(clas);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                newInstance = (Elemento) clas.newInstance();
                System.out.println("instancia:" + newInstance);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Field f = Class.forName("elementos." + e).getSuperclass().getDeclaredField("valencias");
                f.setAccessible(true);
                f.set(newInstance, Filtrar.getValencyByElement(e, ElementoConstant.elementos));

            } catch (SecurityException | IllegalAccessException x) {
                x.printStackTrace();
            }

            if (valencia == 999) {
                    newInstance.setValencia();

            } else {
                while (newInstance.getValencia() != valencia) {
                    newInstance.setValencia();
                }
            }
    
            return newInstance;
    }

}
