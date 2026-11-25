/*

    Autor: Pedro Gonella Barao
    Data: 31/03/2025
    Objetivo: Calcular salario de um trabalhador

*/

#include <stdio.h>

int main()
{
    float salario_bruto;
    float salario_liquido;
    float INSS;
    float INSS_descontado = 0.12;
    float IR;
    float IR_descontado = 0.15;
    float premio;
    float rendimento;
    
    printf("\nBem-vindo(a) calculadora de salario\n");
    printf("Para prosseguirmos com o processo nos informe seu salario bruto: ");
    scanf("%f", &salario_bruto);
    printf("Quanto voce recebeu de premio de comissoes este mes?: ");
    scanf("%f", &premio);
    printf("Quanto esta valendo a base do INSS atualmente?: ");
    scanf("%f", &INSS);
    printf("Quanto esta valendo a base do IR atualmente?: ");
    scanf("%f", &IR);
    
    
    rendimento = salario_bruto + premio;
    
    
    if (IR <= (rendimento - (rendimento * INSS_descontado)))
    {
            
        salario_liquido = rendimento - (rendimento * INSS_descontado + rendimento * IR_descontado);
        printf("\nVoce vai ter um desconto de %.2f de INSS e %.2f de IR", INSS_descontado, IR_descontado);
            
    }
    else if (rendimento > INSS)
    {   
 
        salario_liquido = rendimento - (rendimento * INSS_descontado);
        printf("\nVoce vai ter um desconto de %.2f de INSS", INSS_descontado);
        
    }
 
    else
    {
        
        salario_liquido = rendimento;
        printf("\nVoce nao teve desconto de INSS ou IR");
        
    }
    
    
    
    printf("\nSeu salario bruto sera igual a %.2f", rendimento);
    printf("\nEnquanto seu salario liquido sera igual a %.2f", salario_liquido);
    printf("\nSendo um premio de %.2f", premio);
    
    
    
    return 0;
}