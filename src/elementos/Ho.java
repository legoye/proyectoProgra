package elementos;
import clasificacion.*;
public class Ho extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Ho(){
		setEstado("Solido");
		setValencia();
	}
}
