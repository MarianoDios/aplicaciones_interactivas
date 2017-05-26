
public abstract class NovedadSueldo {

    private boolean activa;
    private String nombre;
    
    public NovedadSueldo(boolean activa, String nombre) {
		super();
		this.activa = activa;
		this.nombre = nombre;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void aplicar(Empleado empleado);

}