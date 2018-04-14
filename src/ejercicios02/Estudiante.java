package ejercicios02;

public class Estudiante {
	String dni;
	String nombre;
	Float nota;
	
	public Estudiante(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	
	public Float getNota() {
		return nota;
	}


	public void setNota(float nota) {
		this.nota = new Float(nota);
	}


	@Override
	public String toString() {
		return "El estudiante "+nombre+" tiene una calificacion de "+nota;
	}
}
