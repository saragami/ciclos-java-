package tipoDeDatosYVariables;

public class Ejercicios {

	public static void main(String[] args) {
	    //System.out.println("hola mundo");
		//tipos de datos
		// byte: sirve para representar un valor numerico de 8 bits= 128 a -127
		byte salas= 10;
		System.out.println(salas);
		//short: sirve para representar 16 bits= 32 767
		short asientos = 1120;
				System.out.println(asientos);
		//sirve para representar un valor numerico de 32 bits 		
		int dulces= 3476 ;
		System.out.println(dulces);
		//long: sirve para representar un valor numerico de  64 bits
		long clientes= 313600; 
		System.out.println(clientes);
		//datos que pueden tener punto decimal 
		//sirve para almacenar un valor decimal de 32 bits 
		float palomitas= 35.5f;
		System.out.println(palomitas);
		//doble para almacenar un valor decimal de 64 bits
		double ganancias =23770880.7f;
		System.out.println(ganancias);
		// boolean 
		// char sirve para representar un caracter o un numero pero solo 1 
		// casting o casteo cambia un dato de entero a string o otra conversion 
		double num= 59.70d; 
		int numInt = (int)  num;
		System.out.println("double"+numInt);
		long numlong = (long) num;
		System.out.println("long"+ numlong);

		String cantidad ="85";
		String precio = "59.70"; 		
		
		int castingCantidad= Integer.parseInt(cantidad); 
		double castingPrecio = Double.parseDouble(precio); 
		System.out.println("el valor en la compra es " + (castingCantidad*castingPrecio));
		
		//operadores aritmeticos
		
		int dias = 28;
		dias = dias + 2;
		System.out.println("dias" + dias);
		
		//Operadores de incremento y decremento
		
				int p = 0;
				p++;
				p++;
				p++;
				System.out.println(p);
				
				/*Operadores relacionales
				 * == compara si un operando es igual a otro
				 * != diferente a 
				 * > mayor que
				 * < menor que
				 * >= mayor o igual que 
				 * <= menor o igual que
				 */
				
				int a = 10;
				int b = 15;
				boolean resultado;
				resultado = a != b;
				System.out.println("resultado de la operación: " + resultado);

			}


	}

