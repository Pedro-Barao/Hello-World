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
    float salario_minimo;
    float comissao;
    int numero_de_funcionarios;
    int bicicletas_vendidas;
    float lucro_bruto;
    float lucro_liquido;
    float salario_final;
    
    
    printf("\nBem-vindo(a) ao site de calculo de lucro da empresa generica de bicicletas\n");
    printf("Qual e o salario minimo atualmente?: ");
    scanf("%f", &salario_minimo);
    printf("Qual o custo de uma bicicleta?: ");
    scanf("%f", &custo_bicicleta);
    printf("Quantos funcionarios tem a empresa?: ");
    scanf("%d", &numero_de_funcionarios);
    printf("Quantas bicicletas foram vendidas este mes?: ");
    scanf("%d", &bicicletas_vendidas);


    
    preco_bicicleta = custo_bicicleta / 0.5;
    comissao = preco_bicicleta * 0.015;
    salario_final = (2 * salario_minimo) + (comissao * bicicletas_vendidas);
    lucro_bruto = preco_bicicleta * bicicletas_vendidas;
    lucro_liquido = lucro_bruto - (salario_final * numero_de_funcionarios);
    
    
    printf("\nEm nossos calculos concluimos que cada trabalhador ira ganhar um salario de = %.2f\n", salario_final);
    printf("Sendo o lucro bruto da empresa igual a = %.2f\n", lucro_bruto); 
    printf("E o lucro liquido da empresa sendo iguai a = %.2f", lucro_liquido);

    return 0;
}