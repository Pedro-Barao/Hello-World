package Exercicio_8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class MainListaUsuario {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		int id;
		String nome;
		
		List<Usuario> usuario = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o id do usuario?: ");
			id = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual o nome do usuario?: ");
			nome = scanner.nextLine();
			
			System.out.print("\n");
			
			usuario.add(new Usuario(id, nome));
			
		}
		
		Map<Integer, String> UsuarioPorId = usuario.stream()
				.collect(Collectors.toMap(Usuario::getId, Usuario::getNome));
		
		System.out.println("Usuarios: ");
		UsuarioPorId.forEach ((Id, Nome) -> {
			
			System.out.println("Id: " + Id + " | Nome: " + Nome);
			
		});
		
	}
	
}
