/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Classe ContaBancaria: Implemente uma classe com saldo e métodos para depositar e sacar
			dinheiro.

 */

package Exercicio_6;

import java.util.Scanner;

public class Banco extends ContaBancaria {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		String dono_conta;
		float saldo, saldo_final, saque = 0, deposito = 0;
		int opcao;

		System.out.println("Qual o nome do dono da conta?: ");
		dono_conta = scanner.nextLine();
		conta.setDonoConta(dono_conta);

		System.out.println("Qual o saldo de sua conta?: ");
		saldo = scanner.nextFloat();
		conta.setSaldo(saldo);

		do {

			System.out.println("Deseja 1-Sacar ou 2-Depositar?: ");
			opcao = scanner.nextInt();

			if (opcao == 1) {

				System.out.println("Quanto deseja Sacar?: ");
				saque = scanner.nextFloat();

				saldo_final = conta.Sacar(saldo, saque);
				conta.setSaldo(saldo);

			}

			else {

				System.out.println("Quanto deseja Depositar?: ");
				deposito = scanner.nextFloat();

				saldo_final = conta.Depositar(saldo, deposito);
				conta.setSaldo(saldo);

			}

		} while (saldo_final == -1);

		System.out.println("O usuario " + conta.getDonoConta() + " tem em sua conta: " + saldo_final + " reais");

	}

}
