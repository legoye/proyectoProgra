package elementos;
import clasificacion.*;
public class Gd extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Gd(){
		setEstado("Solido");
		setValencia();
	}
}
