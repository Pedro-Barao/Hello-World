/*


 */

import java.util.Scanner;

public class 7Tabuada {
    
    public static void main(String[] args)
    {
        
        try(Scanner scanner = new Scanner(System.in))
        {
            
            System.out.println("Bem-vindo ao calculador de tabuada!");
            System.out.println("\nDiga a tabuada de qual número você deseja ver: ");
            
            int tabuada = scanner.nextInt();
            
            System.out.println("\n");
            
            
            for (int i = 1; i < 11; i++)
            {
                
                System.out.println(tabuada * i);
                
            }
         
        }
    }
    
}

