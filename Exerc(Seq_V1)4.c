/******************************************************************************

    Autor: Pedro Gonella Barao
    Data: 18/03/2025
    Objetivo: 

*******************************************************************************/

#include <stdio.h>

int main()
{
    char nome[50];
    int horas_trabalhadas;
    int dependentes;
    float salario_bruto;
    float salario_liquido;
    float INSS;
    float IR;
    
    printf("\nOla funcionario da (empresa generica)\n");
    printf("Queriamos que por gentiliza voce desse suas informacoes para que possamos calcular seu salario\n");
    printf("\nQual o seu nome?: ");
    scanf("%s", nome);
    printf("Quantas horas que voce trabalha?(por dia): ");
    scanf("%d", &horas_trabalhadas);
    printf("Quantos dependentes voce possui?: ");
    scanf("%d", &dependentes);
    
    salario_bruto = horas_trabalhadas* 12 * 20 + (dependentes*40);
    salario_liquido = salario_bruto - (salario_bruto*0.085) -(salario_bruto*0.05);
    INSS = salario_bruto*0.085;
    IR = salario_bruto*0.05;
    
    printf("\nAqui estao suas informacoes senhor(a) %s\n", nome);
    printf("Seu salario bruto e de = %.2f\n", salario_bruto);
    printf("Foram descontados  de INSS = %.2f\n", INSS);
    printf("Foram descontados de IR = %.2f\n", IR);
    printf("Seu salario liquido e de = %.2f", salario_liquido);
    
    return 0;
}
