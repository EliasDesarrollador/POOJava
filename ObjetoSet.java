
import java.util.HashSet;
import java.util.Set;

public class ObjetoSet {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Manzana"); // Duplicado, no se agregará

        System.out.println(frutas); // Resultado: [Manzana, Banana]
    }
}
