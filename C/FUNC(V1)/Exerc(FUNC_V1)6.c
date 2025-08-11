/*

    Autor: Pedro Gonella Barao
    Data: 31/05/2025
    Objetivo: Calcular os divisores de um numero com funcoes
    
*/

#include <stdio.h>


void Divisores(int num)
{

    int i;

    for (i = num; i > 0; i--)
    {

        if (num % i == 0)
        {

            printf("\nO numero %d pode ser divido por %d", num, i);

        }
    }

}


int main()
{

    int num;



    printf("\nQual numero voce que avaliar?: ");
    scanf("%d", &num);

    Divisores(num);
    
}