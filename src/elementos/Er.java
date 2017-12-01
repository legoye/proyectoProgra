package elementos;
import clasificacion.*;
public class Er extends Elemento implements Metal.Lantanido{
	static {
		valencias = new int[] {3};
	}
	
	public Er(){
		setEstado("Solido");
		setValencia();
	}
}
