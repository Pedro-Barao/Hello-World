/*

    Autor:Pedro Gonella Barao
    Data: 08/04/2025
    Objetivo: Tabuada de qualquer numero
    
*/

#include <stdio.h>


int main()
{

    int numero;
    int multiplicador=1;
    int resultado;

    printf("\nQual a tabuada que voce deseja ver?: ");
    scanf("%d", &numero);

    for (multiplicador = 1; multiplicador <= 10; multiplicador++)
    {

        resultado = multiplicador * numero;
        printf("\n%d * %d = %d", numero, multiplicador, resultado);

    }

    return 0;
}