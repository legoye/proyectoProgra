package elementos;
import clasificacion.*;
public class Co extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3};
	}
	
	public Co(){
		setEstado("Solido");
		setValencia();
	}
}
