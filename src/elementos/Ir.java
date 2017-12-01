package elementos;
import clasificacion.*;
public class Ir extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {3,4};
	}
	
	public Ir(){
		setEstado("Solido");
		setValencia();
	}
}
