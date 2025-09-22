/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie uma List<Double>, adicione 3 valores e exiba cada um com duas casas decimais

 */


package Exercícios_Lista_6;


import java.util.ArrayList;
import java.util.List;


public class Exercício8 {
    
    
    public static void main(String[] args) {
        
        
        List<Double> Numeros = new ArrayList<>();
        String numero;
        
        
        Numeros.add(32.3534);
        Numeros.add(123.2141);
        Numeros.add(65745.4);
        
        
        for(int i = 0; i < 3; i++)
        {
         
            numero = String.format("%.2f", Numeros.get(i));
            System.out.println(numero);
            
        }
    }
    
}
