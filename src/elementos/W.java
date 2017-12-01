package elementos;
import clasificacion.*;
public class W extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {4,6};
	}
	
	public W(){
		setEstado("Solido");
		setValencia();
	}
}
