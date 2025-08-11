/*

Autor: Pedro Gonella Barão
Data: 09/08/2025
Objetivo: Praticar operadores lógico

 */

public class 4OperadoresLogicos {
    
    public static void main(String[] arg)
    {
        
        int num1 = 58;
        int num2 = 213;
        boolean Active;
        
        if (num1 > num2)
        {
            
            Active = true;
            System.out.println(Active);
            
        }
        else
        {
            
            Active = false;
            System.out.println(Active);
            
        }
        
        
        
        
        if (num2 + num1 < num2 * num2)
        {
            
            Active = false;
            System.out.println(Active);
            
        }
        else
        {
            
            Active = true;
            System.out.println(Active);
            
        }
        
        
        
        if (num1 + num2 == 271 && num2 - num1 == 155)
        {
            
            Active = true;
            System.out.println(Active);
            
        }
        else
        {
            
            Active = false;
            System.out.println(Active);
            
        }
        
        
        
        if ((num1 + num2 == 200 || num2 * num1 != 2439) && (num2 - num1 - num1 == 97 || num2 / num1 + num2 == 0.74835))
        {
            
            Active = true;
            System.out.println(Active);
            
        }
        else
        {
            
            Active = false;
            System.out.println(Active);
        }
    }
            
}


