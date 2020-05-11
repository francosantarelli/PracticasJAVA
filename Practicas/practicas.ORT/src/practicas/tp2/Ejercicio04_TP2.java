package practicas.tp2;

/*A partir de un valor ingresado por el usuario (el cual deberá estar comprendido
entre 2 y 9, inclusive), generar y mostrar todos los múltiplos del mismo menores
a 100, primero en forma ascendente y luego en sentido inverso, dentro del
mismo programa.*/

import java.util.Scanner;

public class Ejercicio04_TP2 {

	public static boolean esMultiplo(int n1, int n2) {
		if (n1 % n2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int multiplo = 0;

		System.out.print("Ingrese un numero entre 2 y 9: ");
		multiplo = input.nextInt();

		System.out.print("Los multiplos de " + multiplo + " son");
		for (int x = 1; x < multiplo; x++) {
			if (esMultiplo(multiplo, x)) {
				System.out.print(" " + x);
			}
		}

		input.close();
	}

}
