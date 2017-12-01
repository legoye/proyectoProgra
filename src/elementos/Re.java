package elementos;
import clasificacion.*;
public class Re extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {4};
	}
	
	public Re(){
		setEstado("Solido");
		setValencia();
	}
}
