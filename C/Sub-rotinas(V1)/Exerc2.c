/*

Autor: Pedro Gonella Barao
Data: 18/08/2025
Objetivo: Fazer funcoes para receber dados de pessoas e calcular a media

*/

#include "funcao_basica.h"


void LerValores(char* nome[5][30], float salario[5], int numero_de_filhos[5])
{


    int i = 0;


    //Recebendo os dados

    do
    {

        //Apresentacao nao ser apagada

        Tela();

        gotoxy(14, 6);
        printf("Forneca seus dados para podermos fazermos uma media: ");


        //Funcao de uso das bordas

        gotoxy(20, 10);
        printf("Qual o seu nome?..........: ");
        scanf("%s", &nome[i]);


        gotoxy(20, 14);
        printf("Quanto voce ganha por mes?: ");
        scanf("%f", &salario[i]);


        gotoxy(20, 18);
        printf("Quantos filhos voce tem?..: ");
        scanf("%d", &numero_de_filhos[i]);


        gotoxy(16, 20);
        system("pause");
        system("cls");


        i++;

    } while(i < 5);


}


void CalcularMedias(float salario[5], int numero_de_filhos[5], float media_salarial, float maior_salario, float porcentagem_final, int media_de_filhos)
{


    int percentual = 0;

    //Calcular o resultado das medias

    for(int i = 0; i < 5; i++)
    {

        media_salarial += salario[i];
        media_de_filhos += numero_de_filhos[i];


        if (maior_salario < salario[i])
        {

            maior_salario = salario[i];

        }

        if(salario[i] <= 3500)
        {

            percentual++;

            porcentagem_final = (percentual * 100) / 5;

        }


    }

    gotoxy(5, 5);
    printf("Media Salarial da Cidade...........................: %.2f", media_salarial / 5);


    gotoxy(5, 8);
    printf("Media de Filhos da Cidade..........................: %d", media_de_filhos / 5);


    gotoxy(5, 11);
    printf("Maior Salario da Cidade............................: %.2f", maior_salario);


    gotoxy(5, 14);
    printf("Percentual de pessoas com salario abaixo de RS 3500: %.2f", porcentagem_final);


    gotoxy(5, 20);
    system("pause");
    system("cls");
    
}


int main(void)
{

    //Variaveis

    char* nome[5][30];
    float salario[5], media_salarial = 0, maior_salario = 0, porcentagem_final;
    int numero_de_filhos[5], media_de_filhos = 0, caso, verificador = 0;
    

    //Usando goto para um codigo funcionar 100% do tempo

    comeco:
    system("cls");

    //Apresentacao basica

    Tela();

    gotoxy(34, 5);
    printf("Ola usuario!");


    gotoxy(20, 6);
    printf("Decida qual procedimento quer executar: ");


    gotoxy(25, 10);
    printf("1-Coletar Dados");


    gotoxy(25, 13);
    printf("2-Calcular Dados Recebidos");


    gotoxy(25, 16);
    printf("3-Sair do sistema");


    gotoxy(25, 20);
    printf("Sua resposta: ");
    scanf("%d", &caso);


    switch(caso)
    {

        case 1:
        
            //Funcao de ler os valores

            verificador = 1;

            system("cls");

            LerValores(nome, salario, numero_de_filhos);
    
        goto comeco;


        case 2:

            //Funcao de realizar as medias e percentuais

            if (verificador == 0)
            {

                gotoxy(20, 22);
                printf("O sistema nao possui dados para calcular");


                gotoxy(18, 23);
                system("pause");


                goto comeco;

            }

            system("cls");
            CalcularMedias(salario, numero_de_filhos, media_salarial, maior_salario, porcentagem_final, media_de_filhos);

        goto comeco;


        case 3:

            //Finalizar o programa
            
        break;
        

        default:

            gotoxy(28, 22);
            printf("Forneca, um valor valido");


            gotoxy(18, 23);
            system("pause");
        
        goto comeco;

    }



}