/*

    Autor: Pedro Gonella Barao
    Data: 03/04/2025
    Objetivo: 

*/

#include <stdio.h>

int main()
{

    int nota1;
    int nota2;
    int nota3;
    int media=0;
    int contador=0;


    printf("\nOla, seja bem-vindo(a) a calculadora de media\n");
    printf("Quanto vale sua primeira nota?: ");
    scanf("%d", &nota1);
    printf("Quanto vale sua segunda nota?: ");
    scanf("%d", &nota2);
    printf("Quanto vale sua terceira nota?: ");
    scanf("%d", &nota3);

    if (nota1 % 2 ==0)
    {

        media = media + nota1;
        contador = contador + 1;

    }
    if (nota2 % 2 ==0)
    {

        media = media + nota2;
        contador = contador + 1;
        
    }
    if (nota3 % 2 ==0)
    {

        media = media + nota3;
        contador = contador + 1;
        
    }




    if (contador == 3)
    {

        media = media / 3;
        printf("\nTodas as notas foram utilizadas\n");
        printf("Sua media sera igual a = %d", media);

    }
    else if (contador == 2)
    {

        media = media / 2;
        printf("\nApenas uas notas foram utilizadas\n");
        printf("Sua media sera igual a = %d", media);
        
    }
    else if (contador == 1)
    {

        media = media;
        printf("\nApenas uma nota foi utilizada\n");
        printf("Sua media sera igual a = %d", media);
        
    }
    else
    {

        printf("\nNenhuma nota foi utilizada, pois nenhuma nota e par\n");

    }

    return 0;

}