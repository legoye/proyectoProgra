package elementos;
import clasificacion.*;
public class Cs extends Elemento implements Metal.Alcalino{
	static {
		valencias = new int[] {1};
	}
	
	public Cs(){
		setEstado("Solido");
		setValencia();
	}
}
