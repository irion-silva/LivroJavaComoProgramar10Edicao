/*2.30 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um 
número consistindo em cinco dígitos a partir do usuário,separe o número em seus 
dígitos individuais e imprima os dígitos separados uns dos outros por três 
espaços. Por exemplo, se o usuário digitar o número 42339, o programa deve 
imprimir:
4 2 3 3 9
Suponha que o usuário insira o número correto de dígitos. O que acontece quando 
você insere um número com mais de cinco dígitos? O que acontece quando você 
insere um número com menos de cinco dígitos? [Dica: é possível fazer este 
exercício com as técnicas que aprendeu neste capítulo. Você precisará tanto das 
operações de divisão como das de resto para “selecionar” cada dígito.]
 */
package capitulo2;

import java.util.Scanner;

public class Exer02_30 {

    public static void main(String[] args) {
        System.out.println("-----SPACE BETWEEN WORDS-----");
        Scanner input = new Scanner(System.in);
        
        int number1, number2, number3, number4, number5;
        
        System.out.print("Enter the first number:");
        number1 = input.nextInt();
        System.out.print("Enter the second number:");
        number2 = input.nextInt();
        System.out.print("Enter the third number:");
        number3 = input.nextInt();
        System.out.print("Enter the fourth number:");
        number4 = input.nextInt();
        System.out.print("Enter the fifth number:");
        number5 = input.nextInt();
        
        System.out.printf("%d\t%d\t%d\t%d\t%d%n",number1,number2,number3,
                                                                number4,number5);
        
    }

}
