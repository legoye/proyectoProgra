package elementos;
import clasificacion.*;
public class Pm extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Pm(){
		setEstado("Solido");
		setValencia();
	}
}
