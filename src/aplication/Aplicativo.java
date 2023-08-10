package aplication;

import java.util.Scanner;

import entities.Triangulo;

public class Aplicativo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Informe os lados do triângulo x : ");
		x.ladoA = leitor.nextDouble();
		x.ladoB = leitor.nextDouble();
		x.ladoC = leitor.nextDouble();
		System.out.println("Informe os lados do triângulo y : ");
		y.ladoA = leitor.nextDouble();
		y.ladoB = leitor.nextDouble();
		y.ladoC = leitor.nextDouble();
		
		System.out.printf("Lados do triângulo x : %.2f %.2f %.2f %n", x.ladoA,x.ladoB,x.ladoC);
		System.out.printf("Lados do triângulo y : %.2f %.2f %.2f %n", y.ladoA,y.ladoB,y.ladoC);
		
		double areaDeX = x.area();
		double areaDeY = y.area();
		
		System.out.printf("Área de x : %.2f %n", areaDeX);
		System.out.printf("Área de y : %.2f %n", areaDeY);
		
		String classificacaox = x.classificacaoDoTrianglo();
		String classificacaoy = y.classificacaoDoTrianglo();
		System.out.println("o triângulo X é um : " + classificacaox );
		System.out.println("o triângulo Y é um : " + classificacaoy );
		leitor.close();
	}

}
