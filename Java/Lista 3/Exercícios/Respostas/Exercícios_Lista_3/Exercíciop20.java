/*

Autor: Pedro Gonella Barao
Data: 03/09/2025
Objetivo: Classe Funcionario

 */


package Exercícios_Lista_3;


public class Exercíciop20 {
    
    
    private String nome;
    private float salarioBase;
    
    
    Exercíciop20(){};
    Exercíciop20(String nome, float salarioBase)
    {
     
        this.nome = nome;
        this.salarioBase = salarioBase;
        
    }
    
    
    String getNome()
    {
        
        return nome;
        
    }

    float getsalarioBase()
    {
     
        return salarioBase;
        
    }
    
    
    class Gerente
    {
        
        Exercíciop20 gerente = new Exercíciop20();
        String nome;
        float salarioBase;
        
        
    }
    
    class Funcionario
    {
        
        Exercíciop20 funcionario = new Exercíciop20();
        String nome;
        float salarioBase;
        
        
    }
    
}
