/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Pagamento com um método realizarPagamento(), e implemente CartaoCredito
			e BoletoBancario.
 *
 */

package Exerciciop_24;

public abstract class Pagamento {

	private String dono_pagamento;
	private float valor_pagamento;

	public String getDonoPagamento() {

		return this.dono_pagamento;

	}

	public void setDonoPagamento(String dono_pagamento) {

		this.dono_pagamento = dono_pagamento;

	}

	public float getValorPagamento() {

		return this.valor_pagamento;

	}

	public void setValorPagamento(float valor_pagamento) {

		this.valor_pagamento = valor_pagamento;

	}

	public abstract void RealizarPagamento(float valor_pagamento);

}
