/*

    Autor: Pedro Gonella Barao
    Data: 03/10/2025
    Objetivo: Exercício de Lista Duplamente Encadeada:
    Cadastro de Funcionários
    Inserir no início, fim e posição
    Remover no início, fim e posição
    Alterar cadastro
    Consultar por código
    Gravar/Carregar em arquivo .dat

*/

#include <string.h>
#include <conio.h>     // getch()
#include "funcao_basica.h"   // gotoxy, Tela, MenuPrincipal, MenuSecundario (fornecido pelo usuário)


//Struct dos dadaos dos funcionarios
typedef struct 
{
    int   codigo; //Inalteravel
    char  nome[50];
    char  endereco[50];
    char  cargo[50];
    char  dt_nascimento[11];
    char  telefone[15];
    float salario;

} reg_funcionarios;

//Uma struct responsavel por gerar apontadores para itens da lista
typedef struct TipoItem *TipoApontador;

//Uma struct para apontar para os itens da lista
typedef struct TipoItem
{
    TipoApontador anterior; //Pega um ponteiro e manda para o funcionario antecessor listado
    reg_funcionarios conteudo; //Pega um ponteiro para mostrar todos os dados de um funcionario
    TipoApontador proximo; //Pega um ponteiro e manda para o funcionario sucessor listado

} TipoItem;

//Uma struct que ponta para o anterior do primeiro item da lista e o proximo do ultimo item da lista
typedef struct 
{
    TipoApontador Primeiro;  // ponteiro para o primeiro nó
    TipoApontador Ultimo;    // ponteiro para o último nó

} TipoLista;


//Uma funcao que mostra as informacoes que o usuario deve preencher
void InformacoesFuncionario()
{

    gotoxy(10, 7);  printf("====Codigo...................:");

    gotoxy(10, 9);  printf("1 - Nome.....................:");

    gotoxy(10, 11); printf("2 - Endereco.................:");

    gotoxy(10, 13); printf("3 - Cargo....................:");

    gotoxy(10, 15); printf("4 - Data de Nascimento.......:");

    gotoxy(10, 17); printf("5 - Telefone.................:");
    
    gotoxy(10, 19); printf("6 - Salario..................:");

}


//Uma funcao que limpa a linha principal de inputs do usuario
void LimpaLinha()
{

    gotoxy(2, 23);
    printf("                                                                               ");


    gotoxy(2, 23);
    printf("Resposta.:");

}


//Uma funcao que limpa linhas adversas na tela
void LimpaInfo()
{

    printf("                                    ");

}


//Uma funcao que "limpa" funcoes como scanf para que nao sobre espacos vazios
void LimpaTeclado()
{

    int c;
    while ((c = getchar()) != '\n' && c != EOF) {}
    
}


//Uma funcao que faz no final de todo procedimento dar um free nos ponteiros
void LiberarLista(TipoLista *L)
{

    //Um ponteiro que aponta para o primeiro elemento da lista
    TipoApontador p = L->Primeiro;

    while (p != NULL) 
    {

        TipoApontador prox = p->proximo;
        free(p);
        p = prox;

    }

    L->Primeiro = L->Ultimo = NULL;

}


//Uma funcao que imprime na tela do usuario todas os dados presentes em um funcionario
void MostrarFuncionario(reg_funcionarios *f)
{

    gotoxy(41, 7);  
    printf("%d",   f->codigo);

    gotoxy(41, 9);
    printf("%s",   f->nome);

    gotoxy(41, 11); 
    printf("%s",   f->endereco);

    gotoxy(41, 13); 
    printf("%s",   f->cargo);

    gotoxy(41, 15); 
    printf("%s",   f->dt_nascimento);

    gotoxy(41, 17);
    printf("%s",   f->telefone);

    gotoxy(41, 19); 
    printf("%.2f", f->salario);

}


//Uma funcao que faz com que de inicio ao procedimento da lista
void Inicializa(TipoLista *L)
{

    L->Primeiro = NULL;
    L->Ultimo   = NULL;
    
}


//Uma funcao que auxilia a listar todos os cadastros, seja para grava-los ou consulta-los
int Contador(TipoLista *L)
{

    int cont = 0;

    for (TipoApontador p = L->Primeiro; p != NULL; p = p->proximo) 
    {

        cont++;

    }


    return cont;

}


