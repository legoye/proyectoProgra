package elementos;
import clasificacion.*;
public class V extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,3,4,5};
	}
	
	public V(){
		setEstado("Solido");
		setValencia();
	}
}
