package elementos;
import clasificacion.*;
public class Mg extends Elemento implements Metal.Alcalinoterreo{
	static {
		valencias = new int[] {2};
	}
	
	public Mg(){
		setEstado("Solido");
		setValencia();
	}
}
