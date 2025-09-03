// Clase para realizar operaciones aritméticas básicas
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 6;

        int suma = suma(num1, num2);
        int resta = resta(num1, num2);
        int multiplicacion = multiplicacion(num1, num2);
        double division = division(num1, num2);

        System.out.println("Operaciones aritmeticas:");
        System.out.println(
            "Resultados: " +
            "Suma: " + suma + " " + " | " +
            "Resta: " + resta + " " + " | " +
            "Multiplicacion: " + multiplicacion + " " + "| " +
            "Division: " + division
        );
    }

    // Métodos de operaciones
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division por cero");
        }
        return (double) a / b;
    }
}
