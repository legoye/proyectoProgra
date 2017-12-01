package elementos;
import clasificacion.*;
public class Se extends Elemento implements NoMetal.OtroNoMetal, Chalcogeno{
	static {
		valencias = new int[] {-2,2,4,6};
	}
	
	public Se(){
		setEstado("Solido");
		setValencia();
	}
}
