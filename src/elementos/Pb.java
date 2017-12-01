package elementos;
import clasificacion.*;
public class Pb extends Elemento implements Metal.DelBloqueP{
	static {
		valencias = new int[] {2,4};
	}
	
	public Pb(){
		setEstado("Solido");
		setValencia();
	}
}
