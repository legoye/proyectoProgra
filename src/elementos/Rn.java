package elementos;
import clasificacion.*;
public class Rn extends Elemento implements NoMetal.GasNoble{
	static {
		valencias = new int[] {0};
	}
	
	public Rn(){
		setEstado("Gaseoso");
		setValencia();
	}
}
