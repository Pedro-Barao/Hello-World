package Exerciciop_24;

import java.util.Scanner;

public class MainPagarBoleto {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		BoletoBancario boleto = new BoletoBancario();
		String dono_pagamento;
		float valor_pagamento;

		System.out.println("Qual o nome de quem realizara o pagamento?: ");
		dono_pagamento = scanner.nextLine();
		boleto.setDonoPagamento(dono_pagamento);

		System.out.println("Qual o valor do pagamento feito?: ");
		valor_pagamento = scanner.nextFloat();
		boleto.setValorPagamento(valor_pagamento);

		System.out.println("O usuario " + boleto.getDonoPagamento() + " fez");
		boleto.RealizarPagamento(valor_pagamento);

	}

}
