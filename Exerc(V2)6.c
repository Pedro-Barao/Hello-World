/*

    Autor: Pedro Gonella Barao
    Data: 25/03/2025
    Objetivo: Calcular salario bruto de um trabalhador

*/


#include <stdio.h>


int main()
{

    float salario_bruto;
    int horas_trabalhadas;
    float valor_hora_trabalhada;
    int dependentes;
    int idade_dependente1;
    int idade_dependente2;
    int idade_dependente3;


    printf("\nBem-vindo(a) a calculadora salarial\n");
    printf("Quantas horas voce trabalha por mes?: ");
    scanf("%d", &horas_trabalhadas);
    printf("Quanto voce ganha por hora trabalhada?: ");
    scanf("%f", &valor_hora_trabalhada);
    printf("Quantos dependetes voce tem?: ");
    scanf("%d", &dependentes);

    if (dependentes == 0){
        printf("\nVoce nao possui depenedentes\n");

        salario_bruto = horas_trabalhadas * valor_hora_trabalhada;

    } else if (dependentes == 1){
        printf("\nVoce possui 1 dependente\n");
        printf("Quantos anos tem seu dependente?:");
        scanf("%d", &idade_dependente1);

        if (idade_dependente1 >= 13){
            
            salario_bruto = horas_trabalhadas * valor_hora_trabalhada + (dependentes * 13.48);

        } else {

            salario_bruto = horas_trabalhadas * valor_hora_trabalhada;
        }

    } else if (dependentes == 2){
        printf("\nVoce possui 2 dependentes\n");
        printf("Quantos anos tem seu primeiro dependente?:");
        scanf("%d", &idade_dependente1);
        printf("Quantos anos tem seu segundo dependente?:");
        scanf("%d", &idade_dependente2);

        if (idade_dependente1 && idade_dependente2 <= 13){
            
            salario_bruto = horas_trabalhadas * valor_hora_trabalhada + (dependentes * 13.48);

        } else if (idade_dependente1 || idade_dependente2 <= 13){

            salario_bruto = horas_trabalhadas * valor_hora_trabalhada + (1 * 13.48);
        } else{

            salario_bruto = horas_trabalhadas * valor_hora_trabalhada;
        }
    } else if (dependentes == 3){
        printf("\nVoce possui 3 dependentes\n");
        printf("Quantos anos tem seu primeiro dependente?:");
        scanf("%d", &idade_dependente1);
        printf("Quantos anos tem seu segundo dependente?:");
        scanf("%d", &idade_dependente2);
        printf("Quantos anos tem seu terceiro dependente?:");
        scanf("%d", &idade_dependente3);

        if (idade_dependente1 && idade_dependente2 && idade_dependente3 <= 13){
            
            salario_bruto = horas_trabalhadas * valor_hora_trabalhada + (dependentes * 13.48);

        } else if (idade_dependente1 && idade_dependente2 <= 13 || idade_dependente1 && idade_dependente3 <= 13 || idade_dependente2 && idade_dependente3 <= 13){

            salario_bruto = horas_trabalhadas * valor_hora_trabalhada + (2 * 13.48);

        } else if (idade_dependente1 || idade_dependente2 || idade_dependente3 <= 13){

            salario_bruto = horas_trabalhadas * valor_hora_trabalhada + (1 * 13.48);
        } else{

            salario_bruto = horas_trabalhadas * valor_hora_trabalhada + (dependentes * 13.48);

        }
    }


    printf("\nSeu salario bruto e de %.2f", salario_bruto);
    return 0;

}
