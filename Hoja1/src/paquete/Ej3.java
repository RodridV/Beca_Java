package paquete;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		/*
		Programa que lee de manera consecutiva n�meros hasta que se introducen dos n�meros
		iguales seguidos.
		*/
		
		int A,B;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero");
		A=sc.nextInt();
		
		System.out.println("Introduzca otro n�mero");
		B=sc.nextInt();
		
		if (A==B) {
			System.out.println("FIN");
		}
		else {
			A=B;
			System.out.println("Introduzca otro n�mero");
			B=sc.nextInt();
			while (A!=B) {
				A=B;
				System.out.println("Introduzca otro n�mero");
				B=sc.nextInt();
			}
			System.out.println("FIN");
		}
		sc.close();
	}

}