/*2.14 Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par 
de adjacentes separados por um espaço. Use as seguintes
técnicas:
a) Uma instrução System.out.println.
b) Quatro instruções System.out.print.
c) Uma instrução System.out.printf.
 */
package capitulo2;

public class Exer02_14 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a + " " + b + " " + c + " " + d);

        System.out.print(a + " " + b + " " + c + " " + d + "\n");
        System.out.print(a + " " + b + " " + c + " " + d + "\n");
        System.out.print(a + " " + b + " " + c + " " + d + "\n");
        System.out.print(a + " " + b + " " + c + " " + d + "\n");

        System.out.printf("%d %d %d %d\n", a, b, c, d);
    }

}
