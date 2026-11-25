package Exerciciop_20;

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainListaUsuario {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		int id;
		String nome_completo;
		
		List<Usuario> usuario = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Qual o id do usuario?: ");
			id = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Qual o nome completo do usuario?: ");
			nome_completo = scanner.nextLine();
			
			System.out.print("\n");
			
			usuario.add(new Usuario(id, nome_completo));
			
		}
		
		Map<String, List<Usuario>> NomesId = usuario.stream()
				.collect(Collectors.groupingBy(Usuario::getNomeCompleto, Collectors.toList()));

		NomesId.forEach((NomeCompleto, Usuarios) -> {
			
			String[] nomes_divididos = NomeCompleto.split(" ");
			NomeCompleto = String.join("_", nomes_divididos).toLowerCase();
			
			System.out.print(NomeCompleto + ": ");
			Usuarios.forEach(u -> System.out.println("id = " + u.getId() + " | Nome = " + u.getNomeCompleto()));
			
		});
		
	}
	
}
