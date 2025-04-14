/*

    Autor: Pedro Gonella Barao
    Data: 06/04/2025
    Objetivo: Identificar se um numero e par ou impar
    
*/

#include <stdio.h>

int main()
{

    int numero;

    printf("\nOla, bem-vindo(a) ao identeificador de numeros\n");
    printf("Qual sera o numero identificado?: ");
    scanf("%d", &numero);

    if (numero % 2 ==0)
    {

        printf("\nO numero %d e par", numero);

    }
    else
    {

        printf("\nO numero %d e impar", numero);

    }

    return 0;

}