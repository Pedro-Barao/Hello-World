package Exercicio_9;

import java.util.Scanner;

public class MainTransacaoBancaria {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		TitularBancario dono = new TitularBancario();
		String dono_conta;
		float saldo, valor_transacao, saldo_final;
		int tipo_transacao;

		System.out.println("Qual o nome do titular da conta?: ");
		dono_conta = scanner.nextLine();
		dono.setDonoConta(dono_conta);

		System.out.println("Qual o saldo em sua conta?: ");
		saldo = scanner.nextFloat();
		dono.setSaldo(saldo);

		do {

			System.out.println("Qual o valor que sera transicionado?: ");
			valor_transacao = scanner.nextFloat();
			dono.setValor(valor_transacao);

			System.out.println("Qual o tipo da transacao que sera feita? 1-Sacar 2-Depositar: ");
			tipo_transacao = scanner.nextInt();
			dono.setTipoTransacao(tipo_transacao);

			saldo_final = dono.RealizarTransacao(saldo, valor_transacao, tipo_transacao);

		} while (saldo_final == -1);

		System.out.println("O titular da conta " + dono.getDonoConta());

		if (dono.getTipoTransacao() == 1) {

			System.out.println("Um saque de: " + dono.getValorTransacao());

		}

		else {

			System.out.println("Um deposito de: " + dono.getValorTransacao());

		}

		System.out.println("Deixando o saldo da sua conta com " + saldo_final);

	}

}
