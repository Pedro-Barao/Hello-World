/*

    Autor: Pedro Gonell Barao
    Data: 10/04/2025
    Objetivo: Registrar a altura e o numero de alunos imprimindo-os em ordem
    
*/

#include <stdio.h>


int main()
{

    int i;
    int idade[5];


    for( i = 0; i < 5; i++)
    {

        printf("digite a idade da pessoa %d: ", i+1);
        scanf("%d", &idade[i]);

    }

    printf("\n%d", idade[1]);


    return 0;
}