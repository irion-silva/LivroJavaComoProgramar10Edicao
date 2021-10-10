/*2.15 (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois 
inteiros, obtenha dele esses números e imprima sua soma, produto,
diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
 */
package capitulo2;

import java.util.Scanner;

public class Exer02_15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, soma, produto, dif;
        float quociente;
        System.out.println("-----OPERAÇÕES MATEMÁTICA-----");

        System.out.print("Informe o primeiro número(N1):");
        num1 = teclado.nextInt();
        System.out.print("Informe o segundo número(N2):");
        num2 = teclado.nextInt();
        
        soma = num1 + num2;
        System.out.printf("%s%d%n","Soma = ",soma);
        
        produto = num1 * num2;
        System.out.printf("%s%d%n","Produto = ",produto);
        
        if (num1 > num2){
            dif = num1 - num2;
            System.out.printf("%s%d%n","Diferença = ",dif);
        }else {
            dif = num2 - num1;
            System.out.printf("%s%d%n","Diferença = ",dif);
        }
        
        quociente = num1 / num2;
        System.out.printf("%s%.2f%n","Quociente = ",quociente);
    }

}
