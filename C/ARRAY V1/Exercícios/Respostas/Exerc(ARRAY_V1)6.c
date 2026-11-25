/*

    Autor: Pedro Gonella Barao
    Data: 20/05/2025
    Objetivo: Conversão de temperaturas
    
*/

#include <stdio.h>

int main()
{

    float A[25];
    float B[25];
    int i;

    for (i = 0; i < 25; i++)
    {

        printf("\n\nQual o valor da temperatura %d?(em celsius): ", i+1);
        scanf("%f", &A[i]);

        B[i] = 9 / 5 * A[i] + 32;

    }

    for (i = 0; i < 25; i++)
    {

        printf("\nO valor da temperatura %d em Celcius e de = %.2f", i+1, A[i]);
        printf("\nO valor da temperatura %d em Fahrenheit e de = %.2f\n", i+1, B[i]);

    }
}