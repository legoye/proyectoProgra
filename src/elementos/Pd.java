package elementos;
import clasificacion.*;
public class Pd extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {1,2,4,6};
	}
	
	public Pd(){
		setEstado("Solido");
		setValencia();
	}
}
