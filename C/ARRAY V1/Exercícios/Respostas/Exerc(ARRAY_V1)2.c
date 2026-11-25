/*

    Autor: Pedro Gonella Barao
    Data: 20/05/2025
    Objetivo: Quadrado dos elementos de um vetor
    
*/

#include <stdio.h>

int main()
{

    int A[15];
    int B[15];
    int i;

    for (i = 0; i < 15; i++)
    {

        printf("\n\nQual o valor de %dA?(B = A^2): ", i+1);
        scanf("%d", &A[i]);
        B[i] = A[i] * A[i];

    }

    printf("\n\n");

    for (i = 0; i < 15; i++)
    {

        printf("\nO valor de %dA e de = %d", i+1, A[i]);

    }

    printf("\n\n");

    for (i = 0; i < 15; i++)
    {

        printf("\nO valor de %dB e de = %d", i+1, B[i]);

    }
}