/*

Autor: Pedro Gonella Barao
Data: 02/09/2025
Objetivo: Tentar chamar os atriubtos privados da classe animal

 */


package Exercícios_Lista_3;


class Cachorro extends Animal15_16_17_18_19
{

    @Override
    void emitirSom()
    {
         
    System.out.println("Latindo");
            
    }
        
}

class Gato extends Animal15_16_17_18_19
{
        
    @Override
    void emitirSom()
    {
         
    System.out.println("Miando");
            
    }
        
}


public class Exercíciop18{
    
    
    
    
    public static void main(String[] args)
    {
        
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        cachorro.nome = "Rex";
        cachorro.idade = 10;
        
        gato.nome = "Mia";
        gato.idade = 2;
        
        
        cachorro.emitirSom();
        gato.emitirSom();
                
    }
}
