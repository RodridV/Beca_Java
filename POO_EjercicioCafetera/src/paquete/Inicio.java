package paquete;

import java.util.Scanner;

import clases.Cafetera;

public class Inicio {

	public static void main(String[] args) {
		/*
		Dise�ar una clase que simule el funcionamiento de una m�quina de caf�.
		La cafetera registrar� el volumen de agua que puede almacenar, as� como
		el tama�o de los vasos de caf� o tazas que el usuario puede solicitar.
		Se pide, crear la clase Cafetera y sus miembros.
		
		A. Campos
			- volumen (cantidad de agua que puede almacenar la cafetera)
			- volumenVaso	-> restar al volumen
			- volumenTaza	-> restar al volumen
		B. M�todos
			- servirTaza()
			- servirVaso()
			- mostrar() -> indicar las caracter�sticas (redefinir toString)
		*/
		
		//float volumen = 2;	//volumen de la cafetera
		//float volumenTaza=0.4F;	//Volumen de la taza
		//float volumenVaso=0.2F;	//Volumen del vaso
		
		//Rellenamos los datos
		Scanner sc = new Scanner (System.in);
		
		//Iniciamos la cafetera
		Cafetera miCafetera = new Cafetera();
		
		//Rellenamos los datos de la cafetera
		System.out.println("Introduzca el volumen de la cafetera (en litros).");
		miCafetera.setVolumen(sc.nextFloat());
		
		System.out.println("Introduzca volumen de la taza (en litros).");
		miCafetera.setVolumenTaza(sc.nextFloat());
		
		System.out.println("Introduzca el volumen del vaso (en litros).");
		miCafetera.setVolumenVaso(sc.nextFloat());
		
		String menu;
		int opcion;	//Opci�n elegida en el men�
		
		menu="Men�:\n"
				+ "1. Mostrar capacidad de la cafetera.\n"
				+ "2. Servir una taza de caf�.\n"
				+ "3. Servir vaso de caf�.\n"
				+ "4. Salir del programa.\n";
		
		do {
			System.out.println(menu);
			System.out.println("Seleccione opci�n.\n");
			opcion=sc.nextInt();
			
			switch (opcion) {
				case 1:
					miCafetera.mostrar();
					break;
				case 2:
					miCafetera.servirTaza();
					break;
				case 3:
					miCafetera.servirVaso();
					break;
				case 4:
					System.out.println("Fin del programa. \n");
					break;
				default:
					System.out.println("Opci�n incorrecta.\n");
					break;
			}
			
		}while (opcion!=4);
			
		sc.close();
	}

}
