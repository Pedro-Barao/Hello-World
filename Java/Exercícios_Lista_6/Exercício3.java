/*
Nome: Pedro Gonella Barão
Data: 19/09/2025
Objetivo: Crie um array de caracteres contendo as letras do seu nome e percorra-o com um for
 */


package Exercícios_Lista_6;


public class Exercício3 {
    
    
    public static void main(String[] args) {
        
        String[] nome = new String[5];
        
        nome[0] = "P";
        nome[1] = "e";
        nome[2] = "d";
        nome[3] = "r";
        nome[4] = "o";
        
        
        for(int i = 0; i < 5; i++)
        {
         
            System.out.print(nome[i]);
            
        }
        
        System.out.print("\n");
        
    }
    
}
