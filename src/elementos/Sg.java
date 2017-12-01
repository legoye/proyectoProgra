package elementos;
import clasificacion.*;
public class Sg extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {6};
	}
	
	public Sg(){
		setEstado("Desconocido");
		setValencia();
	}
}
