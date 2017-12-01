package elementos;
import clasificacion.*;
public class Cl extends Elemento implements NoMetal.OtroNoMetal, Halogeno{
	static {
		valencias = new int[] {-1,1,3,5};
	}
	
	public Cl(){
		setEstado("Solido");
		setValencia();
	}
}
