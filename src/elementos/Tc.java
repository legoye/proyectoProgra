package elementos;
import clasificacion.*;
public class Tc extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {4,7};
	}
	
	public Tc(){
		setEstado("Solido");
		setValencia();
	}
}
