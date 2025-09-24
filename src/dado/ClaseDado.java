package dado;
import java.util.Scanner;
public class ClaseDado {

	public static void main(String[] args) {
	Scanner scanner = new  Scanner (System.in);
		// Arreglo para contar ocurrencias (posiciones  0 a 5  representan numeros 1 a 6)
   int []   contador = new  int [6];
   
   int numero; //variable donde guradamos el numero ingresado 
   System.out.println("Ingrese el numero del dado (1-6) Ingrese 0 para terminar:");
   
   //Bucle  que se  repite  hasta  que se ingrese  0 
   while (true) {
	   numero = scanner.nextInt(); // lee el numero del teclado 
	   
	   if (numero == 0) {
		    break ; // corta el bucle cuando se ingresa 0 
	   }
	   
	   if (numero >= 1  && numero <= 6) {
		   contador[numero - 1 ]++;  // suma en la posicion  correspondiente 
	   } else {
		   System.out.println("Numero invalido , ingrese entre  1 y  6 ."); 
	   }
   }

   // Mostrar resultados 
   System.out.println("Resultados : ");{
	   for (int  i = 0;  i  <  contador.length;  i ++) {
		   System.out.println("Numero " + (i + 1 )  + ": "  + contador[i]  + " veces ");
	   }
	   
	   
   }
	}

}
