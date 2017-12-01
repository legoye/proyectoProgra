package elementos;
import clasificacion.*;
public class Ca extends Elemento implements Metal.Alcalinoterreo{
	static {
		valencias = new int[] {2};
	}
	
	public Ca(){
		setEstado("Solido");
		setValencia();
	}
}
