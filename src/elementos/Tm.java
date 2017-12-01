package elementos;
import clasificacion.*;
public class Tm extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Tm(){
		setEstado("Solido");
		setValencia();
	}
}
