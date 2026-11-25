/*

    Autor: Pedro Gonella Barao
    Data: 20/05/2025
    Objetivo: Imprimir numeros em ordem inversa

*/


#include <stdio.h>

int main()
{

    int num[10];
    int i;

    for (i = 0; i < 10; i++)
    {

        printf("\n\nQuanto vale o numero %d?: ", i+1);
        scanf("%d", &num[i]);

    }

    printf("\n\n");

    for (i = 9; i > -1; i--)
    {

        printf("O valor do numero %d e = %d\n", i+1, num[i]);

    }

    return 0;

}