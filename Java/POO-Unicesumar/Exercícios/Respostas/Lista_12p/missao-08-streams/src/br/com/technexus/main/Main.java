package br.com.technexus.main;

import br.com.technexus.model.Loja;
import br.com.technexus.model.Produto;

public class Main {

    public static void main(String[] args) {

        Loja loja = new Loja();

        // GAMES
        loja.cadastrar(new Produto(
                "The Witcher 3",
                "GAMES",
                150.00
        ));

        loja.cadastrar(new Produto(
                "FIFA",
                "GAMES",
                200.00
        ));

        // LIVROS
        loja.cadastrar(new Produto(
                "Java for Dummies",
                "LIVROS",
                100.00
        ));

        loja.cadastrar(new Produto(
                "Clean Code",
                "LIVROS",
                80.00
        ));

        // HARDWARE
        loja.cadastrar(new Produto(
                "Mouse",
                "HARDWARE",
                50.00
        ));

        // Exercício 3
        System.out.println("=== GAMES ===");

        loja.buscarPorCategoria("GAMES")
                .forEach(System.out::println);

        // Exercício 4
        System.out.println("\n=== PATRIMÔNIO TOTAL ===");

        System.out.println(
                "R$ " + loja.calcularPatrimonioTotal()
        );

        // Exercício 5
        System.out.println("\n=== TOTAL DE LIVROS ===");

        System.out.println(
                "R$ " + loja.calcularTotalPorCategoria("LIVROS")
        );
    }
}