
//package poojava;

public class Bicicleta {
 // Definimos dos atributos
	public int rueda;
	public int velocidad;
	
	// La clase Bicicleta tiene un costructor 
	public  Bicicleta (int velocidadInicial, int ruedaInicial) {
		velocidad = velocidadInicial;
		rueda = ruedaInicial;
	}
	
	// Definir metodos de la BIcicleta
	public void  setRueda(int nuevoValor ) {
		rueda = nuevoValor;
	}
	
	// Metodo Frenar 
	public void frenar( int intensidad) {
		velocidad -= intensidad; // se resta de intensidad a la velocidad
		if (velocidad  < 0 ) {
			velocidad = 0;  // no ouede tener velocidad negativa
		}
	}
	
// Metodo acelerar
	public void acelerar (int intensidad) {
		velocidad += intensidad;
	}
	
	// Metodo Main
	public static void main(String[] args) {
		Bicicleta  bici = new Bicicleta(10, 2);
		bici.acelerar(5);
		System.out.println("Velocidad actual: " + bici.velocidad);
		bici.frenar(8);
		System.out.println("Velocidad despues de frenar:" + bici.velocidad);
		
		
	}

}

