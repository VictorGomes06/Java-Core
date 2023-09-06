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
		String idLivo = leitor.nextLine();

		System.out.println("Titulo :");
		String titulo = leitor.nextLine();

		System.out.println("Autor : ");
		String autor = leitor.nextLine();

		System.out.println("Ano : ");
		String ano = leitor.nextLine();

		System.out.println("Gênero : ");
		String genero = leitor.nextLine();

		System.out.println("Editora : ");
		String editora = leitor.nextLine();

		System.out.println("Páginas : ");
		String paginas = leitor.nextLine();

		leitor.close();

	}

	public void adicionarLivro(String idLivro, String titulo, String nomeAutor, String ano, String genero,
			String editora, String paginas) {
		this.Livros.add(idLivro + "-" + titulo + " - " + nomeAutor + " - " + ano + " - " + genero + " - " + editora
				+ " - " + paginas);
	}

	public int Mostrarlivros(int quantLivros) {
		quantLivros = Livros.size();
		return quantLivros;
	}

	public void exibirQuantidadeElementos() {
		System.out.println("A lista contém " + this.Livros.size() + " elementos");
	}

	public int removerLivro(String titulo) {

		int index = this.Livros.indexOf(titulo);
		return Livros.indexOf(titulo);

	}
}
