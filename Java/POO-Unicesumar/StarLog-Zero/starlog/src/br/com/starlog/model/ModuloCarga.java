package br.com.starlog.model;

import java.util.ArrayList;
import java.util.List;

import br.com.starlog.exception.CapacidadeExcedidaException;

public class ModuloCarga {
    
    private String idModulo;
    private int capacidadeMaxima;
    private List<Carga> cargas = new ArrayList<>();
    
    public ModuloCarga(String idModulo, int capacidadeMaxima)
    {

        this.idModulo = idModulo;
        this.capacidadeMaxima = capacidadeMaxima;

    }

    public void carregarCarga(Carga carga) throws CapacidadeExcedidaException
    {

        if(this.cargas.size() >= this.capacidadeMaxima)
        {

            throw new CapacidadeExcedidaException("\nCapacidade maxima de " + this.capacidadeMaxima + " atingida no módulo " + this.idModulo);

        }

        cargas.add(carga);

        System.out.println("\nCarga adicionada a lista com sucesso!\n");

    }

    public double calcularSeguroTotal()
    {

        double seguro_total = cargas.stream()
                            .mapToDouble(Carga::getValorSeguro)
                            .sum();

        return seguro_total;
        
    }

    public long contarPorCarga(String categoria)
    {

        long por_categira = cargas.stream()
                            .filter(c -> c.getCategoria() == categoria)
                            .count();

        return por_categira;

    }

    public double calcularSeguroPesadas(double pesoCorte)
    {

        double calculo_pesadas = cargas.stream()
                                .filter(c -> c.getPesoKg() > pesoCorte)
                                .mapToDouble(Carga::getValorSeguro)
                                .sum();

        return calculo_pesadas;
        
    }
    
    public String getIdModulo()
    {

        return idModulo;

    }
    
}
