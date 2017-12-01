package elementos;
import clasificacion.*;
public class Ba extends Elemento implements Metal.Alcalinoterreo{
	static {
		valencias = new int[] {2};
	}
	
	public Ba(){
		setEstado("Solido");
		setValencia();
	}
}
