package elementos;
import clasificacion.*;
public class O extends Elemento implements NoMetal.OtroNoMetal, Chalcogeno{
	
	static {
		valencias = new int[] {-2,-1};
	}
	
	public O(){
		setEstado("Gaseoso");
		setValencia();
	}
}
