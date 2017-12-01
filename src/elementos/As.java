package elementos;
import clasificacion.*;
public class As extends Elemento implements Metaloide,Pnictogeno{
	static {
		valencias = new int[] {-3,3,5};
	}
	
	public As(){
		setEstado("Solido");
		setValencia();
	}
}
