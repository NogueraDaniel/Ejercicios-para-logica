package algoritmos;

public class UtilArrays {

	// Muestra el contenido de un array de caracteres recibido como parámetro sin
	// valores repetidos.
	public static void mostrarSinRepetidos(char[] elementos) {

		// Recorro "elementos":
		for (int i = 0; i < elementos.length; i++) {

			// Envio la posicion actual como parametro, junto al array
			if (!contieneChar(i, elementos)) {

				// Si no contiene en char, lo mostramos
				System.out.print(elementos[i]);
			}
		}
	}

	// Indica si un rango de posiciones contiene un char ubicado en una posicion
	// especifica del array
	private static boolean contieneChar(int posicionBuscada, char[] elementos) {

		boolean encontro = false;
		int i = 0;

		// Recorro desde 0 hasta posicion buscada sin incluirla
		while (i < posicionBuscada && !encontro) {

			// Comparo si el char aparecio anteriormente
			if (elementos[posicionBuscada] == elementos[i]) {

				encontro = true;

			} else {

				i++;
			}
		}

		return encontro;
	}

	// Retorna si el contenido de un array de caracteres recibido como parámetro
	// representa un palíndromo.
	public static boolean esPalindromo(char[] elementos) {

		// Usamos este boolean como flag para salir del proximo ciclo
		boolean esPalindromo = true;

		// Obtenemos ambos extremos del array
		int i = 0;
		int j = elementos.length - 1;

		// Recorro comparando la posicion trasera con la delantera, saliendo del ciclo
		// cuando sean diferentes entre si
		while (i < j && esPalindromo) {

			if (elementos[i] != elementos[j]) {

				esPalindromo = false;
			}

			i++;
			j--;
		}

		return esPalindromo;

	}

	// Invierte el contenido de un array de caracteres recibido como parámetro, sin
	// usar un array
	// auxiliar
	public static void invertir(char[] elementos) {

		// Obtengo ambos extremos del array
		int posTrasera = 0, posDelantera = elementos.length - 1;

		// Creo un char auxiliar para intercambiar valores
		char aux;

		// Mientras que la posicion trasera sea menor a la delantera, voy intercambiando
		// sus valores

		while (posTrasera < posDelantera) {

			// Guardo el valor en la posicion delantera en la variable auxiliar
			aux = elementos[posDelantera];

			// Pongo el elemento en la posicion trasera en la posicion delantera
			elementos[posDelantera] = elementos[posTrasera];

			// Pongo el elemento que estaba en la posicion delantera, antes de hacer el
			// cambio, en la posicion trasera, usando la variable auxiliar
			elementos[posTrasera] = aux;

			// Muevo los extremos
			posTrasera++;
			posDelantera--;
		}

	}

	// Rota una posición hacia la derecha cada elemento de un array de caracteres
	// recibido como parámetro, sin usar un array auxiliar.
	public static void rotar1(char[] elementos) {

		// Guardo el ultimo elemento del arreglo en la variable 'next'
		char next = elementos[elementos.length - 1];

		char aux;

		for (int i = 0; i < elementos.length; i++) {

			// Guardo en la variable auxiliar el elemento ubicado en la posicion 'i'
			aux = elementos[i];

			// En la posicion 'i' pongo al elemento que esta por detras (Si me encuentro en
			// la primer posicion, pondre al ultimo elemento, si me encuentro en la segundo
			// posicion, pondre al primero, etc)

			elementos[i] = next;

			// Guardo como siguiente al elemento que inicialmente se encontraba en la
			// posicion 'i', el cual guarde en la variable auxiliar
			next = aux;

		}
	}

	// Muestra los valores resultantes de la unión de dos arrays de caracteres
	// (sin repeticiones) recibidos como parámetros.
	public static void mostrarUnion(char[] cjto1, char[] cjto2) {

		// Creo un nuevo arreglo del tamaño de los 2 arreglos enviados por parametro
		char[] unificado = new char[cjto1.length + cjto2.length];

		// Unifico los 2 arreglos en 'unificado'
		unificarArray(unificado, cjto1, cjto2);

		// Ahora los muestro sin repetidos con el metodo implementado anteriormente
		mostrarSinRepetidos(unificado);
	}

	private static void unificarArray(char[] unificado, char[] cjto1, char[] cjto2) {

		// Declaro una constante para identificar cuantas listas recibo por parametro
		final int CANT_LISTAS = 2;

		// Inicializo la posicion con la que asignare los valores en el arreglo
		// unificado
		int posUnificado = 0;

		// Creo una matriz para guardar ambos arreglos
		char[][] matriz = new char[CANT_LISTAS][];

		matriz[0] = cjto1;
		matriz[1] = cjto2;

		// Recorro la matriz asignando los valores al arreglo unificado
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				// El iterador de la lista unificada es independiente al for anidado
				unificado[posUnificado] = matriz[i][j];
				posUnificado++;
			}

		}

	}

	// Muestra los valores resultantes de la intersección de dos arrays de
	// caracteres (sin repeticiones) recibidos como parámetros. Mostrara los char
	// que se encuentren en ambas listas sin repetirse

	public static void mostrarInterseccion(char[] cjto1, char[] cjto2) {

		// Recorro unicamente una de las dos listas, ya que solo me interesa saber si
		// los
		// valores de una lista se encuentran en la otra
		for (int i = 0; i < cjto1.length; i++) {

			// Consulto primero si el char actual aun no aparecio en mi lista, y luego
			// consulto
			// si ese mismo char se encuentra en la segunda lista

			if (!contieneChar(i, cjto1) && contieneCharEnviado(cjto1[i], cjto2)) {

				// Si se cumple la condicion, lo muestro
				System.out.print(cjto1[i] + " ");
			}

		}
	}

	/// Indica si un char enviado como parametro se encuentra en la lista enviada
	/// por parametro
	private static boolean contieneCharEnviado(char c, char[] array) {

		boolean contiene = false;

		int i = 0;

		while (i < array.length && !contiene) {

			if (c == array[i]) {

				contiene = true;
			}

			i++;
		}

		return contiene;
	}

	// Muestra los valores resultantes de la diferencia de dos arrays de caracteres
	// (sin repeticiones)
	// recibidos como parámetros (el primero menos el segundo).
	public static void mostrarDiferencia(char[] cjto1, char[] cjto2) {

		for (int i = 0; i < cjto1.length; i++) {

			// Si el char no se encuentra en la segunda lista, y no aparecio aun en la
			// primera, lo mostramos
			if (!contieneChar(i, cjto1) && !contieneCharEnviado(cjto1[i], cjto2)) {

				System.out.print(cjto1[i] + " ");
			}

		}

	}

}
