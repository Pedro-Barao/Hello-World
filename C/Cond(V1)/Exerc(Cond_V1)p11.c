/*

    Autor: Pedro Gonlla Barao
    Data: 06/04/2025
    Objetivo: Calculadora de salario de trabalhador com horas adicionais
    
*/

#include <stdio.h>

int main()
{

    char nome[50];
    int horas_extras_tempo;
    float salario_por_hora;
    float salario_por_hora_extra;
    char hora_extra;

    printf("\nBem-vindo(a) trabalhador(a), vamos calcular seu salario final?\n");
    printf("Primeiramente informe seu nome: ");
    fflush(stdin);
    fgets(nome, 50, stdin);
    printf("Quanto voce ganha por hora?: ");
    scanf("%f", &salario_por_hora);
    printf("Voce trabalhou horas extras este mes?(S ou N): ");
    scanf("%s", &hora_extra);

    if (hora_extra == 'S' || hora_extra == 's')
    {

        printf("\nQuantas horas extras voce trabalhou este mes?: ");
        scanf("%d", &horas_extras_tempo);
        salario_por_hora_extra = (salario_por_hora * 40) + (0.5 * (salario_por_hora * horas_extras_tempo));

    }
    else
    {

        printf("\nVoce nao trabalhou horas extras este mes");
        salario_por_hora_extra = (salario_por_hora * 40);

    }

    printf("\nTrabalhador(a) %s", nome);
    printf("Seu salario sera de %.2f reais", salario_por_hora_extra);

    return 0;
}