package paquete2;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		/*Programa que genera los N primeros n�meros de la serie de Fibonacci. El valor N deber�
		ser le�do por el teclado. NOTA: Los dos primeros n�meros son 1, y el resto se obtiene
		sumando los dos anteriores: 1,1,2,3,5,8,13,21�
		*/
		
		int N,Fib1=1,Fib2=1,Fib3;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("�Cu�ntos n�meros quiere de la serie de Fibonacci?");
		N=sc.nextInt();
		System.out.println(Fib1);
		
		for(int i=2;i<=N;i++) {
			
			System.out.println(Fib2);
			
			Fib3=Fib1+Fib2;
			Fib1=Fib2;
			Fib2=Fib3;
		}
		sc.close();
		
		
	}

}
