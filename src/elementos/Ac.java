package elementos;
import clasificacion.*;
public class Ac extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {3};
	}
	
	public Ac(){
		setEstado("Solido");
		setValencia();
	}
}
