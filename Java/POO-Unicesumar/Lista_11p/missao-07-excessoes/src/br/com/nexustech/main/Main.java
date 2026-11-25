package br.com.nexustech.main;

import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;

import br.com.nexustech.execption.BanidoException;
import br.com.nexustech.execption.NivelInsuficienteException;
import br.com.nexustech.model.Masmorra;
import br.com.nexustech.model.MatchMaker;
import br.com.nexustech.model.ModoRanqueado;

public class Main {
    
    public static void main(String[] args)
    {

        //Exercício 1 e 2
        int kills = 15;
        int deaths = 0;

        try
        {

            System.out.println(kills/deaths);

        }

        catch(ArithmeticException error)
        {

            System.out.println("\nTaxa de K/D: Jogador Invicto!");

        }


        //Exercício 3
        String[] inventario = new String[3];

        try
        {

            inventario[5] = "Espada";

        }

        catch(ArrayIndexOutOfBoundsException error)
        {

            System.out.println("\nInventário cheio");

        }


        //Exercício 4
        String jogador = null;

        if(jogador != null)
        {

            System.out.println("\n" + jogador);

        }

        else
        {

            System.out.println("\nJogador desconectado");
            
        }

        //Exercício 6
        try
        {

            conectarServidor();

        }

        catch(Exception error)
        {

            error.getMessage();

        }

        //Exercício 7
        finally
        {

            System.out.println("\nFechando portas de rede do jogo...");

        }


        //Exercício 9
        Masmorra masmorra = new Masmorra();

        int nivelJogador = 20;

        try
        {

            masmorra.entrar(nivelJogador);

        }

        catch(NivelInsuficienteException error)
        {

            System.out.println(error.getMessage());

        }

        //Exercício 14
        MatchMaker partida = new MatchMaker();

        ModoRanqueado ranqueada = new ModoRanqueado();

        boolean jogadorNaoBanido = false;
        boolean jogadorBanido = true;

        try
        {

            partida.encontrarSala(ranqueada, jogadorNaoBanido);
            partida.encontrarSala(ranqueada, jogadorBanido);

        }

        catch(BanidoException error)
        {

            System.out.println(error.getMessage());

        }

    }

    //Exercício 5
    public static void conectarServidor() throws Exception
    {

        throw new Exception("\nServidor caiu!");

    }

}
