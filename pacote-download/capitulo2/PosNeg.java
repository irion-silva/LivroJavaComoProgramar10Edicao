/*2.32 (Valores negativos, positivos e zero) Escreva um programa que insira 
cinco números, além de determinar e imprimir quantos negativos, quantos positivos
e quantos zeros foram inseridos.
 */
package capitulo2;

import java.util.Scanner;

public class PosNeg {

    public static void main(String[] args) {
        System.out.println("-----NEGATIVE, POSITIVE AND ZERO VALUE------");
        
        Scanner input = new Scanner(System.in);
        
        int number1, number2, number3, number4, number5;
        int positive = 0,negative = 0,zero = 0;
        
        System.out.print("Enter the first number:");
        number1 = input.nextInt();
        System.out.print("Enter the second number:");
        number2 = input.nextInt();
        System.out.print("Enter the third number:");
        number3 = input.nextInt();
        System.out.print("Enter the fourth number");
        number4 = input.nextInt();
        System.out.print("Enter the fifth number:");
        number5 = input.nextInt();
        
        if (number1 < 0) {
            negative++;
        } else if (number1 == 0) {
            zero++;
        } else {
            positive++;
        }
        
        if (number2 < 0) {
            negative++;
        } else if (number2 == 0) {
            zero++;
        } else {
            positive++;
        }
        
        if (number3 < 0) {
            negative++;
        } else if (number3 == 0) {
            zero++;
        } else {
            positive++;
        }
        
        if (number4 < 0) {
            negative++;
        } else if (number4 == 0) {
            zero++;
        } else {
            positive++;
        }
        
        if (number5 < 0) {
            negative++;
        } else if (number5 == 0) {
            zero++;
        } else {
            positive++;
        }
        
        System.out.printf("The amount of positive numbers are:%d%n",positive);
        System.out.printf("The amount of negative numbers are:%d%n",negative);
        System.out.printf("The amount of zero numbers are:%d%n",zero);
    }

}
