/*

    Autor: Pedro Gonella Barao
    Data: 15/04/2025
    Objetivo: Calcular a media de filhos e salario da população
    
*/

#include <stdio.h>


int main(){


    float salario;
    float maior_salario=0;
    float media_salario=0;
    float media_numero_de_filhos = 0;
    float porcentagem_menor_100 = 0;
    float contador=0;
    float salario_menor_100=0;
    int numero_de_filhos;
    int cadastrar;

    do
    {
        printf("Qual o seu salario: ");
        scanf("%f", &salario);
        printf("Quantos filhos voce tem?: ");
        scanf("%d", &numero_de_filhos);
        printf("Cadastrar outro usuario? (1-Sim 2-Nao):");
        scanf("%d", &cadastrar);



        if(salario > maior_salario)
        {

        maior_salario = salario;

        }

    if(salario <= 1000)
    {

        salario_menor_100++;

    }


    
    media_salario += salario;
    media_numero_de_filhos += numero_de_filhos;
    contador++;

    }while(cadastrar==1);

    media_salario = media_salario / contador;
    media_numero_de_filhos = media_numero_de_filhos / contador;
    porcentagem_menor_100 = (salario_menor_100 / contador) * 100;


    printf("\n\nMedia do salario da populacao: R$ %.2f\n", media_salario);
    printf("\nMedia do numero de filhos: %.2f\n", media_numero_de_filhos);
    printf("Maior salario registrado: R$ %.2f\n", maior_salario);
    printf("Percentual de pessoas com salario ate R$100: %.2f%%\n", porcentagem_menor_100);
    



    return 0;
}