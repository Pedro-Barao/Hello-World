package br.com.techinvoice.database;

public class GerenciadorConfiguracao {
    
    private static GerenciadorConfiguracao instanciaUnica;

    private String apiKey = "AWS-12345-KEY";

    private GerenciadorConfiguracao()
    {

        System.out.println("\nEstabelecendo conexão com o banco...\nConexão estabelecida!\n");

    }

    public static GerenciadorConfiguracao getInstance()
    {

        if(instanciaUnica == null)
        {

            instanciaUnica = new GerenciadorConfiguracao();

        }

        return instanciaUnica;

    }

    public String getApiKey()
    {

        return apiKey;
        
    }

}
