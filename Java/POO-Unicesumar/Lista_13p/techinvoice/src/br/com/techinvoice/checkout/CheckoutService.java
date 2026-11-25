package br.com.techinvoice.checkout;

import br.com.techinvoice.documento.DocumentoFactory;
import br.com.techinvoice.documento.IDocumento;

public class CheckoutService {
    
    public void realizarCheckout(String tipoSelecionado)
    {

        System.out.println("\nIniciando processo...");

        IDocumento formatoDocumento = DocumentoFactory.gerarDocumento(tipoSelecionado);

        formatoDocumento.gerarPDF();

        System.out.println("Documento do tipo: " + tipoSelecionado + " gerado com sucesso");

    }

}
