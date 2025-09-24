
import java.util.Scanner;
import java.util.Arrays; 


// Clase principal OrdenAlfabet
public class OrdenAlfabet {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner (System.in); 

        // Creamos un arreglo de tamano 10 
        String [] nombres = new String [10];

        // Cargamos los nombres en el arreglo
        System.out.println("Ingrese 10 nombres: "   );
        for (int i = 0 ;  i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ":");
            nombres[i] = scanner.nextLine(); // Guardamos cada nombre en el array

        }

        //Ordenamos alfabeticamente 
        Arrays.sort(nombres);

        //Mostramos los nombres ordenados 
        System.out.println("\nNombres ordenados alfabeticamente: ");
        for (String  nombre : nombres) {
            System.out.println(nombre);
        }

    }

}
