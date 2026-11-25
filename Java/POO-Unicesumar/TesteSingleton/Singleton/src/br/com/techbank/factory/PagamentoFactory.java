package br.com.techbank.factory;

import br.com.techbank.pagamento.*;

public class PagamentoFactory {
    
    public static IPagamento criarPagamento(String tipo)
    {

        if(tipo == null || tipo.trim().isEmpty())
        {

            throw new IllegalArgumentException("O tipo de pagamento selecionado não pode ser nulo ou vazio");

        }

        if("PIX".equalsIgnoreCase(tipo))
        {

            return new PagamentoPix();

        }

        if("CARTAO".equalsIgnoreCase(tipo))
        {

            return new PagamentoCartao();

        }

        if("BOLETO".equalsIgnoreCase(tipo))
        {

            return new PagamentoBoleto();

        }

        throw new IllegalArgumentException("Modalidade de pagamento não suportada pela plataforma: " + tipo);

    }

}
