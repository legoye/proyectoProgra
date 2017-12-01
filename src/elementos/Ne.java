package elementos;
import clasificacion.*;
public class Ne extends Elemento implements NoMetal.GasNoble{
	static {
		valencias = new int[] {0};
	}
	
	public Ne(){
		setEstado("Gaseoso");
		setValencia();
	}
}
