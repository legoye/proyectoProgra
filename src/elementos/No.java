package elementos;
import clasificacion.*;
public class No extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {2};
	}
	
	public No(){
		setEstado("Solido");
		setValencia();
	}
}
