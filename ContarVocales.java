import java.text.Normalizer; // Utilidad para normalizar texto y manejar acentos
import java.util.LinkedHashMap; // Implementación de Map que mantiene el orden de inserción
import java.util.Locale; // Representa una configuración regional (idioma/país)
import java.util.Map; // Interfaz Map para asociar claves con valores
import java.util.Scanner; // Para leer entrada desde la consola

public class ContarVocales { // Clase principal para contar vocales en un texto
    public static void main(String[] args) { // Método de entrada del programa
        Scanner sc = new Scanner(System.in, "UTF-8"); // Crea un Scanner que lee de la entrada estándar con codificación UTF-8
        System.out.print("Ingrese una cadena: "); // Pide al usuario que introduzca una cadena
        String entrada = sc.nextLine(); // Lee la línea completa ingresada por el usuario

        Map<Character, Integer> conteo = contarVocales(entrada); // Llama al método contarVocales y obtiene el mapa con el conteo
        System.out.println(String.format("{A=%d, E=%d, I=%d, O=%d, U=%d}", // Formatea e imprime los resultados de forma ordenada
                conteo.get('A'), conteo.get('E'), conteo.get('I'), conteo.get('O'), conteo.get('U'))); // Obtiene los valores del mapa para cada vocal

        sc.close(); // Cierra el Scanner para liberar recursos
    }

    // Cuenta vocales A, E, I, O, U incluyendo mayúsculas, minúsculas y acentuadas
    public static Map<Character, Integer> contarVocales(String texto) { // Método que retorna un mapa con el conteo por vocal
        Map<Character, Integer> res = new LinkedHashMap<>(); // Mapa de resultados que preserva el orden A, E, I, O, U
        res.put('A', 0); // Inicializa el contador de 'A' en 0
        res.put('E', 0); // Inicializa el contador de 'E' en 0
        res.put('I', 0); // Inicializa el contador de 'I' en 0
        res.put('O', 0); // Inicializa el contador de 'O' en 0
        res.put('U', 0); // Inicializa el contador de 'U' en 0

        if (texto == null || texto.isEmpty()) return res; // Si el texto es nulo o vacío, retorna el mapa inicializado

        // Normaliza a forma NFD y elimina diacríticos para que á, ä, â -> a, etc.
        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD); // Descompone caracteres acentuados en base + marcas
        String sinAcentos = normalizado.replaceAll("\\p{M}+", ""); // Elimina las marcas diacríticas (acentos) del texto
        String upper = sinAcentos.toUpperCase(new Locale("es", "ES")); // Convierte todo a mayúsculas usando el locale español

        for (int i = 0; i < upper.length(); i++) { // Recorre carácter por carácter la cadena procesada
            char c = upper.charAt(i); // Obtiene el carácter en la posición i
            switch (c) { // Evalúa el carácter para ver si es una vocal
                case 'A': res.put('A', res.get('A') + 1); break; // Si es 'A', incrementa su contador
                case 'E': res.put('E', res.get('E') + 1); break; // Si es 'E', incrementa su contador
                case 'I': res.put('I', res.get('I') + 1); break; // Si es 'I', incrementa su contador
                case 'O': res.put('O', res.get('O') + 1); break; // Si es 'O', incrementa su contador
                case 'U': res.put('U', res.get('U') + 1); break; // Si es 'U', incrementa su contador
                default: // otros caracteres no se cuentan
            }
        }
        return res; // Retorna el mapa con los conteos finales por vocal
    }
}
