package elementos;
import clasificacion.*;
public class P extends Elemento implements NoMetal.OtroNoMetal, Pnictogeno{
	static {
		valencias = new int[] {-3,3,4,5};
	}
	
	public P(){
		setEstado("Solido");
		setValencia();
	}
}
