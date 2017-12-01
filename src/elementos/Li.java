package elementos;
import clasificacion.*;
public class Li extends Elemento implements Metal.Alcalino{
	static {
		valencias = new int[] {1};
	}
	
	public Li() {
		setEstado("Solido");
		setValencia();
	}
}
