package clase1;

public class Ejecuta {

	public static void main(String[] args)
	{
		/*
		El alumno aprueba si supera el examen o entrega las 2 pr�cticas
		  nota	practica1Entregada	practica2Entregada
		--------------------------------------------------
		    3			true				false	
		*/
		float nota;                	//declaraci�n de la variable (indicando el tipo)
		boolean practica1Entregada;
		boolean practica2Entregada;
		
		nota = 3;                 	//asignaci�n de la variable
		practica1Entregada = true;
		practica2Entregada = false;
		
		if (nota>=5 || practica1Entregada==true && practica2Entregada==true){
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Suspenso");
		}
		
		if (nota>=5 || (practica1Entregada==true && practica2Entregada==true)){
			System.out.println("Aprobado_de_verdad");
		}
		else {
			System.out.println("Suspenso_de_verdad");
		}
		//Es lo mismo en ambos casos. Pens�bamos que el primero dar�a "Aprobado"
		//Le da prioridad al && y despu�s hace el ||
		if (practica1Entregada==true && practica2Entregada==true || nota>=5 ){
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Suspenso");
		}
	}

}

