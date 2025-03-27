/******************************************************************************

    Autor: Pedro Gonella Barao
    Data: 26/03/2025
    Objetivo: Calcular salario e comissao de carros

*******************************************************************************/

#include <stdio.h>

int main()
{

    float salario_fixo;
    float comissao;
    int carros_vendidos;
    float salario_final;
    float preco_do_carro;
    
    
    printf("\nBem-vindo(a) calculadora de salario e comissao da empresa generica\n");
    printf("Primeiro nos diga qual o seu salario fixo?: ");
    scanf("%f", &salario_fixo);
    printf("Agora quantos carros voce vendeu este mes?: ");
    scanf("%d", &carros_vendidos);
    printf("Quanto custa cada carro?: ");
    scanf("%f", &preco_do_carro);
    printf("Por fim precisamos da comissao que o senhor(a) recebe por venda(em decimal): ");
    scanf("%f", &comissao);



    comissao = preco_do_carro * 0.05;
    salario_final = (carros_vendidos * comissao) + salario_fixo;


    printf("\nOla senhor(a) funcionario, seu salario fixo e de = %.2f\n", salario_fixo);
    printf("E o seu salario final deste mes sera de = %.2f", salario_final);

    return 0;
}