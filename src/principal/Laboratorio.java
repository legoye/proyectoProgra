package principal;

import Model.ElementoConstant;
import elementos.*;
import clasificacion.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import utilities.Filtrar;
import utilities.Molecula;
import java.lang.reflect.Field;

public class Laboratorio {

    public static Class<?>[] getInterfacesOfElementos(Elemento e) {
        Class<?> c1 = e.getClass();
        return c1.getInterfaces();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println(Arrays.toString(Filtrar.getValencyByElement("Ag", ElementoConstant.elementos)));

        H obj = new H();

        try {
            Field f = Class.forName("elementos.H").getSuperclass().getDeclaredField("valencias");
            f.setAccessible(true);
            f.set(obj, new int[]{1, -1});

        } catch (ClassNotFoundException | SecurityException | IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        while (obj.getValencia() != 1) {
            obj.setValencia();
        }
        
        System.out.println(obj.getValencia());

        //Creando un �tomo de O
        NoMetal.OtroNoMetal o1 = new O();
        Elemento o2 = (O) o1;
        System.out.println(o2.getValencia());

////        NoMetal.OtroNoMetal h1 = new H();
////        Elemento eh = (H) h1;
////        System.out.println(eh.getValencia());

        NoMetal.OtroNoMetal h2 = new H();
        Elemento eh2 = (H) h2;
        System.out.println(eh2.getValencia());

        List<Elemento> atomos = new ArrayList();
        atomos.add(o2);
        atomos.add(obj);
        atomos.add(eh2);

        int valenciaM = o2.getValencia() + obj.getValencia() + eh2.getValencia();

        Molecula m = new Molecula(atomos);
        m.setValencia(valenciaM);
        System.out.println("valencia molecula " + m.getValencia());
        ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("C:\\io\\x.file"));
        oo.writeObject(m);
        System.out.println("molecula creada ---> " + m);
        oo.close();

        try {
            FileInputStream fin = new FileInputStream("C:\\io\\x.file");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Molecula moleculaLeida = (Molecula) ois.readObject();
            ois.close();
            System.out.println("---> " + moleculaLeida.getElementos());
            //    return (Molecula) moleculaLeida;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("message: " + e.getMessage());
        }

//		NoMetal.OtroNoMetal s1 = new S();
//		Elemento s2 = (S) s1;
//		Chalcogeno s3 = (S) s2;
//		Elemento s4 = (S) s3;
//		System.out.println(s4.getValencia());
//                
//                Class<?> c1 = o2.getClass();
//                System.out.println(c1.getSuperclass());
//                for(Class<?> i: c1.getInterfaces())
//			System.out.println(i);
//                
//                getInterfacesOfElementos(o2);
//                
//                ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("C:\\io\\x.file"));
//		oo.writeObject(o2);
//
//		oo.close();
    }

}
