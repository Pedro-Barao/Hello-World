/*

Nome: Pedro Gonella Barão
Data: 19/09/2025
Objetivo: Crie um array de 3 palavras e exiba-as em ordem inversa

 */


package Exercícios_Lista_6;


public class Exercício5 {
    
    
    public static void main(String[] args) {
        
        
        String[] palavras = new String[3];
        String[] sub_palavras = new String[3];
        
        
        palavras[0] = "Gato";
        palavras[1] = "Bola";
        palavras[2] = "Pato";
        
        for(int j = 0; j < 3; j++)
        {
        
            for(int i = 4; i > 0; i--)
            {
            
                sub_palavras[j] = palavras[j].substring(i - 1, i);
                sub_palavras[j] = palavras[j].substring(i - 1, i);
                sub_palavras[j] = palavras[j].substring(i - 1, i);
           
                System.out.print(sub_palavras[j]);
           
            }
            
            System.out.print("\n");
            
        }    
        
    }
    
}
