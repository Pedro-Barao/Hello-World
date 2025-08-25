/*

Autor: Pedro Gonella Barao
Data: 22/08/2025
Objetivo: Uma funcao que retorna em 2 outras funcoes, uma os valores pares e a outra os valores impares

*/


#include "funcao_basica.h"


void ParImpar(int *a, int *b, int *c)
{

    //Variaveis da funcao

    int aumento_de_a = 0, aumento_de_b = 0;


    //Colocando os valores em a e b

    for (int i = 0; i < 30; i++)
    {


        if (c[i] % 2 == 0)
        {

            a[aumento_de_a] = c[i];
            aumento_de_a++;

        }

        else
        {

            b[aumento_de_b] = c[i];
            aumento_de_b++;

        }

    }


    //Preenchendo os demais valores

    for(aumento_de_a; aumento_de_a < 30; aumento_de_a++)
    {

        a[aumento_de_a] = 0;

    }

    for(aumento_de_b; aumento_de_b < 30; aumento_de_b++)
    {

        b[aumento_de_b] = 0;

    }

}


int main(void)
{

    //Variaveis

    int C[30], A[30], B[30], separador_A = 4, separador_B = 4;


    //Tela inicial do usuario

    Tela();

    gotoxy(34, 5);
    printf("Ola usuario!");


    gotoxy(5, 8);
    printf("Preencha os valores de C e mostraremos os valores entre pares e impares:");


    //Recebendo os valores de C

    for(int i = 0; i < 30; i++)
    {

        if (i < 10)
        {

            gotoxy(7, i + 12);
            printf("Valor de C[%d]: ", i + 1);
            scanf("%d", &C[i]);

        }

        else if (i < 20)
        {

            gotoxy(32, i + 2);
            printf("Valor de C[%d]: ", i + 1);
            scanf("%d", &C[i]);

        }

        else
        {

            gotoxy(57, i - 8);
            printf("Valor de C[%d]: ", i + 1);
            scanf("%d", &C[i]);

        }

    }


    //Mandando os valores para a funcao

    ParImpar(A, B, C);


    //Reestabelecendo a tela

    system("cls");

    Tela();


    gotoxy(3, 8);
    printf("Preencha os valores de C e mostra remos os valores entre pares e impares:");


    gotoxy(3, 14);
    printf("O os valores pares sao: ");


    gotoxy(3, 18);
    printf("O os valores pares sao: ");


    //Mostrando os resultados

    for(int i = 0; i < 30; i++)
    {

        if(A[i] != 0)
        {

            if(separador_A < 40)
            {

                gotoxy(24 + separador_A, 13);
                printf("%d, ", A[i]);
                separador_A = separador_A + 4;

            }

            else
            {

                gotoxy(24 + (separador_A - 36), 15);
                printf("%d, ", A[i]);
                separador_A = separador_A + 4;

            }

        }

        if(B[i] != 0)
        {

            if (separador_B < 40)
            {

                gotoxy(24 + separador_B, 18);
                printf("%d, ", B[i]);
                separador_B = separador_B + 4;

            }

            else
            {

                gotoxy(24 + (separador_B - 36), 20);
                printf("%d, ", B[i]);
                separador_B = separador_B + 4;

            }
            
        }

    }


    gotoxy(18, 23);
    system("pause");
    
}