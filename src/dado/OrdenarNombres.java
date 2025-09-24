package dado;

// Importamos la clase  Arrays  para usar el metodo  de ordenamiento 
import java.util.Arrays;
// Importamos la clase  Scanner  para leer la entrada del usuario
import java.util.Scanner;

// CLase publica 
public class OrdenarNombres {

	public static void main(String[] args) {
		// Creamos un objeto scanner  para leer la entrada del usuario 
		Scanner  scanner = new Scanner (System.in);
		
		// Declaramos el array de Strings con tamaño  10 para almacenar  los nombres 
		String[]  nombres  = new  String[10];
		
		// Mensaje inicial para el usuario  
		System.out.println("*** Programa para ordenar nombres ***");
		System.out.println("Ingrese 10 nombres :");

		
		// Bucle  for para cerrar los 10 nombres  en el array
		for (int  i = 0;  i  < 10;  i++) {
			// Solicitar al usuario  que ingrese un nombre 
			System.out.print("Nombre" + (i + 1) + ":" );
			//Leemos el nombre ingresado y guardamos en el array
			nombres[i] = scanner.nextLine();
			}
		// Cerramos el scanner para linberar recursos
		scanner.close();
		//Ordenar  el array  de nombres  alfabeticamente 
		Arrays.sort(nombres);
		
		// Imprimimos  los nombres  ordenados 
		System.out.println("\n *** NOMBRES ORDENADOS ALFABETICAMENTE ***");
		
		//Bucle for-each  para recorrer y mostrar cada nombre ordenado 
		for (String nombre : nombres) {
			System.out.println(nombre);
		         }
         }
}
