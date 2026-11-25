import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main { 

    public static void main(String[] args)
    {

        /*
        List<Integer> lista = new ArrayList<>();

        try
        {

            File pista = new File("/home/pedrob/Downloads/OperacaoEnigmaFinal/src/pista_01.jpg");

            BufferedImage imagem_pista = ImageIO.read(pista);

            int largura_imagem = imagem_pista.getWidth();
            int altura_imagem = imagem_pista.getHeight();

            int[][] matriz_imagem = new int[200][200];

            for(int i = 0; i < 200; i++)
            {

                for(int x = 0; x < 200; x++)
                {

                    matriz_imagem[x][i] = 0;
                    
                }

            }

            for(int i = 0; i < altura_imagem; i++)
            {

                for(int x = 0; x < largura_imagem; x++)
                {

                    int cor_pixel = imagem_pista.getRGB(x, i);

                    Color cor = new Color(cor_pixel);

                    if(cor.getBlue() == 0) 
                    { 
                            
                        matriz_imagem[x][i] += 0;
                        
                    }

                    else if(cor.getBlue() < 255)
                    {

                        matriz_imagem[x][i] += 1;

                    }

                    else
                    {

                        matriz_imagem[x][i] += 2;

                    }


                    if(cor.getRed() == 0)
                    {

                        matriz_imagem[x][i] += 0;

                    }

                    else if(cor.getRed() < 255)
                    {

                        matriz_imagem[x][i] += 1;

                    }

                    else
                    {

                        matriz_imagem[x][i] += 2;

                    }

                    if(cor.getGreen() == 0)
                    {

                        matriz_imagem[x][i] += 0;


                    }

                    else if(cor.getGreen() < 255)
                    {

                        matriz_imagem[x][i] += 1;

                    }

                    else
                    {

                        matriz_imagem[x][i] += 2;

                    }

                }

            }

            for(int i = 0; i < altura_imagem; i++)
            {

                for(int x = 1; x < largura_imagem - 1; x++)
                {

                    int anterior = matriz_imagem[x - 1][i];
                    int atual = matriz_imagem[x][i];
                    int proximo = matriz_imagem[x + 1][i];

                    if (anterior == 3 && proximo == 3 && atual != 3) 
                    {

                        lista.add(matriz_imagem[x][i]);
                        
                        System.out.println(
                            "Linha: " + i +
                            " Coluna: " + x +
                            " Valor: " + atual+
                            " Binário: " + Integer.toBinaryString(atual)
                        );
                            
                    }
                        
                }

            }
            
            System.out.print("\n");

            lista.forEach(l -> System.out.print(l));

            System.out.println("\n");
            System.out.println(largura_imagem);
            System.out.println(altura_imagem);

            System.out.println("\nValor: 0\n");
            System.out.println("Azul = 0: " + contador_azul_0);
            System.out.println("Verde = 0: " + contador_verde_0);
            System.out.println("Vermelho = 0: " + contador_vermelho_0);

            System.out.println("\nValor: 255\n");
            System.out.println("Azul = 255: " + contador_azul_255);
            System.out.println("Verde = 255: " + contador_verde_255);
            System.out.println("Vermelho = 255: " + contador_vermelho_255);

            System.out.println("\nValor: <255 e >0\n");
            System.out.println("Azul = <255 e >0: " + contador_azul);
            System.out.println("Verde = <255 e >0: " + contador_verde);
            System.out.println("Vermelho = <255 e >0: " + contador_vermelho);
            
           
        }

        catch(IOException error)
        {

            System.out.println("Erro ao carregar arquivo " + error.getMessage());

        }

        */



        try 
        {

            BufferedImage imagem = ImageIO.read(new File("/home/pedrob/Downloads/OperacaoEnigmaFinal/src/ruido.bmp"));

            int largura_imagem = imagem.getWidth();
            int altura_imagem = imagem.getHeight();

            for(int i = 0; i < largura_imagem; i++)
            {
                
                for(int o = 0; o < altura_imagem; o++)
                {

                    int pixel = imagem.getRGB(i, o);

                    int alpha = (pixel >> 24) & 0xff;
                    int vermelho = (pixel >> 16) & 0xff;
                    
                    int cor_final;

                    if (vermelho % 2 == 0) 
                    {

                        cor_final = 255;

                    } 

                    else 
                    {

                        cor_final = 0;

                    }
                    
                    int novo_Pixel = (alpha << 24) | (cor_final << 16) | (cor_final << 8) | cor_final;
                    imagem.setRGB(i, o, novo_Pixel);

                }

            }

            ImageIO.write(imagem, "png", new File("/home/pedrob/Downloads/OperacaoEnigmaFinal/src/descoberta.png"));

        } 
        
        catch(IOException error)
        {

            System.out.println("Erro ao carregar arquivo " + error.getMessage());

        }

    }
    

}
