package elementos;
import clasificacion.*;
public class Ra extends Elemento implements Metal.Alcalinoterreo{
	static {
		valencias = new int[] {2};
	}
	
	public Ra(){
		setEstado("Solido");
		setValencia();
	}
}
