import java.util.Locale;
import java.util.Scanner;

// Programa que capitaliza cada palabra de una cadena ingresada por teclado
public class CapitalizarCadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Ingrese una cadena: ");
        String entrada = sc.nextLine();

        String salida = capitalizar(entrada);
        System.out.println(salida);

        sc.close();
    }

    // Capitaliza cada palabra: primera letra en mayúscula, resto en minúscula
    public static String capitalizar(String texto) {
        if (texto == null || texto.isBlank()) {
            return texto;
        }

        Locale es = new Locale("es", "ES");
        String[] palabras = texto.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            String p = palabras[i];
            if (!p.isEmpty()) {
                int firstCp = p.codePointAt(0);
                int upperFirst = Character.toUpperCase(firstCp);
                String resto = p.substring(Character.charCount(firstCp)).toLowerCase(es);
                sb.append(new String(Character.toChars(upperFirst))).append(resto);
            }
            if (i < palabras.length - 1) sb.append(' ');
        }
        return sb.toString();
    }
}
