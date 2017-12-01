package elementos;
import clasificacion.*;
public class Sm extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Sm(){
		setEstado("Solido");
		setValencia();
	}
}
