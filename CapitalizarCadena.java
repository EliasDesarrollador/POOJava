import java.util.Locale; // Importa Locale para manejar reglas de idioma al cambiar mayúsculas/minúsculas
import java.util.Scanner; // Importa Scanner para leer texto desde el teclado

// Programa que capitaliza cada palabra de una cadena ingresada por teclado
public class CapitalizarCadena { // Declaración de la clase pública

    public static void main(String[] args) { // Método principal: punto de entrada del programa
        Scanner sc = new Scanner(System.in, "UTF-8"); // Crea un Scanner que lee desde la entrada estándar usando UTF-8
        System.out.print("Ingrese una cadena: "); // Muestra un mensaje pidiendo la cadena al usuario
        String entrada = sc.nextLine(); // Lee la línea completa ingresada por el usuario

        String salida = capitalizar(entrada); // Llama al método capitalizar para transformar la cadena
        System.out.println(salida); // Imprime la cadena capitalizada en pantalla

        sc.close(); // Cierra el Scanner para liberar recursos
    }

    // Capitaliza cada palabra: primera letra en mayúscula, resto en minúscula
    public static String capitalizar(String texto) { // Define un método estático que recibe un String y devuelve otro
        if (texto == null || texto.isBlank()) { // Si el texto es null o está en blanco (vacío o solo espacios)
            return texto; // Devuelve el mismo valor (null o cadena vacía) sin procesar
        }

        Locale es = new Locale("es", "ES"); // Define el locale español para reglas de minúsculas/mayúsculas
        String[] palabras = texto.trim().split("\\s+"); // Elimina espacios al inicio/fin y divide por 1+ espacios
        StringBuilder sb = new StringBuilder(); // Usado para construir el resultado de forma eficiente

        for (int i = 0; i < palabras.length; i++) { // Recorre cada palabra por índice
            String p = palabras[i]; // Toma la palabra actual
            if (!p.isEmpty()) { // Si la palabra no está vacía (seguridad)
                int firstCp = p.codePointAt(0); // Obtiene el primer punto de código (soporta caracteres Unicode)
                int upperFirst = Character.toUpperCase(firstCp); // Convierte ese primer carácter a mayúscula
                String resto = p.substring(Character.charCount(firstCp)).toLowerCase(es); // Convierte el resto a minúsculas según locale
                sb.append(new String(Character.toChars(upperFirst))).append(resto); // Agrega la primera letra mayúscula + resto
            }
            if (i < palabras.length - 1) sb.append(' '); // Agrega espacio entre palabras excepto después de la última
        }
        return sb.toString(); // Devuelve el resultado final como String
    }
}
