import java.util.ArrayList;

public class Departamento {
	private String nombre;
	public Facultad facultad;
	private ArrayList<CarreraUniversitaria> carrerasUniversitarias = new ArrayList<CarreraUniversitaria>();
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();

	public Departamento(String nombre) {
		this.nombre = nombre;
		this.facultad = facultad;
		this.profesores = new ArrayList<>();
		this.administrativos = new ArrayList<>();
		this.carrerasUniversitarias = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Administrativo> getAdministrativos(){
		return administrativos;
	}

	public ArrayList<Profesor> getProfesores(){
		return profesores;
	}

	public ArrayList<CarreraUniversitaria> getCarrerasUniversitarias(){
		return carrerasUniversitarias;
	}

	public CarreraUniversitaria agregarCarreraUniversitaria(CarreraUniversitaria carreraUniversitaria){
		this.carrerasUniversitarias.add(carreraUniversitaria);
		return carreraUniversitaria;
	}
	public Profesor agregarProfesor(Profesor profesor) {
		this.profesores.add(profesor);
		return profesor;
	}

	public Administrativo agregarAdministrativo(Administrativo administrativo) {
		this.administrativos.add(administrativo);
		return administrativo;
	}
}