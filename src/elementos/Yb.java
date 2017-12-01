package elementos;
import clasificacion.*;
public class Yb extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Yb(){
		setEstado("Solido");
		setValencia();
	}
}
