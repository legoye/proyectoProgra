package elementos;
import clasificacion.*;
public class Es extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {3};
	}
	
	public Es(){
		setEstado("Solido");
		setValencia();
	}
}
