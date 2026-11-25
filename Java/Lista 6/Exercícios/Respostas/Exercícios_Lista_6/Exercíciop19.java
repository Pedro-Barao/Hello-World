/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie uma Queue<Double> com valores decimais e exiba-os com for

 */


package Exercícios_Lista_6;


import java.util.LinkedList;
import java.util.Queue;


public class Exercíciop19 {
    
    
    public static void main(String[] args) {
        
        
        Queue<Double> Numeros = new LinkedList<>();
        
        
        Numeros.add(1231.213);
        Numeros.add(3434.2131);
        Numeros.add(987676.21312);
        Numeros.add(12781.1237);
        
        
        for(int i = 0; i < 4; i++)
        {
            
            System.out.println(Numeros.poll());
            
        }
        
    }
    
}
