package Exercicio_9;

public class TitularBancario extends Banco {

	TitularBancario() {

		super();
	}

	TitularBancario(String dono_conta, float saldo, float valor_transacao, int tipo_transacao) {

		super.setDonoConta(dono_conta);
		super.setSaldo(saldo);
		super.setValor(valor_transacao);
		super.setTipoTransacao(tipo_transacao);
	}

	@Override
	public float RealizarTransacao(float saldo, float valor_transacao, int tipo_transacao) {

		if (tipo_transacao == 1) {

			if (valor_transacao > saldo) {

				System.out.println("VALOR DE SAQUE MAIOR QUE SALDO, SAQUE INDISPONIVEL");

				return -1;

			}

			else {

				return saldo - valor_transacao;

			}

		}

		else {

			return saldo + valor_transacao;

		}

	}

}
