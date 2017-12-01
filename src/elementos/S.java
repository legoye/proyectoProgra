package elementos;
import clasificacion.*;
public class S extends Elemento implements NoMetal.OtroNoMetal, Chalcogeno{
	static {
		valencias = new int[] {-2,2,4,6};
	}
	
	public S(){
		setEstado("Solido");
		setValencia();
	}
}
