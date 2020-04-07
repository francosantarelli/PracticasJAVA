package practicas.tp2;

/*Mostrar todos los números enteros del 1 al 100. Luego, mostrar los mismos
números en orden inverso.*/

public class Ejercicio01_TP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fin = 10;

		System.out.println("Mostramos del 1 al 10");

		for (int i = 1; i <= fin; i++) {
			System.out.println(i);
		}

		System.out.println("Mostramos del 10 al 1");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

	}

}
