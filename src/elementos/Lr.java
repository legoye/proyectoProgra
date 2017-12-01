package elementos;
import clasificacion.*;
public class Lr extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {3};
	}
	
	public Lr(){
		setEstado("Solido");
		setValencia();
	}
}
