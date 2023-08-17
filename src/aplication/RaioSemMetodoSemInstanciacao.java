package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CalculadoraComMetodosEstaticos;

public class RaioSemMetodoSemInstanciacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.println("Entre com valor do raio : ");
		double raio = leitor.nextDouble();

		double c = CalculadoraComMetodosEstaticos.circunferencia(raio);

		double v = CalculadoraComMetodosEstaticos.volume(raio);

		System.out.printf("Circunferencia : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("Valor do PI é : %.2f%n", CalculadoraComMetodosEstaticos.PI);

		leitor.close();
	}

}
