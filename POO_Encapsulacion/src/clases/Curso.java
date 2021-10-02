package clases;

public class Curso {
	//Constructores
	public Curso() {
					
	}
				
				
	//Campos
				
	private String denominacion="";		//Siempre inicializar para evitar errores
	private int horas;
	private String academia="";
			
			
	//M�todos			Vamos a crear los m�todos getter y setter (manualmente)
		
	//...getters
	public String getDenominacion() {
	//return denominacion.toUpperCase();		//Lo pasa todo a may�sculas
				
		if(this.denominacion.equals("")) {
			return "Sin denominaci�n";
			}
		else {
			return this.denominacion.toUpperCase();
			}
		}
			
	public int getHoras() {
		return this.horas;
		}
			
	public String getAcademia() {
		return ("Academia: "+this.academia);
		}
	
	//... setters
			
	public void setDenominacion(String p_denominacion){
		this.denominacion=p_denominacion;
		}
			
	public void setHoras(int horas) {
		this.horas=horas;
		}
			
	public void setAcademia(String academia) {
		this.academia=academia;
		}
}