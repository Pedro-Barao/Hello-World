package Exercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainFiltrarClientes {

	public static void main(String args[]) {

		List<Cliente> clientes = new ArrayList();

		clientes.add(new Cliente("Caio", 22));
		clientes.add(new Cliente("Marcos", 32));
		clientes.add(new Cliente("Joao", 54));
		clientes.add(new Cliente("Carla", 31));

		List<Cliente> clientes30 = clientes.stream().filter(c -> c.getIdade() > 30).collect(Collectors.toList());

		clientes30.forEach(c -> System.out.println(c.getNome() + " tem " + c.getIdade() + " anos\n"));

	}

}
