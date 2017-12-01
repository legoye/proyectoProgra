package elementos;
import clasificacion.*;
public class Rf extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {4};
	}
	
	public Rf(){
		setEstado("Desconocido");
		setValencia();
	}
}
