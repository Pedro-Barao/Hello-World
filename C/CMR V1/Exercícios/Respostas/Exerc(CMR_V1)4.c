/*

    Autor: Pedro Gonella Barao
    Data: 08/04/2025
    Objetivo: Contar todos os numeros impares de 1 a 20
    
*/

#include <stdio.h>

int main()
{

    int numero=1;

    for (numero = 1; numero<= 20; numero++)
    {

        if (numero % 2 !=0)
        {

            printf("%d, ", numero);

        }
    }

    return 0;
}