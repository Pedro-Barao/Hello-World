/******************************************************************************

    Autor: Pedro Gonella Barao
    Data: 26/03/2025
    Objetivo: Calcular salario, comissao de funcionarios e lucro de empresa

*******************************************************************************/

#include <stdio.h>

int main()
{

    float preco_bicicleta;
    float custo_bicicleta;
    float salario_vendedor;
    float salario_minimo;
    float comissao;
    int numero_de_funcionarios;
    int bicicletas_vendidas;
    float lucro_bruto;
    float salario_final;
    
    
    printf("\nBem-vindo(a) ao site de calculo de lucro da empresa generica de bicicletas\n");
    printf("Qual e o salario minimo atualmente?: ");
    scanf("%f", &salario_minimo);
    printf("Qual o preco da bicicleta?: ");
    scanf("%f", &preco_bicicleta);
    printf("Quantos funcionarios tem a empresa?: ");
    scanf("%d", &numero_de_funcionarios);
    printf("Quantas bicicletas foram vendidas este mes?: ");
    scanf("%d", &bicicletas_vendidas);
    
    
    
    
    
    
    preco_bicicleta = custo_bicicleta / 0.5;
    comissao = preco_bicicleta * 0.015;
    salario_final = (2 * salario_minimo) + (comissao * bicicletas_vendidas);
    lucro_bruto = preco_bicicleta * bicicletas_vendidas;
    
    
    return 0;
}