public abstract class Profesor extends Trabajador {

	public Profesor(String nombre, String tituloProfesional, String direccion, String estadoCivil, String rut) {
		super(nombre, tituloProfesional, direccion, estadoCivil, rut);
	}
	public String getTipo(){
		return "Profesor";
	}
	public void asignarHorario(int opcion) {
		switch (opcion){
			case 1:
				super.setHorario("Jornada parcial");
				break;
			case 2:
				super.setHorario("Media Jornada");
				break;
			case 3:
				super.setHorario("Jornada completa");
				break;
		}
	}
}