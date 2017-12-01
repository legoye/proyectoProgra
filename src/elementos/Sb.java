package elementos;
import clasificacion.*;
public class Sb extends Elemento implements Metaloide,Pnictogeno{
	static {
		valencias = new int[] {-3,3,5};
	}
	
	public Sb(){
		setEstado("Solido");
		setValencia();
	}
}
