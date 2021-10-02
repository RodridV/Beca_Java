package paquete2;

import java.util.Calendar;
import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		/*
		Programa que lee nombre y a�o de nacimiento de una serie de alumnos hasta introducir
		como nombre de alumno �fin�. En ese momento mostrar� la edad media de los alumnos y
		el nombre del alumno menor. NOTA: Al introducir como nombre �fin�, no nos ha de pedir el
		a�o de nacimiento.
		 */
		
		
		//Nombre de cada alumno, nombre del alumno de menor edad
		String nombre,nombre_menor="";
		
		//Edad de cada alumno, edad menor, contador para hacer la media
		int edad,edadMin=Integer.MAX_VALUE,i=0;
		
		int year = Calendar.getInstance().get(Calendar.YEAR); //A�o actual
		
		float sum=0;	//Sumatorio edades
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca nombre del alumno");
		nombre=sc.next();
		
		while (!nombre.equals("fin")) {		//nombre.equals("fin")==false   tambi�n valdr�a
			System.out.println("Introduzca a�o de nacimiento");
			edad=year-sc.nextInt();		//Calculamos la edad del alumno
			sum += edad;				//Sumamos las edades de los alumnos
			i++;
			if (edad<edadMin) {			//Para ver el de menor edad
				edadMin=edad;
				nombre_menor=nombre;
			}
			System.out.println("Introduzca nombre del alumno");
			nombre=sc.next();
		}
		
		//Para saber si se ha pedido alg�n dato o no
		if (sum!=0) {
			System.out.println("La edad media de los alumnos es " + (sum/i)+ " a�os");
			System.out.println("El alumno menor es " + nombre_menor);
		}
		System.out.println("Fin del programa");
		sc.close();
	}
}
