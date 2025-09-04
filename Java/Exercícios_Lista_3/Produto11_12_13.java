/*

Autor: Pedro Gonella Barao
Data: 28/08/2025
Objetivo: Fazer a classe Produto

 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Produto11_12_13 {
    
    
    private String nome;
    private float preco;
    private int quantidade;
    protected int codigo;
    
    
    Produto11_12_13(){};
    Produto11_12_13(String nome, float preco, int quantidade)
    {
        
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
        
    }
    
    
    String getNome()
    {
        
        return nome;
        
    }
    void setNome(String nome)
    {
        
        this.nome = nome;
        
    }
    
    
    float getPreco()
    {
        
        return preco;
        
    }
    void setPreco(float preco)
    {
        
        this.preco = preco;
        
    }
    
    
    int getQuantidade()
    {
        
        return quantidade;
        
    }
    void setQuantidade(int quantidade)
    {
        
        this.quantidade = quantidade;
        
    }
    
    
    int getCodigo()
    {
        
        return codigo;
        
    }
    void setCodigo(int codigo)
    {
        
        this.codigo = codigo;
        
    }
    
    
    
    int AumentarEstoque(int quantidade)
    {
        
        Scanner scanner = new Scanner(System.in);
        int aumento;
        
        
        System.out.println("\nQuantos produtos a mais no estoque?:");
        aumento = scanner.nextInt();
        
        
        quantidade += aumento;
        
        
        return quantidade;
        
    }
    
    
    int DiminuirEstoque(int quantidade)
    {
        
        Scanner scanner = new Scanner(System.in);
        int diminui;
        
        
        System.out.println("\nQuantos produtos a mais no estoque?:");
        diminui = scanner.nextInt();
        
        
        if (quantidade > diminui)
        {
            
            quantidade -= diminui;
            
        }
        else
        {
            
            System.out.println("\nQuandidade de reducao supera a quantidade do estoque");
            
        }
        
        
        
        return quantidade;
        
    }
    
    void MostrarProduto(String nome, int quantidade, float preco)
    {
        
        
        System.out.println("\nNome: " + nome + "\nQuantidade: " + quantidade + "\nPreco: " + preco + "\nCodigo: " + codigo);
        
        
    }
    
}
