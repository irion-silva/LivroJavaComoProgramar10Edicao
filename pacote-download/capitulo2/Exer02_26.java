/*2.26 (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de 
determinar se o primeiro é um múltiplo do segundo e imprimir o resultado. 
[Dica: utilize o operador de resto.]
 */
package capitulo2;

import java.util.Scanner;

public class Exer02_26 {

    public static void main(String[] args) {
        System.out.println("-----MÚLTIPLOS-----");
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.print("Informe o primeiro número(N1):");
        num1 = teclado.nextInt();
        System.out.print("Informe o segundo número(N2):");
        num2 = teclado.nextInt();

        if (num1 % num2 == 0) {
            System.out.printf("%d%s%d%n", num1, " é múltiplo de ", num2);
        } else {
            System.out.printf("%d%s%d%n", num1, " não é múltiplo de ", num2);
        }
    }

}
