package elementos;
import clasificacion.*;
public class Cu extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {1,2,3,4};
	}
	
	public Cu(){
		setEstado("Solido");
		setValencia();
	}
}
