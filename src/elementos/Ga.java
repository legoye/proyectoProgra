package elementos;
import clasificacion.*;
public class Ga extends Elemento implements Metal.DelBloqueP{
	static {
		valencias = new int[] {3};
	}
	
	public Ga(){
		setEstado("Solido");
		setValencia();
	}
}
