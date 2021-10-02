package paquete2;

import java.util.ArrayList;
import java.util.List;

public class Ej12 {

	public static void main(String[] args) {
		/*
		Programa que muestra los n�meros primos existentes entre el 1 y el 100. NOTA: Un
		n�mero es primo si tiene dos �nicos divisores que son el 1 y �l mismo.
		*/

		int a,resto;
		List<Integer> div =new ArrayList<Integer> ();
		
		for(int i=1;i<=100;i++) {
			a=1;
			div.clear();
			while (a<=i) {
				resto=i%a;
				if (resto==0) {
					div.add(a);
				}
				a=a+1;
			}
			if (div.size()<=2) {
				System.out.println(i);
			}
		}
	}

}
