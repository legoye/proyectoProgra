package elementos;
import clasificacion.*;
public class Rb extends Elemento implements Metal.Alcalino{
	static {
		valencias = new int[] {1};
	}
	
	public Rb(){
		setEstado("Solido");
		setValencia();
	}
}
