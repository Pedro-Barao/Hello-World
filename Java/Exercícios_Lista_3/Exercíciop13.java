/*

Autor: Pedro Gonella Barao
Data: 28/08/2025
Objetivo: Ver o erro de tentar chamar atributos privados

 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Exercíciop13 extends Produto11_12_13 {
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        Produto11_12_13 Usuario = new Produto11_12_13();
        int opcao, quantidade, codigo;
        float preco;
        String nome;
        
        
        System.out.println("\nOla usuario! Digite o nome do seu produto:");
        nome = scanner.nextLine();
        
        System.out.println("\nAgora o preco dele:");
        preco = scanner.nextFloat();
        
        System.out.println("\nPor fim a a quantidade:");
        quantidade = scanner.nextInt();
        
        System.out.println("\nQual o codigo do seu produto?");
        codigo = scanner.nextInt();
        
        
        Usuario.setNome(nome);
        Usuario.setPreco(preco);
        Usuario.setQuantidade(quantidade);
        Usuario.setCodigo(codigo);
        
        
        do
        {

            System.out.println("\nO que voce deseja modificar no estoque desse produto?:\n1-Aumentar estoque\n2-Diminuir estoque\n3-Mostrar produto\n4-Fechar o Sistema");
            opcao = scanner.nextInt();
        
        
            switch (opcao)
            {
            
                case 1:
                
                    quantidade = Usuario.AumentarEstoque(quantidade);
                    
                    break;

            
                case 2:
                
                    quantidade = Usuario.DiminuirEstoque(quantidade);
                    
                    break;
                
                case 3:
                
                    Usuario.MostrarProduto(nome, quantidade, preco);
                    
                    break;
                
                
            } 
            
        }while (opcao != 4);
        
    }
    
}
