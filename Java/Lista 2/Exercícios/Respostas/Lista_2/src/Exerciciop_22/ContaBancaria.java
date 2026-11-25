/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe ContaBancaria com métodos sacar() e depositar(), e implemente
			ContaCorrente e ContaPoupanca.
 *
 */

package Exerciciop_22;

public abstract class ContaBancaria {

	private String correntista;
	private float saldo;

	public String getCorrentista() {

		return this.correntista;

	}

	public void setCorrentista(String correntista) {

		this.correntista = correntista;

	}

	public float getSaldo() {

		return this.saldo;

	}

	public void setSaldo(float saldo) {

		this.saldo = saldo;

	}

	public abstract float Sacar(float saldo, float valor);

	public abstract float Depositar(float saldo, float valor);

}
