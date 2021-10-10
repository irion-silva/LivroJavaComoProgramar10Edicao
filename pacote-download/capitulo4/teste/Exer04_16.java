/*4.16 O que o seguinte programa imprime?
 */
package capitulo4.teste;

/**
 * @version 1.0
 * @since 2021-09-09
 * @author irion-silva
 */
public class Exer04_16 {

    public static void main(String[] args) {
        int x = 1;
        int total = 0;
        
        while (x <= 10) {
            int y = x *x;
            System.out.println(y);
            total += y;
            ++x;
        }
        
        System.out.printf("Total é %d%n", total);
    }
}
