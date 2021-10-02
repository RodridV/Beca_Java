package paquete;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 9 n�meros. A continuaci�n nos pedir� que
		busquemos un n�mero entre los introducidos, y nos dir� si ha sido encontrado o no. En el
		caso en el que haya sido encontrado, nos indicar� cu�ntas veces se ha introducido. El
		programa nos preguntar� si queremos seguir buscando m�s n�meros o no: ��Desea
		seguir buscando?(s/n)�.
		*/
		
		int [] lista = new int [9];
		Scanner sc =new Scanner (System.in);
		String respuesta="s";
		int num,rep=0;			//N�mero que se va a buscar y veces que ha aparecido
		
		//Solicitamos los n�meros
		for (int i=0;i<lista.length;i++) {
			System.out.println("Introduzca n�mero");
			lista[i]=sc.nextInt();
		}
		
		do {
			System.out.println("Introduce n�mero que desea buscar:");
			num=sc.nextInt();
			for (int j=0;j<lista.length;j++) {
				if(num==lista[j]) {
					rep++;
				}
			}
			if(rep==0) {
				System.out.println("No se ha encontrado el n�mero");
			}
			else {
				System.out.println("El n�mero "+ num + " se ha repetido " +rep + " veces");
			}
			rep=0;
			System.out.println("�Desea seguir buscando? (s/n)");
			respuesta=sc.next();
		}while(respuesta.equals("s"));
		
		System.out.println("Fin del programa");
		sc.close();
	}

}
