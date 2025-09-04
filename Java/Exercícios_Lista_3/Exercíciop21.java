/*

Autor: Pedro Gonella Barao
Data: 03/09/2025
Objetivo: Relacionar Cliente com Pedido e exibir os dados
 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Exercíciop21 {
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        Produto21 produto = new Produto21();
        String nome, email;
        double valorTotal;
        
        
        System.out.println("\nOla usuario! Digite o seu nome:");
        nome = scanner.nextLine();
        
        System.out.println("\nAgora digite seu email:");
        email = scanner.nextLine();
        
        System.out.println("\nQual o preco do produto comprado?:");
        valorTotal = scanner.nextDouble();
  
        
        produto.setNome(nome);
        produto.setEmail(email);
        produto.setvalorTotal(valorTotal);
        
        
        System.out.println("\nOla " + produto.getNome());
        System.out.println("\nCom o email " + produto.getEmail());
        System.out.println("\nVoce comprou um produto no valor " + produto.getvalorTotal() + " reais");
        
    }
    
}
