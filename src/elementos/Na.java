package elementos;
import clasificacion.*;
public class Na extends Elemento implements Metal.Alcalino{
	static {
		valencias = new int[] {1};
	}
	
	public Na(){
		setEstado("Solido");
		setValencia();
	}
}
