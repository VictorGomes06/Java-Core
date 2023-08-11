package Exercicios;

import entities.ExploradorRobo;

public class StartRobot {

	public static void main(String[] args) {
		
		ExploradorRobo alfa = new ExploradorRobo();
		String name = "Alfa";
		alfa.status = "Explorando";
		alfa.velocidade = 7;
		alfa.temperatura = 20;
		
		System.out.println("------------------ " + name + " ------------------");
		
		alfa.verificarTemperatura();
		alfa.exibirAtributos();
		System.out.println("Aumentando a velocidade");
		alfa.velocidade = 8;
		
		alfa.exibirAtributos();
		System.out.println("Alterar temperatura");
		alfa.temperatura = 47;
		alfa.verificarTemperatura();
		alfa.exibirAtributos();
		
		
		
		

	}

}
