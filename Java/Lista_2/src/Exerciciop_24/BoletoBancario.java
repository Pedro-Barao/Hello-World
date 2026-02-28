package Exerciciop_24;

public class BoletoBancario extends Pagamento {

	BoletoBancario() {

		super();

	}

	BoletoBancario(String dono_pagamento, float valor_pagamento) {

		super.setDonoPagamento(dono_pagamento);
		super.setValorPagamento(valor_pagamento);

	}

	@Override
	public void RealizarPagamento(float valor_pagamento) {

		System.out.println("O pagamento de valor igual a " + valor_pagamento + " foi pago no boleto");

	}

}
