package Variaveis;

import java.util.Scanner;

public class Contatos {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String email;
		long telefone;
		
		System.out.print("Insira Seu Nome : ");
		name = sc.next();
		System.out.print("Insira seu email :");
		email = sc.next();
		System.out.print("insira seu telefone :");
		telefone = sc.nextLong();	
		
		System.out.printf(" Dados : %n name : %s %n email : %s %n Telefone : %d ",name,email,telefone);
		
		sc.close();
		
		
		
	}

}
