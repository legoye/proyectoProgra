package elementos;
import clasificacion.*;
public class Mn extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3,4,6,7};
	}
	
	public Mn(){
		setEstado("Solido");
		setValencia();
	}
}
