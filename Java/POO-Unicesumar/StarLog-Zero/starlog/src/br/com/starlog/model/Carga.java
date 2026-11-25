package br.com.starlog.model;

public class Carga {
    
    private final String codigoRastreio = "";
    private String categoria;
    private double pesoKg;
    private double valorSeguro;

    public Carga(String codigoRastreio, String categoria, double pesoKg, double valorSeguro)
    {

        if(codigoRastreio.trim().isEmpty() || codigoRastreio == null)
        {

            throw new IllegalArgumentException("\nCódigo rastreio de carga não pode ser nulo ou vazio\n");

        }

        if(pesoKg <= 0)
        {

            throw new IllegalArgumentException("\nPeso da carga inválido\n");

        }

        this.categoria = categoria;
        this.pesoKg = pesoKg;
        this.valorSeguro = valorSeguro;

    }


    @Override
    public int hashCode()
    {

        return codigoRastreio.hashCode();

    }


    @Override
    public boolean equals(Object objeto)
    {

        if(objeto == null || objeto.getClass() != getClass())
        {

            return false;
            
        }

        if(this == objeto)
        {

            return true;

        }

        Carga nova = (Carga) objeto;

        return this.codigoRastreio.equals(nova.codigoRastreio);

    }

    @Override 
    public String toString()
    {

        return "\nCodigo Rastreamento: " + codigoRastreio.hashCode() + "\nCategoria: " + categoria + " | Peso (KG): " + pesoKg + " | Valor Seguro: " + valorSeguro;
         
    }


    public String getCodigoRastreio()
    {

        return codigoRastreio;

    }


    public String getCategoria()
    {

        return categoria;

    }

    public void setCateforia(String categoria)
    {

        this.categoria = categoria;

    }


    public double getPesoKg()
    {

        return pesoKg;

    }

    public void setPesoKg(double pesoKg)
    {

        this.pesoKg = pesoKg;

    }


    public double getValorSeguro()
    {

        return valorSeguro;

    }

    public void setValorSeguro(double valorSeguro)
    {

        this.valorSeguro = valorSeguro;
        
    }

}
