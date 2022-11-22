public abstract class Trabajador {
	private String nombre;
	private String tituloProfesional;
	private String direccion;
	private String estadoCivil;
	private String rut;
	private String horario;

	public Trabajador(String nombre, String tituloProfesional, String direccion, String estadoCivil, String rut) {
		this.nombre = nombre;
		this.tituloProfesional = tituloProfesional;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
	}

	public Trabajador(String nombre, String direccion, String rut, String estadoCivil, String tituloProfesional, String horario) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.rut = rut;
		this.estadoCivil = estadoCivil;
		this.tituloProfesional =tituloProfesional;
		this.horario=horario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getHorario(){
		return this.horario;
	}

	public void setHorario(String horario){
		this.horario = horario;
	}

	public abstract String getTipo();
}