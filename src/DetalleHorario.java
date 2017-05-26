import java.util.Date;

public class DetalleHorario {

    private int horaIngreso;
    private int horaSalida;
    private Date fecha;
    
    public DetalleHorario(int horaIngreso, int horaSalida, Date fecha) {
		super();
		this.horaIngreso = horaIngreso;
		this.horaSalida = horaSalida;
		this.fecha = fecha;
	} 
    
	public int getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(int horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void calcularHoras() {
        
    }

    public void validarHorarioSalida(void actividades) {

    }

}