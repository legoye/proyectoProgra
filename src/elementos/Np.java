package elementos;
import clasificacion.*;
public class Np extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {5};
	}
	
	public Np(){
		setEstado("Solido");
		setValencia();
	}
}
