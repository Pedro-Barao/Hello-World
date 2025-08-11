/*

    Autor: Pedro Gonella Barao
    Data: 20/05/2025
    Objetivo: Inverter um vetor
    
*/

#include <stdio.h>

int main()
{

    int num[8];
    int i;

    for (i = 0; i < 8; i++)
    {

        printf("\n\nQual o valor do numero %d?: ", i+1);
        scanf("%d", &num[i]);

    }

    for (i = 7; i > -1; i--)
    {

        printf("\nO valor do numero %d = %d", i+1, num[i]);

    }

    return 0;

}