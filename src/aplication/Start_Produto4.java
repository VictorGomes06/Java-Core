package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Start_Produto4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		Produto produto = new Produto(null,0);
		System.out.println("Informe as informações do produto !");
		System.out.println("Nome : ");
		String nome = leitor.next();
        produto.setNome(nome);
		
        System.out.println("Preço : ");
        double preco = leitor.nextDouble();
        produto.setPreco(preco);
        
       
        
        System.out.println("informações do produto : " + "nome :" + produto.getNome() + " valor R$ " + produto.getPreco() );
        
        System.out.println("Quantidade :");
        int quantidade = leitor.nextInt();
        produto.addProduto(quantidade);
        
        System.out.println("valor total em estoque : R$ " + produto .valorTotalEmEstoque());
        
        System.out.println("Informe a quantidade que para remover : ");
        quantidade = leitor.nextInt();
        produto.removerProduto(quantidade);
        
        System.out.println("valor total em estoque : R$ " + produto .valorTotalEmEstoque());
        
	}

}
