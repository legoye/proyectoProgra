package elementos;
import clasificacion.*;
public class In extends Elemento implements Metal.DelBloqueP{
	static {
		valencias = new int[] {3};
	}
	
	public In(){
		setEstado("Solido");
		setValencia();
	}
}
