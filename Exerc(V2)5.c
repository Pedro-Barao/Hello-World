/*

    Autor: Pedro Gonella Barao
    Data: 25/03/2025
    Objetivo: Uma calculadora de media harmonica e aritmetica

*/

#include <stdio.h>


int main()
{
    float media_harmonica;
    float media_aritmetica;
    float valor1;
    float valor2;
    float valor3;

    printf("\nBem-vindo(a) a calculadora de media hamonica e aritmetica(com 3 valores)\n");
    printf("Qual e o primeiro valor da media?: ");
    scanf("%f", &valor1);
    printf("Qual e o segundo valor da media?: ");
    scanf("%f", &valor2);
    printf("Qual e o terceiro valor da media?: ");
    scanf("%f", &valor3);


    media_aritmetica = (valor1 + valor2 + valor3) / 3;
    media_harmonica = 3 / ((1 / valor1) + (1 / valor2) + (1 / valor3));

    printf("\nO valor de media aritmetica desses 3 numeros e igual a = %.2f\n", media_aritmetica);
    printf("O valor da media harmonica desses 3 numeros e igual a = %.2f", media_harmonica);

    return 0;

}