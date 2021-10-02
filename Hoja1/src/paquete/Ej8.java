package paquete;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		/*
		Programa que lee 87 n�meros. Al finalizar mostrar� el m�ximo introducido, y cu�ntas veces
		se repite dicho m�ximo.
		 */
		
		int num,rep_max=0,max=Integer.MIN_VALUE;
		Scanner sc =new Scanner(System.in);
		
		
		for(int i=1;i<=87;i++) {
			
			System.out.println("Introduzca n�mero");
			num=sc.nextInt();
			
			if (num>max) {
				max=num;
				rep_max=1;
			}
			else if (num==max) {
				rep_max=rep_max+1;
			}
			

		}
		System.out.println("El n�mero m�ximo introducido ha sido el " + max + " y se ha repetido " + rep_max + " veces");
		sc.close();
	}

}
