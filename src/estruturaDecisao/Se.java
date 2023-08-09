package estruturaDecisao;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		   System.out.println("Digite um número:");
	        double valor01 = sc.nextInt();

	        if (valor01 != 0) {
	            System.out.print("Digite o segundo número:");
	            double valor02 = sc.nextInt();

	            if (valor02 != 0) {
	                System.out.print("Digite o terceiro número:");
	                double valor03 = sc.nextInt();

	                if (valor03 != 0) {
	                    System.out.print("Digite o quarto número:");
	                    double valor04 = sc.nextInt();

	                    if (valor04 != 0) {
	                        System.out.print("Digite o quinto número:");
	                        double valor05 = sc.nextInt();

	                          if (valor05 != 0) {
	                            System.out.println("Os números digitados são: " + valor01 + ", " + valor02 + ", " + valor03 + ", " + valor04 + ", " + valor05);
	                        } else {
	                            System.out.println("Você inseriu o número 0. Programa encerrado.");
	                        }
	                    } else {
	                        System.out.println("Você inseriu o número 0. Programa encerrado.");
	                    }
	                } else {
	                    System.out.println("Você inseriu o número 0. Programa encerrado.");
	                }
	            } else {
	                System.out.println("Você inseriu o número 0. Programa encerrado.");
	            }
	        } else {
	            System.out.println("Você inseriu o número 0. Programa encerrado.");
	        }

	        sc.close();
		
	}

}