//Uma funcao que cria um novo no dentro do programa, utilizado em casos de cadastro ou carregamento de dados
TipoApontador NovoNo(const reg_funcionarios *dado)
{

    TipoApontador p = (TipoApontador)malloc(sizeof(TipoItem));

    if (!p) return NULL;

    p->conteudo = *dado;
    p->anterior = NULL;
    p->proximo  = NULL;

    return p;

}


//Uma funcao que pesquisa pelo codigo de um usuario registrado
TipoApontador BuscaPorCodigo(TipoLista *L, int codigo)
{

    for (TipoApontador p = L->Primeiro; p != NULL; p = p->proximo)

        if (p->conteudo.codigo == codigo) 
        {

            return p;

        }

    return NULL;

}


//Uma funcao que ajeita a lista e define se ela sera em ordem alfabetica ou por codigo
void OrdenaLista(TipoLista *L, int ordem)
{

    TipoApontador p, r;
    int i, j, quantidade;
    reg_funcionarios aux;

    if (L == NULL) return;

    quantidade = Contador(L);

    if (quantidade <= 1) return;  // nada a ordenar

    p = L->Primeiro;

    if (ordem == 1)  /* 1 = alfabética por nome */
    {

        for (i = 1; i < quantidade && p != NULL; i++, p = p->proximo)
        {

            r = p->proximo;  /* reinicia r a cada volta */

            for (j = i + 1; j <= quantidade && r != NULL; j++, r = r->proximo)
            {

                int resultado = strcmp(p->conteudo.nome, r->conteudo.nome);

                if (resultado > 0)
                {

                    aux = p->conteudo;
                    p->conteudo = r->conteudo;
                    r->conteudo = aux;

                }

            }

        }

    }

    else            /* 2 (ou qualquer outro) = por código */
    {

        p = L->Primeiro;  /* garante p no início para o segundo modo */

        for (i = 1; i < quantidade && p != NULL; i++, p = p->proximo)
        {

            r = p->proximo;

            for (j = i + 1; j <= quantidade && r != NULL; j++, r = r->proximo)
            {

                if (p->conteudo.codigo > r->conteudo.codigo)
                {

                    aux = p->conteudo;
                    p->conteudo = r->conteudo;
                    r->conteudo = aux;

                }

            }

        }

    }

}


//Uma funcao para gravar os registros do sistema em um arquivo .dat
void Gravar(TipoLista *L)
{

    FILE *f = fopen("cadastro.dat", "wb");

    if (f == NULL)
    {

        gotoxy(15, 23); 
        printf("Erro ao abrir arquivo para gravacao");

        getch();
        return;

    }

    int n = Contador(L);

    if (fwrite(&n, sizeof(int), 1, f) != 1)
    {
        
        fclose(f);

        gotoxy(15, 23); 
        printf("Erro ao gravar quantidade");
        getch();
        return;

    }

    for (TipoApontador p = L->Primeiro; p != NULL; p = p->proximo)
    {
        if (fwrite(&p->conteudo, sizeof(reg_funcionarios), 1, f) != 1)
        {

            fclose(f);

            gotoxy(15, 23); 
            printf("Erro ao gravar registro");
            getch();
            return;

        }

    }

    fclose(f);

    gotoxy(15, 23); 
    printf("Dados gravados com sucesso");
    getch();

}


//Uma funcao que carrega o arquivo .dat e traz para o sistema os cadastros ja feitos
void Carregar(TipoLista *L)
{

    FILE *f = fopen("cadastro.dat", "rb");

    if (f == NULL) 
    { 

        Inicializa(L); 
        return; 

    }

    int n = 0;

    size_t ok = fread(&n, sizeof(int), 1, f);

    if (ok != 1) 
    { 

        fclose(f); 
        Inicializa(L); 
        return; 

    }

    Inicializa(L);

    for (int i = 0; i < n; i++)
    {

        reg_funcionarios r;

        if (fread(&r, sizeof(reg_funcionarios), 1, f) != 1) 
        {

            break; // arquivo corrompido ou curto

        }

        // inserir no FINAL diretamente (sem chamar InserirFim)
        TipoApontador p = NovoNo(&r);

        if (!p) 
        {

            // falha de memória: para de carregar para não inconsistir a lista
            break;

        }

        if (L->Primeiro == NULL) 
        {
            
            L->Primeiro = L->Ultimo = p;

        } 
        
        else 
        {

            p->anterior = L->Ultimo;
            L->Ultimo->proximo = p;
            L->Ultimo = p;

        }

    }

    fclose(f);

}


