package elementos;
import clasificacion.*;
public class B extends Elemento implements Metaloide{
	static {
		valencias = new int[] {3};
	}
	
	public B(){
		setEstado("Solido");
		setValencia();
	}
}
