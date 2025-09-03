
// package POOJava;

// Ejemplo de clase  publica Persona 
public class Persona {
 // variables con sus tipos de datos 
    String nombre;
    int edad;

    // Metodo Saludar 
    void saludar() {
        System.out.println("Hola, me llamo" + " " + nombre);
    }

    

    public static void main(String[] args) {

        Persona p1 = new Persona(); // Creamos Objeto
        p1.nombre = "Elias";
        p1.edad = 22;
        p1.saludar();

    }

}