//Uma funcao para receber os dados para o cadastro
void ColetarFuncionario(reg_funcionarios *r)
{

    Tela();
    MenuSecundario();

    gotoxy(35, 2); printf("CADASTRO DE FUNCIONARIO");

    InformacoesFuncionario();

    gotoxy(41, 7);
    scanf("%d", &r->codigo);

    gotoxy(41, 9);  
    fflush(stdin);
    fgets(r->nome, 50, stdin);

    gotoxy(41, 11);
    fflush(stdin);
    fgets(r->endereco, 50, stdin);

    gotoxy(41, 13);
    fflush(stdin);
    fgets(r->cargo, 50, stdin);

    gotoxy(41, 15);
    fflush(stdin);
    fgets(r->dt_nascimento, 50, stdin);

    gotoxy(41, 17);
    fflush(stdin);
    fgets(r->telefone, 50, stdin);

    gotoxy(41, 19);
    scanf("%f", &r->salario);

}


//Uma funcao que cadastra um usuario no inicio da lista
void CadastrarInicio(TipoLista *L)
{

    int resultado;

    do
    {
        
        reg_funcionarios r;

        //Codigo unico
        int existe;
        do 
        {

            ColetarFuncionario(&r);

            existe = (BuscaPorCodigo(L, r.codigo) != NULL);

            if (existe) 
            { 
                
                LimpaLinha(); 
                
                printf("CODIGO JA CADASTRADO"); 
                getch(); 
            
            }

        } while (existe);

        //Inserir no INICIO (sem chamar outra função)
        TipoApontador p = NovoNo(&r);

        if (!p) 
        { 
            
            LimpaLinha(); 
            
            printf("Falha de memoria"); 
            getch(); 
            return; 

        }


        if (L->Primeiro == NULL) 
        {

            L->Primeiro = L->Ultimo = p;

        } 
        
        else 
        {

            p->proximo = L->Primeiro;
            L->Primeiro->anterior = p;
            L->Primeiro = p;

        }

        LimpaLinha(); 
        
        printf("Funcionario cadastrado no INICIO!"); 
        getch();

        LimpaLinha(); 

        printf("Deseja cadastrar outro usuario?: 1-Sim 2-Nao:");
        scanf("%d", &resultado); 

    } while (resultado != 2);

}


//Uma funcao que registra um funcionario no final da lista
void CadastrarFim(TipoLista *L)
{
    
    int resultado;

    do
    {
        reg_funcionarios r;

        int existe;

        do 
        {

            ColetarFuncionario(&r);

            //Procedimento de enviar a variavel para o mecanismo de busca
            existe = (BuscaPorCodigo(L, r.codigo) != NULL);

            //Verificacao para o ver se o codigo ja foi cadastrado
            if (existe) 
            { 
                LimpaLinha(); 

                printf("CODIGO JA CADASTRADO");
                getch(); 
            
            }

        } while (existe);

        //Inserir no FINAL (sem chamar outra função)
        TipoApontador p = NovoNo(&r);

        //Falha no cadastro
        if (!p) 
        { 
            
            LimpaLinha(); 

            printf("Falha de memoria"); 
            getch(); 
            return; 
        
        }

        if (L->Primeiro == NULL) 
        {

            L->Primeiro = L->Ultimo = p;

        } 
        
        else 
        {

            p->anterior = L->Ultimo;
            L->Ultimo->proximo = p;
            L->Ultimo = p;

        }

        LimpaLinha(); 
        
        printf("Funcionario cadastrado no FINAL!"); 
        getch();

        LimpaLinha(); 
        
        printf("Deseja cadastrar outro usuario?: 1-Sim 2-Nao:");
        scanf("%d", &resultado); 

    } while(resultado != 2);

}


