/*

    Autor: Pedro Gonella Barao
    Data: 31/05/2025
    Objetivo: Calcular fatorial com funcoes
    
*/

#include <stdio.h>


int Fatorial(int num)
{

    int i;
    int resultado=1;

    for (i = num; i > 0; i--)
    {

        resultado = resultado * i;
        printf("%d * ", i);

    }

    return resultado;

}

int main()
{

    int num;
    int resultado;

    printf("\nQual o numero que voce que calcular o fatorial?: ");
    scanf("%d", &num);


    resultado = Fatorial(num);


    printf("\n\nO resultado do fatorial vale = %d", resultado);

    return 0;
}