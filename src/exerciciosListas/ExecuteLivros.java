package exerciciosListas;

import java.util.List;
import java.util.Scanner;

public class ExecuteLivros {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Informe o código do livro : ");
	String idLivro = leitor.nextLine();
	System.out.println("Informe o título do livro : ");
	String titulo = leitor.nextLine();
	System.out.println("Informe o autor do livro : ");
	String autor = leitor.nextLine();
	System.out.println("Informe o ano do livro : ");
	String ano = leitor.nextLine();
	System.out.println("Informe o género do livro : ");
	String genero = leitor.nextLine();
	System.out.println("Informe a editora do livro : ");
	String editora = leitor.nextLine();
	
	// Instacar um obj livro
	Livros livros = new Livros();
	// Adicionar livro
	livros.addLivros(idLivro, titulo, autor, ano, genero, editora, editora);
	
	//Listar os elemnetos da lista Livros
	List<String> titulos = livros.getTitulos();
	
	for (String titulos1 : titulos) {
		System.out.println(titulos1);
	}
	//Listar a quantidade de elemnetos
	livros.exibirQuantidadeElementos();
	//remover elementos da lista
	livros.removerLivro(titulo);
	System.out.println("----------------------");
	//Listar a quantidade de elemnetos
		livros.exibirQuantidadeElementos();
	
	leitor.close();

	}

}
