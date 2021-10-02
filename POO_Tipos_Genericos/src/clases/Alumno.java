package clases;

public class Alumno {

	//Constructores
	public Alumno(int matricula) {
		this.matricula=matricula;
	}
	
	public Alumno(int matricula, String nombre) {
		this.matricula = matricula;
		this.nombre = nombre;
	}
	
	//Campos
	public int matricula;		//N�mero de matr�cula //id,PK
	public String nombre;
	
	//M�todos
	@Override
	public String toString() {
		return "N�mero de matr�cula: "+matricula+"\n"
				+"Nombre del alumno: "+nombre+"\n";
		}

	@Override
	public boolean equals(Object obj) {
		
		return ((Alumno)obj).matricula==this.matricula;
	}
	
	
}
