package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 10 n�meros sin repetir. Si el usuario introduce
		alg�n n�mero repetido se le debe notificar, y no ha de ser contabilizado.
		*/
		
		int cont=0,comprobar;	//Contador para llegar hasta los 10 n�meros;Para comprobar repetici�n de n�mero
		Scanner sc = new Scanner(System.in);
		int [] num= new int [10];
		boolean repetido; //Para ver si es repetido
		
		System.out.println("Introduzca n�mero");
		num[cont]=sc.nextInt();
		
		while (cont<num.length-1) {	//Hay que quitarle 1 para que no vuelva a entrar al bucle
			repetido=false;
			System.out.println("Introduzca n�mero");
			comprobar=sc.nextInt();
			for (int i=0;i<=cont;i++) {
				if (num[i]==comprobar) {
					repetido=true;
				}
			}
			if (repetido==false) {
				cont++;
				num[cont]=comprobar;
			}
			else {
				System.out.println("El n�mero introducido es repetido");
			}
		}
		
		System.out.println("Los n�mero introducidos son" +"\n"
							+Arrays.toString(num));
		sc.close();
	}

}
