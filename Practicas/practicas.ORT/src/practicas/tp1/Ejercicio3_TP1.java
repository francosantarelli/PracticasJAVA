package practicas.tp1;

/*Luego de ingresar por teclado dos números n1 y n2, mostrar el resultado de la
suma entre ambos, utilizando el siguiente formato:
“La multiplicación entre “ + n1 + “ y “ + n2 + “ da como resultado “ + n1 + n2.
¿El resultado que se ve en pantalla es correcto? ¿Cómo se puede solucionar?
*/

import java.util.Scanner;

public class Ejercicio3_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0;
		int n2 = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un Numero");
		n1 = entrada.nextInt();
		System.out.println("Ingrese otro Numero");
		n2 = entrada.nextInt();

		System.out.println("La multiplicación entre " + n1 + " y " + n2 + " da como resultado " + (n1 * n2));

		entrada.close();

	}

}
