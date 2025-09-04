/*

Autor: Gabriel Nascimento, Guilherme Cortez, Herique Oliveira e Pedro Barao
Data: 02/09/2025
Objetivo: Criar um ArrayList e que exibe os numeros impares de 1 a 10

 */


package Exercícios_Lista_6;

import java.util.ArrayList;


public class Exercíciop25 {
    
    
    public static void main(String[] args)
    {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        
        for (int i = 0; i < 10; i++)
        {
            
            numeros.add(i + 1);
            
        }
        
        
        for (int i = 0; i < 10; i++)
        {
         
            if(numeros.get(i) % 2 != 0)
            {
                
                System.out.println("\nO numero " + numeros.get(i) + " e impar");
                
            }
            
        }
        
    }
    
}
