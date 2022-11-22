import java.util.ArrayList;

public class Universidad {
	private String nombre;
	private String tipoUniversidad;
	private String[] direccionAsociadas;
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();

	public Universidad (String nombre, String tipoUniversidad, String[] direccionAsociadas){
		this.nombre = nombre;
		this.tipoUniversidad = tipoUniversidad;
		this.direccionAsociadas = direccionAsociadas;
		this.trabajadores = new ArrayList<>();
		this.facultades = new ArrayList<>();
	}

	public Facultad agregarFacultad(Facultad facultad){
		this.facultades.add(facultad);
		return facultad;
	}

	public Profesor agregarProfesor(Profesor profesor){
		this.trabajadores.add(profesor);
		return profesor;
	}

	public Administrativo agregarAdministrativo(Administrativo administrativo){
		this.trabajadores.add(administrativo);
		return administrativo;
	}

	public ArrayList<Profesor> obtenerProfesoresFacultad(Facultad facultad){
		ArrayList<Profesor> listaProfesores = new ArrayList<>();
		for (Departamento departamento : facultad.getDepartamentos()){
			listaProfesores.addAll(departamento.getProfesores());
		}
		return listaProfesores;
	}

	public ArrayList<CarreraUniversitaria> obtenerCarrerasUniversitariasFacultad(Facultad facultad){
		ArrayList<CarreraUniversitaria> carreraUniversitarias = new ArrayList<>();
		for (Departamento departamento : facultad.getDepartamentos()){
			carreraUniversitarias.addAll(departamento.getCarrerasUniversitarias());
		}
		return carreraUniversitarias;
	}

	public ArrayList<Profesor> obtenerProfesoresUniversidad(){
		ArrayList<Profesor> listaProfesores = new ArrayList<>();
		for (Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("Profesor")){
				listaProfesores.add((Profesor) trabajador);
			}
		}
		return listaProfesores;
	}

	public ArrayList<Administrativo> obtenerAdministrativosUniversidad(){
		ArrayList<Administrativo> listaAdmininstrativos = new ArrayList<>();
		for (Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("Administrativo")){
				listaAdmininstrativos.add((Administrativo) trabajador);
			}
		}
		return listaAdmininstrativos;
	}

	public ArrayList<Profesor> obtenerProfesorContrato(String jornada, Departamento departamento){
		ArrayList<Profesor> listaProfesores = new ArrayList<>();
		for (Profesor profesor : departamento.getProfesores()){
			if(profesor.getHorario().equals(jornada)){
				listaProfesores.add(profesor);
			}
		}
		return listaProfesores;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoUniversidad() {
		return this.tipoUniversidad;
	}

	public void setTipoUniversidad(String tipoUniversidad) {
		this.tipoUniversidad = tipoUniversidad;
	}

	public String[] getDireccionAsociadas() {
		return this.direccionAsociadas;
	}

	public void setDireccionAsociadas(String[] direccionAsociadas) {
		this.direccionAsociadas = direccionAsociadas;
	}
}