package practicas.ORT;

/*Dado un valor num�rico mayor que 0 ingresado por teclado, mostrar un mensaje
por pantalla indicando si el n�mero es par o impar. Para eso debe utilizarse el
operador �m�dulo� (%).*/

import java.util.Scanner;

public class Ejercicio8_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese un numero mayor que 0");
		numero = input.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

		input.close();
	}

}
