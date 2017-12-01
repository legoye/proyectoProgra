package elementos;
import clasificacion.*;
public class I extends Elemento implements NoMetal.OtroNoMetal, Halogeno{
	static {
		valencias = new int[] {-1,1,3,5};
	}
	
	public I(){
		setEstado("Solido");
		setValencia();
	}
}
