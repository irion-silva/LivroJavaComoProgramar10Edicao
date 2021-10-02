/*4.32 (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que 
utiliza apenas as instruções de saída
System.out.print("* ");
System.out.print(" ");
System.out.println();
para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método 
System.out.println sem argumentos faz com que o programa gere saída de um único 
caractere de nova linha. [Dica: as instruções de repetição são requeridas.]
 */
package capitulo4.teste;

/**
 * @version 1.0
 * @since 2021-09-27
 * @author irion-silva
 */
public class TabuleiroDamasTest {

    public static void main(String[] args)
	{
		for (int i = 1; i <= 8; i++)
		{
			if((i%2)==0){
				System.out.print(" ");
                        }
			for (int j = 1; j <= 8; j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();	
		}
	}
}
