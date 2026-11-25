package br.com.techinvoice.documento;

public class NotaFiscal implements IDocumento {
    
    @Override
    public void gerarPDF()
    {

        System.out.println("\nGerando Nota Fiscal com impostos...\n");

    }

}
