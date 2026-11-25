/*

    Autor: Pedro Gonella Barao
    Data: 15/04/2025
    Objeitvo: Contagem de votos eme eleição
    
*/


#include <stdio.h>
#include <windows.h>

int main()
{
    int resposta;
    int codigo;
    int candidato1 = 0;
    int candidato2 = 0;
    int candidato3 = 0;
    int candidato4 = 0;
    int voto_nulo = 0;
    int voto_branco = 0;

    do
    {
        system("cls");
        printf("Digite o codigo do eleitor: ");
        scanf("%d", &codigo);
        printf("1)Voto para candidato 1\n\n");
        printf("2)Voto para candidato 2\n\n");
        printf("3)Voto para candidato 3\n\n");
        printf("4)Voto para candidato 4\n\n");
        printf("5)Voto nulo\n\n");
        printf("6)Voto branco\n\n");
        printf("0)Encerrar votacao\n");
        printf("Digite sua resposta: ");
        scanf("%d", &resposta);

        switch (resposta)
        {
        case 0:

            printf("**Votacao encerrada**\n");
            break;

        case 1:

            candidato1++;
            break;

        case 2:

            candidato2++;
            break;

        case 3:

            candidato3++;
            break;

        case 4:

            candidato4++;
            break;

        case 5:

            voto_nulo++;
            break;

        case 6:

            voto_branco++;
            break;

        default:

            printf("Voto invalido!!\n");
            break;

        }

    } while (resposta != 0);


    printf("  Numero de votos\n\n");
    printf("Candidato 1: %d\n\n", candidato1);
    printf("Candidato 2: %d\n\n", candidato2);
    printf("Candidato 3: %d\n\n", candidato3);
    printf("Candidato 4: %d\n\n", candidato4);
    printf("Voto nulo: %d\n\n", voto_nulo);
    printf("Voto branco: %d\n\n", voto_branco);

    return 0;
}