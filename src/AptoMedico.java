import java.util.*;

public class AptoMedico {

    private Date fecha;
    private String nombreProfesional;
    private String observaciones;
    private Date fechaVencimiento;

    public AptoMedico(Date fecha, String nombreProfesional, String observaciones, Date fechaVencimiento) {
		super();
		this.fecha = fecha;
		this.nombreProfesional = nombreProfesional;
		this.observaciones = observaciones;
		this.fechaVencimiento = fechaVencimiento;
	}   

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreProfesional() {
		return nombreProfesional;
	}

	public void setNombreProfesional(String nombreProfesional) {
		this.nombreProfesional = nombreProfesional;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public void esVigente() {
    }

}