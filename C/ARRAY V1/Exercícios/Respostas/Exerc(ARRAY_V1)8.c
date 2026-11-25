/*

    Autor: Pedro Gonella Barao
    Data: 21/05/2025
    Objetivo: Classificacao de notas
    
*/

#include <stdio.h>

int main()
{

    int notas[10];
    int i;
    float media=0;

    for (i = 0; i < 10; i++)
    {

        printf("\n\nQuanto o aluno %d tirou na prova?: ", i+1);
        scanf("%d", &notas[i]);
        media += notas[i];

    }

    media = media/i;
    printf("\n\n");
    printf("A media geral foi de = %.2f", media);

    for (i = 0; i < 10; i++)
    {

        if (notas[i] > media)
        {

            printf("\n\nA nota do aluno %d foi maior que a media\n", i+1);
            printf("Ele tirou uma nota de = %d", notas[i]);

        }
        else
        {

            printf("\n\nA nota do aluno %d foi menor que a media\n", i+1);
            printf("Ele tirou uma nota de = %d", notas[i]);
            
        }

    }

    return 0;
}