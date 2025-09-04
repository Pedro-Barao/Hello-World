/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Classe Carro

 */


package Exercícios_Lista_3;


public class Carro5_6_7 {
    
    
    private String marca;
    private String modelo;
    private int ano;
    
    Carro5_6_7(){};
    Carro5_6_7(String marca, String modelo, int ano)
    {
        
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        
    }
    

    
    public String getMarca()
    {
        
        return marca;
        
    }
    public void setMarca(String marca)
    {
        
        this.marca = marca;
        
    }
    
    
    public String getModeko()
    {
        
        return modelo;
        
    }
    public void setModelo(String modelo)
    {
        
        this.modelo = modelo;
        
    }
    
    
    public int getAno()
    {
        
        return ano;
        
    }
    public void setAno(int ano)
    {
   
        if (ano >= 1886)
        {
            
            this.ano = ano;
 
        }
        
        else
        {
            
            System.out.println("\n\nO carro nao pode ser mais antigo que 1886");
            
        }
        
    }
    
    void DefinicaoCarro5_6_7()
    {
        
        System.out.println("\n" + marca + " " + modelo + " " + ano);
        
    }
    
}
