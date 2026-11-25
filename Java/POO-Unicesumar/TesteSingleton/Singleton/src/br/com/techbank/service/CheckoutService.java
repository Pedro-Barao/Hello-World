package br.com.techbank.service;

import br.com.techbank.factory.PagamentoFactory;
import br.com.techbank.pagamento.IPagamento;

public class CheckoutService {
    
    public void realizarCheckout(String tipoSelecionado, double valorTotal)
    {

        System.out.println("\nIniciando orquestração de venda...\n");

        IPagamento formaPagamento = PagamentoFactory.criarPagamento(tipoSelecionado);

        formaPagamento.processar(valorTotal);

        System.out.println("\nTransação finalizada com sucesso!\n");
    }

}
