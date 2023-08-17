package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Start_Produto2 {

	public static void main(String[] args) {
		
				Locale.setDefault(Locale.US);
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Digite as informações do produto: ");
				System.out.print("Nome: ");
				String nome = entrada.next();
				
				System.out.print("Preço: ");
				double preco = entrada.nextDouble();
				
				System.out.print("Quantidade em estoque: ");
				int quantidade = entrada.nextInt();
				System.out.println();
				
				Produto produto = new Produto(nome, preco, quantidade);
				
				System.out.println("Informações do produto: " + produto);
				System.out.println();
				
				System.out.println("Insira o número de produtos a serem adicionados ao estoque: ");
				quantidade = entrada.nextInt();
				produto.adicionarProduto(quantidade);
				System.out.println();
				
				System.out.println("Dados atualizados: " + produto);
				System.out.println();
				
				System.out.println("Insira o número de produtos a serem removidos do estoque: ");
				quantidade = entrada.nextInt();
				produto.removerProduto(quantidade);
				System.out.println();
				
				System.out.println("Dados atualizados: " + produto);
				
				entrada.close();

			}

		}

