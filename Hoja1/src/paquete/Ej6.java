package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		/*
		6. Programa que lee 9 n�meros, y en el caso en el que el primero introducido sea igual al
		�ltimo, nos muestra la media. En caso contrario, no se mostrar� nada.
		 */

		List<Integer> lista = new ArrayList<Integer> ();
		int a,i=2;
		float sum,media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer n�mero de la lista");
		a= sc.nextInt();
		lista.add(a);
		
		while (lista.size()<9) {
			System.out.println("Introduzca otro n�mero");
			a= sc.nextInt();
			lista.add(a);
		}
		if (lista.get(0)==lista.get(8)) {
			sum=lista.get(1);
			while (i<=8) {
				sum=sum+lista.get(i);
				i=i+1;
			}
			media=sum/9F;		//Se debe a�adir la F para que nos de los decimales
			System.out.println("La media de los n�meros es "+media);
		}
		else {
			System.out.println("Fin");
		}
		sc.close();
	}

}
