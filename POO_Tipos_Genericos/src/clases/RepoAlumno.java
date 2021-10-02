package clases;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.I_CRUD;

public class RepoAlumno implements I_CRUD<Alumno, Integer>
{

	//Constructor
	public RepoAlumno() {
		listado = new HashMap<Integer, Alumno>();
	}
	
	//Campos
	public HashMap<Integer,Alumno>listado;

	//M�todos
	@Override
	public void nuevo(Alumno clase) {
		this.listado.put(clase.matricula, clase);
		System.out.println("Alumno a�adido.\n");
	}

	@Override
	public Alumno leer(Integer id) {
		Alumno alumno = this.listado.get(id);
		return alumno;
	}

	@Override
	public HashMap<Integer, Alumno> listar2() {
		
		return this.listado;
	}

	@Override
	public void editar(Integer id, Alumno clase) {
		this.listado.put(id, clase);
		System.out.println("Editado con �xito.\n");
	}

	
	@Override
	public void eliminar2(Integer id) {
		if (this.listado.remove(id)==null) {
			System.out.println("No se ha eliminado porque no se encuentra.\n");
		}	
		else {
			System.out.println("Eliminado con �xito.\n");
		}
	}
	
	
	//Generados a causa del RepoArticulo
	@Override
	public void eliminar(Alumno clase) {
		this.listado.remove(clase.matricula);
		System.out.println("Eliminado con �xito.\n");
	}

	@Override
	public ArrayList<Alumno> listar() {		
		return null;
	}

}
