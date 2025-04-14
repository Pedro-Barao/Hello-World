/*

    Autor: Pedro Gonella Barão
    Data: 31/03/2025
    Objetivo: Calculadora de desconto para associados

*/

#include <stdio.h>

int main()
{
    char nome[50];
    int idade;
    char sexo;
    float mensalidade;

    printf("\nBem-vindo(a) calculadora de desconto de mensalidade do clube\n");
    printf("Para saber quanto de desconto voce recebera precisamos de algumas informacoes\n");
    printf("Primeiramente qual o seu nome?: ");
    fflush(stdin);
    fgets(nome, 50, stdin);
    printf("Qual o preco bruto da sua mensalidade?: ");
    scanf("%f", &mensalidade);
    printf("Qual a sua idade?: ");
    scanf("%d", &idade);
    printf("Qual o seu sexo(M ou F)?: ");
    scanf("%s", &sexo);



    if (sexo == 'M'){   

        if (idade <= 25){

            printf("\nVoce e um menino\n");
            mensalidade = mensalidade;
            printf("\nSenhor %s", nome);
            printf("Voce pagara %.2f reais de mensalidade", mensalidade);

        } 
        else
        {

            printf("\nVoce e um homem\n");
            mensalidade = mensalidade - (mensalidade * 0.25);
            printf("\nSenhor %s");
            printf("Voce pagara %.2f reais de mensalidade", mensalidade);

        }
    } 
    else 
    {
        if (idade <= 30){

            printf("\nVoce e uma menina\n");
            mensalidade = mensalidade - (mensalidade * 0.2);
            printf("\nSenhorita %s", nome);
            printf("Voce pagara %.2f reais de mensalidade", mensalidade);

        }
        else if (idade <= 40)
        {

            printf("\nVoce e uma mulher\n");
            mensalidade = mensalidade - (mensalidade * 0.3);
            printf("\nSenhorita %s", nome);
            printf("Voce pagara %.2f reais de mensalidade", mensalidade);

        }
        else
        {

            printf("\nVoce e uma mulher com idade avancada\n");
            mensalidade = mensalidade - (mensalidade * 0.35);
            printf("\nSenhorita %s", nome);
            printf("Voce pagara %.2f reais de mensalidade", mensalidade);
        }
    }

    return 0;
}