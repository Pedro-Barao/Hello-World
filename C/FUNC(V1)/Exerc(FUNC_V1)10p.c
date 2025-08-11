/*
    Autor: Pedro Gonella Barao  
    Data: 01/06/2025  
    Objetivo: Receber média final e retornar o conceito do aluno  
*/

#include <stdio.h>

char Resposta(float media)
{
    
    char conceito;
    
    if (media >= 0.0 && media <= 4.9)
    {
        
        conceito = 'D';
        
    }
    else if (media >= 5.0 && media <= 6.9)
    {
        
        conceito = 'C';
        
    }

    else if (media >= 7.0 && media <= 8.9)
    {
        
        conceito = 'B';
        
    }

    else if (media >= 9.0 && media <= 10.0)
    {
        
        conceito = 'A';
        
    }

    else
    {
        
        conceito = 'X'; 
      
    } 
    
    return conceito;
    
}

int main()
{
    float media;
    char conceito;

    printf("Digite a média final do aluno: ");
    scanf("%f", &media);

    conceito = Resposta(media);

    if (conceito == 'X')
    {
        
        printf("Média inválida!\n");
        
    }
    else
    {
        
        printf("O media do aluno é: %c\n", conceito);
        
    }        

    return 0;
}
