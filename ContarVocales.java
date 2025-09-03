import java.text.Normalizer;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Ingrese una cadena: ");
        String entrada = sc.nextLine();

        Map<Character, Integer> conteo = contarVocales(entrada);
        System.out.println(String.format("{A=%d, E=%d, I=%d, O=%d, U=%d}",
                conteo.get('A'), conteo.get('E'), conteo.get('I'), conteo.get('O'), conteo.get('U')));

        sc.close();
    }

    // Cuenta vocales A, E, I, O, U incluyendo mayúsculas, minúsculas y acentuadas
    public static Map<Character, Integer> contarVocales(String texto) {
        Map<Character, Integer> res = new LinkedHashMap<>();
        res.put('A', 0);
        res.put('E', 0);
        res.put('I', 0);
        res.put('O', 0);
        res.put('U', 0);

        if (texto == null || texto.isEmpty()) return res;

        // Normaliza a forma NFD y elimina diacríticos para que á, ä, â -> a, etc.
        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        String sinAcentos = normalizado.replaceAll("\\p{M}+", "");
        String upper = sinAcentos.toUpperCase(new Locale("es", "ES"));

        for (int i = 0; i < upper.length(); i++) {
            char c = upper.charAt(i);
            switch (c) {
                case 'A': res.put('A', res.get('A') + 1); break;
                case 'E': res.put('E', res.get('E') + 1); break;
                case 'I': res.put('I', res.get('I') + 1); break;
                case 'O': res.put('O', res.get('O') + 1); break;
                case 'U': res.put('U', res.get('U') + 1); break;
                default: // otros caracteres no se cuentan
            }
        }
        return res;
    }
}
