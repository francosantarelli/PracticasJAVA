package practicas.tp2;

/*Dados dos n�meros enteros cuya relaci�n de valores es que el primero es menor o
igual al segundo, escribir la secuencia de n�meros que existe entre ambos:
a) Incluy�ndolos;
b) Excluy�ndolos.
En la carga debemos asegurarnos de que la relaci�n entre los valores es la
correcta.
�Qu� pasar�a si este control no se tiene en cuenta? �C�mo lo solucionar�a?*/

import java.util.Scanner;

public class Ejercicio02_TP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;

		System.out.print("Ingrese un numero: ");
		n1 = input.nextInt();
		System.out.print("Ingrese otro numero: ");
		n2 = input.nextInt();

		// Incluidos
		/*
		 * System.out.println("Con los numeros ingresados incluidos: ");
		 * 
		 * while (n1 <= n2) { System.out.println(n1++); }
		 */

		// Excluidos
		/*
		 * System.out.println("Ac� excluidos ");
		 * 
		 * n1 = n1 + 1;
		 * 
		 * while (n1 < n2) { System.out.println(n1++); }
		 */

		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
		}

		input.close();
	}

}
