package paquete2;

import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		/*
		Realiza un programa que cargue desde teclado una tabla de enteros de dimensi�n 3x3. El
		programa mostrar� la columna en la que la suma de sus elementos sea menor.
		*/
		
		int tabla[][]=new int [3][3];
		Scanner sc=new Scanner(System.in);
		
		//Creamos la tabla
		for(int i=0;i<tabla.length;i++) {
			System.out.println("N�meros para la fila "+(i+1));
			for(int j=0;j<tabla.length;j++) {
				System.out.println("Introduzca n�mero");
				tabla[i][j]=sc.nextInt();
			}
		}
		
		int suma_min=Integer.MAX_VALUE;
		int col=0; 						//Columna cuya suma es menor

		for (int j=0;j<tabla.length;j++) {
			int suma=0;
			for(int i=0;i<tabla.length;i++) {
				suma=suma+tabla[i][j];
			}
			if (suma<suma_min) {
				suma_min=suma;
				col=j;
			}
		}
		System.out.println("La columna cuya suma es menor es la "+(col+1)+" y su suma es "+suma_min);
		
		sc.close();
	}

}
