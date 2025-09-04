/*

Autor: Pedro Gonella Barao
Data: 02/09/2025
Objetivo: Usar o termo super para acessar a superclasse de cachorro e gato

 */


package Exercícios_Lista_3;


class Cachorro extends Animal15_16_17_18_19
{

    Cachorro(String nome, int idade)
    {
     
        super(nome, idade);
        
    }
    
    
    @Override
    void emitirSom()
    {
         
        System.out.println("Latindo");
            
    }
        
}

class Gato extends Animal15_16_17_18_19
{
        
    
    Gato(String nome, int idade)
    {
     
        super(nome, idade);
        
    }
    
    
    @Override
    void emitirSom()
    {
         
        System.out.println("Miando");
            
    }
        
}


public class Exercíciop19{
    
    
    
    
    public static void main(String[] args)
    {
        
        Cachorro cachorro = new Cachorro("Rex", 10);
        Gato gato = new Gato("Mia", 2);

        
        cachorro.emitirSom();
        gato.emitirSom();
        
        
        System.out.println("\nO " + cachorro.getNome() + " tem " + cachorro.getIdade() + " anos");
        System.out.println("\nA " + gato.getNome() + " tem " + gato.getIdade() + " anos");        
                
    }
}
