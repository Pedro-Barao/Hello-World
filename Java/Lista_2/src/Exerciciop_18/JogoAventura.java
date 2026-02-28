package Exerciciop_18;

public class JogoAventura extends Jogo {

	JogoAventura() {

		super();

	}

	JogoAventura(String nome_jogo, int horas_jogadas) {

		super.setNomeJogo(nome_jogo);
		super.setHorasJogadas(horas_jogadas);

	}

	@Override
	public void Iniciar(String nome_jogo) {

		System.out.println("Voce iniciou o jogo de aventura: " + nome_jogo);

	}

}
