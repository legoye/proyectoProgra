package elementos;
import clasificacion.*;
public class Y extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {3};
	}
	
	public Y(){
		setEstado("Solido");
		setValencia();
	}
}
