/*4.31 (Imprimindo o equivalente decimal de um número binário) Escreva um 
aplicativo que insere um número inteiro que contém somente 0s e 1s (isto é, um 
número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os 
operadores de resto e divisão para pegar os dígitos do número binário um de cada
vez da direita para a esquerda. No sistema de números decimais, o dígito mais à 
direita tem um valor posicional de 1 e o próximo dígito à esquerda um valor 
posicional de 10, depois 100, depois 1.000 e assim por diante. O número decimal 
234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número 
binário, o dígito mais à direita tem um valor posicional de 1, o próximo dígito 
à esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O 
equivalente decimal do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 
4 + 8 ou 13.]
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-09-26
 * @author irion-silva
 */
public class BinarioParaDecimalTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer binario, soma = 0, divisor = 1, mult = 1;

        System.out.println("-----BINÁRIO PARA DECIMAL-----");
        System.out.print("Informe um número binário:");
        binario = sc.nextInt();

        for (int i = binario.toString().length(); i > 0; i--) {
            System.out.println("((" + binario + "/" + divisor + ")%10)*" + mult);
            System.out.println("((" + binario / divisor + ")%10*" + mult);
            System.out.println("(" + (binario / divisor) % 10 + ")*" + mult);
            System.out.println(((binario / divisor) % 10) * mult);
            soma += ((binario/divisor)%10)*mult;
            divisor *= 10;
            mult *= 2;
            System.out.println("-;-;-;-;-;-;-;-;");
        }
        System.out.println("Soma = " + soma);
    }

}
