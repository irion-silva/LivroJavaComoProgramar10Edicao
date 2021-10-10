/*4.37 a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu 
fatorial..
 */
package capitulo4;

/**
 * @version 1.0
 * @since 2021-10-03
 * @author irion-silva
 */
public class FatorialA {
    public int calcula(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
