package elementos;

import java.util.Random;
import java.io.*;

public abstract class Elemento implements Serializable {

    private static final long serialVersionUID = 1L;

    protected static int[] valencias;
    protected int valencia;
    protected String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setValencia() {
        valencia = valencias[new Random().nextInt(valencias.length)];
    }

    public int getValencia() {
        return valencia;
    }

    @Override
    public String toString() {
        return "Elemento{" + "valencia=" + valencia + ", estado=" + estado + '}';
    }
    
    
}
