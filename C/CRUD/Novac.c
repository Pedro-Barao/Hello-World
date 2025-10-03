/*

    Autor: Pedro Gonella Barao
    Data: 27/08/2025
    Objetivo: CRUD
    
*/



#include "funcao_basica.h"


#define MAX 100


typedef struct{

    int codigo;
    char nome[40];
    char telefone[12];
    char endereco[50];
    char cpf[16];
    char email[20];
    char data_nascimento[11];

}   registro_cliente;


typedef struct{

    int inicio;
    int fim;
    registro_cliente clie[MAX];

} Lista;


void InformacoesCliente()
{

    gotoxy(10, 7);
    printf("====Codigo...................:");

    gotoxy(10, 9);
    printf("1 - Nome.....................:");

    gotoxy(10, 11);
    printf("2 - Telefone.................:");

    gotoxy(10, 13);
    printf("3 - Endereco.................:");

    gotoxy(10, 15);
    printf("4 - CPF......................:");

    gotoxy(10, 17);
    printf("5 - Email....................:");

    gotoxy(10, 19);
    printf("6 - Data de Nascimento.......:");

}


void LimpaLinha()
{

    gotoxy(2, 23);
    printf("                                                           ");

}


void LimpaInfo()
{

    printf("                                  ");

}

void Gravar(Lista *L)
{

    FILE *arquivo = fopen("cadastro.dat", "wb");

    if(arquivo == NULL)
    {

        gotoxy(15, 23);
        printf("Erro ao abrir o arquivo");
        return;

    }
    else
    {

        system("cls");
        Tela();
        gotoxy(15, 23);
        printf("Dados gravados com sucesso");
        getch();

    }

    if (fwrite(L, sizeof(*L), 1, arquivo) != 1)
    {

        gotoxy(15, 23);
        printf("Erro ao gravar arquivo");

    }
    
    fclose(arquivo);

}

void Carregar(Lista *L)
{

    FILE *arquivo = fopen("cadastro.dat", "rb");

    if(arquivo == NULL)
    {

        L->inicio = 0;
        L->fim = 0;
        return;
        
    }


    size_t arquivo_lido = fread(L, sizeof(*L), 1, arquivo);
    fclose(arquivo);

    if(arquivo_lido != 1)
    {

        L->inicio = 0;
        L->fim = 0;

    }

}

int Pesquisa(Lista *L, int codigo)
{

    int i;

    if (codigo == 0)
    {

        return 0;

    }
    
    else
    {

        for (i = 0; i < L->fim; i++)
        {

            if (L->clie[i].codigo == codigo)
            {

                // Usuario existe

                return i;

            }

        }

        // Usuario nao existe

        return -1;

    }

}


void CadastrarCliente(Lista *L)
{

    registro_cliente registro_clie;
    int resposta;
    int resultado;




    do
    {

        do
        {

            Tela();
            MenuSecundario();


            gotoxy(45, 2);
            printf("CADASTRAR CLIENTE");


            InformacoesCliente();


            gotoxy(41, 7);
            scanf("%d", &registro_clie.codigo);


            resultado = Pesquisa(L, registro_clie.codigo);


            if ((resultado != -1) && (registro_clie.codigo != 0))
            {

                LimpaLinha();

                gotoxy(7, 23);
                printf("USUARIO JA EXISTENTE");

                gotoxy(28, 23);
                getch();

            }

        } while ((resultado != -1) && (registro_clie.codigo != 0));


        gotoxy(41, 9);
        fflush(stdin);
        fgets(registro_clie.nome, 40, stdin);

        gotoxy(41, 11);
        fflush(stdin);
        fgets(registro_clie.telefone, 12, stdin);

        gotoxy(41, 13);
        fflush(stdin);
        fgets(registro_clie.endereco, 50, stdin);

        gotoxy(41, 15);
        fflush(stdin);
        fgets(registro_clie.cpf, 16, stdin);

        gotoxy(41, 17);
        fflush(stdin);
        fgets(registro_clie.email, 20, stdin);

        gotoxy(41, 19);
        (stdin);
        fgets(registro_clie.data_nascimento, 11, stdin);


        LimpaLinha();
        gotoxy(7 ,23);
        printf("Deseja salvar os dados?: 1-Sim 2-Nao...:");

        gotoxy(49, 23);
        scanf("%d", &resposta);

        LimpaLinha();

        if (resposta == 1)
        {

            if (L->fim == MAX)
            {

                gotoxy(7, 23);
                printf("LISTA IMPOSSIVEL DE SER ESCRITA");

                getch();
                gotoxy(7, 23);

                LimpaLinha();

            }

            else
            {
            
                L->clie[L->fim] = registro_clie;

                L->fim++;

                LimpaLinha();

                gotoxy(7 ,23);
                printf("Usuario salvo com Sucesso!");


                gotoxy(35, 23);
                getch();

            }

        }

        gotoxy(7, 23);
        printf("Deseja cadastar outro cliente?: 1-Sim 2-Nao...:");

        gotoxy(55, 23);
        scanf("%d", &resposta);
    
        
    } while(resposta == 1);


}


