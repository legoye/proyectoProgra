package elementos;
import clasificacion.*;
public class Be extends Elemento implements Metal.Alcalinoterreo{
	static {
		valencias = new int[] {2};
	}
	
	public Be(){
		setEstado("Solido");
		setValencia();
	}
}
