/*

Autor: Pedro Gonella Barao
Data: 28/08/2025
Objetivo: Ver o erro de tentar chamar atributos privados

 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Exercíciop12 {
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        Produto11_12_13 Usuario = new Produto11_12_13();
        String nome;
        float preco;
        int quantidade;
        
        
        System.out.println("\nOla usuario! Digite o nome do seu produto:");
        nome = scanner.nextLine();
        
        System.out.println("\nAgora o preco dele:");
        preco = scanner.nextFloat();
        
        System.out.println("\nPor fim a a quantidade:");
        quantidade = scanner.nextInt();
        
        
        Usuario.getNome(nome);
        Usuario.getPreco(preco);
        Usuario.getQuantidade(quantidade);
        
        
    }
}
