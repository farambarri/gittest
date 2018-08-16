package git.ejercicio;

public class Ejercicio {

	public static void main(String[] args) {
		int longitud = 50;
		
		System.out.println("Primos:");
		for (int i = 2; i < longitud; i++) {
			if (esPrimo(i)) {
				System.out.println(i);
				
			}
		}
		
		
	}
	
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}

}
