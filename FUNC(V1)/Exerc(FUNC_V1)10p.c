/*
    Autor: Pedro Gonella Barao  
    Data: 01/06/2025  
    Objetivo: Receber média final e retornar o conceito do aluno  
*/

#include <stdio.h>

char Conceito(float media)
{
    if (media >= 0.0 && media <= 4.9)
        return 'D';
    else if (media >= 5.0 && media <= 6.9)
        return 'C';
    else if (media >= 7.0 && media <= 8.9)
        return 'B';
    else if (media >= 9.0 && media <= 10.0)
        return 'A';
    else
        return 'X'; // valor inválido
}

int main()
{
    float media;
    char conceito;

    printf("Digite a média final do aluno: ");
    scanf("%f", &media);

    conceito = Conceito(media);

    if (conceito == 'X')
        printf("Média inválida!\n");
    else
        printf("O conceito do aluno é: %c\n", conceito);

    return 0;
}
