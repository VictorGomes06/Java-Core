package entities;

import java.lang.reflect.Array;

public class Alistamento {
	private String nome;
	private int anoNascimento;
	private String nomeDaMae;
	private String nomeDoPai;
	private int telefone;
	private String email;
	private double altura;
	private double peso;
	private double multa;
	private int idade ;

	public Alistamento() {

	}

	public Alistamento(String nome, int anoNascimento, String nomeDaMae, String nomeDoPai, int telefone, String email,
			double altura, double peso) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.nomeDaMae = nomeDaMae;
		this.nomeDoPai = nomeDoPai;
		this.telefone = telefone;
		this.email = email;
		this.altura = altura;
		this.peso = peso;
	}

	public int idade() {
		idade = 2023 - anoNascimento;
		return idade;
	}

	public double multa() {
		idade = idade();
		if (idade >= 20) {
			for (int i = 0; i < idade; i++) {
				multa = 5.00 * (idade - 20);
			}
		}
		return multa;
	}

	public String dataTrue() {
		if (idade() > 45 || idade() < 18) {
			
		} else {
			
		}
		return email;
		

	}

	public String[] Array() {
		
		String dados[] = new String[7];
		nome = dados[0];
		dados[1] = getNome(); 
		nomeDaMae = dados[2];
		nomeDoPai = dados[3];
		
		email = dados[5];
		
		return dados;
	}
	
	@Override
	public String toString() {
		return dataTrue();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	

}
