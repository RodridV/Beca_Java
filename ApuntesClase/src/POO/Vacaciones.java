package POO;

public class Vacaciones {		//Asociado a Mod_Acceso

	//Constructores
	public Vacaciones(String destino, int dias, boolean playa)
	{
		this.destino = destino;
		this.dias = dias;
		this.playa = playa;
	}

	public Vacaciones() {
	}
	
	
	//Campos
	protected String destino;
	public int dias;
	public boolean playa;
	
	//protected -> h�brido privado y p�blico. P�blico porque se puede heredar (si la clase est� en el mismo paquete) y privado porque desde el objeto solicitar.
	
	
	public void mostrar() {
		String texto;
		
		/*
		texto= "D�as: "+this.dias+"\n"
				+"Destino: "+this.destino+"\n"
				+"Playa: "+ ((this.playa==true)?"si":"no");
		*/
		
		texto= "D�as: "+this.dias+"\n"
				+"Destino: "+this.destino+"\n";
		if (this.playa==true){
			texto= texto+ "Playa: si";
		}
		else if(this.playa==false){
			texto=texto+ "Playa: no";
		}
		
		System.out.println(texto);
		
	}
	
	
}
