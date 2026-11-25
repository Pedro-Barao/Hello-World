/*

Autor: Pedro Gonella Barao
Data: 18/08/2025
Objetivo: Fazer 2 funcoes para receber um vetor de 50 valores e ver o maior e o menor numero

*/


#include "funcao_basica.h"


int MAIOR_VALOR(int *numeros)
{

    int maior_valor = 0;

    for (int i = 0; i < 50; i++)
    {

        if(maior_valor < numeros[i])
        {

            maior_valor = numeros[i];

        }

    }

    return maior_valor;

}


int MENOR_VALOR(int *numeros)
{

    int menor_valor = 9999999;

    for (int i = 0; i < 50; i++)
    {

        if(menor_valor > numeros[i])
        {

            menor_valor = numeros[i];

        }

    }

    return menor_valor;

}


int main(void)
{

    //Variaveis

    int numeros[50];
    int maior_valor;
    int menor_valor;


    //Apresentacao para o usuario

    Tela();


    gotoxy(34, 5);
    printf("Ola usuario!");

    gotoxy(10, 7);
    printf("Digite 50 numeros para que possamos ver o maior e o menor:");


    //Recebendo os 50 valores do array

    for (int i = 0; i < 50; i++)
    {

        if (i < 14)
        {

            gotoxy(7, i + 10);
            printf("Numero %d = ", i + 1);
            scanf("%d", &numeros[i]);

        }

        else if (i < 28)
        {

            gotoxy(32, i - 4);
            printf("Numero %d = ", i + 1);
            scanf("%d", &numeros[i]);

        }

        else if (i < 42)
        {

            gotoxy(57, i - 18);
            printf("Numero %d = ", i + 1);
            scanf("%d", &numeros[i]);

        }

        else
        {

            gotoxy(7, i - 32);
            printf("Numero %d = ", i + 1);
            scanf("%d", &numeros[i]);

        }

        if (i == 41)
        {

            system("cls");
            Tela();
            gotoxy(10, 7);
            printf("Digite 50 numeros para que possamos ver o maior e o menor:");

        }

    }


    system("cls");
    Tela();

    gotoxy(10, 7);
    printf("Digite 50 numeros para que possamos ver o maior e o menor:");

    //Chamando as duas funcoes

    maior_valor = MAIOR_VALOR(numeros);

    menor_valor = MENOR_VALOR(numeros);


    //Mostrando os resultados

    gotoxy(26, 12);
    printf("O maior numero vale = %d", maior_valor);


    gotoxy(26, 16);
    printf("O menor numero vale = %d", menor_valor);


    gotoxy(18, 23);
    system("pause");

}