/*

Autor: Pedro Gonella Barao
Data: 03/09/2025
Objetivo: Criar um sistema bancario

 */


package Exercícios_Lista_3;


import java.util.Scanner;

public class SistemaBancario24 {
    
    
    private int saldo;
    private String titular;
    
    
    SistemaBancario24(){};
    SistemaBancario24(int saldo, String titular)
    {
     
        this.saldo = saldo;
        this. titular = titular;
        
    }
    
    
    int getSaldo()
    {
        
        return saldo;
        
    }
    void setSaldo(int saldo)
    {
        
        this.saldo = saldo;
        
    }
    
    
    String getTitular()
    {
        
        return titular;
        
    }
    void setTitular(String Titular)
    {
        
        this.titular = titular;
        
    }
    
    
    
    int Saque(int saldo)
    {
        
        Scanner scanner = new Scanner(System.in);
        int saque;
        
        
        System.out.println("\nQuanto voce deseja sacar?:");
        saque = scanner.nextInt();
        
        
        if(saque > saldo)
        {
            
            System.out.println("\nSeu saque nao pode ser maio que seu saldo");
            
            return 0;
            
        }
        
        else
        {
            
            System.out.println("\nSaque efeituado com sucesso!");
            
            saque = saldo - saque;
            
            return saque;
            
        }
   
    }
   
    int Deposito(int saldo)
    {
        
        Scanner scanner = new Scanner(System.in);
        int deposito;
        
        
        System.out.println("\nQuanto voce deseja depositar?:");
        deposito = scanner.nextInt();

            
        System.out.println("\nDeposito efeituado com sucesso!");
            
        
        return deposito;
   
    }
    
}
