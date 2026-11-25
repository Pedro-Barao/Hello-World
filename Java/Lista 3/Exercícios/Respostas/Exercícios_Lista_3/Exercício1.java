/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Criar uma classe carro com marca, modelo e ano

 */


package Exercícios_Lista_3;


class Carro {
    
    
    String marca;
    String modelo;
    int ano;
    
    
    Carro(String marca, String modelo, int ano)
    {
        
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        
    }
    

}


public class Exercício1 {
    
    public static void main(String[] args)
    {
    
        Carro Logan = new Carro("Renault", "Logan", 2010);
    
    
         System.out.println(Logan.marca + " " + Logan.modelo + " " + Logan.ano);
         
    }
    
}

