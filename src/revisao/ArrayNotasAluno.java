package revisao;

import java.util.Locale;
import java.util.Scanner;



public class ArrayNotasAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		/*
		 * //Declarar Array notas de um aluno. double notasAluno[] = new double[3];
		 * //Atribuir elementos ao Array . notasAluno[0] = 5.5; notasAluno[1] = 7.5;
		 * notasAluno[2] = 8.5;
		 */
		// Criar objetos Notas de alunos.
		ImplementacaoArray notasAlunoA = new ImplementacaoArray();
		notasAlunoA.addElementosArray(leitor);
		notasAlunoA.ListarElementos();
		

		leitor.close();
	}

}
