/*

Nome: Pedro Gonella Barao
Data: 24/09/2025
Objetivo: Complete um programa que aloque dinamicamente um vetor de 40 int, 
    grave em cada posição seu próprio índice (0..39), imprima tudo, verifique falha de alocação e libere a memória.

*/


#include <stdio.h>
#include <stdlib.h>


int main(void)
{

    int numero[40];
    int *n = numero;


    for(int i = 0; i < 40; i++)
    {

        *n = i;
        printf("%d\n", *n);

    }

    free(n);

}