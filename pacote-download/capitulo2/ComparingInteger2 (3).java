/*2.24 (Inteiros maiores e menores) Escreva um aplicativo que leia cinco 
inteiros, além de determinar e imprimir o maior e o menor inteiro no grupo. 
Utilize somente as técnicas de programação que você aprendeu neste capítulo.
 */
package capitulo2;

import java.util.Scanner;

public class ComparingInteger2 {

    public static void main(String[] args) {
        System.out.println("-----COMPARANDO 5 INTEIROS-----");
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3, num4, num5, menor, maior;

        System.out.print("Informe o primeiro número(N1):");
        num1 = teclado.nextInt();
        System.out.print("Informe o segundo número(N2):");
        num2 = teclado.nextInt();
        System.out.print("Informe o terceiro número(N3):");
        num3 = teclado.nextInt();
        System.out.print("Informe o quarto número(N4):");
        num4 = teclado.nextInt();
        System.out.print("Informe o quinto número(N5):");
        num5 = teclado.nextInt();

        maior = -1000000;
        menor = 1000000;

        if (num1 > maior) {
            maior = num1;
        }
        if (num1 < menor) {
            menor = num1;
        }
        if (num2 > maior) {
            maior = num2;
        }
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num4 > maior) {
            maior = num4;
        }
        if (num4 < menor) {
            menor = num4;
        }
        if (num5 > maior) {
            maior = num5;
        }
        if (num5 < menor) {
            menor = num5;
        }
        
        System.out.printf("%s%d%n","O menor é ",menor);
        System.out.printf("%s%d%n","O maior é ",maior);

    }

}
