package elementos;
import clasificacion.*;
public class Tb extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Tb(){
		setEstado("Solido");
		setValencia();
	}
}
