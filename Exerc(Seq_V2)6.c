/*

    Autor: Pedro Gonella Barao
    Data: 25/03/2025
    Objetivo: Calcular salario bruto de um trabalhador

*/

#include <stdio.h>

int main()
{

    float salario_bruto;
    int horas_trabalhadas;
    float valor_hora_trabalhada;
    int dependentes;
    int menores14;

    printf("\nBem-vindo(a) a calculadora salarial\n");
    printf("Quantas horas voce trabalha por mes?: ");
    scanf("%d", &horas_trabalhadas);
    printf("Quanto voce ganha por hora trabalhada?: ");
    scanf("%f", &valor_hora_trabalhada);
    printf("Quantos dependetes voce tem?: ");
    scanf("%d", &dependentes);

    if (dependentes > 0)
    {
        printf("\nVoce possui %d depenedentes \n", dependentes);
        printf("Quantos dependentes sao menores que 14 anos?...");
        scanf("%d", &menores14);
        salario_bruto = (menores14*13.48)+(horas_trabalhadas*valor_hora_trabalhada);

    }
    else
    {
        printf("\nVoce nao possui depenedentes\n");
        salario_bruto = horas_trabalhadas * valor_hora_trabalhada;
    }

    printf("\n============================================\n");
    printf("Seu salario bruto e de.....%.2f", salario_bruto);
    return 0;
}
