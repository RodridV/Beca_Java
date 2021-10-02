package paquete;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		/* 2.Programa que lee 11 n�meros comprendidos entre el 20 y 40, ambos inclusive.
		En el caso en el que alg�n n�mero introducido no se encontrara dentro del rango
		permitido, se mostrar� un mensaje de error y seguir� pidiendo n�meros. El 
		programa finalizar� cuando se hayan introducido 11 n�meros v�lidos y mostrar�
		el n�mero m�ximo introducido de los 11 v�lidos. Adem�s indicar� cu�ntos n�meros
		de los introducidos no han sido v�lidos.
		*/
		
		int a, max, num_val,num_inval;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println("Introduce el primer n�mero");
		a = sc.nextInt();
		max=0;
		
		if (20 <= a && a <= 40) {
			max=a;
			num_val=1;
			num_inval=0;
		}
		else {
			num_inval=1;
			num_val=0;
			System.out.println("El n�mero debe estar comprendido entre 20 y 40");
		}
		while (num_val <11) {
			System.out.println("Introduce otro n�mero");
			a = sc.nextInt();
				
			if (20 <= a && a <= 40) {
				num_val++;
				if (a>max) {
					max=a;
				}
			}
			else {
				num_inval ++;
				System.out.println("El n�mero debe estar comprendido entre 20 y 40");
			}
		}
		System.out.println("El n�mero m�ximo introducido es "+ max);
		System.out.println("Se han introducido " + num_inval + " n�meros inv�lidos");
		sc.close();
	}
}
