package elementos;
import clasificacion.*;
public class Br extends Elemento implements NoMetal.OtroNoMetal, Halogeno{
	static {
		valencias = new int[] {-1,1,3,5};
	}
	
	public Br(){
		setEstado("Liquido");
		setValencia();
	}
}
