package br.com.techbank.pagamento;

public class PagamentoCartao implements IPagamento{
    
    @Override
    public void processar(double valor) 
    {

        System.out.println("CARTAO: Capturando e autorizando transação de R$ " + valor);

    }

}
