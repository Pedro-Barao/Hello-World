/*
    Autor: Pedro Gonella Barao  
    Data: 01/06/2025  
    Objetivo: Separar elementos pares e ímpares de um vetor X em dois vetores A (pares) e B (ímpares)  
*/

#include <stdio.h>

void SepararParesImpares(int X[], int A[], int B[], int *tamA, int *tamB)
{
    int i;
    *tamA = 0;
    *tamB = 0;

    for (i = 0; i < 30; i++)
    {
        if (X[i] % 2 == 0)
        {
            A[*tamA] = X[i];
            (*tamA)++;
        }
        else
        {
            B[*tamB] = X[i];
            (*tamB)++;
        }
    }
}

int main()
{
    int X[30], A[30], B[30];
    int i, tamA, tamB;

    printf("Digite os 30 valores do vetor X:\n");
    for (i = 0; i < 30; i++)
    {
        scanf("%d", &X[i]);
    }

    SepararParesImpares(X, A, B, &tamA, &tamB);

    printf("\nVetor A (pares): ");
    for (i = 0; i < tamA; i++)
    {
        printf("%d ", A[i]);
    }

    printf("\nVetor B (ímpares): ");
    for (i = 0; i < tamB; i++)
    {
        printf("%d ", B[i]);
    }

    return 0;
}
