package elementos;
import clasificacion.*;
public class Hs extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {8};
	}
	
	public Hs(){
		setEstado("Desconocido");
		setValencia();
	}
}
