package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		// 5. Programa que nos informa si un n�mero introducido es primo o no.
		
		int A,a,resto;
		Scanner sc = new Scanner(System.in);
		List<Integer> div =new ArrayList<Integer> ();

		System.out.println("Introduzca un n�mero");
		A= sc.nextInt();
		a=2;
		if (a<A) {
			while (a<A) {
				resto=A%a;
				if (resto==0) {
					div.add(a);
				}
				a=a+1;
			}
		}
		if (div.size()==0) {
			System.out.println("El n�mero elegido es un n�mero primo");
		}
		else {
			System.out.println("El n�mero elegido no es un n�mero primo");
		}
		sc.close();
	}
}