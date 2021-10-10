/*4.30 (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da 
esquerda para a direita ou da direita para a esquerda. Por exemplo, cada um dos 
seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611.
Escreva um aplicativo que lê em um inteiro de cinco dígitos e determina se ele é
ou não um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de
erro e permita que o usuário insira um novo valor.
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-09-22
 * @author irion-silva
 */
public class Exer04_30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorUsuario, primeiro, segundo, terceiro, quarto, quinto;

        System.out.print("Informe um número inteiros de 5 casas:");
        valorUsuario = sc.nextInt();

        while (valorUsuario < 10000 || valorUsuario > 99999) {
            System.out.print("Entrada Inválida! Informe um número inteiros de 5 casas:");
            valorUsuario = sc.nextInt();
        }
        
        quinto = valorUsuario % 10;
        valorUsuario /= 10;
        
        quarto = valorUsuario % 10;
        valorUsuario /= 10;
        
        terceiro = valorUsuario % 10;
        valorUsuario /= 10;
        
        segundo = valorUsuario % 10;
        valorUsuario /= 10;
        
        primeiro = valorUsuario % 10;
        valorUsuario /= 10;
        
        if (primeiro == quinto && segundo == quarto) {
            System.out.println("O número é uma capicua");
        } else {
            System.out.println("O número não é uma capicua");
        }
    }

}
