package practicas.tp2;

/*Ingresar dos n�meros enteros positivos llamados A y B. Calcular el producto de
�stos a trav�s de sumas sucesivas. Por ejemplo, si los n�meros son 4 y 2, hacer 4
+ 4; si son 5 y 3, hacer 5 + 5 + 5.
�Qu� pasa si la diferencia entre los dos n�meros es muy grande? �Influye cu�l se
usa para sumar y cu�l para contar la cantidad de sumas hechas? �C�mo puede
mejorarse para que sea m�s eficiente?*/

import java.util.Scanner;

public class Ejercicio03_TP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int aSumar = 0;
		int veces = 0;
		int producto = 0;

		System.out.print("Ingrese el numero que vamos a sumar: ");
		aSumar = input.nextInt();
		System.out.print("Ingrese cuantas veces lo vamos a sumar: ");
		veces = input.nextInt();

		for (int i = 0; i < veces; i++) {
			producto += aSumar;
			// System.out.println(producto + " + " + aSumar + " es: " + (producto +
			// aSumar));
			System.out.println(producto);
		}

		input.close();
	}

}
