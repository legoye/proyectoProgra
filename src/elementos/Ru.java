package elementos;
import clasificacion.*;
public class Ru extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3,4,6,8};
	}
	
	public Ru(){
		setEstado("Solido");
		setValencia();
	}
}
