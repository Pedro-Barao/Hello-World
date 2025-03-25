/*

    Autor: Pedro Gonella Barao
    Data: 25/03/2025
    Objetivo: Calcular quantos dias de vida tem uma pessoa

*/

#include <stdio.h>

int main()
{
    int anos;
    int meses;
    int dias;
    int dias_final;



    printf("\nBem-vindo(a) calculadora de dias de vida\n");
    printf("Quantos anos voce tem?: ");
    scanf("%d", &anos);
    printf("Quantos meses voce tem?(sem contar os anos): ");
    scanf("%d", &meses);
    printf("Quantos dias voce tem?(sem contar os meses): ");
    scanf("%d", &dias);

    anos = anos * 365;
    meses = meses * 30;
    dias_final = anos + meses + dias;

    printf("\n Voce tem %d de dias de vida", dias_final);

    return 0;

}