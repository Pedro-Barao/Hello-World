package Exerciciop_21;

import java.util.Scanner;

public class MainUsarFacebook {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Facebook facebook = new Facebook();
		String dono_post;
		int curtidas = 50, opcao;

		System.out.println("Bem-vindo ao Facebook");

		System.out.println("Qual o nome do usuario?: ");
		dono_post = scanner.nextLine();
		facebook.setDonoPost(dono_post);

		System.out.println("O post que " + facebook.getDonoPost() + " esta vendo tem " + curtidas + " curtidas");
		System.out.println("Deseja curtir o post do outro usuario? 1-Sim 2-Nao: ");
		opcao = scanner.nextInt();
		curtidas = facebook.Curtir(dono_post, curtidas, opcao);

		System.out.println("Post de outro usuario tem " + curtidas);

		System.out.println("Deseja postar alguma coisa?: ");
		opcao = scanner.nextInt();
		facebook.Postar(dono_post, opcao);

	}

}
