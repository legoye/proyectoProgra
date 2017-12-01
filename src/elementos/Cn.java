package elementos;
import clasificacion.*;
public class Cn extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {0};
	}
	
	public Cn(){
		setEstado("Desconocido");
		setValencia();
	}
}
