package Exerciciop_22;

import java.util.Scanner;

public class MainProcedimentosContaPoupanca {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		ContaPoupanca conta = new ContaPoupanca();
		String correntista;
		float saldo, valor, saldo_final;
		int opcao;

		System.out.println("Qual o nome do correntista da conta poupanca?: ");
		correntista = scanner.nextLine();
		conta.setCorrentista(correntista);

		System.out.println("Qual o saldo da conta poupanca?: ");
		saldo = scanner.nextFloat();
		conta.setSaldo(saldo);

		do {

			System.out.println("Quanto dinheiro sera movimentado?: ");
			valor = scanner.nextFloat();

			System.out.println("Qual procedimento sera feito com o valor colocado acima? 1-Sacar 2-Depositar: ");
			opcao = scanner.nextInt();

			if (opcao == 1) {

				saldo_final = conta.Sacar(saldo, valor);

			}

			else {

				saldo_final = conta.Depositar(saldo, valor);

			}

		} while (saldo_final == -1);

		System.out.println("O correntista " + conta.getCorrentista() + " movimentou um total de " + valor + " reais");
		System.out.println(
				"Deixando sua conta poupanca que tinha " + conta.getSaldo() + " reais, com " + saldo_final + " reais");

	}

}
