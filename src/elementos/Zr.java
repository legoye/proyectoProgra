package elementos;
import clasificacion.*;
public class Zr extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {4};
	}
	
	public Zr(){
		setEstado("Solido");
		setValencia();
	}
}
