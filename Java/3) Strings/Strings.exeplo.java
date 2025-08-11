/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author falea
 */

public class Strings {

    public static void main(String[] args) {
        // Declaração e Inicialização de Strings
        String nome = "João";
        String sobrenome = "Silva";
        
        // Concatenação de Strings
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome Completo: " + nomeCompleto);
        
        // Comprimento da String
        int comprimento = nomeCompleto.length();
        System.out.println("Comprimento do Nome Completo: " + comprimento);
        
        // Comparação de Strings
        boolean igual = nome.equals(sobrenome);
        System.out.println("Nome e Sobrenome são Iguais? " + igual);
        
        // Substituição de Caracteres
        String nomeSubstituido = nomeCompleto.replace('a', '@');
        System.out.println("Nome com Substituição de 'a' por '@': " + nomeSubstituido);
        
        // Divisão de String (Split)
        String[] partes = nomeCompleto.split(" ");
        System.out.println("Primeiro Nome: " + partes[0]);
        System.out.println("Último Nome: " + partes[1]);
        
        // Conversão para Maiúsculas
        String maiusculo = nomeCompleto.toUpperCase();
        System.out.println("Nome Completo em Maiúsculas: " + maiusculo);
        
        // Conversão para Minúsculas
        String minusculo = nomeCompleto.toLowerCase();
        System.out.println("Nome Completo em Minúsculas: " + minusculo);
        
        // Extração de Substring
        String primeiroNome = nomeCompleto.substring(0, 4); // Extrai "João"
        System.out.println("Primeiro Nome Extraído: " + primeiroNome);
        
        // Verificação de Conteúdo
        boolean contemSilva = nomeCompleto.contains("Silva");
        System.out.println("Nome Completo contém 'Silva'? " + contemSilva);
        
        // Remoção de Espaços em Branco
        String nomeEspacos = "  João Silva  ";
        String nomeSemEspacos = nomeEspacos.trim();
        System.out.println("Nome sem Espaços: '" + nomeSemEspacos + "'");
    }
}
