/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Declare um Map<String, Integer> para armazenar nomes e idades, depoisexiba cada um

 */


package Exercícios_Lista_6;


import java.util.HashMap;
import java.util.Map;


public class Exercíciop12 {
    
    
    public static void main(String[] args) {
        
        
        Map<String, Integer> NomeeIdade = new HashMap<>();
        
        
        NomeeIdade.put("Caio", 20);
        NomeeIdade.put("Maria", 2);
        NomeeIdade.put("Andreia", 34);
        NomeeIdade.put("Lucas", 13);
        
        System.out.println(NomeeIdade);
        
    }
    
}
