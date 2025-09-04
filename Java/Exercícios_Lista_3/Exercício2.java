/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Criar um método que exiba as informacoes de carro

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
    
    void DefinicaoCarro()
    {
        
        System.out.println(marca + " " + modelo + " " + ano);
        
    }
    
}


public class Exercício2 {
    
    public static void main(String[] args)
    {
    
        Carro Logan = new Carro("Renault", "Logan", 2010);
    
    
        Logan.DefinicaoCarro();
        
    }
    
}

