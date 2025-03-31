/******************************************************************************

    Autor: Pedro Gonella Barao
    Data: 26/03/2025
    Objetivo: Registrar salario e funcionarios de uma empresa

*******************************************************************************/

#include <stdio.h>

int main()
{

    int aumento_para_funcionarios;
    int numero_do_funcionario;
    float salario_atual;
    float salario_final;
    float percentual_de_produtividade;
    int produtos_vendidos;
    float preco_produto;
    
    
    printf("\nBem-vindo(a) ao site da empresa generica\n");
    printf("Para identificarmos voce pedimos que nos forneca seu numero de trabalho\n");
    printf("Qual o seu numero de trabalho?: ");
    scanf("%d", &numero_do_funcionario);
    printf("Qual o seu salario?: ");
    scanf("%f", &salario_atual);
    printf("Qual seu indice de produtividade na empresa?(em decimal): ");
    scanf("%f", &percentual_de_produtividade);
    printf("Quantos produtos voce vendeu?: ");
    scanf("%d", &produtos_vendidos);
    printf("Quanto custa cada produto?: ");
    scanf("%f", &preco_produto);
    
    
    percentual_de_produtividade = (produtos_vendidos * preco_produto) * percentual_de_produtividade;
    aumento_para_funcionarios = (salario_atual * 0.08) + percentual_de_produtividade;
    salario_final = salario_atual + aumento_para_funcionarios;
    
    
    printf("\nOla funcionario com o codigo %d\n", numero_do_funcionario);
    printf("Estamos felizes de comentar sobre o aumento salarial\n");
    printf("Seu salario foi de %.2f para %.2f", salario_atual, salario_final);
    
    return 0;
}
