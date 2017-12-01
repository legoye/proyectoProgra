package elementos;
import clasificacion.*;
public class Pa extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {5};
	}
	
	public Pa(){
		setEstado("Solido");
		setValencia();
	}
}
