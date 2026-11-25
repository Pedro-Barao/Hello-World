/*

Autor: Pedro Gonella Barao
Data: 22/08/2025
Objetivo: Uma funcao que retorna em 2 outras funcoes, uma os valores pares e a outra os valores impares

*/


#include "funcao_basica.h"


void Par(int *c, int numero_de_pares, int *numeros)
{

    //Colocando os valores em c

    for (int i = 0; i < 15; i++)
    {

        if (c[i] % 2 == 0)
        {

            *numeros += 1;

        }

    }

}


int main(void)
{

    //Variaveis

    int C[15], numero_de_pares = 0, *numeros;

    numeros = &numero_de_pares;


    //Tela inicial do usuario

    Tela();

    gotoxy(34, 5);
    printf("Ola usuario!");


    gotoxy(7, 8);
    printf("Preencha os valores de C e mostraremos quantos valores sao pares:");


    //Recebendo os valores de C

    for(int i = 0; i < 15; i++)
    {

        if (i < 10)
        {

            gotoxy(7, i + 12);
            printf("Valor de C[%d]: ", i + 1);
            scanf("%d", &C[i]);

        }

        else
        {

            gotoxy(32, i + 2);
            printf("Valor de C[%d]: ", i + 1);
            scanf("%d", &C[i]);

        }

    }


    //Mandando os valores para a funcao

    Par(C, numero_de_pares, numeros);


    //Mostrando os resultados

    gotoxy(32, 20);
    printf("C tem um total de %d pares", *numeros);


    gotoxy(18, 23);
    system("pause");
    
}