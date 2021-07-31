/*a) O programa calculará o produto de três inteiros.
*/
package capitulo2;

import java.util.Scanner;

public class ProductOf3Int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z,result;
        
        System.out.print("Informe o primeiro número inteiro:");
        x = input.nextInt();
        System.out.print("Informe o segundo número inteiro:");
        y = input.nextInt();
        System.out.print("Informe o terceiro número inteiro:");
        z = input.nextInt();
        
        result = (x*y*z);
        
        System.out.printf("Product is %d%n",result);
    }
    
}
