/*

    Autor: Pedro Gonell Barao
    Data: 20/05/2025
    Objetivo: Somar todos os numeros maiores que a media
    
*/

#include <stdio.h>

int main()
{

    int num[10];
    int soma_num=0;
    int i;
    float media=0;


    for (i = 0; i < 10; i++)
    {

        printf("\n\nQuanto vale o valor de %d?: ", i+1);
        scanf("%d", &num[i]);
        media += num[i];

    }

    media = media/i;

    for (i = 0; i < 10; i++)
    {

        if (num[i] > media)
        {

            soma_num += num[i];

        }

        printf("\nO valor de %d e = %d", i+1, num[i]);

    }

    printf("\n\nA media e = %.2f", media);
    printf("\nA soma dos numeros maiores que a media e = %d", soma_num);

    return 0;

}