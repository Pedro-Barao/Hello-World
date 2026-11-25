package br.com.techinvoice.documento;

public class Recibo implements IDocumento {
    
    @Override
    public void gerarPDF()
    {

        System.out.println("\nGerando Recibo simples de pagamento...");
        
    }

}
