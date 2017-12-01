package elementos;
import clasificacion.*;
public class Pu extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {4};
	}
	
	public Pu(){
		setEstado("Solido");
		setValencia();
	}
}
