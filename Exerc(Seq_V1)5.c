/*

    Autor: Pedro Gonella Barao
    Data: 18/03/2025
    Objetivo: Mudanca do salario bruto

*/

#include <stdio.h>

int main()
{
 
    int trabalhadores;
    float salario_minimo;
    float preco_bicicleta;
    float comissao;
    float salario_final;
    float lucro;
    int numero_de_bicicletas;
    float lucro_bruto;
    
    printf("Bem-vindo(a) ao sistema de calculo de lucro da (empresa generica)\n");
    printf("Informe o salario minimo atualmente?: ");
    scanf("%f", &salario_minimo);
    printf("Qual o custo de uma bicicleta?: ");
    scanf("%f", &preco_bicicleta);
    printf("Quantas bicicletas foram vendidas esse mes?: ");
    scanf("%d", &numero_de_bicicletas);
    printf("Quantos funcionarios tem na sua empresa?: ");
    scanf("%d", &trabalhadores);
    
    preco_bicicleta = preco_bicicleta/0.5;
    comissao = preco_bicicleta*0.15;
    salario_final = (salario_minimo*2) + comissao;
    lucro = (preco_bicicleta*numero_de_bicicletas) - (salario_final*trabalhadores);
    lucro_bruto = (preco_bicicleta*numero_de_bicicletas);
    
    printf("\nA empresa generica tem %.2f de lucro bruto", lucro_bruto);
    printf("\nA empresa generica tem %.2f de lucro\n\n", lucro);
    printf("E cada fucionario recebe %.2f de salario mensalmente", salario_final);

    return 0;
}
