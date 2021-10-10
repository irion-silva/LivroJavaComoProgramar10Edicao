/*4.21 (Localize o maior número) O processo de localizar o maior valor é muito 
utilizado em aplicativos de computador. Por exemplo, um programa que determina o
vencedor de uma competição de vendas inseriria o número de unidades vendidas por
cada vendedor. O vendedor que vende mais unidades ganha a competição. Escreva um
programa em pseudocódigo e, então, um aplicativo Java que aceita como entrada
uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa
deve utilizar pelo menos as três variáveis a seguir:
a) counter: um contador para contar até 10 (isto é, monitorar quantos números 
foram inseridos e determinar quando todos os 10 números foram processados).
b) number: o inteiro mais recentemente inserido pelo usuário.
c) largest: o maior número encontrado até agora.
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-09-05
 * @author irion-silva
 */
public class Exer04_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 1, numero, maior = 0;
        
        for (contador = 1; contador <= 10; contador++) {
            System.out.print("Informe um número aleatório:");
            numero = sc.nextInt();
            
            if (contador == 1) {
                maior = numero;
            }
            
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.printf("Maior número digitado:%d%n", maior);
    }
}
