package clases;

public class Tren extends Vehiculo{		//Hacemos que Tren herede de Veh�culo

	//Constructores
	public Tren() {
		super();
	}
	
	public Tren(String tipo, int peso, String color,
				int vagones, boolean largoRecorrido) {
		
		super(tipo, peso, color);
		
		this.vagones = vagones;
		this.largoRecorrido = largoRecorrido;
	}
	
	
	//Campos
	public int vagones;
	public boolean largoRecorrido;
	
	//M�todos
	//...toString
	@Override
	public String toString() {
		return super.toString()		//Invocamos el toString de la clase padre (Vehiculo)
				+"N�mero de vagones: " + vagones + "\n"
				+ "�Es de largo recorrido? " + ((largoRecorrido)?"Si":"No") + "\n";
	}
	
	
}
