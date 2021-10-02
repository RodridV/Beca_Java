package ejecuta;

import java.util.Scanner;

import clases.Gestion_Listado;

public class Inicio {

	public static void main(String[] args) {
		
		/*	Usamos el ejercicio 31 como ejemplo:
		31. Realiza un programa que gestione una tabla ordenada ascendentemente y con un m�ximo
		de 18 elementos. No se permitir�n repetidos:
		
		Men�:
		1.- Introducir n�mero entero.
		2.- Listar n�meros.
		3.- Eliminar n�mero.
		4.- Eliminar todos los n�meros.
		5.- Salir.	
		*/

		//Declaramos las variables
		Gestion_Listado gestion=new Gestion_Listado();
		Scanner sc = new Scanner(System.in);
		int opcion;
		int numero;
		String menu;
		
		menu ="Men�:\n"
				+ "1. Introducir n�mero entero.\n"
				+ "2. Listar n�meros.\n"
				+ "3. Eliminar n�mero.\n"
				+ "4. Eliminar todos los n�meros.\n"
				+ "5. Salir.\n";
		
		do {
			System.out.println(menu);
			System.out.print("Introduzca opci�n: \n");
			
			try {
				opcion= Integer.valueOf(sc.nextLine());	//Para que no se convierta en un bucle infinito.
				
				switch(opcion) {
				case 1:
					System.out.println("Introduzca n�mero:");
					numero =Integer.valueOf(sc.nextLine());
					gestion.nuevo(numero);
					break;
				
				case 2:
					gestion.listar();
					break;
				
				case 3:
					System.out.println("Introduzca n�mero que desea eliminar:");
					numero =Integer.valueOf(sc.nextLine());
					gestion.eliminar(numero);
					break;
				
				case 4:
					gestion.eliminar();
					break;
				
				case 5:
					System.out.println("Fin del programa");
					break;
				
				default :
					System.out.println("Opci�n no v�lida.\n");
				break;
				}
			}
			catch (Exception e) {
				opcion= 0;		//Para que vuelva a realizar el do while
				System.out.println("Opci�n incorrecta. Debe introducir un n�mero.\n");
			}
			
		}while(opcion!=5);
		sc.close();
	}

}
