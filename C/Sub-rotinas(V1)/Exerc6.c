/*

Autor: Pedro Gonella Barao
Data: 21/08/2025
Objetivo: Fazer uma funcao que retorna por referencia os 4 primeiros numeros perfietos

*/

#include "funcao_basica.h"
#include <math.h>

void NumerosPerfeitos(int *a)
{

    //Variaveis

    int aumento = 1;


    for(int i = 1; i < 6; i++)
    {

        if (i < 3)
        {

            a[i - 1] = pow(2, i) * (pow(2, i + 1) - 1);

        }

        else
        {

            a[i - 1] = pow(2, i + aumento) * (pow(2, i + 1 + aumento) - 1);

            aumento++;

        }
    
    }

}


int main(void)
{

    //Variaveis

    int A[4];


    //Mandando A para a funcao

    NumerosPerfeitos(A);


    //Imprimindo os valores de A

    Tela();

    gotoxy(34, 5);
    printf("Ola usuario!");

    gotoxy(15, 8);
    printf("Os valores dos 4 primeiros numeros perfeitos sao:");

    for(int i = 0; i < 4; i++)
    {

        gotoxy(22, 12 + i + i);
        printf("O perfeitos numero %d vale = %d", i + 1, A[i]);

    }


    gotoxy(18, 23);
    system("pause");

    //Libertando o A


}