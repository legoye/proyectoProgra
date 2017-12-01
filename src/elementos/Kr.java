package elementos;
import clasificacion.*;
public class Kr extends Elemento implements NoMetal.GasNoble{
	static {
		valencias = new int[] {0};
	}
	
	public Kr(){
		setEstado("Gaseoso");
		setValencia();
	}
}
