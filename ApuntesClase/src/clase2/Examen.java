package clase2;

public class Examen {

	public static void main(String[] args) {
		String pais = "Espa�a";
		boolean historia=false;
		
		if( (pais.equals("Espa�a") || pais.equals("Francia")) && historia==true) {
			System.out.println("Encontrado1");
		}
		
		if( pais.equals("Espa�a") || pais.equals("Francia") && historia==true) {
			System.out.println("Encontrado2");
		}

	}

}
