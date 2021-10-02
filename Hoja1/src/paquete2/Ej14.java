package paquete2;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		/*
		Programa que lee una secuencia de 10 n�meros y muestra el mayor de los m�ltiplos de 5,
		y el menor de los m�ltiplos de 3. Si no hubiera ning�n m�ltiplo, el programa lo indicar�a.
		*/
		
		int num,may5=Integer.MIN_VALUE,men3=Integer.MAX_VALUE;
		Scanner sc = new Scanner (System.in);
		
		for (int i =1;i<=10;i++) {
			System.out.println("Introduzca n�mero");
			num=sc.nextInt();
			
			if (num%5==0) {					//Comprobamos si es divisible entre 5
				if (num>may5) {				//Cambiamos el mayor m�ltiplo de 5
					may5=num;
				}
			}
			if (num%3==0) {
				if(num<men3) {
					men3=num;
				}
			}
		}
		sc.close();
		if (may5==0) {
			System.out.println("No hay m�ltiplos de 5");
		}
		else if (may5!=0){
			System.out.println("El mayor m�ltiplo de 5 es " + may5);
		}
		if (men3==0) {
			System.out.println("No hay m�ltiplos de 3");
		}
		else if(men3!=0) {
			System.out.println("El menor m�ltiplo de 3 es " + men3);
		}
	}

}
