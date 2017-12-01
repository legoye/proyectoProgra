package elementos;
import clasificacion.*;
public class HDeu extends Elemento implements NoMetal.OtroNoMetal{
	static {
		valencias=new int[] {-1,1};
	}
	public HDeu() {
		setEstado("Gaseoso");
		setValencia();
	}
}