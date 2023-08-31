package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeListaLivros {
	List<String> Livros = new ArrayList<>();

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		AtividadeListaLivros Livros = new AtividadeListaLivros();

		System.out.println("Informe o Id do livro : ");
		String idLivo = leitor.next();
		Livros.addLivro(idLivo);
		
		System.out.println("Titulo :");
		String titulo = leitor.next();
		Livros.addLivro(titulo);
		
		System.out.println("Autor : ");
		String autor = leitor.next();
		Livros.addLivro(autor);
		
		System.out.println("Ano : ");
		String ano = leitor.next();
		Livros.addLivro(ano);
		
		System.out.println("Gênero : ");
		String genero = leitor.next();
		Livros.addLivro(genero);
		
		System.out.println("Editora : ");
		String editora = leitor.next();
		Livros.addLivro(editora);
		
		System.out.println("Páginas : ");
		String paginas = leitor.next();
		Livros.addLivro(paginas);
		
		System.out.println("Quantidade de livros : " + Livros.Mostrarlivros(0));
		System.out.println("----------------");
		Livros.MostrarElementos();
		
		leitor.close();
		
	}

	public void addLivro(String idlivro) {
		Livros.add(idlivro);
	}

	public int Mostrarlivros(int quantLivros) {
		quantLivros = Livros.size();
		return quantLivros;
	}

	public void MostrarElementos() {
		System.out.println("Livro : " + Livros.get(0));
		System.out.println("Título : " + Livros.get(1));
		System.out.println("Autor: " + Livros.get(2));
		System.out.println("Ano : " + Livros.get(3));
		System.out.println("Gênero : " + Livros.get(4));
		System.out.println("Editora : " + Livros.get(5));
		System.out.println("Páginas : " + Livros.get(6));
	}

	public void RemoverLivro() {
		Livros.removeAll(Livros);
	}

}
