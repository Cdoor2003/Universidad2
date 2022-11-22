public abstract class Administrativo extends Trabajador {
	private Departamento departamento;

	public Administrativo(String nombre, String tituloProfesional, String direccion, String estadoCivil, String rut) {
		super(nombre, tituloProfesional, direccion, estadoCivil, rut);
	}
	public String getTipo(){
		return "Administrativo";
	}

	public Departamento asociarDepartamento(Departamento departamento){
		this.departamento = departamento;
		return departamento;
	}
}