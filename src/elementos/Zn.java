package elementos;
import clasificacion.*;
public class Zn extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2};
	}
	
	public Zn(){
		setEstado("Solido");
		setValencia();
	}
}
