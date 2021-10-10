/*4.37 b) Escreva um aplicativo que estima o valor da constante matemática e utilizando
a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular
e = 1 + 1/1! + 1/2! + 1/3! + ...
 */
package capitulo4;

/**
 * @version 1.0
 * @since 2021-10-02
 * @author irion-silva
 */
public class FatorialB {

    public double calcula(int i) {
        double retorno = 1.0;
        if (i > 0) {
            for (int j = i; j >= 1; j--) {
                retorno *= j;
            }
        }
        return retorno;
    }
}
