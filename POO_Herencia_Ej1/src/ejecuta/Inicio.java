package ejecuta;

import clases.Hamster;

public class Inicio {

	public static void main(String[] args) {
		
		/*
		Mascota miMascota = new Mascota("Puka",5);
		
		//M�todo creado
		System.out.println(miMascota.mostrar());

		//M�todo redefinido o sobreesctrito
		System.out.println(miMascota.toString());
		//Al sobreescribirlo en clases.Mascota, nos aparece que pertence a Mascota
		 */
		 
		Hamster miHamster = new Hamster("Marr�n","ExtraVital","Fulgencio",3);
		//Hamster miHamster2 = new Hamster();
		
		System.out.println(miHamster.toString());
	}

}
