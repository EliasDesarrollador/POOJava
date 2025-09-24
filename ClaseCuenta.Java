

package POOJava;  
//🔹 'package' = palabra reservada, organiza las clases dentro de un paquete llamado POOJava.

//Encapsulamiento : Controlar los accesos a los atributos y metodos de una clase con private y getters/setters.

//Definimos una clase llamada Cuenta 

public class Cuenta {  
//🔹 'public' = modificador de acceso, visible desde cualquier parte.
//🔹 'class' = palabra reservada, define una clase llamada Cuenta.
	
	private double saldo; 
	// 🔹 'private' = acceso restringido, solo la misma clase puede usarlo.
	// 🔹 'double' = tipo de dato para números decimales.
	// 'saldo' = atributo que guarda el dinero en la cuenta.
	
	public void depositar(double monto) { 
	// 🔹 'public' = accesible desde cualquier parte.
	// 🔹 'void' = método que no retorna nada.
	// 'depositar' = nombre del método.
	// Parámetro: 'double monto' → la cantidad de dinero a ingresar.
		
		saldo += monto;  
		// suma el monto al saldo actual.
	}
	
	// Getter: nos permite consultar el saldo de manera segura
	public double getSaldo() {  
	// 🔹 'double' = tipo de dato de retorno (número decimal).
	// 'getSaldo' = nombre del método que devuelve el saldo.
		return saldo;  
		// 🔹 'return' = devuelve el valor de saldo.
	}

	public static void main(String[] args) {
	// 🔹 'public' = accesible desde cualquier parte.
	// 🔹 'static' = pertenece a la clase, no necesita crear objeto para llamarlo.
	// 🔹 'void' = no retorna nada.
	// 'main' = punto de entrada del programa.
	// 'String[] args' = argumentos que se pueden pasar desde consola.
		
		Cuenta miCuenta = new Cuenta();   
		// 🔹 'new' = crea un objeto en memoria.
		// 'miCuenta' = objeto de tipo Cuenta.
		
		miCuenta.depositar(10000);   
		// Llamamos al método depositar, agregando 5000 al saldo.
		
		System.out.println("Saldo actual: " + miCuenta.getSaldo()); 
		// Muestra el saldo actual usando el getter.
	}
}
