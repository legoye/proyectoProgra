package elementos;
import clasificacion.*;
public class He extends Elemento implements NoMetal.GasNoble{
	static {
		valencias = new int[] {0};
	}
	
	public He(){
		setEstado("Gaseoso");
		setValencia();
	}
}
