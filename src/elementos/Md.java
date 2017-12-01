package elementos;
import clasificacion.*;
public class Md extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {3};
	}
	
	public Md(){
		setEstado("Solido");
		setValencia();
	}
}
