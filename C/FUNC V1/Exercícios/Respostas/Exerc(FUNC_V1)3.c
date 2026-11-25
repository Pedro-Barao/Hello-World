/*

    Autor: Pedro Gonella Barao
    Data: 31/05/2025;
    Objetivo: Calcular se um numero e perfeito com funcoes
    
*/

#include <stdio.h>
#include <math.h>

int NumeroPerfeito(int num_primo, int soma_perfeita)
{

    int resultado;

    resultado = num_primo * soma_perfeita;

    return resultado;

}

int main()
{

    int num_perfeito;
    int resultado;
    int num_primo;
    int soma_perfeita;


    printf("\nQual numero voce deseja testar?: ");
    scanf("%d", &num_perfeito);
    

    printf("\nQual a soma de metade dos divisores do numero(6, 1+2=3)?: ");
    scanf("%d", &soma_perfeita);


    printf("\nQual o maior numero dos divisores que voce somou?: ");
    scanf("%d", &num_primo);

    resultado = NumeroPerfeito(num_primo, soma_perfeita);


    if (num_perfeito == resultado)
    {

        printf("\n\nSim, o numero %d e perfeito", num_perfeito);

    }

    else
    {

        printf("\n\nNao, o numero %d nao e perfeito", num_perfeito);

    }

    return 0;

}