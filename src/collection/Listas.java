package collection;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		/**
		 * Sintaxe para implementar uma lista List<tipo> nome = new ArrayList<>();
		 */

		// Implementar Lista tipo String
		List<String> lista = new ArrayList<>();

		// Adicionar elementos a lista
		lista.add("Matemática");
		lista.add("Física");
		lista.add("Biologia");
		lista.add("Português");
		lista.add("Geografia");
		lista.add("História");
		lista.add("Matemática");
		lista.add("Programação");

		// Percorrer os elementos da lista.
		for (String materias : lista) {
			System.out.println(materias);
		}
		System.out.println("---------------------------");
		// Inserir elementos entre um nodo
		lista.add(1, "George");

		for (String materias : lista) {
			System.out.println(materias);
		}

		// Verificar tamanho da lista.
		System.out.println("---------------------------");
		System.out.println("A lista possui um tamanho de " + lista.size() + " posições.");
		System.out.println(lista.get(0));

		System.out.println("---------------------------");
		// Remover elemtos da lista.
		lista.remove(0);
		lista.remove("Biologia");
		for (String materias : lista) {
			System.out.println(materias);
		}
		// Listar a posição de um elemento.
		System.out.println("Index de Inglês: " + lista.indexOf("História"));

		/*
		 * Trabalhar com predicado Remover todos os elementos que iniciem com a letra G.
		 * para remover um elemento utilizando predicado,usamos o método removeif.
		 */

		lista.removeIf(disciplina -> disciplina.charAt(0) == 'G');
		// Remover toda String disciplina,tal que disciplina na posição 0 seja == 'G'.
		System.out.println("---------------------------");
		for (String materias : lista) {
			System.out.println(materias);
		}

		lista.removeIf(disciplina -> disciplina.charAt(4) == 'm');

		System.out.println("---------------------------");
		for (String materias : lista) {
			System.out.println(materias);
		}
	}

}
