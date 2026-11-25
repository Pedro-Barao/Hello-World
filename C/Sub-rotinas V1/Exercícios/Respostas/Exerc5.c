/*

Autor: Pedro Gonella Barao
Data: 19/08/2025
Objetivo: Fazer 2 vetores e retornar um sendo o fatorial do outro

*/

#include "funcao_basica.h"

void FatoriaisDeA(int *a, int *b)
{

    //Transformando os valores de A em fatoriais em B
    
    for (int i = 0; i <= 10; i++)
    {

        int fatorial = 1;

       for (int j = 0; j < a[i]; j++)
       {

            fatorial *= (a[i] - j);

       }

       b[i] = fatorial;

    }
    
}


int main(void)
{

    //Variaveis

    int A[10];
    int B[10];


    //Apresentacao ao usuario

    Tela();

    gotoxy(34, 5);
    printf("Ola usuario!");


    gotoxy(14, 7);
    printf("Forneca os valores de A para mostrarmos seus fatoriais:");


    //Recebendo os valores de A

    for(int i = 0; i < 10; i++)
    {

        gotoxy(5, i + 10);
        printf("Qual o valor de A [%d]?: ", i + 1);
        scanf("%d", &A[i]);

    }


    //Chamando a funcao fatoriais de A

    FatoriaisDeA(A, B);


    //Imprimindo B

    for(int i = 0; i < 10; i++)
    {

        gotoxy(40, i + 10);
        printf("O valor de B [%d] e: %d", i + 1, B[i]);

    }


    gotoxy(18, 23);
    system("pause");


}