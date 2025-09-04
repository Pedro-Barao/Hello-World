/*

Autor: Pedro Gonella Barao
Data: 02/09/2025
Objetivo: Classe animal
 */


package Exercícios_Lista_3;


public class Animal15_16_17_18_19 {
    
    
    private String nome;
    private int idade;
    
    
    Animal15_16_17_18_19(){};
    Animal15_16_17_18_19(String nome, int idade)
    {
        
        this.nome = nome;
        this.idade = idade;
        
    }
    
    
    String getNome()
    {
     
        return nome;
        
    }
    void setNome(String nome)
    {
     
        this.nome = nome;
        
    }
    
    
    int getIdade()
    {
     
        return idade;
        
    }
    void setIdade(int idade)
    {
     
        this.idade = idade;
        
    }
    
    
    void emitirSom()
    {
        
        System.out.println("Som generico");
        
    }
    
}
