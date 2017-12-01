package elementos;
import clasificacion.*;
public class Bi extends Elemento implements Metal.DelBloqueP,Pnictogeno{
	static {
		valencias = new int[] {-3,3,5};
	}
	
	public Bi(){
		setEstado("Solido");
		setValencia();
	}
}
