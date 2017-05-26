import java.util.*;

public abstract class Deporte {

    private int codigo;
    private String titulo;
    private String descripcion;
    
    public Deporte(int codigo, String titulo, String descripcion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}   

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public abstract void validarHorario(Date datetime);

}