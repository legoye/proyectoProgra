package elementos;
import clasificacion.*;
public class Fl extends Elemento implements Metal.DelBloqueP{
	static {
		valencias = new int[] {0};
	}
	
	public Fl(){
		setEstado("Solido");
		setValencia();
	}
}
