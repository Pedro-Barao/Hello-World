/*

    Autor: Pedro Gonella Barao
    Data: 10/04/2025
    Objetivo: Somar todos os numeros que o usuario quiser
    
*/

#include <stdio.h>


int main()
{

    int numero;
    int quantidade;
    int contagem=1;
    int resultado=0;

    printf("\nOla, quantos numeros voce quer somar?: ");
    scanf("%d", &quantidade);

    do
    {

        printf("\n#%d valor: ", contagem);
        scanf("%d", &numero);
        quantidade--;
        contagem++;
        resultado = resultado + numero;

    }
    while (quantidade > 0);

    printf("\n\nA soma de todos os valores e  de = %d", resultado);

    return 0;
}