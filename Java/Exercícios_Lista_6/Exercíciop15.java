/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie um Map<Integer, String> representando IDs de alunos e seus nomes, depois percorra-os

 */


package Exercícios_Lista_6;


import java.util.HashMap;
import java.util.Map;


public class Exercíciop15 {
    
    
    public static void main(String[] args) {
        
        
        Map<Integer, String> IDNome = new HashMap<>();
        
        
        IDNome.put(1, "Marcos");
        IDNome.put(2, "Jessica");
        IDNome.put(3, "Anderson");
        IDNome.put(4, "Teresa");
        
        System.out.println(IDNome);
        
    }
    
}
