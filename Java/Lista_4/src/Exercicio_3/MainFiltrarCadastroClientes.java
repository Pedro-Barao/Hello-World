package Exercicio_3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainFiltrarCadastroClientes {

	public static void main(String args[]) {

		List<Cliente> cliente = new ArrayList();
		LocalDate hoje = LocalDate.now();
		LocalDate CincoAnosAtras = hoje.minusYears(5);

		cliente.add(new Cliente("Anderson", 42, LocalDate.of(2020, 2, 23)));
		cliente.add(new Cliente("Marilia", 32, LocalDate.of(2021, 5, 13)));
		cliente.add(new Cliente("Jonathan", 26, LocalDate.of(2024, 5, 01)));
		cliente.add(new Cliente("Logan", 58, LocalDate.of(2020, 10, 20)));
		cliente.add(new Cliente("Caio", 25, LocalDate.of(2022, 6, 29)));

		List<Cliente> clienteanos5 = cliente.stream().filter(c -> c.getDataCadastro().isAfter(CincoAnosAtras))
				.collect(Collectors.toList());

		clienteanos5.forEach(c -> System.out.println("O usuario " + c.getNome() + " tem " + c.getIdade()
				+ " anos e esta cadastrado no sistema desde " + c.getDataCadastro().getYear()
				+ " (ou seja, em torno de " + (Period.between(c.getDataCadastro(), hoje).getYears() + " ano(s)\n")));

	}

}
