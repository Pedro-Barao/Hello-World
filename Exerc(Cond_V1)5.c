/*

    Autor: Pedro Gonella Barao
    Data: 03/04/2025
    Objetivo: Registrar e imprimir o menor e o maior numero

*/

#include <stdio.h>

int main()
{

    int numero1;
    int numero2;
    int numero3;

    printf("\nOla, seja bem-vindo(a) ao comparador de numeros\n");
    printf("Quanto vale o primeiro numero?: ");
    scanf("%d", &numero1);
    printf("Quanto vale o segundo numero?: ");
    scanf("%d", &numero2);
    printf("Quanto vale o terceiro numero?: ");
    scanf("%d", &numero3);

    if (numero1 > numero2 && numero1 > numero3)
    {

        printf("\nO numero %d e o maior\n", numero1);

    }
    else if (numero2 > numero1 && numero2 > numero3)
    {

        printf("\nO numero %d e o maior\n", numero2);

    }
    else
    {

        printf("\nO numero %d e o maior\n", numero3);

    }

    if (numero1 < numero2 && numero1 < numero3)
    {

        printf("Enquanto o numero %d e o menor", numero1);

    }
    else if (numero2 < numero1 && numero2 < numero3)
    {

        printf("Enquanto o numero %d e o menor", numero2);

    }
    else
    {

        printf("Enquanto o numero %d e o menor", numero3);
        
    }

    return 0;


}