package paquete;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) 
	{
		
		/*
		 Programa que pide el n�mero de calificaciones a introducir, y una nota de corte. A
		continuaci�n se introducir�n las calificaciones, para finalmente indicar cu�ntas
		calificaciones han igualado o superado la nota de corte.
		 */
		int num_calif,aprob=0;
		float calif,nota_corte;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el n�mero de calificaciones");
		num_calif=sc.nextInt();
		System.out.println("Introduzca la nota de corte");
		nota_corte=sc.nextFloat();
		
		for (int i=1; i<=num_calif; i++) {
			System.out.println("Introduzca calificaci�n");
			calif=sc.nextFloat();
			if (calif>=nota_corte) {
				aprob++;
			}
		}
		
		sc.close();		
		System.out.println(aprob + " alumn@s han superado la nota de corte");
	}

}
