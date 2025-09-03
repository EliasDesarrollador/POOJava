
// Biblioteca para recoger entrada del usuario
import java.util.Scanner;
// Clase publica  
public class Practicabase {

    // Funcion 
    private String mostrarAltura( int altura ) {
        String resultado  = " "; 
        if (altura >= 180){
        resultado = ("Eres una persona alta !" + altura);

        }else {
        resultado = ("Tienes una estatura mediana !"+ altura + "cm");
        }
        return resultado;
    }
    // metodo de entrada  del programa 
    public  static void main  (String[]args){
        // System.out.println("Hola Usuario !");

// Definir variables 
    // String nombre = "Elias ";
    // int edad = 22;


    // Entrada de datos 
    Scanner sc = new Scanner(System.in);
    // System.out.println( "Como te llamas :   ");
    // String nombre = sc.nextLine();
    // System.out.println("El usuario se llama : " + nombre);


    //ESTRUCTURA DE CONTROL
 //Condicionales 
//  System.out.print("Cuanto mides ?  : ") ;
//  int altura = sc.nextInt();

//  if (altura >= 180){
//     System.out.println("Eres una persona alta !" + altura);

//  }else {
//     System.out.println("Tienes una estatura mediana !"+ altura + "cm");
//  }

        Practicabase programa = new  Practicabase();
        System.out.println(Practicabase.mostrarAltura(altura));
    }
    
}
