package estruturaDecisao;

import java.util.Scanner;

public class Se2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double valor01 = 0;
		 double valor02 = 0;
		 double valor03 = 0;
		 double valor04 = 0;
		 double valor05 = 0;
		   System.out.print("Digite um número:");
	         valor01 = sc.nextDouble();

	        if (valor01 != 0) {
	            System.out.print("Digite o segundo número:");
	             valor02 = sc.nextDouble();

	            if (valor02 != 0) {
	                System.out.print("Digite o terceiro número:");
	                 valor03 = sc.nextDouble();

	                if (valor03 != 0) {
	                    System.out.print("Digite o quarto número:");
	                    valor04 = sc.nextDouble();

	                    if (valor04 != 0) {
	                        System.out.print("Digite o quinto número:");
	                        valor05 = sc.nextDouble();

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
	        
	       double soma = valor01 + valor02 + valor03 + valor04 + valor05;
	       System.out.println("A soma dos números informados é : " + soma );
	        sc.close();
	}

}
