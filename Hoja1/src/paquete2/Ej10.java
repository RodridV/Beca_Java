package paquete2;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// Programa que lee 10 n�meros e indica si todos los n�meros son iguales o no.
		
		int num1,num2,cont;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca n�mero");
		num1=sc.nextInt();
		cont=1;
		for (int i=1;i<10;i++) {
			System.out.println("Introduzca n�mero");
			num2=sc.nextInt();
			
			if  (num1==num2) {
				cont++;
			}
		}
		sc.close();
		if (cont==10) {
			System.out.println("Todos los n�meros son iguales");
		}
		else {
			System.out.println("Los n�meros introducidos no son iguales");
		}
	}

}
