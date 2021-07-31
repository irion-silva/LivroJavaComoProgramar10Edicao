/*2.16 (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir 
dois inteiros, obtenha dele esses números e exiba o número maior seguido pelas 
palavras “is larger". Se os números forem iguais, imprima a mensagem 
“These numbers are equal". Utilize as técnicas mostradas na Figura 2.15.
 */
package capitulo2;

import java.util.Scanner;

public class ComparingInteger {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("-----COMPARING INTERGER-----");
        System.out.print("Informe o primeiro número(N1):");
        num1 = teclado.nextInt();
        System.out.print("Informe o segundo número(N2):");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.printf("%d%s%n", num1, " is larger.");
        } else if (num1 == num2){
            System.out.println("These numbers are equal.");
        } else {
            System.out.printf("%d%s%n", num2, " is larger.");
        }
    }

}
