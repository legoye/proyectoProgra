package principal;

import Model.ElementoConstant;
import elementos.*;
import clasificacion.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import utilities.Filtrar;
import utilities.Molecula;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javassist.CannotCompileException;
import javassist.NotFoundException;
import utilities.ClassMake;

public class Laboratorio {

    public static Class<?>[] getInterfacesOfElementos(Elemento e) {
        Class<?> c1 = e.getClass();
        return c1.getInterfaces();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println(Arrays.toString(Filtrar.getValencyByElement("Ag", ElementoConstant.elementos)));
        String e = "H";
        String basePath = new File("").getAbsolutePath();
        File file = new File(basePath);
        System.out.println("base path " +basePath);
        File raizPaquete = file.getParentFile().getParentFile();
        URL url = raizPaquete.toURL();
        URL[] urls = new URL[]{url};
        ClassLoader cl = new URLClassLoader(urls);
        Class clas = null;
        Elemento newInstance = null;

        try {
            clas = cl.loadClass("elementos." + e);
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
            f.set(newInstance, new int[]{1, -1});

        } catch (ClassNotFoundException | SecurityException | IllegalAccessException | NoSuchFieldException x) {
            x.printStackTrace();
        }

        while (newInstance.getValencia() != 1) {
            newInstance.setValencia();
        }

        System.out.println(newInstance.getValencia());

        NoMetal.OtroNoMetal o1 = new O();
        Elemento o2 = (O) o1;
        System.out.println(o2.getValencia());

        NoMetal.OtroNoMetal h2 = new H();
        Elemento eh2 = (H) h2;
        System.out.println(eh2.getValencia());

        List<Elemento> atomos = new ArrayList();
        atomos.add(o2);
        atomos.add(newInstance);
        atomos.add(eh2);

        int valenciaM = o2.getValencia() + newInstance.getValencia() + eh2.getValencia();

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
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("message: " + ex.getMessage());
        }

        /// class maker with java assist 
        System.out.println(ClassMake.getArrElementosConstructores(m));;
        try {
            ClassMake.makeClass("test", m);
        } catch (NotFoundException | CannotCompileException ex) {
            Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Class  classs = Class.forName("test");
            for(Constructor<?> c: classs.getConstructors())
			System.out.println(c);

            Molecula o = (Molecula) classs.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Laboratorio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
