/*

    Autor: Pedro Gonella Barao
    Data: 18/03/2025
    Objetivo: Odometro teste

*/

#include <stdio.h>

int main()
{
    float odometro_inicial;
    float odometro_final;
    float quilometros_percorridos;
    float lucro_diario;
    float preco_combustivel;
    int metros_por_litro;
    float preco_em_reais;
    float media_de_consumo;
    float combustivel_gasto;
    float lucro_total;


    printf("\nOla! Bem-vindo ao site calculador de odometros\n");
    printf("Primeiramente informe qual o preco atual do combustivel: ");
    scanf("%f", &preco_combustivel);
    printf("Coloque o valor inical do odometro: ");
    scanf("%f", &odometro_inicial);
    printf("Coloque o valor final do odometro: ");
    scanf("%f", &odometro_final);
    printf("Quantos quilometros o carro percorreu no dia?: ");
    scanf("%f", &quilometros_percorridos);
    printf("Quanto quilometros seu carro anda com 1 litro?: ");
    scanf("%d", &metros_por_litro);

    combustivel_gasto = quilometros_percorridos/metros_por_litro;
    lucro_diario = odometro_final-odometro_inicial;
    preco_em_reais = combustivel_gasto*preco_combustivel;
    media_de_consumo = preco_combustivel/metros_por_litro;
    lucro_total = lucro_diario - preco_em_reais;

    printf("\nLogo pode-se deduzir que a media de consumo do seu carro e = %f\n", media_de_consumo);
    printf("Gastando um total de gasolina de (em litros) = %.2f\n", combustivel_gasto);
    printf("Gastando um total de gasolina de (em reais) = %.2f\n", preco_em_reais);
    printf("Logo o seu lucro total sera de = %.2f", lucro_total);



    return 0;
}