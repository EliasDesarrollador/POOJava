// Clase para realizar operaciones aritméticas básicas
public class OperacionesAritmeticas { // Define una clase pública llamada OperacionesAritmeticas
    public static void main(String[] args) { // Punto de entrada del programa
        int num1 = 2; // Primer operando entero con valor 2
        int num2 = 6; // Segundo operando entero con valor 6

        int suma = suma(num1, num2); // Llama al método suma y almacena el resultado
        int resta = resta(num1, num2); // Llama al método resta y almacena el resultado
        int multiplicacion = multiplicacion(num1, num2); // Llama al método multiplicacion y almacena el resultado
        double division = division(num1, num2); // Llama al método division (que retorna double) y almacena el resultado

        System.out.println("Operaciones aritmeticas:"); // Imprime un encabezado
        System.out.println( // Imprime la línea con todos los resultados formateados
            "Resultados: " + // Texto inicial
            "Suma: " + suma + " " + " | " + // Concatenación del texto "Suma" con el valor de suma
            "Resta: " + resta + " " + " | " + // Concatenación del texto "Resta" con el valor de resta
            "Multiplicacion: " + multiplicacion + " " + "| " + // Concatenación del texto "Multiplicacion" con su valor
            "Division: " + division // Concatenación del texto "Division" con su valor
        ); // Cierra la llamada a println
    }

    // Métodos de operaciones
    public static int suma(int a, int b) { // Método estático que suma dos enteros
        return a + b; // Retorna la suma de a y b
    }

    public static int resta(int a, int b) { // Método estático que resta dos enteros
        return a - b; // Retorna la resta de a menos b
    }

    public static int multiplicacion(int a, int b) { // Método estático que multiplica dos enteros
        return a * b; // Retorna el producto de a y b
    }

    public static double division(int a, int b) { // Método estático que divide a entre b y retorna double
        if (b == 0) { // Verifica si el divisor es cero
            throw new ArithmeticException("Division por cero"); // Lanza una excepción si se intenta dividir por cero
        }
        return (double) a / b; // Convierte a a double para realizar división de punto flotante y retorna el resultado
    }
}
