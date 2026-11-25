package br.com.starlog.model;

/**
 * CAMADA MODEL (Modelo de Domínio)
 * Representa uma carga a ser despachada pela estação StarLog.
 * 
 * ATENÇÃO: Esta classe NÃO deve importar nenhum componente visual do Swing!
 */
public class Carga {
    private final String codigoRastreio;
    private final String categoria;
    private final double peso;
    private final double valorDeclarado;

    public Carga(String codigoRastreio, String categoria, double peso, double valorDeclarado) {
        // TODO: BARREIRA FAIL-FAST (Missão 2)
        // 1. Código de rastreio não pode ser nulo ou vazio -> lançar IllegalArgumentException("Código de rastreio não pode ser nulo ou vazio.");
        // 2. Categoria não pode ser nula ou vazia -> lançar IllegalArgumentException("Categoria não pode ser nula ou vazia.");
        // 3. Peso deve ser estritamente maior que zero -> lançar IllegalArgumentException("Peso deve ser estritamente positivo (maior que zero).");
        // 4. Valor declarado deve ser maior que zero -> lançar IllegalArgumentException("Valor declarado deve ser maior que zero.");

        this.codigoRastreio = codigoRastreio != null ? codigoRastreio.trim().toUpperCase() : "";
        this.categoria = categoria != null ? categoria.trim().toUpperCase() : "";
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPeso() {
        return peso;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Regra de Negócio: Cálculo do Seguro Espacial da Carga.
     * Cargas perigosas ou pesadas possuem taxa base diferenciada.
     */
    public double calcularSeguro() {
        // TODO: Regra de Negócio (Missão 2)
        // 1. Taxa base de 2% do valor declarado
        // 2. Se a categoria for "PERIGOSA" ou se o peso for superior a 100 kg,
        //    adicionar sobretaxa fixa de R$ 150,00 de risco operacional.
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("[%s] Categoria: %s | Peso: %.2f kg | Valor: R$ %.2f | Seguro: R$ %.2f",
                codigoRastreio, categoria, peso, valorDeclarado, calcularSeguro());
    }
}