void ConsultarCliente(Lista *L)
{

    int resultado, i, resposta;
    registro_cliente registro_clie;


    do
    {

        Tela();
        MenuSecundario();

        gotoxy(45, 2);
        printf("CONSULTAR CLIENTE");

        InformacoesCliente();

        LimpaLinha();

        gotoxy(3 ,23);
        printf("Digite o codigo(Digite 0 para sair):");


        gotoxy(40, 23);
        scanf("%d", &registro_clie.codigo);


        resultado = Pesquisa(L, registro_clie.codigo);


        if (resultado == 0)
        {

            LimpaLinha();

        }

        if (resultado != -1)
        {

            if (registro_clie.codigo == L->clie[resultado].codigo)
            {

                gotoxy(41, 7);
                printf("%d", L->clie[resultado].codigo);

                gotoxy(41, 9);
                printf("%s", L->clie[resultado].nome);

                gotoxy(41, 11);
                printf("%s", L->clie[resultado].telefone);

                gotoxy(41, 13);
                printf("%s", L->clie[resultado].endereco);

                gotoxy(41, 15);
                printf("%s", L->clie[resultado].cpf);

                gotoxy(41, 17);
                printf("%s", L->clie[resultado].email);

                gotoxy(41, 19);
                printf("%s", L->clie[resultado].data_nascimento);


                gotoxy(28, 23);


                LimpaLinha();

            }


        }

        else
        {

            LimpaLinha();

            gotoxy(5, 23);
            printf("CODIGO NAO REGISTRADO");

            gotoxy(27, 23);
            getch();

            LimpaLinha();

        }
        
        gotoxy(5, 23);
        printf("Deseja verificar outro cliente?: 1-Sim 2-Nao:");

        gotoxy(50, 23);
        scanf("%d", &resposta);


    } while (resposta == 1);


}


void AlterarCliente(Lista *L)
{

    int resultado, i, resposta, escolha, alterar, verificador;
    registro_cliente registro_clie;


    do
    {

        Tela();
        MenuSecundario();

        gotoxy(45, 2);
        printf("ALTERAR CLIENTE");

        InformacoesCliente();

        LimpaLinha();

        gotoxy(3 ,23);
        printf("Digite o codigo(Digite 0 para sair):");


        gotoxy(40, 23);
        scanf("%d", &registro_clie.codigo);


        resultado = Pesquisa(L, registro_clie.codigo);


        if (resultado == 0)
        {

            LimpaLinha();

        }


        if (resultado != -1)
        {

            if (registro_clie.codigo == L->clie[resultado].codigo)
            {

                gotoxy(41, 7);
                printf("%d", L->clie[resultado].codigo);

                gotoxy(41, 9);
                printf("%s", L->clie[resultado].nome);

                gotoxy(41, 11);
                printf("%s", L->clie[resultado].telefone);

                gotoxy(41, 13);
                printf("%s", L->clie[resultado].endereco);

                gotoxy(41, 15);
                printf("%s", L->clie[resultado].cpf);

                gotoxy(41, 17);
                printf("%s", L->clie[resultado].email);

                gotoxy(41, 19);
                printf("%s", L->clie[resultado].data_nascimento);


                gotoxy(28, 23);


                LimpaLinha();

            }

            do
            {

                    LimpaLinha();

                    gotoxy(5, 23);
                    printf("Qual dos dados voce deseja alterar?:");

                    gotoxy(42, 23);
                    scanf("%d", &escolha);


                    switch (escolha)
                    {


                        case 1:

                            gotoxy(41, 9);

                            LimpaInfo();

                            gotoxy(41, 9);

                            scanf("%s", L->clie[resultado].nome);

                            break;


                        case 2:

                            gotoxy(41, 11);

                            LimpaInfo();

                            gotoxy(41, 11);

                            scanf("%s", L->clie[resultado].telefone);

                            break;


                        case 3:

                            gotoxy(41, 13);

                            LimpaInfo();

                            gotoxy(41, 13);

                            scanf("%s", L->clie[resultado].endereco);

                            break;


                        case 4:

                            gotoxy(41, 15);

                            LimpaInfo();

                            gotoxy(41, 15);

                            scanf("%s", L->clie[resultado].cpf);

                            break;


                        case 5:

                            gotoxy(41, 17);

                            LimpaInfo();

                            gotoxy(41, 17);

                            scanf("%s", L->clie[resultado].email);

                            break;


                        case 6:

                            gotoxy(41, 19);

                            LimpaInfo();

                            gotoxy(41, 19);

                            scanf("%s", L->clie[resultado].data_nascimento);

                            break;

            
                        default:

                            LimpaLinha();

                            gotoxy(7, 23);
                            printf("INSIRA UM VALOR VALIDO");

                            break;

                    }



                LimpaLinha();
                

                gotoxy(7, 23);

                printf("Deseja alterar mais algum dado?: 1-Sim 2-Nao:");
                scanf("%d", &alterar);


            } while (alterar != 2);

        }

        else
        {

            LimpaLinha();

            gotoxy(5, 23);
            printf("CODIGO NAO REGISTRADO");

            gotoxy(27, 23);
            getch();

            LimpaLinha();

        }
        

        LimpaLinha();


        gotoxy(5, 23);
        printf("Deseja alterar outro cliente?: 1-Sim 2-Nao:");

        gotoxy(50, 23);
        scanf("%d", &resposta);


    } while (resposta == 1);


}

