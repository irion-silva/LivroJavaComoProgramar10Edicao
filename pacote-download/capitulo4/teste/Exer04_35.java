/*4.35 (Lados de um triângulo) Escreva um aplicativo que lê três valores 
diferentes de zero inseridos pelo usuário, determina e imprime se eles poderiam 
representar os lados de um triângulo.
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-09-28
 * @author irion-silva
 */
public class Exer04_35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1, c = 1;

        System.out.println("REPRESENTAÇÃO DE UM TRIÂNGULO");
        do {
            System.out.print("Informe o tamanho do lado A:");
            a = sc.nextInt();
            if (a == 0) {
                System.out.println("Número Inválido.");
            }
            } while (a == 0);
        
        do {
        System.out.print("Informe o tamanho do lado B:");
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("Número Inválido.");
            }
            } while (b == 0);
            
        do {
            System.out.print("Informe o tamanho do lado C:");
            c = sc.nextInt();
            if (c == 0) {
                System.out.println("Número Inválido.");
            }
            } while (c == 0);
            
            
        if (a + b > c && b + c > a && a + c > b) {
            System.out.printf("Os lados %d,%d e %d podem formar um triângulo.\n", a, b, c);
        } else {
            System.out.printf("Os lados %d,%d e %d não podem formar um triângulo.\n", a, b, c);
        }

    }

}
