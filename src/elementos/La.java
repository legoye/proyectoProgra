package elementos;
import clasificacion.*;
public class La extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public La(){
		setEstado("Solido");
		setValencia();
	}
}
