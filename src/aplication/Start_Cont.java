package aplication;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Conta;

public class Start_Cont {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Conta conta;

		int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta Y/y ou n",
				"Abertura da conta", JOptionPane.PLAIN_MESSAGE));
		String donoConta = JOptionPane.showInputDialog(null, "Informe o nome do dono da conta",
				"Abertura da conta", JOptionPane.PLAIN_MESSAGE);
		String seraQueVaiterDeposito = JOptionPane.showInputDialog(null, "Terá depósito inicial ?", "Abertura da conta",
				JOptionPane.PLAIN_MESSAGE);
		seraQueVaiterDeposito = seraQueVaiterDeposito.toUpperCase();
		char temDepositoSimNao = seraQueVaiterDeposito.charAt(0);
		if (temDepositoSimNao == 'Y') {
			double depositoInicial = Double.parseDouble(JOptionPane.showInputDialog(null,
					"Informe o valor para o depósito ", "Abertura de conta", JOptionPane.PLAIN_MESSAGE));
			conta = new Conta(numeroConta, donoConta, depositoInicial);

		} else {
			conta = new Conta(numeroConta, donoConta);
		}
	}

}
