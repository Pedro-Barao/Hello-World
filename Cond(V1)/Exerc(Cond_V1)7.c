/*

    Autor: Pedro Gonella Barao
    Data: 03/04/2025
    objetivo: Variar a apresentacao dependendo do sexo do usuario

*/

#include <stdio.h>


int main()
{

    char nome[50];
    char sexo;

    printf("\nQual o seu nome?: ");
    fflush(stdin);
    fgets(nome, 50, stdin);
    printf("\nQual seu sexo?(M ou F): ");
    scanf(" %c", &sexo);


    printf("\n%s", nome);


    if (sexo == 'M' || sexo == 'm')
    {

        printf("Ola ILMO.SR\n");

    }
    else
    {

        printf("Ola ILMA.SRA\n");

    }


    return 0;
}
