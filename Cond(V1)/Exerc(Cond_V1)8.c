/*

    Autor: Pedro Gonella Barao
    Data: 06/04/2025
    Objetivo: Calculadora de media (reprovado ou aprovado)
    
*/

#include <stdio.h>


int main()
{

    float numero1;
    float numero2;
    float numero3;
    float numero4;
    float media;


    printf("\nOla, seja bem-vindo(a) a calculadora de media de reprovacao ou aprovacao\n");
    printf("Quanto voce tirou na primeira nota?: ");
    scanf("%f", &numero1);
    printf("Quanto voce tirou na segunda nota?: ");
    scanf("%f", &numero2);
    printf("Quanto voce tirou na teceira nota?: ");
    scanf("%f", &numero3);
    printf("Quanto voce tirou na quarta nota?: ");
    scanf("%f", &numero4);

    media = (numero1 + numero2 + numero3 + numero4) / 4;

    if (media >= 7)
    {

        printf("\nEstamos felizes em dizer que com uma media de %.2f voce sera aprovado!", media);

    }
    else
    {

        printf("\nLamentamos em dizer que com uma media de %.2f voce sera reprovado", media);

    }

    return 0;
}