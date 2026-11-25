/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Criar uma classe chamada pessoa com os atributos específicos e usando get set

 */


package Exercícios_Lista_3;


public class Pessoa8_9 {
    
    private String nome;
    private int idade;
    private float altura;
    
    
    Pessoa8_9(){};
    public Pessoa8_9(String nome, int idade, float altura)
    { 
     
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        
    }
 
    public String getNome()
    {
     
        return nome;
        
    }
    public void setNome(String nome)
    {
        
        this.nome = nome;
        
    }
    
    
    
    public int getIdade()
    {
        
        return idade;
        
    }
    public void setIdade(int idade)
    {
        
        if (idade > 0)
        {
           
            this.idade = idade;
            
        }
        
        else
        {
            
            System.out.println("\nSua idade nao pode ser negativa");
            
        }
        
    }
    
    
    public float getAltura()
    {
        
        return altura;
        
    }
    public void setAltura(float altura)
    {
        
        this.altura = altura;
        
    }
    
    
    void ImprimirDados()
    {
        
        System.out.println("\n" + nome + " " + idade + " " + altura);
        
    }


    
}
