/*

Nome: Pedro Gonella Barao
Data: 24/09/2025
Objetvio: Implemente void troca(int *a, int *b) e demonstre em main com x=3 e y=5.

*/


#include <stdio.h>


void troca(int *a, int *b)
{

    int troca = *a;
    *a = *b;
    *b = troca;

}


int main(void)
{

    int x = 3;
    int y = 5;

    troca(&x, &y);

    printf("%d\n", x);
    printf("%d", y);
    
}