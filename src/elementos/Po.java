package elementos;
import clasificacion.*;
public class Po extends Elemento implements Metal.DelBloqueP,Chalcogeno{
	static {
		valencias = new int[] {-2,2,4};
	}
	
	public Po(){
		setEstado("Solido");
		setValencia();
	}
}
