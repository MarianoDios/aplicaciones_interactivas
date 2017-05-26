import java.util.*;

public class ActividadSimple extends Deporte {

	private int dia;
    private int horaInicio;
    private int horaFin;
    
    public ActividadSimple(int codigo, String titulo, String descripcion, int dia, int horaInicio, int horaFin) {
		super(codigo, titulo, descripcion);
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}

	public void validarHorario(Date datetime) {

    }

}