/*

    Autor: Pedro Gonella Barao
    Data: 21/05/2025
    Objetivo: Soma das diagonais de uma matriz
    
*/

#include <stdio.h>

int main()
{

    int num[4][4];
    int i;
    int j;
    int soma_principal=0;
    int soma_secundaria=0;


    for (i = 0; i < 4; i++)
    {

        for (j = 0; j < 4; j++)
        {

            printf("\nQuanto vale o espaco %d, %d?: ", i+1, j+1);
            scanf("%d", &num[i][j]);

        }

        printf("\n");

    }

    for (i = 0; i < 4; i++)
    {

        soma_principal += num[i][i];

    }


    for (i = 0; i < 4; i++)
    {

        for (j = 0; j < 4; j++)
        {

            if (i + j == 3)
            {

                soma_secundaria += num[i][j];
            
            }
        }
        
    }

    printf("\nA soma de todos os numeros da diagonal principal e = %d", soma_principal);
    printf("\nA soma de todos os numeros da diagonal secundaria e = %d", soma_secundaria);

}