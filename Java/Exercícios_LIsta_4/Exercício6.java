/*

Autor: Pedro Gonella Barao
Data: 30/08/2025
Objetivo: Receber os valores de um enum com credito, debito, pix e boleto com metodos para descontar as taxas

 */


package Exercícios_Lista_4;


import java.util.Scanner;


public class Exercício6 {
    
    public static void main(String[] args)
    {
     
        Scanner scanner = new Scanner(System.in);
        double valor;
        String metodo;

        
        System.out.println("\nOla usuario! Digite qual o valor voce ira pagar:");
        valor = scanner.nextDouble();
        scanner.nextLine();
        
        
        System.out.println("\nSelecione o metodo de pagamento:");
        metodo = scanner.nextLine().trim().toUpperCase();

        
        CREDITO_DEBITO_PIX_BOLETO6.Pagamento forma = CREDITO_DEBITO_PIX_BOLETO6.Pagamento.valueOf(metodo);
        
        
        System.out.println("\nVoce ira pagar um valor de: " + valor);
                
         
        valor = forma.AplicarDesconto(valor);

        
        System.out.println("\nSendo que apenas: " + valor + " reais serao para o vendedor");
        
        
    }
}