package test;

import java.util.Scanner;

import entities.ExploradorRobo;

public class TesteRobos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String name1 , name2;
		
		ExploradorRobo beta = new ExploradorRobo();
		ExploradorRobo omega = new ExploradorRobo();
		
		System.out.println(" nome do Robo : ");
		name1 = leitor.next();	
		System.out.print("Status : ");
		beta.status = leitor.next();
		System.out.print("Velocidade : ");
		beta.velocidade = leitor.nextInt();
		System.out.print("Temperatura : ");
		beta.temperatura = leitor.nextDouble();
		System.out.println("----------------------");
		System.out.println(name1);
		beta.exibirAtributos();
		System.out.println("------------------");
		
		System.out.println(" nome do segundo Robo : ");
		name2 = leitor.next();	
		System.out.print("Status : ");
		omega.status = leitor.next();
		System.out.print("Velocidade : ");
		omega.velocidade = leitor.nextInt();
		System.out.print("Temperatura : ");
		omega.temperatura = leitor.nextDouble();
		System.out.println("----------------------");
		System.out.println(name2);
		omega.exibirAtributos();
	}

}
