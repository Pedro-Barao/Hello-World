/*

    Autor: Pedro Gonella Barao
    Data: 25/03/2025
    Objetivo: Calcular preço final de um carro

*/

#include <stdio.h>

int main()
{
    float preco_bruto;
    float preco_final;
    float taxa_revendedor;
    float impostos;


    printf("\nBem-vindo(a) calculadora de preco final de carros!\n");
    printf("Qual o preco de fabrica do seu automovel?: ");
    scanf("%f", &preco_bruto);

    impostos = preco_bruto * 0.45;
    taxa_revendedor = preco_bruto * 0.28;
    preco_final = preco_bruto + impostos + taxa_revendedor;

    printf("\nO automovel tem o preco de fabrica de = %.2f reais\n", preco_bruto);
    printf("E o preco final do carro e igual a = %.2f reais", preco_final);

    return 0;
}