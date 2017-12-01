package elementos;
import clasificacion.*;
public class Fr extends Elemento implements Metal.Alcalino{
	static {
		valencias = new int[] {1};
	}
	
	public Fr(){
		setEstado("Solido");
		setValencia();
	}
}
