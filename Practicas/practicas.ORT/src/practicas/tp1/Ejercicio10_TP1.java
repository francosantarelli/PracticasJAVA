package practicas.tp1;

/*Para entrar a la montaña rusa "Infierno en las alturas" nos piden tener al menos 7
años y medir más de 1,40 m. Definir la operación necesaria y probarla con los
siguientes datos:
Nombre 	Edad 	Altura 	¿Puede? (V/F)
Juan 	5 		1.45
Pedro 	7 		1.23
Luis 	8 		1.51
Ana 	8 		1.39
*/

import java.util.Scanner;

public class Ejercicio10_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		double altura = 0;
		boolean puede = false;
		int edadMinima = 7;
		double alturaMinima = 1.40;

		System.out.print("Ingrese su nombre: ");
		nombre = input.nextLine();
		System.out.print("Ingrese su edad: ");
		edad = input.nextInt();
		System.out.print("Ingrese su altura: ");
		altura = input.nextDouble();

		if (edad >= edadMinima) {
			if (altura >= alturaMinima) {
				puede = true;
				System.out.println(nombre + " puede ingresar: " + puede);
			} else {
				puede = false;
				System.out.println(nombre + " tiene la edad pero no la altura. Puede ingresar: " + puede);
			}
		} else {
			puede = false;
			System.out.println(nombre + " tiene menos de " + edadMinima + " años. Puede ingresar: " + puede);
		}

		input.close();
	}

}
