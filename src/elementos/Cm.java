package elementos;
import clasificacion.*;
public class Cm extends Elemento implements Metal.Actinido{
	static {
		valencias = new int[] {3};
	}
	
	public Cm(){
		setEstado("Solido");
		setValencia();
	}
}
