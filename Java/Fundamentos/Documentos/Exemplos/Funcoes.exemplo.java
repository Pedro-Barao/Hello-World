/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author falea
 */
public class Funcoes {

    // Função pura que soma dois números
    public static int soma(int a, int b) {
        return a + b;
    }
    
    // Função impura que imprime uma mensagem no console
    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
    
    // Função impura que gera um número aleatório
    public static int gerarNumeroAleatorio(int limite) {
        return (int) (Math.random() * limite);
    }
       
    public static void main(String[] args) {
       
        // Exemplo de função pura
        int resultadoSoma = soma(2, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);
        
        // Exemplo de função impura imprimindo uma mensagem
        imprimirMensagem("Olá, mundo!");
        
        // Exemplo de função impura gerando um número aleatório
        int numeroAleatorio = gerarNumeroAleatorio(10);
        System.out.println("Número aleatório: " + numeroAleatorio);
        
        
    }
}

