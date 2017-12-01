package elementos;
import clasificacion.*;
public class Fe extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3};
	}
	
	public Fe(){
		setEstado("Solido");
		setValencia();
	}
}
