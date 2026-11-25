/*

Autor: Pedro Gonella Barao
Data: 04/09/2025
Objetivo: Criar a classe estoque

 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Estoque25 {
    
    
    Produto25 produto = new Produto25();
    
    
    Estoque25(){};
    Estoque25(String nome, int quantidade)
    {
        
        this.produto.nome = nome;
        this.produto.quantidade = quantidade;
        
    }
    
    
    String getNome()
    {
        
        return produto.nome;
        
    }
    void setNome(String nome)
    {
        
        this.produto.nome = produto.nome;
        
    }
    
    
    int getQuantidade()
    {
        
        return produto.quantidade;
        
    }
    void setQuantidade()
    {
        
        this.produto.quantidade = produto.quantidade;
        
    }
    
    
    boolean verificarDisponibilidade(String nome, int quantidade)
    {
        
        Scanner scanner = new Scanner(System.in);
        int resultado;
        boolean verificador;
        
        
        System.out.println("\nQuantos produtos foram levados?:");
        resultado = scanner.nextInt();
        
        
        if (resultado > quantidade)
        {
            
            System.out.println("\nNao e possivel retirar mais produtos do que estao em estoque");
            
            return verificador = false;
            
        }
        
        else if (resultado == quantidade)
        {
            
            System.out.println("Todos os produtos dos que estao em estoque foram levados");
            
            return verificador = true;
            
        }
        
        else
        {
            
            System.out.println("Alguns produtos dos que estao em estoque foram levados");
            
            return verificador = true;
            
        }
        
    }
    
}
