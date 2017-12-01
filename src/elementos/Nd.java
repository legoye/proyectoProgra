package elementos;
import clasificacion.*;
public class Nd extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Nd(){
		setEstado("Solido");
		setValencia();
	}
}
