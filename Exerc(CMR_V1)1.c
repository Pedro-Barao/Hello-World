/*

    Autor: Pedro Gonella Barao
    Data: 08/04/2025
    Objetivo: Apresentar os Quadrados dos numeros de 15 a 200
    
*/

#include <stdio.h>
#include <math.h>


int main()
{

    int numero=15;
    int resultado;

    while (numero <= 200)
    {

        resultado = numero * numero;
        printf("%d ^ 2 = %d\n", numero, resultado);
        numero++;

    }

    return 0;

}