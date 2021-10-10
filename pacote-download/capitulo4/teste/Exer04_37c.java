/*4.37 c) Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir.
Permita ao usuário inserir o número de termos a calcular.
e^x = 1 + x/1! + x^2/2! + x^3/3! + ...
 */
package capitulo4.teste;

import capitulo4.FatorialC;
import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-10-03
 * @author irion-silva
 */
public class Exer04_37c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FatorialC fat = new FatorialC();
        double euler = 1;
        int x;
        
        System.out.print("Difinir x para e^x:");
        x = sc.nextInt();
        
        for (int i = 1; i <= 33; i++) {
            euler += Math.pow(x, i)/fat.calcula(i);
        }
        System.out.println("Euler = "+euler+"\nMath.pow = "+Math.pow(Math.E, x));
    }
}
