
public class ItemSalario {

    public String descripcion;
    public int unidades;
    public float monto;
    
	public ItemSalario(String descripcion, int unidades, float monto) {
		super();
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

}