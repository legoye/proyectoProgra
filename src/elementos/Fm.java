package elementos;
import clasificacion.*;
public class Fm extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {3};
	}
	
	public Fm(){
		setEstado("Solido");
		setValencia();
	}
}
