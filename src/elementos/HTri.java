package elementos;
import clasificacion.*;
public class HTri extends Elemento implements NoMetal.OtroNoMetal{
	static {
		valencias=new int[] {-1,1};
	}
	public HTri() {
		setEstado("Gaseoso");
		setValencia();
	}
}