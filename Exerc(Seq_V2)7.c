/*

    Autor: Pedro Gonella Barao
    Data: 25/03/2025
    Objetivo: Salario de um vendedor

*/


#include <stdio.h>

int main()
{
    int numero_vendedor;
    char nome[50];
    float salario_fixo;
    int produtos_vendidos;
    float porcentagem_das_vendas;
    float salario_total;
    float preco_do_produto;

    printf("\nBem-vindo(a) ao site da empresa generica!\n");
    printf("Para te identificarmos precisamos de seus dados.\n");
    printf("\nPrimeiramente, qual o seu nome?: ");
    fflush(stdin);
    fgets(nome, 50, stdin);
    printf("\nAgora qual seu numero de identificacao?: ");
    scanf("%d", &numero_vendedor);
    printf("\nOla senhor(a) %s", nome);
    printf("Vamos calcular seu salario para voce em um instante\n");
    printf("Qual o seu salario fixo?: ");
    scanf("%f", &salario_fixo);
    printf("Quantos produtos voce vendeu este mes?: ");
    scanf("%d", &produtos_vendidos);
    printf("Qual sua porcentagem de lucro sobre seus produtos vendidos?(em decimal): ");
    scanf("%f", &porcentagem_das_vendas);
    printf("Quanto custa cada produto?: ");
    scanf("%f", &preco_do_produto);


    salario_total = salario_fixo + (produtos_vendidos * (preco_do_produto  * porcentagem_das_vendas));


    printf("\nOla senhor(a) %s", nome);
    printf("\nCom seu codigo %d.", numero_vendedor);
    printf("\nSeu salario final e de = %.2f", salario_total);

    return 0;


}
