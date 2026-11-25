/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo:Crie uma List<String>, adicione 5 nomes e percorra com um for exibindo cada nome

 */


package Exercícios_Lista_6;


import java.util.ArrayList;
import java.util.List;


public class Exercício6 {
    
    
    public static void main(String[] args) {
        
        
        List<String> Nomes = new ArrayList<>();
        
        
        Nomes.add("Caio");
        Nomes.add("Jose");
        Nomes.add("Mario");
        Nomes.add("Antinia");
        Nomes.add("Airton");
        
        
        for(int i = 0; i < 5; i++)
        {
         
            System.out.println(Nomes.get(i));
            
        }
        
    }
    
}
