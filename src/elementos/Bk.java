package elementos;
import clasificacion.*;
public class Bk extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {3};
	}
	
	public Bk(){
		setEstado("Solido");
		setValencia();
	}
}
