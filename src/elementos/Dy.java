package elementos;
import clasificacion.*;
public class Dy extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Dy(){
		setEstado("Solido");
		setValencia();
	}
}
