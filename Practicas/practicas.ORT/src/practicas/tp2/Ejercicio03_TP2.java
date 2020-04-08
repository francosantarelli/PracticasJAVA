package practicas.tp2;

/*Ingresar dos números enteros positivos llamados A y B. Calcular el producto de
éstos a través de sumas sucesivas. Por ejemplo, si los números son 4 y 2, hacer 4
+ 4; si son 5 y 3, hacer 5 + 5 + 5.
¿Qué pasa si la diferencia entre los dos números es muy grande? ¿Influye cuál se
usa para sumar y cuál para contar la cantidad de sumas hechas? ¿Cómo puede
mejorarse para que sea más eficiente?*/

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
