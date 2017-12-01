package elementos;
import clasificacion.*;
public class Rh extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {3};
	}
	
	public Rh(){
		setEstado("Solido");
		setValencia();
	}
}
