/*4.29 (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário 
que insira o tamanho do lado de um quadrado e, então, exibe um quadrado vazio 
desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos
os comprimentos de lado possíveis entre 1 e 20.
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-09-13
 * @author irion-silva
 */
public class Exer04_29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas;
        int colunas;
        System.out.print("Informe o tamanho de lados do quadrado[Tamanho entre 1 e 20]:");
        linhas = sc.nextInt();
        colunas = linhas;

        for (int i = 0; i < colunas; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < linhas - 2; i++) {

            System.out.print("*");

            for (int j = 0; j < colunas - 2; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }

        for (int i = 0; i < colunas; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

}
