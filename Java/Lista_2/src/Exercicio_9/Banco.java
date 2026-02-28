/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Adicione um atributo cor à classe Veiculo e um método concreto mostrarCor().

 */

package Exercicio_9;

public abstract class Banco {

	private String dono_conta;
	private float saldo;
	private float valor_transacao;
	private int tipo_transacao;

	public String getDonoConta() {

		return this.dono_conta;

	}

	public void setDonoConta(String dono_conta) {

		this.dono_conta = dono_conta;

	}

	public float getSaldo() {

		return this.saldo;

	}

	public void setSaldo(float saldo) {

		this.saldo = saldo;

	}

	public float getValorTransacao() {

		return this.valor_transacao;

	}

	public void setValor(float valor_transacao) {

		this.valor_transacao = valor_transacao;

	}

	public int getTipoTransacao() {

		return this.tipo_transacao;

	}

	public void setTipoTransacao(int tipo_transacao) {

		this.tipo_transacao = tipo_transacao;

	}

	public abstract float RealizarTransacao(float saldo, float valor, int tipo_transacao);

}
