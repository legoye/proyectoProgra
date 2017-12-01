package elementos;
import clasificacion.*;
public class Pt extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {2,4};
	}
	
	public Pt(){
		setEstado("Solido");
		setValencia();
	}
}
