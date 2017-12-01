package elementos;
import clasificacion.*;
public class H extends Elemento implements NoMetal.OtroNoMetal{
	static {
		valencias=new int[] {-1,1};
	}
	public H() {
		setEstado("Gaseoso");
		setValencia();
	}
}