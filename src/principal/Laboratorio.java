package principal;

import elementos.*;
import clasificacion.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Laboratorio {
    
    
        public static Class<?>[] getInterfacesOfElementos(Elemento e){        
            Class<?> c1 = e.getClass();
            return c1.getInterfaces();        
        } 

//	Una clase interna se crea cuando deseamos que haya una estrecha relaci�n entre 2 clases que contienen m�todos espec�ficos 
//	pero que est�n sumamente relacionados unos con otros. Si se crea una clase interna, las variables y
//	m�todos de la clase dentro de la cual se encuentran estar�n disponibles dentro de la clase interna, 
//	incluso aquellos marcados como privados(private).
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Creando un �tomo de O
		NoMetal.OtroNoMetal o1 = new O();
		Elemento o2 = (O) o1;
		System.out.println(o2.getValencia());
		
		NoMetal.OtroNoMetal s1 = new S();
		Elemento s2 = (S) s1;
		Chalcogeno s3 = (S) s2;
		Elemento s4 = (S) s3;
		System.out.println(s4.getValencia());
                
                Class<?> c1 = o2.getClass();
                System.out.println(c1.getSuperclass());
                for(Class<?> i: c1.getInterfaces())
			System.out.println(i);
                
                getInterfacesOfElementos(o2);
                
                ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("C:\\io\\x.file"));
		oo.writeObject(o2);

		oo.close();
                
                
		
		
	}

}
