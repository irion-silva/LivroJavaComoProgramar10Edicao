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
        System.out.println("-----ESPAÇO ENTRE NÚMEROS-----");
        Scanner input = new Scanner(System.in);
        
        int numero,numero1,numero2,numero3,numero4,numero5;
        
        System.out.print("Informe um número inteiro de cinco dígitos:");
        numero = input.nextInt();
        
        numero1 = (numero/10000)%10;
        numero2 = (numero/1000)%10;
        numero3 = (numero/100)%10;
        numero4 = (numero/10)%10;
        numero5 = numero%10;
        
        System.out.printf("%d  %d  %d  %d  %d\n",numero1,numero2,numero3,numero4,numero5);
        
        
        
    }

}
