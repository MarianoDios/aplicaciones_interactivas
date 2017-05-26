
public class ItemCronograma {

    public int horaInicio;
    public int horaFin;
    public String nombreActividad;
    public String nombreDeporte;
    
	public ItemCronograma(int horaInicio, int horaFin, String nombreActividad, String nombreDeporte) {
		super();
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.nombreActividad = nombreActividad;
		this.nombreDeporte = nombreDeporte;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}

	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public String getNombreDeporte() {
		return nombreDeporte;
	}

	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}
	
}