package elementos;
import clasificacion.*;
public class Th extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {4};
	}
	
	public Th(){
		setEstado("Solido");
		setValencia();
	}
}