//Uma funcao para cadastrar um funcionario em qualquer posicao da lista
void CadastrarPosicao(TipoLista *L)
{

    int resultado;

    do
    {

        reg_funcionarios r;

        int existe;

        do 
        {

            ColetarFuncionario(&r);

            existe = (BuscaPorCodigo(L, r.codigo) != NULL);

            if (existe) 
            { 
                
                LimpaLinha(); 
                
                printf("CODIGO JA CADASTRADO"); 
                getch(); 

            }

        } while (existe);

        LimpaLinha(); 
        
        printf("Digite a posicao desejada: ");
        int pos = 1; scanf("%d", &pos); 

        //Inserir NA POSIÇÃO (tudo aqui dentro)
        TipoApontador p = NovoNo(&r);

        if (!p) 
        { 
            
            LimpaLinha(); 
            
            printf("Falha de memoria"); 
            getch(); 
            return; 
        
        }

        if (L->Primeiro == NULL) 
        {

            //Lista vazia -> vira primeiro/último
            L->Primeiro = L->Ultimo = p;

        } 
        
        else 
        {

            int n = Contador(L);

            if (pos <= 1) 
            {

                //Como inicio
                p->proximo = L->Primeiro;
                L->Primeiro->anterior = p;
                L->Primeiro = p;

            } 
            
            else if (pos > n) 
            {

                //Como fim
                p->anterior = L->Ultimo;
                L->Ultimo->proximo = p;
                L->Ultimo = p;

            } 
            
            else 
            {

                //Inserir antes do nó na posição determinada
                TipoApontador atual = L->Primeiro;
                for (int i = 1; i < pos; i++) atual = atual->proximo;

                p->proximo = atual;
                p->anterior = atual->anterior;
                atual->anterior->proximo = p;
                atual->anterior = p;

            }

        }

        LimpaLinha(); 
        
        printf("Funcionario cadastrado na POSICAO!"); 
        getch();

        LimpaLinha(); 

        printf("Deseja cadastrar outro usuario?: 1-Sim 2-Nao:");
        scanf("%d", &resultado); 

    } while(resultado != 2);
}


//Uma funcao que remove um funcionario do comeco da lista
void RemoverNoInicio(TipoLista *L)
{

    Tela(); 
    MenuSecundario();

    gotoxy(30, 2); 
    printf("REMOVER FUNCIONARIO - INICIO");

    if (L->Primeiro == NULL) 
    {

        LimpaLinha(); 

        printf("Lista vazia!"); 
        getch();
        return;

    }

    TipoApontador p = L->Primeiro;

    if (L->Primeiro == L->Ultimo) 
    {

        L->Primeiro = L->Ultimo = NULL;

    } 
    
    else 
    {

        L->Primeiro = p->proximo;
        L->Primeiro->anterior = NULL;

    }

    free(p);

    LimpaLinha(); 
    
    printf("Removido do INICIO com sucesso!"); 
    getch();

}


//Uma funcao que remove um funcionario do fim da lista
void RemoverNoFim(TipoLista *L)
{

    Tela(); 
    MenuSecundario();

    gotoxy(30, 2); 
    printf("REMOVER FUNCIONARIO - FINAL");

    if (L->Primeiro == NULL) 
    {

        LimpaLinha(); 

        printf("Lista vazia!"); 
        getch();
        return;

    }

    TipoApontador p = L->Ultimo;

    if (L->Primeiro == L->Ultimo) 
    {

        L->Primeiro = L->Ultimo = NULL;

    } 

    else 
    {

        L->Ultimo = p->anterior;
        L->Ultimo->proximo = NULL;

    }

    free(p);

    LimpaLinha(); 
    
    printf("Removido do FINAL com sucesso!"); 
    getch();

}


