package interfaz;

import java.util.HashMap;

public interface ICRUD <T1, T2>
{ 
	//T1 es el tipo de datos del objeto, por ejemplo Alumno.
	//T2 es el tipo de datos del campo del objeto que lo identifica como �nico. Por ejemplo, el n� de matr�cula del alumno
	
	
	void nuevo(T1 clase);
	
	T1 leer(T2 id);		//id -> Identificaci�n general y �nica
	
	HashMap <T2, T1> listar();
	
	void editar(T2 id);		//Identificaci�n de lo que se va a modificar
	
	void eliminar(T2 id);
	
}