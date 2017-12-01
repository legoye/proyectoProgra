package elementos;
import clasificacion.*;
public class Db extends Elemento implements Metal.DeTransicion{
	static {
		valencias = new int[] {5};
	}
	
	public Db(){
		setEstado("Desconocido");
		setValencia();
	}
}
