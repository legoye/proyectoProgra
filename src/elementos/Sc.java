package elementos;
import clasificacion.*;
public class Sc extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {3};
	}
	
	public Sc(){
		setEstado("Solido");
		setValencia();
	}
}
