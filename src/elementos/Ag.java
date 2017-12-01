package elementos;
import clasificacion.*;
public class Ag extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {1,2,3,4};
	}
	
	public Ag(){
		setEstado("Solido");
		setValencia();
	}
}
