/*

Nome: Pedro Gonella Barao
Data: 24/09/2025
Objetivo: Analise:

    int *p;
    *p = 3;


    a) Qual é o problema?
    b) Mostre duas correções: (i) fazer p apontar para uma variável existente; (ii) alocar memória dinamicamente.

*/


#include <stdio.h>


int main(void)
{

    //a)O erro envolve o fato de que ponteiros apenas apontam para pontos de memoria e nao valores
    int *p;
    *p = 3;

    //b)

    int n;
    *p = n;


    *p = (int*) malloc (sizeof(int));

}