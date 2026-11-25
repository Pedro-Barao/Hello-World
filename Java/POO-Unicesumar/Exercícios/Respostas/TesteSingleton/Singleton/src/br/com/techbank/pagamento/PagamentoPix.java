package br.com.techbank.pagamento;

public class PagamentoPix implements IPagamento{
 
    @Override
    public void processar(double valor) 
    {

        System.out.println("PIX: Gerando QR Code dinâmico no valor de R$ " + valor);
        
    }

}
