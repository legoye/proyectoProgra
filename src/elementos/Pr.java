package elementos;
import clasificacion.*;
public class Pr extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Pr(){
		setEstado("Solido");
		setValencia();
	}
}
