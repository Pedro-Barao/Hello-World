/*

    Autor: Pedro Gonella Barao
    Data: 20/05/2025
    Objetivo: Encontrar o menor e o maior numero
    
*/

#include <stdio.h>

int main()
{

    int num[10];
    int i;
    int maior_num=0;
    int menor_num=99999;

    for (i = 0; i < 10; i++)
    {

        printf("\n\nQuanto vale o numero %d?: ", i+1);
        scanf("%d", &num[i]);

        if (num[i] > maior_num)
        {

            maior_num = num[i];

        }

        if (num[i] < menor_num)
        {

            menor_num = num[i];
            
        }

    }

    printf("\n\n");

    for (i = 0; i < 10; i++)
    {

        printf("\nO valor do numero %d e igual a = %d", i+1, num[i]);

    }

    printf("\n\nO menor numero e = %d", menor_num);
    printf("\n\nO maior numero e = %d", maior_num);

    return 0;
}