package elementos;
import clasificacion.*;
public class Ce extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3,4};
	}
	
	public Ce(){
		setEstado("Solido");
		setValencia();
	}
}
