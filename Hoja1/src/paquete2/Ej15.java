package paquete2;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		/*
		Programa que lee un n�mero y muestra la suma de sus divisores, sin incluir el propio
		n�mero entre sus divisores.
		*/
		
		int num,sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca n�mero");
		num=sc.nextInt();
		
		for (int i=1;i<num;i++) {
			if (num%i==0){
				sum=sum+i;
			}
		}
		sc.close();
		System.out.println("La suma de los divisores es " + sum);
	}

}
