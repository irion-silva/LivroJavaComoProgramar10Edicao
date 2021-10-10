/*4.25 O que o seguinte programa imprime?
 */
package capitulo4.teste;

/**
 * @version 1.0
 * @since 2021-09-07
 * @author irion-silva
 */
public class Exer04_25 {

    public static void main(String[] args) {
        int count = 1;
        
        while (count <= 10) {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }
    }

}
