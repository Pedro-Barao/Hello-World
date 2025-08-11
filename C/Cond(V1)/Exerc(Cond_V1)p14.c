/*

    Autor: Pedro Gonella Barao
    Data: 07/04/2025
    Objetivo: Calcular a gratificacao para os funcionarios
    
*/

#include <stdio.h>

int main()
{

    int horas_faltadas;
    int horas_extras;

    printf("\nOla funcionario, bem-vindo(a) a calculadora de gratificacao de natal\n");
    printf("Quantas horas voce trabalhou extras?: ");
    scanf("%d", &horas_extras);
    printf("Quantas horas voce faltou?: ");
    scanf("%d", &horas_faltadas);
    
    if (horas_extras - horas_faltadas < 10)
    {

        printf("\nVoce recebera um total de 20 reais de gratificacao");

    }
    else if (horas_extras - horas_faltadas < 20)
    {

        printf("\nVoce recebera um total de 40 reais de gratificacao");   

    }
    else if (horas_extras - horas_faltadas < 30)
    {

        printf("\nVoce recebera um total de 60 reais de gratificacao");

    }
    else if (horas_extras - horas_faltadas < 40)
    {

        printf("\nVoce recebera um total de 80 reais de gratificacao");

    }
    else if (horas_extras - horas_faltadas >= 40)
    {

        printf("\nVoce recebera um total de 100 reais de gratificacao");
    
    }

    return 0;
}