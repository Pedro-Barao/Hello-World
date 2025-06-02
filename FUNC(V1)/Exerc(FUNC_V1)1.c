/*

    Autor: Pedro Gonella Barao
    Data: 30/05/2025
    Objetivo: Calcular as medias dos alunos com funcoes
    
*/

#include <stdio.h>



int MediaAritmetica(int notas[])
{

    int i;
    float resultado=0;

    for (i = 0; i < 3; i++)
    {

        resultado += notas[i];

    }

    resultado = resultado/3;

    return resultado;

}


int MediaPonderada(int notas[])
{

    int i;
    float resultado=0;

    for (i = 0; i < 3; i++)
    {

        if (i == 0)
        {

            notas[i] = notas[i]/5;

        }

        if (i == 1)
        {

            notas[i] = notas[i]/3;

        }

        if (i == 2)
        {

            notas[i] = notas[i]/2;

        }


        resultado += notas[i];

    }


    return resultado;

}


int MediaHarmonica(int notas[])
{

    int i;
    float soma=0;
    float resultado=0;


    for (i = 0; i < 3; i++)
    {

        soma += 1.0 / notas[i];

    }

    resultado = 3.0 / soma;


    return resultado;

}

int main()
{
    
    int notas[3];
    int i;
    float resultado=0;
    char media;


    for (i = 0; i < 3; i++)
    {

        printf("\nQuanto vale a nota %d?: ", i+1);
        scanf("%d", &notas[i]);

    }




        printf("\n\nQual a media voce quer aplicar em suas provas?:\nA-Media Artmetica\nP-Media Ponederada\nH-Media Harmonica\nR: ");
        scanf(" %c", &media);


        switch (media)
        {


            case 'A':

                resultado = MediaAritmetica(notas);

                break;

            case 'P':

                resultado = MediaPonderada(notas);

                break; 
                
                
            case 'H':

                resultado = MediaHarmonica(notas);

                break;

        }



    printf("\n\nO resultado da sua media e igual a = %.2f", resultado);

    return 0;
}