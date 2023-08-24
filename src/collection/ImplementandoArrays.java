package collection;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ImplementandoArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		// Exemplo 01 array notas de um aluno.
		double notasAlunoA[] = new double[4];

		// Atribuição
		notasAlunoA[0] = 5.5;
		notasAlunoA[1] = 4.8;
		notasAlunoA[2] = 8.5;
		notasAlunoA[3] = 9.5;

		// Exibição

		System.out.println(notasAlunoA[0] + "\n" + notasAlunoA[1] + "\n" + notasAlunoA[2] + "\n" + notasAlunoA[3]);

		System.out.println("-----------Exibição com uso de for--------");

		// exibir por meio d emétodo da classe Arrays.
		System.out.println(Arrays.toString(notasAlunoA));
		double notas;
		// Formas de percorrer um Array
		for (int i = 0; i < 4; i++) {
			notas = notasAlunoA[i];
			System.out.println(i + ": " + notas);
			// calcular média das notas

			notas += notasAlunoA[i];
			System.out.printf("Média das notas : %.2f", notas / 3);
		}

		leitor.close();

	}

}
