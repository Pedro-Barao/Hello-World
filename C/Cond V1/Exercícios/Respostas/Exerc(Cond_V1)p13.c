/*

    Autor: Pedro Gonella Barao
    Data: 07/04/2025
    Objetivo: Calcular diferenca de horario de jogos
    
*/

#include <stdio.h>

int main()
{

    int horas_finais;
    int horas_iniciais;
    int horas_de_jogo;

    printf("\nOla, seja bem-vindo(a) ao calculador de horas de jogos\n");
    printf("Que horas o jogo comecou?: ");
    scanf("%d", &horas_iniciais);
    printf("Que horas o jogo terminou?: ");
    scanf("%d", &horas_finais);

    if (horas_finais - horas_iniciais > 0)
    {

        horas_de_jogo = horas_finais - horas_iniciais;
        printf("\nO jogo teve %d hora(s) de duracao", horas_de_jogo);

    }
    else if (horas_finais - horas_iniciais < 0)
    {

        horas_de_jogo = horas_iniciais + horas_finais;
        printf("\nO jogo teve %d horas de duracao", horas_de_jogo);

    }
    else
    {

        printf("\nO jogo teve 24 horas de duracao");

    }

    return 0;
}