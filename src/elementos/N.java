package elementos;
import clasificacion.*;
public class N extends Elemento implements NoMetal.OtroNoMetal, Pnictogeno{
	static {
		valencias = new int[] {-3,1,2,3,4};
	}
	
	public N(){
		setEstado("Gaseoso");
		setValencia();
	}
}
