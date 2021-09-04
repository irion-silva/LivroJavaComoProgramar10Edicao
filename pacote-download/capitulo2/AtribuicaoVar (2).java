/*c) Insira um inteiro e atribua o resultado à variável int value. Suponha que a
variável Scanner input possa ser utilizada para ler um valor digitado pelo 
usuário.
 */
package capitulo2;

import java.util.Scanner;

public class AtribuicaoVar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int value;
        System.out.print("Informe um número inteiro:");
        value = teclado.nextInt();
    }

}
