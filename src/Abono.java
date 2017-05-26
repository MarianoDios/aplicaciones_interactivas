/**
 * 
 */
public class Abono {

    private int codigo;
    private String nombre;
    private float precio;
    private int periodoInicio;
    private int periodoFin;
    
    public Abono(int codigo, String nombre, float precio, int periodoInicio, int periodoFin) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.periodoInicio = periodoInicio;
		this.periodoFin = periodoFin;
	} 
    
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getPeriodoInicio() {
		return periodoInicio;
	}

	public void setPeriodoInicio(int periodoInicio) {
		this.periodoInicio = periodoInicio;
	}

	public int getPeriodoFin() {
		return periodoFin;
	}

	public void setPeriodoFin(int periodoFin) {
		this.periodoFin = periodoFin;
	}

	public void esVigente() {

    }

}