package elementos;
import clasificacion.*;
public class Cr extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3,6};
	}
	
	public Cr(){
		setEstado("Solido");
		setValencia();
	}
}
