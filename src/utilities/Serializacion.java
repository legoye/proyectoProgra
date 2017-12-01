/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import elementos.Elemento;
import elementos.Li;
import elementos.O;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        String direccion = "C:\\io\\";
        Elemento o = new Li();
        serializarElemento(o, direccion + o.getClass().getName() + ".out");
        
        Elemento io = obtenerElemento(direccion + o.getClass().getName() + ".out");
        Class<?> c1 = io.getClass();
        for(Class<?> i: c1.getInterfaces())
            System.out.println(i);
        
        System.out.println(c1.getName()); 

    }

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

}
