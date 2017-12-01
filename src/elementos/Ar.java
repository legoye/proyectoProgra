package elementos;
import clasificacion.*;
public class Ar extends Elemento implements NoMetal.GasNoble{
	static {
		valencias = new int[] {0};
	}
	
	public Ar(){
		setEstado("Gaseoso");
		setValencia();
	}
}
