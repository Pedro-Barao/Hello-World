/*

    Autor: Pedro Gonella Barao
    Data: 25/03/2025
    Objetivo: Calcular o preco de um produto em dolar

*/

#include <stdio.h>

int main()
{
    float preco_dolar_atual;
    float preco_real_produto;
    float preco_dolar_produto;
    float taxa;

    printf("\nBem-vindo(a) a calculadora de conversao real->dolar\n");
    printf("Quanto custa o produto?(em reais): ");
    scanf("%f", &preco_real_produto);
    printf("Quanto custa o dolar atualmente?: ");
    scanf("%f", &preco_dolar_atual);



    preco_dolar_produto = preco_real_produto / preco_dolar_atual;
    taxa = preco_dolar_atual;

    printf("\nLogo seu produto que vale %.2f em reais valera %.2f em dolares", preco_real_produto, preco_dolar_produto);
    printf("\nCom uma taxa de %.2f reais a cada 1 dolar", taxa);

    return 0;

}
