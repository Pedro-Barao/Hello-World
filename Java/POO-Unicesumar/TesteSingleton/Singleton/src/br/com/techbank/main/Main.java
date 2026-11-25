package br.com.techbank.main;

import br.com.techbank.database.GerenciadorConexao;
import br.com.techbank.service.CheckoutService;

public class Main {
    
    public static void main(String[] args) {
        
        GerenciadorConexao conexao1 = GerenciadorConexao.getInstance();
        GerenciadorConexao conexao2 = GerenciadorConexao.getInstance();
        
        System.out.println("\nSão o mesmo endereço de memória? " + (conexao1 == conexao2) + "\n");
        
        CheckoutService pagamento_1 = new CheckoutService();

        pagamento_1.realizarCheckout("PIX", 200.00);
        
    }

}
