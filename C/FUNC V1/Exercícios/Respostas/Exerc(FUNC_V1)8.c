/*
    Autor: Pedro Gonella Barao
    Data: 01/06/2025
    Objetivo: União de dois vetores com funções
*/


#include <stdio.h>

// Função que realiza a soma de dois vetores A e B, e armazena o resultado em C
int SomaAB(int A[10], int B[10], int C[10]) {
    
    int i;
    
    for (i = 0; i < 10; i++) {
        
        C[i] = A[i] + B[i];
        
    }
    
    return C[10];
    
}


int main() {
    
    int A[10];
    int B[10];
    int C[10];
    int i;

    // Leitura dos valores dos vetores A e B
    for (i = 0; i < 10; i++) {
        
        printf("\nQual o valor de A %d?: ", i + 1);
        scanf("%d", &A[i]);

        printf("Qual o valor de B %d?: ", i + 1);
        scanf("%d", &B[i]);
        
    }

    // Chamada da função para somar os vetores
    SomaAB(A, B, C);

    
    for (i = 0; i < 10; i++) {
        
        printf("\n%d\n", C[i]);
        
    }

    return 0;
    
}
