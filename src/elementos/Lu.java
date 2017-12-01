package elementos;
import clasificacion.*;
public class Lu extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Lu(){
		setEstado("Solido");
		setValencia();
	}
}
