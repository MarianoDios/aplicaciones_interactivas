public class EmpleadoAsalariado extends Empleado {

    private float sueldoBasico;
    private String puesto;

    public EmpleadoAsalariado(String nombre, String domicilio, int telefono, String email, int cuil, float sueldoBasico, String puesto) {
		super(nombre, domicilio, telefono, email, cuil);
		this.sueldoBasico = sueldoBasico;
		this.puesto = puesto;
	}  

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void calcularBruto() {

    }

    public void registrarIngreso() {

    }

}