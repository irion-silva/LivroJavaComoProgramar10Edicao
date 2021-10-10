/*4.34 (O que há de errado com esse código?) O que há de errado com a seguinte 
instrução? Forneça a instrução correta para adicionar 1 à soma de x e y.
System.out.println(++(x + y));
 */
package capitulo4.teste;

/**
 * @version 1.0
 * @since 2021-09-28
 * @author irion-silva
 */
public class Exer04_34 {

    public static void main(String[] args) {
        int x = 1, y = 2, z;
        z = x+y;
        System.out.println(++z);
    }

}
