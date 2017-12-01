package elementos;
import clasificacion.*;
public class Hf extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3,4};
	}
	
	public Hf(){
		setEstado("Solido");
		setValencia();
	}
}
