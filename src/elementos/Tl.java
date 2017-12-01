package elementos;
import clasificacion.*;
public class Tl extends Elemento implements Metal.DelBloqueP{
	static {
		valencias = new int[] {1,3};
	}
	
	public Tl(){
		setEstado("Solido");
		setValencia();
	}
}
