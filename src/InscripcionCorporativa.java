import java.util.Date;

public class InscripcionCorporativa extends Inscripcion {

    public String nombeEmpresa;
    public int cuit;
    
	public InscripcionCorporativa(Date fecha, String nombeEmpresa, int cuit) {
		super(fecha);
		this.nombeEmpresa = nombeEmpresa;
		this.cuit = cuit;
	}

	public String getNombeEmpresa() {
		return nombeEmpresa;
	}

	public void setNombeEmpresa(String nombeEmpresa) {
		this.nombeEmpresa = nombeEmpresa;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	@Override
	public void validarHorario(Date datetime) {
		
	}

}