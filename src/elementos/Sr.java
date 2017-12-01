package elementos;
import clasificacion.*;
public class Sr extends Elemento implements Metal.Alcalinoterreo{
	static {
		valencias = new int[] {2};
	}
	
	public Sr(){
		setEstado("Solido");
		setValencia();
	}
}
