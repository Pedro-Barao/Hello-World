/*

    Autor: Pedro Gonella Barao
    Data: 31/05/2025
    Objetivo: Calcular peso ideal com fatores com funcoes
    
*/



#include <stdio.h>



int PesoIdealMasculino(float altura)
{

    float peso_ideal;

    peso_ideal = 72.7 * altura - 58;

    return peso_ideal;

}

int PesoIdealFeminino(float altura)
{

    float peso_ideal;

    peso_ideal = 62.1 * altura - 44.7;

    return peso_ideal;
    
}


int main()
{

    float altura;
    float peso_ideal;
    char sexo;


    printf("\nQual a sua altura?: ");
    scanf("%f", &altura);

    printf("\nQual o seu sexo?(M ou F): ");
    scanf(" %c", &sexo);


    if (sexo == 'M')
    {

        peso_ideal = PesoIdealMasculino(altura);

    }

    else
    {

        peso_ideal = PesoIdealFeminino(altura);

    }

    printf("\n\nSeu peso ideal e de %.2f kg", peso_ideal);

    return 0;

}