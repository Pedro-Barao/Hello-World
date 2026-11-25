package Exerciciop_24;

import java.util.Scanner;

public class MainPagarCredito {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		CartaoCredito cartao_credito = new CartaoCredito();
		String dono_pagamento;
		float valor_pagamento;

		System.out.println("Qual o nome de quem realizara o pagamento?: ");
		dono_pagamento = scanner.nextLine();
		cartao_credito.setDonoPagamento(dono_pagamento);

		System.out.println("Qual o valor do pagamento feito?: ");
		valor_pagamento = scanner.nextFloat();
		cartao_credito.setValorPagamento(valor_pagamento);

		System.out.println("O usuario " + cartao_credito.getDonoPagamento() + " fez");
		cartao_credito.RealizarPagamento(valor_pagamento);

	}

}
