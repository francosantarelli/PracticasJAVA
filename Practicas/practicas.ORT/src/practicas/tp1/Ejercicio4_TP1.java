package practicas.tp1;

/*Dados dos números (valor1 y valor2) cargados desde teclado por el usuario,
mostrar el resultado de la división del primero por el segundo siguiendo el
formato valor1 + “ / “ + va lor2 + “ = “ + resultado. Pero en el caso de que el
segundo valor sea cero, en vez de mostrar lo anterior mostrar el siguiente
mensaje de error: “No se puede dividir por cero”.*/

import java.util.Scanner;

public class Ejercicio4_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor1 = 0;
		int valor2 = 0;
		int resultado = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese un valor: ");
		valor1 = input.nextInt();
		System.out.print("Ingrese otro valor: ");
		valor2 = input.nextInt();

		if (valor2 == 0) {
			System.out.println("No se puede dividir por cero");
		} else {
			resultado = valor1 / valor2;
			System.out.println(valor1 + " / " + valor2 + " = " + resultado);
		}

		input.close();

	}

}
