package interfaces;

public interface IGestionListado {
	
	//public abstract void nuevo(); //abstracto -> No tiene llaves ni c�digo dentro
	
	void nuevo(int numero);
	void listar();
	void eliminar(Integer numero);
	void eliminar();
	
}