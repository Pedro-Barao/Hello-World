/*

    Autor: Pedro Gonella Barao
    Data: 18/03/2025
    Objetivo: Gasto de combustivel por quilometro rodado

*/


#include <stdio.h>


int main()
{
    float combustivel_gasto;
    int metros_por_litro;
    float preco_combustivel;
    float preco_em_reais;
    float media_de_consumo;
    float metros_percorridos;

    printf("\nOla! Bem-vindo ao site calculador de consumo de gasolina\n");
    printf("Primeiramente informe qual o preco atual do combustivel: ");
    scanf("%f", &preco_combustivel);
    printf("Quanto quilometros seu carro anda com 1 litro?: ");
    scanf("%d", &metros_por_litro);
    printf("Quantos quilometros o seu carro percorreu?: ");
    scanf("%f", &metros_percorridos);

    media_de_consumo = preco_combustivel/metros_por_litro;
    combustivel_gasto = metros_percorridos/metros_por_litro;
    preco_em_reais = combustivel_gasto*preco_combustivel;

    printf("\nLogo pode-se deduzir que a media de consumo do seu carro e = %f\n", media_de_consumo);
    printf("Gastando um total de gasolina de (em litros) = %.2f\n", combustivel_gasto);
    printf("Gastando um total de gasolina de (em reais) = %.2f", preco_em_reais);

    return 0;

}