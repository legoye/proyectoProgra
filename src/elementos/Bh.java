package elementos;
import clasificacion.*;
public class Bh extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {7};
	}
	
	public Bh(){
		setEstado("Desconocido");
		setValencia();
	}
}
