package elementos;
import clasificacion.*;
public class U extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {6};
	}
	
	public U(){
		setEstado("Solido");
		setValencia();
	}
}
