package test;

import algoritmos.UtilArrays;

public class Test {

	public static void main(String[] args) {

		// Inicializo un conjunto de arreglos

		char[] elementos = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };

		char[] elementos2 = { 'C', 'A', 'L', 'C', 'U', 'L', 'A', 'D', 'O', 'R', 'A' };

		char[] invertir1 = { 'J', 'U', 'A', 'N', 'A' };

		char[] invertir2 = { 'D', 'A', 'N', 'I', 'E', 'L' };

		char[] elementosPal1 = { 'A', 'N', 'I', 'N', 'A' };

		char[] elementosPal2 = { 'R', 'E', 'C', 'O', 'N', 'O', 'C', 'E', 'R' };

		char[] elementosPal3 = { 'B', 'U', 'U', 'B' };

		char[] elementos3 = { 'B', 'L', 'A', 'N', 'C', 'O' };

		char[] elementos4 = { 'S', 'A', 'L', 'M', 'O', 'N' };

		//
		
		System.out.print("Muestro sin repetidos el siguiente arreglo: ");
		mostrarArray(elementos);
		UtilArrays.mostrarSinRepetidos(elementos);

		System.out.print("\n\nMuestro sin repetidos el siguiente arreglo: ");
		mostrarArray(elementos2);
		UtilArrays.mostrarSinRepetidos(elementos2);

		System.out.print("\n\n¿El siguiente arreglo es palindromo?: ");
		mostrarArray(elementosPal1);
		System.out.println("Respuesta: " + UtilArrays.esPalindromo(elementosPal1));

		System.out.print("\n¿El siguiente arreglo es palindromo?: ");
		mostrarArray(elementosPal2);
		System.out.println("Respuesta: " + UtilArrays.esPalindromo(elementosPal2));

		System.out.print("\n¿El siguiente arreglo es palindromo?: ");
		mostrarArray(elementosPal3);
		System.out.println("Respuesta: " + UtilArrays.esPalindromo(elementosPal3));

		System.out.print("\n¿El siguiente arreglo es palindromo?: ");
		mostrarArray(elementos);
		System.out.println("Respuesta: " + UtilArrays.esPalindromo(elementos));

		System.out.print("\n¿El siguiente arreglo es palindromo?: ");
		mostrarArray(elementos2);
		System.out.println("Respuesta: " + UtilArrays.esPalindromo(elementos2) + "\n");

		System.out.println("Muestro el array antes de invertir:");
		mostrarArray(invertir1);

		UtilArrays.invertir(invertir1);

		System.out.println("Muestro el array despues de invertir:");
		mostrarArray(invertir1);

		System.out.println("Muestro el array antes de invertir:");
		mostrarArray(invertir2);

		UtilArrays.invertir(invertir2);

		System.out.println("Muestro el array despues de invertir:");
		mostrarArray(invertir2);

		System.out.println("\nMuestro el array antes de rotar:");
		mostrarArray(elementos2);

		UtilArrays.rotar1(elementos2);

		System.out.println("Muestro el array despues de rotar:");
		mostrarArray(elementos2);

		UtilArrays.rotar1(elementos2);

		System.out.println("Vuelvo a rotar");
		mostrarArray(elementos2);

		// SEGUIR ACA

		System.out.println("\nMuestro union sin repetidos de los siguientes arreglos: ");
		mostrarArray(elementos3);
		mostrarArray(elementos4);
		System.out.println("\nUnion:");
		UtilArrays.mostrarUnion(elementos3, elementos4);

		System.out.println("\n\nMuestro interseccion de los siguientes arreglos: ");
		mostrarArray(elementos3);
		mostrarArray(elementos4);
		System.out.println("\nInterseccion:");
		UtilArrays.mostrarInterseccion(elementos3, elementos4);

		System.out.println("\n\nMuestro diferencia en los siguientes arreglos: ");
		mostrarArray(elementos3);
		mostrarArray(elementos4);
		System.out.println("\nDiferencias:");
		UtilArrays.mostrarDiferencia(elementos3, elementos4);

	}

	private static void mostrarArray(char[] elementosRotar) {
		for (int i = 0; i < elementosRotar.length; i++) {

			System.out.print(elementosRotar[i]);

		}

		System.out.println();
	}

}