package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Start_Produto {
	public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				Scanner entrada = new Scanner(System.in);
				
				Produto produto = new Produto();
				
				System.out.println("Digite as informações do produto: ");
				System.out.print("Nome: ");
				String nome = entrada.next();
				produto.setNome(nome); 
				
				System.out.print("Preço: ");
				String preco = entrada.next();
				produto.setPreco(preco); 
				
				
				System.out.print("Quantidade em estoque: ");
				produto.quantidade = entrada.nextInt();
				System.out.println();
				
				System.out.println("Informações do produto: " + produto);
				System.out.println();
				
				System.out.println("Insira o número de produtos a serem adicionados ao estoque: ");
				int quantidade = entrada.nextInt();
				produto.addProduto(quantidade);
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
	


