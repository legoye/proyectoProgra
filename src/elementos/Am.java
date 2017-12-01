package elementos;
import clasificacion.*;
public class Am extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {3};
	}
	
	public Am(){
		setEstado("Solido");
		setValencia();
	}
}
