package elementos;
import clasificacion.*;
public class Cf extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {3};
	}
	
	public Cf(){
		setEstado("Solido");
		setValencia();
	}
}
