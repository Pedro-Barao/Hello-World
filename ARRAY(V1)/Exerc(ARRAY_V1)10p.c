/*

    Autor: Pedro Gonella Barao
    Data: 21/05/2025
    Objetivo: transposicao de uma matriz
    
*/

#include <stdio.h>

int main()
{

    int matriz[2][3];
    int matriz_transposta[3][2];
    int i;
    int j;


    for (i = 0; i < 2; i++)
    {

        for (j = 0; j < 3; j++)
        {

            printf("\n\nQual o valor do espaco %d, %d?: ", i+1, j+1);
            scanf("%d", &matriz[i][j]);
            matriz_transposta[j][i] = matriz[i][j];

        }
    }


    for (i = 0; i < 2; i++)
    {

        printf("\n------------------------\n");

        for (j = 0; j < 3; j++)
        {

            printf("| %4d |", matriz[i][j]);

        }

    }

    printf("\n------------------------");
    printf("\n\n");

    for (j = 0; j < 3; j++)
    {

        printf("\n----------------\n");

        for (i = 0; i < 2; i++)
        {

            printf("| %4d |", matriz_transposta[j][i]);

        }
        
    }

    printf("\n----------------");

    return 0;
}