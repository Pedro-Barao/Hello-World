using System.Formats.Asn1;
namespace Aprendendo_C_Sharp
{
    
    public class Exemplo_2()
    {
        
        public static void Main()
        {
        
            bool potencia = true;
            int divisao;

            Console.WriteLine("Qual o número a ser testado?: ");
            int numero = int.Parse(Console.ReadLine());

            divisao = numero / 2;

            if (numero % 2 == 0 && divisao % 2 == 0)
            {
                
                Console.WriteLine(potencia);

            }

            else
            {
                
                potencia = false;

                Console.WriteLine(potencia);

            }

        }

    }

}