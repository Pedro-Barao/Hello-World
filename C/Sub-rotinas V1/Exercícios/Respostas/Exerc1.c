/*

Autor: Pedro Gonella Barao
Data: 17/08/2025
Objetivo: Receber 3 valores e ver se eles formam um triangulo, além de nomear o triangulo

*/


#include "funcao_basica.h"


void TrianguloResultado(int lado1, int lado2, int lado3, char *nome_triangulo[])
{


    //Condicionais para o nome do triangulo

    if ((lado1 + lado2 <= lado3) || (lado1 + lado3 <= lado2) || (lado2 + lado3 <= lado1))
    {

        gotoxy(22, 20);
        nome_triangulo[50] = "Nao e possivel formar esse triangulo";

    }

    else if (lado1 == lado2 == lado3)
    {

        gotoxy(18, 20);
        nome_triangulo[50] = "O triangulo formado e um triangulo equilatero";

    }

    else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
    {

        gotoxy(19, 20);
        nome_triangulo[50] = "O triangulo formado e um triangulo isoceles";

    }

    else
    {

        gotoxy(19, 20);
        nome_triangulo[50] = "O triangulo formado e um triangulo escaleno";

    }


}


int main(void)
{
    //Variaveis

    int lado1;
    int lado2;
    int lado3;
    int lado4;
    char *nome_triangulo[50];
    int i;


    //Funcao de uso das bordas

    Tela();


    //Interacao com usuario / Recebimento de valores

    gotoxy(34, 5);
    printf("Ola usuario!");

    gotoxy(26, 7);
    printf("Forneca para nos 3 valores,");

    gotoxy(14, 8);
    printf("e diremos se eles formam um traingulo e de qual tipo:");

    gotoxy(28, 10);
    printf("Valor do primeiro lado: ");
    scanf("%d", &lado1);

    gotoxy(28, 12);
    printf("Valor do segundo lado.: ");
    scanf("%d", &lado2);

    gotoxy(28, 14);
    printf("Valor do terceiro lado: ");
    scanf("%d", &lado3);


    //Chamada da funcao

    TrianguloResultado(lado1, lado2, lado3, nome_triangulo);


    //Resultado final

    printf(" %s\n", nome_triangulo[50]);

    gotoxy(19, 22);
    system("pause");


}