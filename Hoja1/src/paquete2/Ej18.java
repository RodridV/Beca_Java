package paquete2;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		//Programa que lee 3 n�meros y los muestra ordenados de manera descendente.
		
		int num1,num2,num3,num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca n�mero");		//Primer n�mero
		num1=sc.nextInt();
		
		System.out.println("Introduzca otro n�mero");	//Segundo n�mero
		num=sc.nextInt();
		if (num<num1) {
			num2=num1;
			num1=num;
		}
		else {
			num2=num;
		}
		
		System.out.println("Introduzca otro n�mero");	//Tercer n�mero
		num=sc.nextInt();
		if (num>num2) {
			num3=num;
		}
		else if(num<num1) {
			num3=num2;
			num2=num1;
			num1=num;
		}
		else {
			num3=num2;
			num2=num;
		}
		sc.close();
		System.out.println("Los n�meros ordenados de manera descendente son"+ "\n"
		+num3+"\n"
		+num2+"\n"
		+num1);
	}

}
