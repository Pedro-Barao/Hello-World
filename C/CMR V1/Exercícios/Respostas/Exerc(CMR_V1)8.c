#include <stdio.h>


int main()
{

    float salario;
    float salario_final=0;
    char cargo[50];
    char cargo_final[50];
    int i=0;



    for (i = 0; i < 10; i++)
    {

        printf("\nTrabalhador %d, quanto e o teu salario?: ", i+1);
        scanf("%f", &salario);

        printf("\nQual o teu cargo?: ");
        scanf(" %s", cargo);

        if (salario > salario_final)
        {

            salario_final = salario;
            strcpy(cargo_final, cargo);

        }
    }

    printf("\n\nO Funcionario da area de %s ganha o maior salario de %.2f", cargo_final, salario_final);
}