package practicas.ORT;

/*Existen dos reglas que identifican dos conjuntos de valores:
A. El n�mero es de un solo d�gito.
B. El n�mero es impar.
A partir de estas reglas, crear un algoritmo que asigne a las variables booleanas
estaEnA, estaEnB, estaEnAmbos y noEstaEnNinguno el valor verdadero o falso,
seg�n corresponda, para indicar si el valor ingresado pertenece al primer
conjunto, al segundo, a ambos o a ninguno, respectivamente.
Definir un lote de prueba de varios n�meros y probar el algoritmo.*/

import java.util.Scanner;

public class Ejercicio12_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num = 0;
		boolean estaEnA = false;
		boolean estaEnB = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;

		System.out.print("Ingrese un n�mero: ");
		num = input.nextInt();

		if (num / 10 > 0) {
			System.out.println("Tiene mas de dos digitos");
		} else {
			System.out.println("Es de un solo digito. Est� en A");
			estaEnA = true;
		}

		if (num % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El n�mero es impar. Est� en B");
			estaEnB = true;
		}

		if (estaEnA == true && estaEnB == true) {
			estaEnAmbos = true;
			System.out.println("Est� en Ambos: " + estaEnAmbos);
		}

		if (estaEnA == false && estaEnB == false) {
			noEstaEnNinguno = true;
			System.out.println("No est� en ninguno: " + noEstaEnNinguno);
		}

		input.close();
	}

}
