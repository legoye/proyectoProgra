package elementos;
import clasificacion.*;
public class Ge extends Elemento implements Metaloide{
	static {
		valencias = new int[] {2,4};
	}
	
	public Ge(){
		setEstado("Solido");
		setValencia();
	}
}
