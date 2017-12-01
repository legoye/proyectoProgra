package elementos;
import clasificacion.*;
public class Au extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {1,3};
	}
	
	public Au(){
		setEstado("Solido");
		setValencia();
	}
}
