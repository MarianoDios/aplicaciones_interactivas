public abstract class Empleado {

    private String nombre;
    private String domicilio;
    private int telefono;
    private String email;
    private int cuil;

    public Empleado(String nombre, String domicilio, int telefono, String email, int cuil) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
		this.cuil = cuil;
	}  
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public abstract void calcularBruto();

    public abstract void registrarIngreso();

}