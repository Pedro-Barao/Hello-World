/*

    Autor: Pedro Gonella Barao
    Data: 02/06/2025
    Objetivo: somar funcoes
    
*/



#include <stdio.h>

int SomaAB(int A[15], int B[15], int X[])
{


    int i;
    
    for (i = 0; i < 30; i++)
    {
        
        if (X[i] %2 ==0)
        {
            
            A[i/2] = X[i];
            
        }
        
        else
        {
            
            B[i/2] = X[i];
            
        }
    }

    return A[15], B[15];
}


int main()
{

   int X[30];
   int A[15];
   int B[15];
   int i;
   
   
    for (i = 0; i < 30; i++)
   {
       
       printf("\nQual o valor de X%d?: ", i+1);
       scanf("%d", &X[i]);
       
   }
   
   SomaAB(A, B, X);
   
   for (i = 0; i < 15; i++)
   {
       
       printf("\nA%d vale = %d", i+1, A[i]);
       
   }
   
   printf("\n");
   
    for (i = 0; i < 15; i++)
   {
       
       printf("\nB%d vale = %d", i+1, B[i]);
       
   }
   
   return 0;

}