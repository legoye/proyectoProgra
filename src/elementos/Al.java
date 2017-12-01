package elementos;
import clasificacion.*;
public class Al extends Elemento implements Metal.DelBloqueP{
	static {
		valencias = new int[] {3};
	}
	
	public Al(){
		setEstado("Solido");
		setValencia();
	}
}
