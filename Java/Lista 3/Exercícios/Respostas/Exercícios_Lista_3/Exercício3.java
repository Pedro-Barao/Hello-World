/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Criar varios carros e imprimir todos os seus valores

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


public class Exercício3 {
    
    public static void main(String[] args)
    {
    
        Carro Logan = new Carro("Renault", "Logan", 2010);
        Carro Uno = new Carro("Fiat", "Uno", 2016);
        Carro Fusca = new Carro("Volkswagen", "Fusca", 2003);
    
    
        Logan.DefinicaoCarro();
        Uno.DefinicaoCarro();
        Fusca.DefinicaoCarro();
         
    }
    
}

