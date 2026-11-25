/*

Autor: Pedro Gonella Barao
Data: 04/09/2025
Objetivo: Criar a classe produto
 */


package Exercícios_Lista_3;


public class Produto25 {
    
    
    String nome;
    int quantidade;
    
    Produto25(){};
    Produto25(String nome, int quantidade)
    {
        
        this.nome = nome;
        this.quantidade = quantidade;
        
    }
    
    
    String getNome()
    {
        
        return nome;
        
    }
    void setNome(String nome)
    {
        
        this.nome = nome;
        
    }
    
    
    int getQuantidade()
    {
        
        return quantidade;
        
    }
    void setQuantidade()
    {
        
        this.quantidade = quantidade;
        
    }
    
    
}
