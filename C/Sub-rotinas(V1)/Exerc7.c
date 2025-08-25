/*

Autor: Pedro Gonella Barapo
Data: 21/08/2025
Objetivo: Fazer uma funcao que retorna o vetor união entre 2 vetores

*/


#include "funcao_basica.h"


void VetorUniao(int *a, int *b, int *c)
{

    int troca;

    for (int i = 0; i < 20; i++)
    {

        if (i < 10)
        {

            c[i] = a[i];

        }

        else
        {

            c[i] = b[i - 10];

        }

    }

    for (int i = 0; i < 20; i++)
    {

        for (int j = 0; j < 20; j++)
        {

            if (c[i] < c[j])
            {

                troca = c[i];
                c[i] = c[j];
                c[j] = troca;

            }

        }
    }

}

int main(void)
{

    //Variaveis

    int A[10];
    int B[10];
    int C[20];

    //Apresentacao para o usuario

    Tela();


    gotoxy(34, 5);
    printf("Ola usuario!");

    gotoxy(7, 8);
    printf("preencha os valores dos vetores a seguir para mostrarmos sua uniao:");


    //Recebendo os valores de A e B

    for(int i = 0; i < 10; i++)
    {

        gotoxy(11, i + 14);
        printf("Valor de A [%d]: ", i + 1);
        scanf("%d", &A[i]);


        gotoxy(51, i + 14);
        printf("Valor de B [%d]: ", i + 1);
        scanf("%d", &B[i]);

    }


    //Chamando o vetor

    VetorUniao(A, B, C);


    //Trazendo o resultado final

    system("cls");

    Tela();

    gotoxy(7, 5);
    printf("preencha os valores dos vetores a seguir para mostrarmos sua uniao:");


    for (int i = 0; i < 20; i++)
    {

        if (i < 10)
        {

            gotoxy(11, i + 10);
            printf("Valor de C [%d]: %d", i + 1, C[i]);

        }

        else
        {

            gotoxy(51, i);
            printf("Valor de C [%d]: %d", i + 1, C[i]);
        
        }

    }

    gotoxy(18, 23);
    system("pause");

}