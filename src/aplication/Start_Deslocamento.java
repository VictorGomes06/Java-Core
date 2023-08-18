package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Deslocamento;

public class Start_Deslocamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner (System.in);
	    Deslocamento deslocamento  = new Deslocamento();
		
		System.out.println("Valor dos atributos :");
		
		System.out.print("x1 :");
		double x1 = leitor.nextDouble();
		deslocamento.setX1(x1);
		System.out.print("y1 :");
		double y1 = leitor.nextDouble();
		deslocamento.setY1(y1);
		System.out.print("x2 :");
		double x2 = leitor.nextDouble();
		deslocamento.setX2(x2);
		System.out.print("y2 :");
		double y2 = leitor.nextDouble();
		deslocamento.setY2(y2);
		System.out.print("Velocidade : ");
		double velocidade = leitor.nextDouble();
		deslocamento.setVelocidade(velocidade);
		
		double distancia = deslocamento.calCularDistancia();
		double tempo = deslocamento.calcularTempoDeslocamento();
		
		System.out.println("Distância :" + distancia);
		System.out.println("Tempo :" + tempo );
		
		
		
		
	

 }
}