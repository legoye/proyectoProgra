package elementos;
import clasificacion.*;
public class C extends Elemento implements NoMetal.OtroNoMetal, Pnictogeno{
	static {
		valencias = new int[] {2,4};
	}
	
	public C(){
		setEstado("Solido");
		setValencia();
	}
}
