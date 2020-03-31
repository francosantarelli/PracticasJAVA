package practicas.tp1;

/*Dados 2 valores numéricos num1 y num2, ingresados por teclado, asignar en la
variable booleana sonIguales el valor correspondiente a partir de los valores de la
comparación entre ambos (verdadero si son iguales, falso si no lo son).*/

import java.util.Scanner;

public class Ejercicio9_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		boolean sonIguales = false;

		System.out.println("Ingrese un numero");
		num1 = input.nextInt();
		System.out.println("Ingrese otro numero");
		num2 = input.nextInt();

		if (num1 == num2) {
			sonIguales = true;
		} else {
			sonIguales = false;

		}

		System.out.println("Los valores ingresados son iguales: " + sonIguales);

		input.close();
	}

}
