package elementos;
import clasificacion.*;
public class Ti extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {4};
	}
	
	public Ti(){
		setEstado("Solido");
		setValencia();
	}
}
