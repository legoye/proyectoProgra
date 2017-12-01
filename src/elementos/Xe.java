package elementos;
import clasificacion.*;
public class Xe extends Elemento implements NoMetal.GasNoble{
	static {
		valencias = new int[] {0};
	}
	
	public Xe(){
		setEstado("Gaseoso");
		setValencia();
	}
}
