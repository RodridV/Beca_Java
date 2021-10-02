package clases;

public class Movil {
	
	
	//Constructores
	public Movil() {
	}
	
	
	public Movil(int imei,int memoria, String marca, int tamanoPantalla) {
		this.imei=imei;
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
	}

	
	//Campos
	private int imei;		//Identificador de m�vil
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	
	//M�todos
	//...getters and setters
	
	
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamanoPantalla() {
		return tamanoPantalla;
	}
	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}


	//...redefinidos
	@Override
	public String toString() {
		String texto;
		
		texto="IMEI: "+this.imei+"\n"
				+"Memoria: "+this.memoria+" GB"+"\n"
				+"Marca: "+ this.marca+"\n"
				+"Tama�o de pantalla: "+ this.tamanoPantalla+" pulgadas"+"\n";
		
		return texto;
	}

	
	//...normales
	//M�todo que aumenta en un GB la memoria
	public void aumentarMemoria() {
		this.memoria++;
	}
	
	
	
}
