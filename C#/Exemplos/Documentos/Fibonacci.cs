using System.Formats.Asn1;

namespace Aprendendo_C_Sharp
{
    
    public class Fibonacci
    {
        
        public static void Main()
        {
            
            List<int> numerosFibonacci = [1, 1];

            for(int i = 0; i < 18; i++)
            {
                
                int novo_numero = numerosFibonacci[i] + numerosFibonacci[i + 1];

                numerosFibonacci.Add(novo_numero);

            }

            numerosFibonacci.ForEach(Console.WriteLine);

            Console.WriteLine($"A sequencia de FIbonacci tem {numerosFibonacci.Count} de números");

        }

    }
}