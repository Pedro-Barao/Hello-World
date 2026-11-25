/*

Autor: Pedro Gonella Barão
Data: 08/08/2025
Objetivo: Casting(mudança de variáveis)
 */

public class Casting3 {
    
    public static void main(String[] args)
    {
        
        int num_int = 128;
        byte num_int_to_byte = (byte) num_int;
        
        System.out.println(num_int_to_byte);
        
        /*
            
         Probelmas percebidos:

         -Como esperado a partir do número 128 em diate (ou -129),
         o código não consiguirá escrever mais o número desejado,
         pois o byte se limita a uma faixa de -128 indo até 127.
        
        */
        
        
        
        
        double num_double = 400.564341231;
        float num_double_to_float = (float) num_double;
        
        System.out.println(num_double_to_float);
        
        /*
            
         Probelmas percebidos:

         -A partir do sexto caracter em diante a variável
         float não consegue mais detectar os carateres e acaba
         deixando de escreve-los, assim "resumindo" para um número
         que a variável consegue processar.
        
        */
        
        
        
        float num_float = 73.35f;
        int num_float_to_int = (int) num_float;
        
        System.out.println(num_float_to_int);
        
        /*
            
         Probelmas percebidos:

         -Como esperado um número float acaba perdendo sua
         característica principal que é processar números
         decimais e assim passa a mostrar apenas os números antes
         das casas decimais.
        
        */
                
                
        
        
        long num_long = 32768;
        short num_long_to_short = (short) num_long;
        
        System.out.println(num_long_to_short);
        
                /*
            
         Probelmas percebidos:

         -Como esperado a partir do número 32768 em diate (ou -32769),
         o código não consiguirá escrever mais o número desejado,
         pois o short se limita a uma faixa de -32768 indo até 32767.
        
        */
                
    }
}
