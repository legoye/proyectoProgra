package elementos;
import clasificacion.*;
public class At extends Elemento implements Metaloide, Halogeno{
	static {
		valencias = new int[] {-1,1};
	}
	
	public At(){
		setEstado("Solido");
		setValencia();
	}
}
