package Exerciciop_22;

public class ContaCorrente extends ContaBancaria {

	ContaCorrente() {

		super();

	}

	ContaCorrente(String correntista, float saldo) {

		super.setCorrentista(correntista);
		super.setSaldo(saldo);

	}

	@Override
	public float Sacar(float saldo, float valor) {

		if (valor > saldo) {

			System.out.println("VALOR DE SAQUE MAIOR QUE SALDO, SAQUE INDISPONIVEL");

			return -1;

		}

		else {

			return saldo - valor;

		}

	}

	@Override
	public float Depositar(float saldo, float valor) {

		return saldo + valor;

	}

}
