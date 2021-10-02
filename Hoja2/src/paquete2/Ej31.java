package paquete2;


import java.util.Scanner;

public class Ej31 {

	public static void main(String[] args) {
		/*
		Realiza un programa que gestione una lista ordenada ascendentemente y con un m�ximo
		de 18 elementos. No se permitir�n repetidos:
		Men�:
		1.- Introducir n�mero entero.
		2.- Listar n�meros.
		3.- Eliminar n�mero.
		4.- Eliminar todos los n�meros.
		5.- Salir.
		*/
		
		
		String menu;
		Scanner sc = new Scanner(System.in);
		int [] numeros = new int [18];		//Tama�o del array
		int num;		//Valor que introduce el usuario
		int opcion;		//Opci�n elegida por el usuario
		int posi=0;		//Posici�n donde se graba el n�mero
		boolean repe=false;		//Para comprobar si el n�mero es repetido
		boolean encontrado=false; 	//Para eliminar n�meros
		
		menu ="Men�:\n"
				+ "1. Introducir n�mero entero.\n"
				+ "2. Listar n�meros.\n"
				+ "3. Eliminar n�mero.\n"
				+ "4. Eliminar todos los n�meros.\n"
				+ "5. Salir.\n";
		
		do {
			System.out.println(menu);
			System.out.print("Introduzca opci�n: \n");
			opcion= sc.nextInt();
			
			switch (opcion) {
			
				case 1:		//Introducir y ordenar
					
					if (posi==numeros.length) { //Comprobamos que no est� lleno
						System.out.println("La lista est� completa.\n");
					}
					else {
						System.out.println("\nIntroduzca n�mero entero:");
						num=sc.nextInt();
						repe=false;
						//Comprobamos que no est� repetido
						for (int i=0;i<numeros.length;i++) {
							if (num==numeros[i]) {
								repe=true;
							}
						}
						if (repe) {
							System.out.println("El n�mero es repetido.\n");
						}
						else {
							//A�adimos el n�mero y ordenamos
							if (posi==0) {			//Para a�adir el primer n�mero sin problema
								numeros[posi]=num;
							}
							else {
								if (num>numeros[posi-1]) {		//Si el nuevo n�mero es mayor que el �ltimo, se coloca inmediatamente despu�s
									numeros[posi]=num;
								}
								else {
									for (int j=posi;j>0;j--) {		//Desde el final hasta el principio vamos comprobando en qu� posici�n se debe introducir el nuevo n�mero
										if(num<numeros[j-1]) {
											numeros[j]=numeros[j-1];
											numeros[j-1]=num;
										}
										else {
											numeros[j]=num;
											break;				//Una vez introducido el nuevo n�mero, salimos del bucle
										}
									}
								}
							}
							posi++;
							System.out.println("N�mero guardado.\n");
						}
					}
					
				break;	
				
				case 2:		//Listar (mostrar n�meros)
					if(posi==0) {
						System.out.println("No hay datos.\n");
					}
					else {
						System.out.println("La lista de n�meros es:");
						System.out.print("[");
						for(int j=0;j<posi-1;j++) {
							System.out.print(numeros[j]+ ", ");
						}
						System.out.println(numeros[posi-1]+"]\n");
					}
				break;
				
				case 3:		//Eliminar n�mero
					System.out.println("�Qu� n�mero desea eliminar?");
					num=sc.nextInt();
					encontrado=false;
					for (int i=0;i<numeros.length;i++) {
						if (num==numeros[i]) {				//Comprobamos que el n�mero que quiere eliminar existe en nuestro array
							encontrado=true;
							for (int j=i;j<numeros.length-1;j++) {
								numeros[j]=numeros[j+1];
							}
						}
					}
					if (encontrado==false) {
						System.out.println("El n�mero seleccionado no se ha encontrado.\n");
					}
					else {
						posi--;							//Restamos una posici�n de conteo
						System.out.println("El n�mero "+ num+" ha sido eliminado.\n");
						for (int i =posi;i<numeros.length;i++) {
							numeros[i]=0;
						}
					}
					
				break;
				
				case 4:		//Eliminar todos los n�meros
					numeros=new int[numeros.length];		//Tambi�n se puede excluir esto ya que reiniciamos la posici�n
					posi=0;
					System.out.println("Todos los n�meros han sido eliminados.\n");
				break;
				
				case 5:		//Salir del programa
					System.out.println("Saliendo del programa...");
				break;
				
				default:
					System.out.println("\n Opci�n incorrecta.");
				break;
			}
			
		}while(opcion!=5);
		
		System.out.println("\nFin del programa.");
		sc.close();
	}

}
