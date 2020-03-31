package practicas.tp1;

/*Suponiendo que el primer d�a de la semana es el Domingo, pedir un n�mero entre
1 y 7 (inclusive) y mostrar el nombre del d�a correspondiente. Si el d�a no est� en
el rango permitido debe emitir por pantalla un mensaje de error.*/

import java.util.Scanner;

public class Ejercicio7_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diaNumero = 0;
		String diaNombre = "";
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese un n�mero y veamos que d�a es ");
		diaNumero = input.nextInt();

		switch (diaNumero) {
		case 1:
			diaNombre = "Lunes";
			break;
		case 2:
			diaNombre = "Martes";
			break;
		case 3:
			diaNombre = "Miercoles";
			break;
		case 4:
			diaNombre = "Jueves";
			break;
		case 5:
			diaNombre = "Viernes";
			break;
		case 6:
			diaNombre = "S�bado";
			break;
		case 7:
			diaNombre = "Domingo";
			break;
		default:
			break;
		}

		if (diaNumero <= 7 && diaNumero > 0) {
			System.out.println("La casilla " + diaNumero + " pertenece al " + diaNombre);
		} else {
			System.out.println("Ese n�mero no est� dentro del rango permitido.");
		}

		input.close();

	}

}
