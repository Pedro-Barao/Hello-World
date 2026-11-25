package br.com.nexustech.model;

import br.com.nexustech.execption.NivelInsuficienteException;

public class Masmorra {
    
    public void entrar(int nivelJogador)
    {

        if(nivelJogador < 50)
        {

            throw new NivelInsuficienteException("\nSeu nível é muito baixo para a masmorra!");

        }

        else
        {

            System.out.println("\nNível mínimo permitido");

        }

    }

}