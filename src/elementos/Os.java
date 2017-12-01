package elementos;
import clasificacion.*;
public class Os extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {4};
	}
	
	public Os(){
		setEstado("Solido");
		setValencia();
	}
}