//Uma funcao que deleta o funcionario independente sua posicao
void RemoverEmPosicao(TipoLista *L)
{

    int pos; 
    
    Tela(); 
    MenuSecundario();

    gotoxy(28, 2); 
    printf("REMOVER FUNCIONARIO - POSICAO");

    if (L->Primeiro == NULL) 
    {

        LimpaLinha();
        
        printf("Lista vazia!"); 
        getch();
        return;

    }

    LimpaLinha(); 

    printf("Digite a posicao a remover: ");
    scanf("%d", &pos); 

    LimpaTeclado(); //Se estiver usando ClearInputBuffer(), troque aqui

    int n = Contador(L);

    //Normaliza: <=1 remove início; >=n remove fim
    if (pos <= 1) 
    {

        TipoApontador p = L->Primeiro;

        if (L->Primeiro == L->Ultimo) 
        {

            L->Primeiro = L->Ultimo = NULL;

        } 

        else 
        {

            L->Primeiro = p->proximo;
            L->Primeiro->anterior = NULL;

        }

        free(p);

        LimpaLinha(); 
        
        printf("Removido na POSICAO (inicio) com sucesso!"); 
        
        getch();
        return;
    }

    if (pos >= n) 
    {

        TipoApontador p = L->Ultimo;

        if (L->Primeiro == L->Ultimo) 
        {

            L->Primeiro = L->Ultimo = NULL;

        } 
        
        else 
        {

            L->Ultimo = p->anterior;
            L->Ultimo->proximo = NULL;

        }

        free(p);

        LimpaLinha(); 
        
        printf("Removido na POSICAO (final) com sucesso!"); 
        getch();
        return;

    }

    //Posição válida no meio: percorre e remove
    TipoApontador atual = L->Primeiro;

    for (int i = 1; i < pos; i++) 
    {
        
        atual = atual->proximo;

    }

    atual->anterior->proximo = atual->proximo;
    atual->proximo->anterior = atual->anterior;

    free(atual);

    LimpaLinha(); 
    
    printf("Removido na POSICAO com sucesso!");
    getch();

}


//Uma funcao que altera qualquer dado de um funcionario (menos seu codigo)
void AlterarFuncionario(TipoLista *L)
{

    int codigo, resultado, escolha;
    reg_funcionarios *f = NULL;

    do
    {

        Tela(); 
        MenuSecundario();

        gotoxy(33, 2); 
        printf("ALTERAR FUNCIONARIO");

        InformacoesFuncionario();
        LimpaLinha(); 
        
        printf("Digite o codigo (0 para sair): ");
        scanf("%d", &codigo); 
        
        LimpaTeclado();

        if (codigo == 0) 
        {
            
            return;

        }

        TipoApontador p = BuscaPorCodigo(L, codigo);

        if (!p)
        {
            LimpaLinha(); 
            
            printf("CODIGO NAO REGISTRADO"); 
            getch();
            continue;

        }

        f = &p->conteudo;

        MostrarFuncionario(f);

        do
        {

            LimpaLinha(); 

            printf("Qual dado deseja alterar? (0-Sair): ");
            scanf("%d", &escolha); 
            
            LimpaTeclado();

            switch (escolha)
            {

                case 1: 
                
                    gotoxy(41, 9);  
                
                    LimpaInfo(); 
                
                    gotoxy(41, 9);  
                    fflush(stdin);
                    fgets(f->nome, 50, stdin);

                    break;

                case 2: 
                
                    gotoxy(41, 11); 
                
                    LimpaInfo(); 
                
                    gotoxy(41, 11); 
                    fflush(stdin);
                    fgets(f->endereco, 50, stdin);

                    break;

                case 3: 
                
                    gotoxy(41, 13); 
                
                    LimpaInfo(); 
                
                    gotoxy(41, 13); 
                    fflush(stdin);
                    fgets(f->cargo, 50, stdin);

                    break;

                case 4: 
                
                    gotoxy(41, 15); 
                
                    LimpaInfo(); 
                
                    gotoxy(41, 15); 
                    fflush(stdin);
                    fgets(f->dt_nascimento, 11, stdin);
                    
                    break;

                case 5: 
                
                    gotoxy(41, 17); 
                
                    LimpaInfo(); 
                
                    gotoxy(41, 17); 
                    fflush(stdin);
                    fgets(f->telefone, 12, stdin);
                    
                    break;

                case 6:
                
                    gotoxy(41, 19); 
                
                    LimpaInfo(); 
                
                    gotoxy(41, 19); 
                    scanf("%f", &f->salario);
                    
                    break;

                case 0: 
                
                    break;

                default:

                    LimpaLinha(); 
                    
                    printf("INSIRA UM VALOR VALIDO"); 
                    getch();

            }

        } while (escolha != 0);

        LimpaLinha(); 
        
        printf("Dados atualizados!"); 
        getch();

        LimpaLinha(); 
        
        printf("Deseja alterar outro? 1-Sim 2-Nao: ");
        scanf("%d", &resultado); 
        
        LimpaTeclado();

    } while (resultado != 2);

}


