package elementos;
import clasificacion.*;
public class Ta extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {5};
	}
	
	public Ta(){
		setEstado("Solido");
		setValencia();
	}
}
