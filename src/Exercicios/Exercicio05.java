package Exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		int codigoPeca01 = 10;
		int numDepecas01 = 1;
		double valorDaPeca01 = 5.30;
		double valorToalPeca01 = valorDaPeca01 * numDepecas01;
		
		int codigoPeca02 = 10;
		int numDepecas02 = 2;
		double valorDaPeca02 = 5.10;
		double valorToalPeca02 = valorDaPeca02 * numDepecas02;
		
		double total = valorToalPeca01 + valorToalPeca02;
		
		
		System.out.printf("Valor a Pagar : %.2f" ,total);
	}

}
