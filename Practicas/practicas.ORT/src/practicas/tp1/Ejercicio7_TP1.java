package practicas.tp1;

/*Suponiendo que el primer día de la semana es el Domingo, pedir un número entre
1 y 7 (inclusive) y mostrar el nombre del día correspondiente. Si el día no está en
el rango permitido debe emitir por pantalla un mensaje de error.*/

import java.util.Scanner;

public class Ejercicio7_TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diaNumero = 0;
		String diaNombre = "";
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese un número y veamos que día es ");
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
			diaNombre = "Sábado";
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
			System.out.println("Ese número no está dentro del rango permitido.");
		}

		input.close();

	}

}
