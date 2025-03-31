/*

    Autor: Pedro Gonella Barao
    Data: 18/03/2025
    Objetivo: Mudanca do salario bruto

*/

#include <stdio.h>

int main()
{
    char nome[50];
    char cargo[50];
    int idade;
    float salario_bruto;
    float novo_salario_bruto;
    float gratificacao;
    float desconto;
    float salario_final;
    

    printf("\nOla! seja bem-indo ao site da (empresa generica)\n");
    printf("Precisamos que voce nos forneca algumas informacoes para identifica-lo(a)\n\n");
    printf("Qual o seu nome?: ");
    fflush(stdin);
    fgets(nome, 50, stdin);
    printf("Qual o seu cargo?: ");
    fflush(stdin);
    fgets(cargo, 50, stdin);
    printf("Qual a sua idade?: ");
    scanf("%d", &idade);
    printf("Ola senhor(a) %s\n", nome);
    printf("Informe seu salario para fazermos a alteracao dele: \n");
    scanf("%f", &salario_bruto);

    novo_salario_bruto = salario_bruto + (salario_bruto * 38/100);
    gratificacao = salario_bruto * 20/100;
    desconto = salario_bruto * 15/100;
    salario_final = novo_salario_bruto + gratificacao - desconto;

    printf("Seu novo salario sera de = %.2f\n", novo_salario_bruto);
    printf("Sua gratificacao pelo seu trabalho arduo sera de = %.2f\n", gratificacao);
    printf("Seu desconto de imposotos sera de = %.2f\n\n", desconto);

    printf("Logo senhor(a) %s, do cargo de %s, com seus %d anos\n", nome, cargo, idade);
    printf("Informamos que seu salario liquido final sera de = %.2f", salario_final);


    return 0;
}
