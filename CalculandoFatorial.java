package projetos;

public class CalculandoFatorial {
	public static void main(String[] args) {
	
		double fatorial =1 ;
		for (int n = 1; n <= 10; n++) {
			 fatorial = fatorial *n -1;
			fatorial ++;
			System.out.println("O fatorial de " + n+ " é igual a " +fatorial);
		}
		
	
	}
}
