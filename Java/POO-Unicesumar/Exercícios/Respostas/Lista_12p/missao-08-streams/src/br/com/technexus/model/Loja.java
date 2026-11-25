package br.com.technexus.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Loja {
    
    private List<Produto> catalogo = new ArrayList<>();
    
    public void cadastrar(Produto p)
    {

        catalogo.add(p);

        System.out.println("\nProduto adicionado com sucesso");

    }

    public List<Produto> buscarPorCategoria(String catDesejada)
    {

        List<Produto> produtosPorCategoria = catalogo.stream()
                                    .filter(p -> p.getCategoria() == catDesejada)
                                    .collect(Collectors.toList());

        return produtosPorCategoria;

    }

    public double calcularPatrimonioTotal()
    {

        double soma_total = catalogo.stream()
                            .mapToDouble(Produto::getPreco)
                            .sum();

        return soma_total;

    }

    public double calcularPorCategoria(String catDesejada)
    {

        double soma_por_categoria = catalogo.stream()
                                    .filter(p -> p.getCategoria() == catDesejada)
                                    .mapToDouble(Produto::getPreco)
                                    .sum();

        return soma_por_categoria;
        
    }

}