void ExcluirCliente(Lista *L) 
{

    int resultado, resposta, exclusao;
    registro_cliente registro_clie;

    do 
    {

        Tela();
        MenuSecundario();

        gotoxy(45, 2);
        printf("EXCLUIR CLIENTE");

        InformacoesCliente();

        LimpaLinha();

        gotoxy(3, 23);
        printf("Digite o codigo (0 para sair): ");

        gotoxy(35, 23);
        scanf("%d", &registro_clie.codigo);

        if (registro_clie.codigo == 0) {
            LimpaLinha();
            break;
        }

        resultado = Pesquisa(L, registro_clie.codigo);

        if (resultado != -1) {


            gotoxy(41, 7);  
            printf("%d", L->clie[resultado].codigo);

            gotoxy(41, 9);  
            printf("%s", L->clie[resultado].nome);

            gotoxy(41, 11); 
            printf("%s", L->clie[resultado].telefone);

            gotoxy(41, 13); 
            printf("%s", L->clie[resultado].endereco);

            gotoxy(41, 15); 
            printf("%s", L->clie[resultado].cpf);

            gotoxy(41, 17); 
            printf("%s", L->clie[resultado].email);

            gotoxy(41, 19); 
            printf("%s", L->clie[resultado].data_nascimento);


            LimpaLinha();

            gotoxy(5, 23);
            printf("Deseja mesmo excluir o cliente? 1-Sim  2-Nao: ");
            scanf("%d", &exclusao);


            if (exclusao == 1) {
                
                if (L->fim > 0 && resultado >= 0 && resultado < L->fim) 
                {

                    for (int i = resultado; i < L->fim - 1; i++) 
                    {

                        L->clie[i] = L->clie[i + 1];

                    }

                    L->fim--;

                    LimpaLinha();

                    gotoxy(5, 23);
                    printf("Cliente excluido com sucesso.");
                    getch();

                } 

                else 
                {
                    LimpaLinha();

                    gotoxy(5, 23);
                    printf("Falha ao excluir (indice invalido).");
                    getch();

                }

            }

        } 
        
        else 
        {

            LimpaLinha();
            gotoxy(5, 23);
            printf("CODIGO NAO REGISTRADO");
            
            gotoxy(27, 23);
            getch();
            LimpaLinha();
        }

        gotoxy(5, 23);
        printf("Deseja excluir outro cliente? 1-Sim  2-Nao: ");

        gotoxy(50, 23);
        scanf("%d", &resposta);


    } while (resposta == 1);

}





int main(void)
{

    int opcao;

    Lista L;
    L.inicio = 0;
    L.fim = 0;

    //Tela
    
    Carregar(&L);

    system("cls");
    Tela();
    gotoxy(15, 23);
    printf("%d Dado(s) carregado(s) com sucesso", L.fim);
    getch();
        

    do 
    {

        system("cls");
        Tela();
        MenuPrincipal();


        gotoxy(30, 7);
        printf("1-Cadastrar Cliente");

        gotoxy(30, 10);
        printf("2-Consultar Cliente");

        gotoxy(30, 13);
        printf("3-Alterar Cliente");

        gotoxy(30, 16);
        printf("4-Excluir Cliente");

        gotoxy(30, 19);
        printf("5-Finalizar Programa");

        gotoxy(13 ,23);
        scanf("%d", &opcao);


        switch(opcao)
        {

            case 1:

                CadastrarCliente(&L);

                break;

            case 2:

                ConsultarCliente(&L);

                break;

            case 3:

                AlterarCliente(&L);

                break;

            case 4:

                ExcluirCliente(&L);

                break;

            case 5:

                Gravar(&L);

                break;

        }

    } while (opcao != 5);

}