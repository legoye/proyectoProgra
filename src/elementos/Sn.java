package elementos;
import clasificacion.*;
public class Sn extends Elemento implements Metal.DelBloqueP{
	static {
		valencias = new int[] {2,4};
	}
	
	public Sn(){
		setEstado("Solido");
		setValencia();
	}
}
