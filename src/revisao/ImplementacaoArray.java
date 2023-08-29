package revisao;
import java.util.Scanner;

public class ImplementacaoArray {
	// Parâmetro ou varável da classe.
	public double notasAluno[] = new double[4];
	/*
	// Construtor padrão
	public ImplementacaoArray(double[] notasAluno) {
		this.notasAluno = notasAluno;
	}
    */
	// Método para inserir elementos ao array.
	public void addElementosArray(Scanner leitor) {
		System.out.print("Insira a 1° nota : ");
		notasAluno[0] = leitor.nextDouble();
		System.out.print("Insira a 2° nota : ");
		notasAluno[1] = leitor.nextDouble();
		System.out.print("Insira a 3° nota : ");
		notasAluno[2] = leitor.nextDouble();
		System.out.print("Insira a 4° nota : ");
		notasAluno[3] = leitor.nextDouble();
	}
	
	//Listar os elementos o array.
	public void ListarElementos() {
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "° nota: " + notasAluno[i]);
		}
		System.out.println("---------------------");
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.println((i + 1) + "° nota: " + notasAluno[i]);
		}
	}

}
