/*

Nome: Pedro Gonella Barao
Data: 24/09/2025
Objetvio: Explique e corrija o erro:

    int num;
    scanf("%d", num);


    Escreva a versão correta e explique por que o operador & é necessário.

*/


#include <stdio.h>


int main(void)
{

    //Nao colocar o & faz com que o o valor nao seja atribuido ao campo de num
    //Pois num e apenas um jeito de nomear aquele campo aleatoriamente escolhido pelo programa
    int num;
    scanf("%d", &num);


/*

    +-----------+
  --+>num = x   | (apontando para o campo de onde tem o num para atribiur o valor)
    +-----------+
    |           |
    +-----------+
    |           |
    +-----------+
    |           |
    +-----------+

*/

}