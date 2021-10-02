/*4.36 (Lados de um triângulo direito) Escreva um aplicativo que lê três inteiros
diferentes de zero, determina e imprime se eles poderiam representar os lados de
um triângulo direito.
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-10-02
 * @author irion-silva
 */
public class TrianguloRetanguloTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1, c = 1;
        System.out.println("REPRESENTAÇÃO DE UM TRIÂNGULO RETÂNGULO:");
        do {
            System.out.print("Informe o tamanho da hipotenusa(C):");
            c = sc.nextInt();
            if (c == 0) {
                System.out.println("Número inválido. Digite um número diferente de 0.");
            }
        } while (c == 0);

        do {
            System.out.print("Informe o tamanho do cateto(A):");
            a = sc.nextInt();
            if (a == 0) {
                System.out.println("Número inválido. Digite um número diferente de 0.");
            }
        } while (a == 0);

        do {
            System.out.print("Informe o tamanho do cateto(B):");
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("Número inválido. Digite um número diferente de 0.");
            }
        } while (b == 0);

        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            System.out.println("\nO triângulo é um triângulo retângulo.");
        } else {
            System.out.println("\nO triângulo não é um triângulo retângulo.");
        }
    }
}
