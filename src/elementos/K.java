package elementos;
import clasificacion.*;
public class K extends Elemento implements Metal.Alcalino{
	static {
		valencias = new int[] {1};
	}
	
	public K(){
		setEstado("Solido");
		setValencia();
	}
}
