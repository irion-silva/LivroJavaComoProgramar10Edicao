/*4.37 c) Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir.
Permita ao usuário inserir o número de termos a calcular.
e^x = 1 + x/1! + x^2/2! + x^3/3! + ...
 */
package capitulo4;

/**
 * @version 1.0
 * @since 2021-10-03
 * @author irion-silva
 */
public class FatorialC {
    public double calcula(int i){
        double retorno = 1.0;
        
        if (i > 0) {
            for (int j = i; j >= 1; j--) {
                retorno *= j;
            }
        }
        return retorno;
    }
}
