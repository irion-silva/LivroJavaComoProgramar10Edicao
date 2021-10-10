/*2.31 (Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação que
aprendeu neste capítulo, escreva um aplicativo que calcule os quadrados e cubos 
dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como
a seguir:
number square cube
0 0 0
1 1 1
2 4 8
3 9 27
4 16 64
5 25 125
6 36 216
7 49 343
8 64 512
9 81 729
10 100 1000
 */
package capitulo2;

public class Exer02_31 {

    public static void main(String[] args) {
        System.out.println("-----SQUARES AND CUBES TABLE-----");
        System.out.printf("Number\tSquare\tCube%n");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d\t%d\t%d%n",i,(i*i),(i*i*i));
        }

    }

}
