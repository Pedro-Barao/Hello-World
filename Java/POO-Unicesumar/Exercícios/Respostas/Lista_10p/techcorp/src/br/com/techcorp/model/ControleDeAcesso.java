package br.com.techcorp.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControleDeAcesso {
    
    private List<Funcionario> historicoCatraca = new ArrayList<>();
    private Set<Funcionario> autorizadoSalaSegura = new HashSet<>();

    public void registrarPassagem(Funcionario f)
    {

        historicoCatraca.add(f);

        System.out.println("\nFuncionario " + f.getNome() + " passou pela catraca");

    }

    public void concederAcessoSala(Funcionario f)
    {

        if(autorizadoSalaSegura.add(f) == false)
        {

            System.out.println("\nAviso: Matrícula já registrada na sala. Acesso não permitido");

        }

        else
        {

            System.out.println("\nAcesso liberado para a sala segura");

        }

    }

}
