package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		/*
		Programa que muestra todos los divisores de un n�mero introducido. Entre los divisores no
		se incluir� el propio n�mero.
		*/

		int A,a,resto;
		Scanner sc = new Scanner(System.in);
		List<Integer> div =new ArrayList<Integer> ();

		System.out.println("Introduzca un n�mero");
		A= sc.nextInt();
		a=1;
		if (a<A) {
			while (a<A) {
				resto=A%a;
				if (resto==0) {
					div.add(a);
				}
				a=a+1;
			}
		}
		System.out.println("Los divisores de su n�mero son "+div);
		sc.close();
	}
}
