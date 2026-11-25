/*

Autor: Pedro Gonella Barao
Data: 22/08/2025
Objetivo: Uma funcao para ver quantos filmes uma pessoa consegue locar de graca

*/


#include "funcao_basica.h"

void Pedidos(int *filmes_pedidos, int *filmes_de_graca)
{

    //Variaveis da funcao

    char resposta;


    //Refazendo a tela


    for(int i = 0; i < 10; i++)
    {

        comeco:

        system("cls");
        Tela();

        gotoxy(5, 5);
        printf("Usuario %d:", i + 1);


        gotoxy(10, 12);
        printf("Quantos filmes voce ira querer?: ");
        scanf("%d", &filmes_pedidos[i]);


        filmes_de_graca[i] = filmes_pedidos[i] / 3;


        gotoxy(10, 18);
        printf("Se voce levar %d de filmes voce levara: %d de graca", filmes_pedidos[i], filmes_de_graca[i]);


        gotoxy(10, 20);
        printf("Tem certeza que deseja levar esses filmes?(s ou n): ");
        scanf(" %c", &resposta);


        if (resposta == 'n')
        {

            goto comeco;
            
        }


    }

}


int main(void)
{

    //Variaveis

    int filmes_pedidos[10], filmes_de_graca[10], caso;

    filmes_pedidos[0] = 0;


    //Tela de apresentacao

    inicio:

    Tela();

    gotoxy(14, 5);
    printf("Ola usuario! Bem-vindo a promocao da loja X de 2024");

    gotoxy(5, 8);
    printf("Vamos dar inicio ao nosso processo de quantos filmes cada cliente comprou:");


    gotoxy(15, 12);
    printf("1 - Registrar pedidos");


    gotoxy(15, 15);
    printf("2 - Ver pedidos");


    gotoxy(15, 18);
    printf("3 - Sair do programa");


    gotoxy(15, 21);
    printf("Resposta: ");
    scanf("%d", &caso);


    //Switch case para mostrar ou receber os registros

    switch (caso)
    {

        case 1:


            Pedidos(filmes_pedidos, filmes_de_graca);

            system("cls");

            goto inicio;
        

        case 2:


            if(filmes_pedidos[0] == 0)
            {

                gotoxy(35, 21);
                printf("Nao e possivel mostrar os dados ainda");


                gotoxy(30, 23);
                system("pause");


                system("cls");
                goto inicio;

            }


            system("cls");

            Tela();


            for(int i = 0; i < 10; i++)
            {

                gotoxy(12, ((i * 2) + 2));
                printf("O usuario %d pediu %d filmes e ganhou %d filmes de graca", i + 1, filmes_pedidos[i], filmes_de_graca[i]);

            }
        

            gotoxy(30, 23);
            system("pause");
            system("cls");

            goto inicio;


        case 3:


            break;

        
        default:

            gotoxy(35, 21);
            printf("Insira um valor valido");


            gotoxy(30, 23);
            system("pause");


            system("cls");
            goto inicio;
            
            
        
    }
}