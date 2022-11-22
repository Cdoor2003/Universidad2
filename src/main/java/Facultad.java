import java.util.ArrayList;

public class Facultad {
	private String nombreFacultad;
	private String latitud;
	private String longitud;
	public Universidad universidad;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public Facultad (String nombreFacultad, String ubicacionGeografica){
		this.nombreFacultad = nombreFacultad;
		this.latitud = latitud;
		this.longitud = longitud;
		this.departamentos = new ArrayList<>();
		this.universidad = universidad;
	}

	public Departamento agregarDepartamento(Departamento departamento){
		this.departamentos.add(departamento);
		return departamento;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getNombreFacultad() {
		return this.nombreFacultad;
	}

	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}
}