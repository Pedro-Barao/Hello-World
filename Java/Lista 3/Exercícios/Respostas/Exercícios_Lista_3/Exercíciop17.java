/*

Autor: Pedro Gonella Barao
Data: 02/09/2025
Objetivo: Criar uma classe chamada gato e outra chamada cachorro e usar o Override

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


public class Exercíciop17{
    
    
    
    
    public static void main(String[] args)
    {
        
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        
        cachorro.emitirSom();
        gato.emitirSom();
                
    }
}
