/*2.25 (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de 
determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador de resto.
Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando
dividido por 2.]
 */
package capitulo2;

import java.util.Scanner;

public class Exer02_25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----PAR OU ÍMPAR-----");
        int numero;
        
        System.out.print("Informe um número:");
        numero = teclado.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("Número PAR.");
        } else {
            System.out.println("Número ÍMPAR.");
        }
    }

}
