/*4.26 O que o seguinte programa imprime?
 */
package capitulo4.teste;

/**
 * @version 1.0
 * @since 2021-09-09
 * @author irion-silva
 */
public class Enigma3Test {

    public static void main(String[] args) {
        int linha = 10;
        int coluna = 0;

        while (linha >= 1) {
            coluna = 1;

            while (coluna <= 10) {
                System.out.print(linha % 2 == 1 ? "<" : ">");
                ++coluna;
            }

            --linha;
            System.out.println();
        }
    }
}
