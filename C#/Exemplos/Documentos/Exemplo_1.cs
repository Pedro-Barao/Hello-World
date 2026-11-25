//Nome da Pasta Principal
using System.Formats.Asn1;
namespace Aprendendo_C_Sharp
{    
    //Classe
    public class Exemplo_1()
    {
        //Main
        public static void Main()
        {
            //Print
            Console.WriteLine("Hello World");

            //Declaração de variável
            int x = 10;

            //Concicionais
            if ((x == 10) || (x == 2))
            {
                
                Console.WriteLine("Correto");

            }

            else
            {
                
                Console.WriteLine("Incorreto");

            }

            //Vetor
            int[] numeros = new int[3];

            //Colocando os valores em numeros
            for(int i = 0; i < numeros.Length; i++)
            {
                
                numeros[i] = i + 1;

            }

            //Mostrando todos os numeros
            for(int i = 0; i < numeros.Length; i++)
            {
                
                Console.WriteLine(numeros[i]);

            }

            //Resultado = 1
            Console.WriteLine(numeros[0]);

            //Lista
            List<string> nomes = ["Pedro", "João", "Marcos"];

            //Resultado = Todos os Nomes
            nomes.ForEach(Console.WriteLine);

            //Resultado = "Olá, 'Nome', seja bem-vindo(a)!" 
            foreach(string nome in nomes)
            {
                
                Console.WriteLine($"Olá, {nome}, seja bem-vindo(a)!");

            }

            //Resultado = "Olá, 'NOME', seja bem-vindo(a)!" 
            foreach(string nome in nomes)
            {
                
                Console.WriteLine($"Olá, {nome.ToUpper()}, seja bem-vindo(a)!");

            }

            List<string> outros_nomes = ["Carlos", "Ana", "Maria"];

            //Contando quantos Nomes tem
            Console.WriteLine($"Temos {nomes.Count} na lista de nomes agora");

            //Mais Nomes
            nomes.Add("Carlos");
            nomes.Add("Antonio");
            nomes.Add("Andre");

            //Nomes por Ordem Alfabética
            nomes.Sort();
            nomes.ForEach(Console.WriteLine);

            Console.WriteLine($"Temos {nomes.Count} na lista de nomes agora");

        }

    }
    
}
