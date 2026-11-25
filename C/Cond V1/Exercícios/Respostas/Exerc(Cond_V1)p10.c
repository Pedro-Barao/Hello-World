/*

    Autor: Pedro Gonella Barao
    Data: 06/04/2025
    Objetivo: Calculadora de media de aluno com notas valendo peso
    
*/

#include <stdio.h>


int main()
{

    char nome_aluno[50];
    float nota1;
    float nota2;
    float nota3;
    float media;

    printf("\nOla aluno(a), bem-vindo(a) calculadora de medias da escola\n");
    printf("\nPrimeiramente informe seu nome: ");
    fflush(stdin);
    fgets(nome_aluno, 50, stdin);
    printf("Quanto vale sua primeira nota?(peso 2): ");
    scanf("%f", &nota1);
    printf("Quanto vale sua segunda nota?(peso 3): ");
    scanf("%f", &nota2);
    printf("Quanto vale sua terceira nota?(peso 5): ");
    scanf("%f", &nota3);

    nota1 = nota1 * 2;
    nota2 = nota2 * 3;
    nota3 = nota3 * 5;
    media = (nota1 + nota2 + nota3) / 10;

    printf("\nParabens aluno %s", nome_aluno);

    if (media <= 4)
    {

        printf("\nSua media foi de %.2f (Voce ira com D em seu curriculo escolar)", media);

    }
    else if (media > 4 && media <= 6)
    {

        printf("\nSua media foi de %.2f (Voce ira com C em seu curriculo escolar)", media);

    }
    else if (media > 6 && media <= 8)
    {

        printf("\nSua media foi de %.2f (Voce ira com B em seu curriculo escolar)", media);

    }
    else
    {

        printf("\nSua media foi de %.2f (Voce ira com A em seu curriculo escolar)", media);

    }

    return 0;
}