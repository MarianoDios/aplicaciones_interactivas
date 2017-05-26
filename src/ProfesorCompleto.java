
public class ProfesorCompleto extends Empleado {

    private float sueldoBasico;
    
    public ProfesorCompleto(String nombre, String domicilio, int telefono, String email, int cuil, float sueldoBasico) {
		super(nombre, domicilio, telefono, email, cuil);
		this.sueldoBasico = sueldoBasico;
	}
    
	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public void calcularBruto() {

    }

    public void registrarIngreso() {
    	
    }

}