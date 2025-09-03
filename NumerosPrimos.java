
package poojava;

public class NumerosPrimos {

	public static void main(String[] args) {

		int contador = 0 ;
		int candidato = 2;
		
		while ( contador < 100) {
			if (esPrimo(candidato)) {
				contador++;
				System.out.println(contador + ":" + candidato);
			}
			candidato++;
		}
	}
// Metodo  que verifica si un numero es primo 
	static boolean esPrimo(int n) {
    if (n <= 1) return false;          // 1 o menores no son primos
    if (n == 2) return true;           // 2 es primo
    if (n % 2 == 0) return false;      // pares mayores a 2 no son primos

    for (int i = 3; i * i <= n; i += 2) { // divisores impares desde 3 hasta sqrt(n)
        if (n % i == 0) return false;     // si se divide exactamente, no es primo
    }
    return true;                          // si no se encontró divisor, es primo
}

}