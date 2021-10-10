/*4.37 b) Escreva um aplicativo que estima o valor da constante matemática e utilizando
a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular
e = 1 + 1/1! + 1/2! + 1/3! + ...
 */
package capitulo4.teste;

import capitulo4.FatorialB;

/**
 * @version 1.0
 * @since 2021-10-03
 * @author irion-silva
 */
public class Exer04_37b {

    public static void main(String[] args) {
        FatorialB fat = new FatorialB();
        double euler = 0;
        for (int i = 0; i < 20; i++) {
        euler += 1.0/fat.calcula(i);
        }
        System.out.println("Euler = "+euler+"\nMath.E = "+Math.E);
        
    }
}
