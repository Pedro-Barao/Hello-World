/*

Autor: Pedro Gonella Barao
Data: 18/08/2025
Objetivo: Calcular a soma de 2 vetores

*/


#include "funcao_basica.h"

void soma_vetor(int *a, int *b, int *c)
{

    //Estrutura de repeticao para colocar os valores em C

    for(int i = 0; i < 20; i++)
    {

        c[i] = a[i] + b[i];

    }

}


int main(void)
{

    //Variaveis

    int A[20];
    int B[20];
    int C[20];


    //Configuracao baseica

    Tela();

    gotoxy(34, 5);
    printf("Ola usuario!");


    gotoxy(8, 7);
    printf("Precisamos de 20 valores das variaveis A e B para calcularmos a C:");


    //Recebendo valores para A e B

    for(int i = 0; i < 20; i++)
    {

        if (i < 14)
        {

            gotoxy(10, i + 10);
            printf("Quanto vale A %d?: ", i + 1);
            scanf("%d", &A[i]);

            gotoxy(50, i + 10);
            printf("Quanto vale B %d?: ", i + 1);
            scanf("%d", &B[i]);

        }

        else
        {

            gotoxy(10, i);
            printf("Quanto vale A %d?: ", i + 1);
            scanf("%d", &A[i]);

            gotoxy(50, i);
            printf("Quanto vale B %d?: ", i + 1);
            scanf("%d", &B[i]);

        }

        if(i == 13)
        {

            system("cls");
            Tela();


            gotoxy(8, 7);
            printf("Precisamos de 20 valores das variaveis A e B para calcularmos a C:");

        }

    }
    

    //Chamando a funcao

    soma_vetor(A, B, C);


    //Deixar a area apresentavel para o usuario

    system("cls");
    Tela();

    gotoxy(29, 7);
    printf("Os valores finais de C:");


    //Um For para retornar os valores de C para o usuario

    for(int i = 0; i < 20; i++)
    {

        if (i < 14)
        {

            gotoxy(10, i + 10);
            printf("%d + %d = %d", A[i], B[i], C[i]);
     
        }

        else
        {

            gotoxy(50, i - 4);
            printf("%d + %d = %d", A[i], B[i], C[i]);

        }

    }

    gotoxy(32, 22);
    system("pause");

}