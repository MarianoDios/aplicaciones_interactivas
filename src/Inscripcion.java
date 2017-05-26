
import java.util.*;

public abstract class Inscripcion {

    public Date fecha;

    public Inscripcion(Date fecha) {
		super();
		this.fecha = fecha;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public abstract void validarHorario(Date datetime);

}