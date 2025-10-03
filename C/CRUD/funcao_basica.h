#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

void gotoxy(int x, int y)
{

    COORD coord;
    coord.X = (short)x;
    coord.Y = (short)y;
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);

}

void Tela()
{
    
    system("cls");
    
    for(int i = 2; i < 24; i++)
    {

        gotoxy(1, i);
        printf("|");

        gotoxy(80, i);
        printf("|");

    }

    for (int i = 0; i < 80; i++)
    {

        gotoxy(i + 1, 1);
        printf("-");

        gotoxy(i + 1, 24);
        printf("-");

    }

}

void MenuPrincipal()
{
    
    gotoxy(2, 2);
    printf("Autor: Pedro Gonella Barao");

    gotoxy(45, 2);
    printf("MENU PRINCIPAL");

    gotoxy(74, 2);
    printf("Unicv");

    for (int i = 0; i < 80; i++)
    {

        gotoxy(i + 1, 3);
        printf("-");

        gotoxy(i + 1, 22);
        printf("-");

    }

    gotoxy(2, 23);
    printf("Resposta.:");

}

void MenuSecundario()
{

    for (int i = 0; i < 80; i++)
    {

        gotoxy(i + 1, 3);
        printf("-");

        gotoxy(i + 1, 22);
        printf("-");

    }

    gotoxy(2, 23);
    printf("Resposta.:");

}