//Uma funcao que mostra em forma de lista todos os dados de todos os usuarios (em ordem alfabetica ou em ordem crescente de codigo)
void ConsultarFuncionario(TipoLista *L)
{

    Tela();
    MenuSecundario();

    if (L->Primeiro == NULL) 
    {

        LimpaLinha(); 

        printf("Lista vazia!"); 
        getch();
        return;

    }

    int num = 6, numMax = 22, ordem;
    TipoApontador p;

    gotoxy(15, 23);
    printf("Qual ordem voce quer na lista?: 1-Alfabetica 2-Por codigo:");
    scanf("%d", &ordem);

    system("cls");

    Tela();
    MenuSecundario();

    OrdenaLista(L, ordem);
    
    gotoxy(30, 2); printf("LISTA DE FUNCIONARIOS");
    gotoxy(3, 4);  printf("COD  | %-30s | %-20s | %12s", "NOME", "CARGO", "SALARIO");
    gotoxy(3, 5);  printf("-----+--------------------------------+----------------------+--------------");

    for(p = L->Primeiro; p != NULL; p = p->proximo)
    {

        gotoxy(2, num);
        printf(" %-4d | %-30.*s | %-20.*s | %12.2f", 
            p->conteudo.codigo, 
            (int)strcspn(p->conteudo.nome,  "\r\n"), p->conteudo.nome, 
            (int)strcspn(p->conteudo.cargo, "\r\n"), p->conteudo.cargo, 
            p->conteudo.salario);

        num++;

        if (num >= numMax && p->proximo != NULL) 
        {
            
            LimpaLinha(); 
        
            printf("Mais registros... pressione uma tecla"); 
            getch();
            
            Tela();
            MenuSecundario();

            gotoxy(30, 2); printf("LISTA DE FUNCIONARIOS (continua)");
            gotoxy(3, 4);  printf("COD  | %-30s | %-20s | %12s", "NOME", "CARGO", "SALARIO");
            gotoxy(3, 5);  printf("-----+--------------------------------+----------------------+--------------");

            num = 6;

        }

    }

    gotoxy(13, 23);
    printf("Pressione qualquer tecla para continuar....");
    getch();

}


//Uma funcao principal que serve de tela principal para o usuario
int main(void)
{
    
    TipoLista L;
    Inicializa(&L);

    int opcao;

    // Carregar arquivo, se existir
    Carregar(&L);
    system("cls");

    Tela();

    gotoxy(15, 23);
    printf("%d Dado(s) carregado(s) com sucesso", Contador(&L));
    getch();


    do
    {

        system("cls");

        Tela();
        MenuPrincipal();

        //Opcoe de o que o usuario pode fazer no programa
        gotoxy(18, 5);  
        printf("1 - Cadastrar Funcionario no Final da Lista");

        gotoxy(18, 7);  
        printf("2 - Cadastrar Funcionario no Inicio da Lista");

        gotoxy(18, 9);  
        printf("3 - Cadastrar Funcionario em uma Posicao da Lista");

        gotoxy(18, 11); 
        printf("4 - Remover Funcionario no Final da Lista");

        gotoxy(18, 13); 
        printf("5 - Remover Funcionario no Inicio da Lista");

        gotoxy(18, 15); 
        printf("6 - Remover Funcionario em uma Posicao da Lista");

        gotoxy(18, 17); 
        printf("7 - Alteracao do Cadastro de Funcionario");

        gotoxy(18, 19); 
        printf("8 - Consultar Funcionarios");

        gotoxy(18, 21); 
        printf("9 - Sair do Programa");

        gotoxy(13, 23);
        scanf("%d", &opcao);

        LimpaTeclado();

        switch (opcao)
        {
            case 1: 
            
                CadastrarFim(&L);        
            
                break;

            case 2: 
            
                CadastrarInicio(&L);     
                
                break;

            case 3: 
            
                CadastrarPosicao(&L);    
                
                break;

            case 4: 
            
                RemoverNoFim(&L);        
                
                break;

            case 5: 
            
                RemoverNoInicio(&L);     
                
                break;

            case 6: 
            
                RemoverEmPosicao(&L);    
                
                break;

            case 7: 
            
                AlterarFuncionario(&L);  
                
                break;

            case 8: 
            
                ConsultarFuncionario(&L);
                
                break;

            case 9: 
            
                Gravar(&L);              
                
                break;

            default:

                LimpaLinha(); 

                printf("Opcao invalida!"); 
                getch();

        }

    } while (opcao != 9);


    // Libera a lista antes de sair
    LiberarLista(&L);

}
