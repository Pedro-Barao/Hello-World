package br.com.techinvoice.main;

import br.com.techinvoice.checkout.CheckoutService;
import br.com.techinvoice.database.GerenciadorConfiguracao;

public class Main {
    
    public static void main(String[] args)
    {
    
        GerenciadorConfiguracao congiguracao_1 = GerenciadorConfiguracao.getInstance();
        GerenciadorConfiguracao congiguracao_2 = GerenciadorConfiguracao.getInstance();

        System.out.println("\nApi Key: " + congiguracao_1.getApiKey());

        if(congiguracao_1 == congiguracao_2)
        {

            System.out.println("\nConfigurações iguais: " + (congiguracao_1 == congiguracao_2));

        }

        CheckoutService documento_NF = new CheckoutService();

        documento_NF.realizarCheckout("NF");

        try
        {

            CheckoutService documento_Boleto = new CheckoutService();

            documento_Boleto.realizarCheckout("BOLETO");

        }

        catch(IllegalArgumentException error)
        {

            System.out.println("Erro: " + error);

        }

    }

}
