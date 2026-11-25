package br.com.techbank.pagamento;

public class PagamentoBoleto implements IPagamento{
    
    @Override
    public void processar(double valor) 
    {

        System.out.println("Boleto: Gerando linha digitável de cobrança de R$ " + valor);

    }

}
