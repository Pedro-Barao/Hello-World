/*

    Autor: Pedro Gonella Barao
    Data: 07/04/2025
    Objetivo: Calcular a area da preferencia do usuario
    
*/

#include <stdio.h>
#include <math.h>

int main()
{

    char resposta;
    float area;
    float lado1;
    float lado2;
    float raio;
    float altura;

    printf("\nOla, seja bem-vindo(a) calculadora de areas\n");
    printf("Escolha uma das formas abaixo(Responda com A, B, C ou D):\n[A]Circulo\n[B]Retangulo\n[C]Trapezio\n[D]Triangulo\n");
    scanf(" %c", &resposta);

    if (resposta == 'A' || resposta == 'a')
    {

        printf("\nVamos calcular a area de um circulo\n");
        printf("Quanto vale o raio do circulo?: ");
        scanf("%f", &raio);
        area = 3.14 * (pow(raio, 2));
        printf("\nUm circulo de raio de %.2f tera uma area %.2f m2", raio, area);

    }
    else if (resposta == 'B' || resposta == 'b')
    {

        printf("\nVamos calcular a area de um retangulo\n");
        printf("Quanto vale um lado do retangulo?: ");
        scanf("%f", &lado1);
        printf("Quanto vale o outro lado do retangulo?: ");
        scanf("%f", &lado2);
        area = lado1 * lado2;
        printf("\nUm retangulo de lado %.2f e de lado %.2f tera uma area de %.2f m2", lado1, lado2, area);

    }
    else if (resposta == 'C' || resposta == 'c')
    {

        printf("\nVamos calcular a area de um trapezio\n");
        printf("Quanto vale a base menor do trapezio?: ");
        scanf("%f", &lado1);
        printf("Quanto vale a base maior do trapezio?: ");
        scanf("%f", &lado2);
        printf("Quanto vale a altura do trapezio?: ");
        scanf("%f", &altura);
        area = ((lado1 + lado2) * altura) / 2;
        printf("\nUm trapezio de base menor de %.2f, de base maior %.2f e altura %.2f tera uma area de %.2f m2", lado1, lado2, altura, area);

    }
    else if (resposta == 'D' || resposta == 'd')
    {

        printf("\nVamos calcular a area de um triangulo\n");
        printf("Quanto vale a base do triangulo: ");
        scanf("%f", &lado1);
        printf("Quanto vale a altura do triangulo?: ");
        scanf("%f", &altura);
        area = (lado1  * altura) / 2;
        printf("\nUm triangulo de base  %.2f e altura %.2f tera uma area de %.2f m2", lado1, altura, area);

    }

    return 0;
}