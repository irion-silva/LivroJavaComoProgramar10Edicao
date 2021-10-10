/*2.3 f) Se a variável number não for igual a 7, exiba “The variable number is not 
equal to 7".
*/
package capitulo2;

import java.util.Scanner;

public class Exer02_03f {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int number;
        System.out.print("Informe um número inteiro:");
        number = teclado.nextInt();
        
        if (number != 7){
            System.out.println("The variable number is not equal to 7.");
        }
        
    }
    
}
