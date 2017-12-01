package elementos;
import clasificacion.*;
public class Te extends Elemento implements Metaloide,Chalcogeno{
	static {
		valencias = new int[] {-2,2,4,6};
	}
	
	public Te(){
		setEstado("Solido");
		setValencia();
	}
}
