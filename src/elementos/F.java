package elementos;
import clasificacion.*;
public class F extends Elemento implements NoMetal.OtroNoMetal, Halogeno{
	static {
		valencias = new int[] {-1};
	}
	
	public F(){
		setEstado("Gaseoso");
		setValencia();
	}
}
