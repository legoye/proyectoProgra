package elementos;
import clasificacion.*;
public class Nb extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3,4,5};
	}
	
	public Nb(){
		setEstado("Solido");
		setValencia();
	}
}
