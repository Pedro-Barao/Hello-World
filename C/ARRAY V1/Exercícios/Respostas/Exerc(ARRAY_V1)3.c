/*

    Autor: Pedro Gonella Barao
    DAta: 20/05/2025
    Objetivo: Media aritmetica de numeros positivos e negativos
    
*/


#include <stdio.h>

int main()
{

    int num[20];
    int i;
    int contador_positivo=0;
    int contador_negativo=0;
    int soma_positivo=0;
    int soma_negativo=0;

    for (i = 0; i < 20; i++)
    {

        printf("\n\nQual o valor do numero %d?: ", i+1);
        scanf("%d", &num[i]);

        if (num[i] > 0)
        {

            soma_positivo += num[i];
            contador_positivo++;

        }
        else
        {

            soma_negativo += num[i];
            contador_negativo++;

        }

    }

    printf("\n\n");

    for (i = 0; i < 20; i++)
    {

        printf("\nO valor do numero %d e = %d", i+1, num[i]);

    }

    printf("\n\n");

    printf("A media aritmetica dos numeros positivos e igual a %d", soma_positivo/contador_positivo);
    printf("\nA media aritmetica dos numeros negativos e igual a %d", soma_negativo/contador_negativo);

}