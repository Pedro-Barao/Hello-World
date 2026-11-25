/*

Autor: Pedro Gonella Barao
Data: 03/09/2025
Objetivo: Criar uma classe retangulo

 */


package Exercícios_Lista_3;


public class Retangulo22 {
    
    
    private int largura;
    private int altura;
    
    
    Retangulo22(){};
    Retangulo22(int largura, int altura)
    {
        
        this.largura = largura;
        this.altura = altura;
        
    }
    
    
    int getLargura()
    {
        
        return largura;
        
    }
    void setLargura(int largura)
    {
     
        this.largura = largura;
        
    }
    
    
    int getAltura()
    {
        
        return altura;
        
    }
    void setAltura(int altura)
    {
        
        this.altura = altura;
        
    }
    
    
    int CalcularPerimetro(int altura, int largura)
    {
     
        int perimetro;
        
        perimetro = (altura + largura) / 2;
        
        return perimetro;
        
    }
    
    int CalcularArea(int altura, int largura)
    {
        
        int area;
        
        area = altura * largura;
        
        return area;
        
    }
    
}
