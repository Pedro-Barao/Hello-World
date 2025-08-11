/*

    Autor: Pedro Gonella Barao
    Data: 01/06/2025
    Objetivo: Um parametro de soma de um numero inteiro e positivo com funcoes
    
*/

#include <stdio.h>


int Soma(int num)
{

    int i;

    for (i = 0; i < num; i--)
    {

        printf("%d + ", i);

    }

    return num;
}


int main()
{


    int num;
    int i;

    printf("Qual numero voce deseja testar?: ");
    scanf("%d", &num);

    Soma(num);


    return 0;
}