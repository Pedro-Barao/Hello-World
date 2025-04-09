/*

    Autor: Pedro Gonella Barao
    Data: 09/04/2025
    Objetivo: Imprimir 3 elevado de 0 a 15
    
*/


#include <stdio.h>
#include <math.h>

int main()
{

    int numero=3;
    int expoente=0;
    int resultado;

    for (expoente = 0; expoente <= 15; expoente++)
    {

        resultado = pow(numero, expoente);
        printf("%d ^ %d = %d\n", numero, expoente, resultado);

    }

    return 0;
}