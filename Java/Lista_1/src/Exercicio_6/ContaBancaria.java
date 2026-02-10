package Exercicio_6;

public class ContaBancaria {

	private String dono_conta;
	private float saldo;

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

	public float Sacar(float saldo, float saque) {

		if (saque > saldo) {

			System.out.println("SAQUE INVALIDO, FACA UM SAQUE POSSIVEL PARA O SALDO");
			return -1;

		}

		else {

			return saldo - saque;

		}

	}

	public float Depositar(float saldo, float deposito) {

		return saldo + deposito;

	}

}
