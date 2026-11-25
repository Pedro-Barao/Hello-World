package br.com.nexustech.model;

import br.com.nexustech.execption.BanidoException;

//Exercício 13
public class MatchMaker {
    
    public void encontrarSala(ModoJogo modo, boolean jogadorBanido) throws BanidoException
    {

        if(jogadorBanido == true)
        {

            throw new BanidoException("\nPartida não encontrada: Jogador Banido");

        }

        else
        {

            System.out.println("\nPartida encontrada!");

        }

    }

}
