package practicas.tp1;

import java.util.Scanner;

/*Para entrar a la montaña rusa "Miedo a las alturas", que es algo más chica y
tranquila, alcanza con que se cumpla una de las siguientes dos condiciones: nos
piden ser mayores a 7 años ó medir más de 1,50 m. Definir la operación y validar
con el mismo lote de datos del ejercicio anterior.*/

public class Ejercicio11_TP1 {

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

		if (edad >= edadMinima || altura >= alturaMinima) {
			puede = true;
			System.out.println(nombre + " puede ingresar: " + puede);

		} else {
			puede = false;
			System.out.println(nombre + " puede ingresar: " + puede);
		}

		input.close();

	}

}
