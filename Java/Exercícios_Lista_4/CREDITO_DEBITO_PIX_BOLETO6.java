/*

Autor: Pedro Gonella Barao
Data: 30/08/2025
Objetivo: Metodos de pagamento

 */


package Exercícios_Lista_4;


public class CREDITO_DEBITO_PIX_BOLETO6 {
    
    
    enum Pagamento
    {
        
        CREDITO(0.04),
        DEBITO(0.02),
        PIX(0.00),
        BOLETO(0.03);
        
        
        private final double desconto;
        
        
        
        Pagamento (double desconto)
        {
        
            this.desconto = desconto;
        
        }
      
        
        double AplicarDesconto(double valor) 
        {
            
            valor = valor * (1 - this.desconto);
            
            System.out.println("\nVoce tera: " + desconto + " % de desconto");
            
            return valor;
            
        }
        

    }
    
}
