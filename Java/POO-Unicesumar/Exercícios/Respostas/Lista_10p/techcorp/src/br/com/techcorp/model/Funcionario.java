package br.com.techcorp.model;

import java.util.Objects;

public class Funcionario {
    
    private String matricula;
    private String nome;
    private String cargo;

    public Funcionario(String matricula, String nome, String cargo)
    {

        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;

    }


    public String getMatricula()
    {

        return matricula;

    }

    public void setMatricula(String matricula)
    {

        this.matricula = matricula;

    }


    public String getNome()
    {

        return nome;

    }

    public void setNome(String nome)
    {

        this.nome = nome;

    }


    public String getCargo()
    {

        return cargo;

    }

    public void setCargo(String cargo)
    {

        this.cargo = cargo;

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

        Funcionario Novo_Funcionario = (Funcionario) objeto;

        return Objects.equals(matricula, Novo_Funcionario.matricula);

    }


    @Override
    public int hashCode()
    {

        return Objects.hash(matricula);

    }

}
