/*

    Autor: Pedro Gonella Barão
    Data: 21/032025
    Objetivo: Calculadora de Bhaskara

*/

#include <stdio.h>
#include <math.h>


int main()
{
    float a;
    float b;
    float c;
    float x1;
    float x2;

    printf("\nBem-vindo(a) calculadora de Bhaskara!\n");
    printf("Qual seria o valor de a?: ");
    scanf("%f", &a);
    printf("Qual seria o valor de b?: ");
    scanf("%f", &b);
    printf("Qual seria o valor de c?: ");
    scanf("%f", &c);


    x1 = (-b + sqrt(pow(b, 2) - 4 * a * c))/(2 * a);
    x2 = (-b - sqrt(pow(b, 2) - 4 * a * c))/(2 * a);

    printf("\nO valor de x1 e de = %.3f", x1);
    printf("\nO valor de x2 e de = %.3f", x2);

    return 0;
}