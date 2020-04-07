package practicas.tp2;

/*Dados dos números enteros cuya relación de valores es que el primero es menor o
igual al segundo, escribir la secuencia de números que existe entre ambos:
a) Incluyéndolos;
b) Excluyéndolos.
En la carga debemos asegurarnos de que la relación entre los valores es la
correcta.
¿Qué pasaría si este control no se tiene en cuenta? ¿Cómo lo solucionaría?*/

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
		 * System.out.println("Acá excluidos ");
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
