/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo:Crie um Map<String, Double> com produtos e preços, e exiba cada item formatado

 */


package Exercícios_Lista_6;


import java.util.HashMap;
import java.util.Map;


public class Exercíciop14 {
    
    
    public static void main(String[] args) {
        
        
        Map<String, Double> ProdutoPreco = new HashMap<>();
        
        
        ProdutoPreco.put("Lapis", 12.00);
        ProdutoPreco.put("Livro", 35.99);
        ProdutoPreco.put("Carro", 53999.99);
        
        
        System.out.println(ProdutoPreco);
        
    }
    
}
