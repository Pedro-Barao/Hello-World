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