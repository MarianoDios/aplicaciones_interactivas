
public class ProfesorPorClase extends Empleado {

    private float valorHora;

    public ProfesorPorClase(String nombre, String domicilio, int telefono, String email, int cuil, float valorHora) {
		super(nombre, domicilio, telefono, email, cuil);
		this.valorHora = valorHora;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public void calcularBruto() {

    }

    public void registrarIngreso() {

    }

    public void registrarSalida() {

    }

}