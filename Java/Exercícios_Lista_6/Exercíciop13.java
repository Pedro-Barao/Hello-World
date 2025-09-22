/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie um Map<Character, Integer> que associa letras a números e percorra exibindo os valores

 */


package Exercícios_Lista_6;


import java.util.HashMap;
import java.util.Map;


public class Exercíciop13 {
    
    
    public static void main(String[] args) {
        
        
        Map<Character, Integer> LetraNumero = new HashMap<>();
        
        
        LetraNumero.put('a', 21);
        LetraNumero.put('e', 42);
        LetraNumero.put('r', 87);
        
        
        System.out.println(LetraNumero);
        
    }
    
}
