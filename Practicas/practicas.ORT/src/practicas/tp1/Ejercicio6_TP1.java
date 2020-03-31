package practicas.tp1;

/*Dados tres números, informar el valor del mayor de todos (suponer que los tres
valores son distintos).*/

import java.util.Scanner;

public class Ejercicio6_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int mayor = 0;

		System.out.println("Ingrese un número");
		a = input.nextInt();
		System.out.println("Ingrese un segundo número");
		b = input.nextInt();
		System.out.println("Ingrese un tercer número");
		c = input.nextInt();

		System.out.println("Vamos a ver cual es el mayor...");

		if (a > b && a > c) {
			mayor = a;
		}

		if (b > a && b > c) {
			mayor = b;
		}

		if (c > a && c > b) {
			mayor = c;
		}

		System.out.println("El mayor numero que ingresaste es " + mayor);

		input.close();
	}

}
