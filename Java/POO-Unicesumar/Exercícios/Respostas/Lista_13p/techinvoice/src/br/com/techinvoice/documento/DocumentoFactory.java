package br.com.techinvoice.documento;

public class DocumentoFactory {
    
    public static IDocumento gerarDocumento(String tipo)
    {

        if(tipo == null || tipo.trim().isEmpty())
        {

            throw new IllegalArgumentException("O tipo de documento selecionado não pode ser nulo ou vazio");

        }

        if("NF".equalsIgnoreCase(tipo))
        {

            return new NotaFiscal();

        }

        else if("RECIBO".equalsIgnoreCase(tipo))
        {

            return new Recibo();

        }

        throw new IllegalArgumentException("\nTipo de documento inválido\n");

    }

}
