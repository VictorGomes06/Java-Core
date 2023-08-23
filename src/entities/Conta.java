package entities;

public class Conta {
	private int numeroConta;
	private String donoConta;
	private double saldoConta;

	// Contrutores

	public Conta(int numeorConta, String donoConta) {
		this.numeroConta = numeorConta;
		this.donoConta = donoConta;

	}

	public Conta(int numeorConta, String donoConta, double saldoConta) {
		super();
		this.numeroConta = numeorConta;
		this.donoConta = donoConta;
		this.saldoConta = saldoConta;
	}

	// ---------------------------------
	// Métodos gets e sets

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getDonoConta() {
		return donoConta;
	}

	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	// ---------------------------------
	// Método de depósito
	public void Deposito(double valorDeposito) {
		saldoConta += valorDeposito;

	}
	//Método para saque 
	public void Saque(double valorDeposito) {
		saldoConta -= valorDeposito + 5.00;
	}
	//Método toString sobrecarregado 
	
	public String toString() {
		
		return "Conta: " + numeroConta + "\nProprietário : " + donoConta + 
				String.format("\nSaldo da conta : R$ %.2f" , saldoConta) ;
	}
}
