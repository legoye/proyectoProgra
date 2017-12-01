package elementos;
import clasificacion.*;
public class Cd extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,1};
	}
	
	public Cd(){
		setEstado("Solido");
		setValencia();
	}
}
