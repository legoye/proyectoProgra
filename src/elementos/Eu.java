package elementos;
import clasificacion.*;
public class Eu extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {2,3};
	}
	
	public Eu(){
		setEstado("Solido");
		setValencia();
	}
}
