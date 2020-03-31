package practicas.tp1;

/*Ingresar valores para las variables a y b. Una vez cargadas mostrar las variables
por pantalla, intercambiar entre sí sus valores (que lo cargado en a quede en b, y
viceversa) y volver a mostrarlas.*/

import java.util.Scanner;

public class Ejercicio5_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "";
		String b = "";
		String c = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese una letra: ");
		a = input.next();
		System.out.print("Ingrese otra letra: ");
		b = input.next();

		System.out.println("Los valores ingresados son " + a + " y " + b);
		System.out.println("Ahora las intercambiamos...");

		c = b;
		b = a;

		System.out.println("Los valores intercambiados son " + c + " y " + b);

		input.close();

	}

}
