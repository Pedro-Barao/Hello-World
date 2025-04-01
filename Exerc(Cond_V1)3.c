/**************************************
    Autor: Pedro Gonella Barao
    Data: 01/04/2025
    Objetivo: Ler variaveis A e B, calculando Y
***************************************/
#include <stdio.h>


int main()
{
    float A;
    float B;
    float Y;

    printf("\nDigite o valor de A: ");
    scanf("%f", &A);
    printf("Digite o valor de B: ");
    scanf("%f", &B);

    if (A < B)
    {

        Y = B - A;
        printf("\nO resultado da conta Y=B-A sera igual a = %.2f", Y);

    }
    else if (B < A)
    {

        Y = A - B;
        printf("\nO resultado da conta Y=A-B sera igual a = %.2f", Y);

    }
    else
    {

        Y = A + B;
        printf("\nO resultado da conta Y=A+B sera igual a = %.2f", Y);

    }

    printf("\nOs valores de A, B e Y sao respectivamente %.2f, %.2f e %.2f", A, B, Y);

    return 0;
}
