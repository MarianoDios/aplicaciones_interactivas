/**
 * 
 */
public class Socio extends Rol {
	
	private int dni;
	private String nombre;
	private String domicilio;
	private int telefono;
	private String email;
	private int credencial;

    public Socio(int dni, String nombre, String domicilio, int telefono, String email, int credencial) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.email = email;
		this.credencial = credencial;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
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

	public int getCredencial() {
		return credencial;
	}

	public void setCredencial(int credencial) {
		this.credencial = credencial;
	}

	public void validarIngreso() {
		
    }
	
    public static void buscarPorCredencial() {
    	
    }   

}