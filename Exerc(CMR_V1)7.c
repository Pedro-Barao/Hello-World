/*

    Autor: Pedro Gonell Barao
    Data: 10/04/2025
    Objetivo: Registrar a altura e o numero de alunos imprimindo-os em ordem
    
*/

#include <stdio.h>


int main()
{

    int alunos_altura=5;
    int alunos_numero=5;
    float altura;
    float altura_menor=2;
    float altura_maior=0;
    int numero;
    int numero_maior=0;
    int numero_menor=999999;
    int contagem_altura=1;
    int contagem_numeros=1;


    do
    {

        printf("\nQual a altura do %d aluno?: ", contagem_altura);
        scanf("%f", &altura);
        alunos_altura--;
        contagem_altura++;
    
        if (altura > altura_maior)
        {

            altura_maior = altura;

        }

        if (altura < altura_menor)
        {

            altura_menor = altura;

        }


    }
    while(alunos_altura > 0);


    do
    {

        printf("\nQual o numero do %d aluno?: ", contagem_numeros);
        scanf("%d", &numero);
        alunos_numero--;
        contagem_numeros++;
    
        if (numero > numero_maior)
        {

            numero_maior = numero;

        }

        if (numero < numero_menor)
        {

            numero_menor = numero;

        }


    }
    while(alunos_numero > 0);


    printf("\n\nO aluno mais alto mede %.2f e o menor mede %.2f ", altura_maior, altura_menor);
    printf("\n\nO aluno com o maior numero e o %d e o com menor numero e o %d ", numero_maior, numero_menor);



    return 0;
}