package Variaveis;

public class Introducao {

	public static void main(String[] args) {
		// Variáveis Locais.
		
		int lapis = 0;
		float leite = 4, agua = 5;
		float  cafe = 4.5f;
		
		agua = cafe ;
		double x = 10.0000;
		System.out.println(x);
		System.out.printf("%.2f%n" , x);
		System.out.printf("%.4f%n" , x);
		
		System.out.printf("RESULTADO = %.2f metros%n", x );
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n" , nome ,idade ,renda);

	}

}
