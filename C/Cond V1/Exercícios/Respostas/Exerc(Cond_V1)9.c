/*

    Autor: Pedro Gonella Barao
    Data: 06/04/2025
    Objetivo: Identificador e classificador de numeros
    
*/

#include <stdio.h>

int main()
{

    int numero;

    printf("\nBem-vindo(s) ao identificador e clssificador de numeros\n");
    printf("Quanto vale o numero?: ");
    scanf("%d", &numero);

    if (numero % 2 ==0)
    {

        printf("\nO numero %d e par", numero);

    }
    else
    {

        printf("\nO numero %d e impar", numero);

    }
    

    if (numero % 3 ==0)
    {

        printf("\nO numero %d e multiplo de 3", numero);

    }


    if (numero % 5 ==0)
    {

        printf("\nO numero %d e multiplo de 5", numero);

    }
    

    if (numero % 7 ==0)
    {

        printf("\nO numero %d e multiplo de 7", numero);

    }

    return 0;

}