/*

    Autor: Pedro Gonell Barao
    Data: 10/04/2025
    Objetivo: Registrar a altura e o numero de alunos imprimindo-os em ordem
    
*/

#include <stdio.h>


int main()
{

    int i;
    float altura;
    float maior_altura=0;
    float menor_altura=0;
    int numero;
    int maior_numero=0;
    int menor_numero=0;


    for( i = 0; i < 5; i++)
    {

        printf("\nDigite a altura da pessoa %d: ", i+1);
        scanf("%f", &altura);

        printf("\nDigite a numero da pessoa %d: ", i+1);
        scanf("%d", &numero);

        if (i==1)
        {

            maior_numero = numero;
            menor_numero = numero;
            maior_altura = altura;
            menor_altura = altura;

        }

        else
        {

            if (altura > maior_altura)
            {

                maior_altura = altura;
                maior_numero = numero;

            }

            if (altura < menor_altura)
            {

                menor_altura = altura;
                menor_numero = numero;

            }
        }

    }

    printf("\nO aluno mais alto tera %.2f de altura com o numero %d", maior_altura, maior_numero);
    printf("\nO aluno mais baixo tera %.2f de altura com o numero %d", menor_altura, menor_numero);


    return 0;
}