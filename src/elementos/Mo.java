package elementos;
import clasificacion.*;
public class Mo extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3,4,5,6};
	}
	
	public Mo(){
		setEstado("Solido");
		setValencia();
	}
}
