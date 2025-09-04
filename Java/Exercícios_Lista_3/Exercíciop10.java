/*

Autor: Pedro Gonella Barao
Data: 28/08/2025
Objetivo: Fazer um sistema de conta bancaria

 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Exercíciop10 {
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        ContaBancaria10 Usuario = new ContaBancaria10();
        String titular;
        float saldo = 1000;
        int opcao;
        
        
        System.out.println("\nQual seria o titular da conta?:");
        titular = scanner.nextLine();
        
        
        do
        {
            
            System.out. println("\nOla " + titular + "! Qual procedimento voce deseja realizar?:");
            
            System.out.println("\n1-Depositar dinheiro\n2-Sacar dinheiro\n3-Ver saldo\n4-Sair do sistema");
            opcao = scanner.nextInt();
            
            
            switch(opcao)
            {
                
                case 1:
                    
                    saldo = Usuario.Depositar(saldo);
                    
                    break;
                    
                case 2:
                    
                    saldo = Usuario.Sacar(saldo);
                    
                    break;
                    
                case 3:
                    
                    Usuario.setSaldo(saldo);
                    
                    break;
                    
                case 4:
                    
                    System.exit(0);
                    
            }
  
            
        }while (opcao != 4);
    }
}
