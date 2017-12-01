package elementos;
import clasificacion.*;
public class Ni extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3};
	}
	
	public Ni(){
		setEstado("Solido");
		setValencia();
	}
}
