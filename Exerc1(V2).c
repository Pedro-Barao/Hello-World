/*

    Autor: Pedro Gonella Barao
    Data: 24/03/2025
    Objetivo: Calcular preço final de um carro e registrar seu nome

*/

#include <stdio.h>

int main()
{
    float preco_bruto;
    float preco_final;
    char nome_carro[50];
    float taxa_revendedor;
    float impostos;


    printf("\nBem-vindo(a) calculadora de preco final de carros!\n");
    printf("Qual o nome do altomovel?: ");
    fflush(stdin);
    fgets(nome_carro, 50, stdin);
    printf("Qual o preco de fabrica do seu automovel?: ");
    scanf("%f", &preco_bruto);

    impostos = preco_bruto * 0.45;
    taxa_revendedor = preco_bruto * 0.28;
    preco_final = preco_bruto + impostos + taxa_revendedor;

    printf("\nSeu carro e um %s", nome_carro);
    printf("O automovel tem o preco de fabrica de = %.2f reais\n", preco_bruto);
    printf("E o preco final do carro e igual a = %.2f reais", preco_final);

    return 0;
}