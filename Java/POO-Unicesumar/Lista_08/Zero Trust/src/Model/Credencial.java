package Model;

import java.util.Objects;

public class Credencial {
    
    private String codigoHex;
    private boolean ativo;
    private Funcionario titular;

    public Credencial(String codigoHex, boolean ativo, Funcionario titular)
    {

        this.codigoHex = codigoHex;
        this.ativo = ativo;
        this. titular = titular;

    }


    @Override
    public int hashCode()
    {

        return Objects.hash(codigoHex);

    }

    public String getCodigoHex()
    {

        return codigoHex;

    }

    public void setCodigoHex(String codigoHex)
    {

        this.codigoHex = String.valueOf(codigoHex.hashCode());

    }


    public boolean getAtivo()
    {

        return ativo;

    }

    public void setAtivo(boolean ativo)
    {

        this.ativo = ativo;

    }


    public Funcionario getTitular()
    {

        return titular;

    }

    public void setTitular(Funcionario titular)
    {

        this.titular = titular;

    }


    @Override
    public boolean equals(Object objeto)
    {

        if(this == objeto)
        {

            return true;

        }

        if(objeto == null || getClass() != objeto.getClass())
        {

            return false;
            
        }

        Credencial novo = (Credencial) objeto;

        return Objects.equals(codigoHex, novo.codigoHex);

    }

    @Override
    public String toString()
    {

        return "CODIGOHEX: " + codigoHex.hashCode() + 
            "\nAtividade: " + ((ativo) ? "Ativo" : "Inativo") + 
            " | Titular da Conta: " + titular.getNome();

    }

}