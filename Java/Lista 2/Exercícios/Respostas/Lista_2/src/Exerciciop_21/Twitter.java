package Exerciciop_21;

public class Twitter extends RedeSocial {

	Twitter() {

		super();

	}

	Twitter(String dono_post, int curtidas) {

		super.setDonoPost(dono_post);
		super.setCurtidas(curtidas);

	}

	@Override
	public int Curtir(String dono_post, int curtidas, int opcao) {

		if (opcao == 1) {

			System.out.println(dono_post + " curtiu o post de outro usuario");
			return curtidas + 1;

		}

		return curtidas;

	}

	@Override
	public void Postar(String dono_post, int opcao) {

		if (opcao == 1) {

			System.out.println(dono_post + " fez uma postagem no Twitter");

		}

	}

}
