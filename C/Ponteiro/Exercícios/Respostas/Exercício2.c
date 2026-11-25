/*

Nome: Pedro Gonella Barao
Data: 24/09/2025
Objetivo: Implemente void zera(int *n) que recebe o endereço de um inteiro e altera seu 
    conteúdo para zero. Mostre um main mínimo provando o funcionamento.

*/


#include <stdio.h>


void zera(int *n)
{

    *n = 0;

}

int main(void)
{

    int numero = 10;
    int *n = &numero;

    zera(n);

    printf("%d", numero);

    free(n);

}