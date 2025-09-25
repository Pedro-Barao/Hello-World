/*

Nome: Pedro Gonella Barao
Data: 24/09/2025
Objetivo: 
    a) O que sai na primeira linha?
    b) Qual a relação entre os dois endereços impressos nas últimas linhas?
    c) Em uma frase, defina o que é *p e o que é &x.

*/

#include <stdio.h>

int main(void)
{


    int x = 10;
    int *p = &x;

    //a)Imprime 10
    printf("%d\n", *p);

    //b)Ambos imprime o local na memória onde esta armazenado o valor inteiro
    printf("%p\n", p);
    printf("%p\n", &x);

    //c)*p = e um ponteiro que aponta para o local de armazenamento do x (ou seja &x)
    //c)&x = e o local de onde esta sendo armazenado o valor

    free(p);
    
}