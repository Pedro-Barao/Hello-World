/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Classe Carro

 */


package Exercícios_Lista_3;


public class Carro {
    
    
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
        
        System.out.println("\n" + marca + " " + modelo + " " + ano);
        
    }
}