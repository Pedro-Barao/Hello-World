/*

Nome: Pedro Gonella Barao
Data: 24/09/2025
Objetivo:Escreva void preenche(int *v, int n) que armazena v[i]=2*i para 
    i=0..n-1 usando apenas aritmética de ponteiros. Demonstre imprimindo o vetor.

*/

#include <stdio.h>


void preenche(int *v, int x)
{

    int *fim = v + x;

    for(int *p = v; p < fim; p++)
    {

        *p = 2 * (p - v);
  
    }

}

int main(void)
{

    int n[5];
    int *v = n;

    preenche(v, 5);


    for(int i = 0; i < 5; i++)
    {

        printf("\n%d\n", *v);
        v++;

    }

}