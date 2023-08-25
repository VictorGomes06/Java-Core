package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Alistamento;

public class StartAlistamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in) ;
		
		Alistamento alistamento = new Alistamento();
		System.out.println("Alistamento");
		System.out.println("Informe o ano de nascimento : ");
		int anoNascimeto = leitor.nextInt();
		alistamento.setAnoNascimento(anoNascimeto);
		System.out.println(alistamento.toString());
		String nome = leitor.next();
		alistamento.setNome(nome);
		
		leitor.close();
		
		
	}

}
