package elementos;
import clasificacion.*;
public class Si extends Elemento implements Metaloide{
	static {
		valencias = new int[] {4};
	}
	
	public Si(){
		setEstado("Solido");
		setValencia();
	}
}
