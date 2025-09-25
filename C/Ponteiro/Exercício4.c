/*

Nome: Pedro Gonella Barao
Data: 24/09/2025
Objetivo: Dado int v[5]={1,2,3,4,5}; int *p=v;
    a) Escreva um laço que some todos os elementos usando apenas aritmética de ponteiros (sem índices).
    b) Qual é o valor de *(p+3)? Justifique.

*/


#include <stdio.h>


int main(void)
{

    int v[5] = {1, 2, 3, 4, 5};

    //a)O *p ta apontando para o primeiro valor (v[0]), ou seja *p = 1
    int *p = v;

    //b)O *p vale 4, porque ele vai de v[0] para v[3] (v[3] = 4)
    printf("\n%d\n\n", *(p+3));


    for(int i = 0; i < 5; i++)
    {

        printf("%d\n", *p);
        *p++;

    }

}