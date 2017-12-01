package elementos;
import clasificacion.*;
public class Hg extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {1,2};
	}
	
	public Hg(){
		setEstado("Liquido");
		setValencia();
	}
}
