/*

    Autor: Pedro Gonella Barao
    Data: 08/04/2025
    Objetivo: Somar todos os numeros pares de 1 a 500
    
*/


#include <stdio.h>

int main()
{

    int numero=1;
    int resultado=0;

    for (numero = 1; numero <= 500; numero++)
    {

        if (numero % 2 ==0)
        {

            resultado = resultado + numero;
        
        }
        
        if (numero == 500)
        {

        printf("\n%d", resultado);

        }
   
    }

    return 0;
}