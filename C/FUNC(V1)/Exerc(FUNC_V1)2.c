/*

    Autor: Pedro Gonella Barao
    Data: 31/05/2025
    Objetivo: Calcular uma idade em dias com funcoes
    
*/


#include <stdio.h>


int ConversorDias(int anos, int meses)
{

    int total_dias;

    anos = anos * 365;

    meses = meses * 30;

    total_dias = anos + meses;

    return total_dias;

}



int main()
{

    int anos;
    int meses;
    int dias;
    int total_dias;

    printf("\nQuantos anos voce tem?: ");
    scanf("%d", &anos);

    printf("\nSem contar os anos, quantos meses voce tem?: ");
    scanf("%d", &meses);

    printf("\nSem contar os meses, quantos dias voce tem?: ");
    scanf("%d", &dias);


    total_dias = ConversorDias(anos, meses);


    printf("\n\nVoce tem (em dias) = %d", total_dias + dias);

    return 0;
}