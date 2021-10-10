/*4.37 (Fatorial) O fatorial de um inteiro não negativo n é escrito como n! 
(pronuncia-se “n fatorial”) e é definido como segue:
n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
e
n! = 1 (para n = 0)
Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu 
fatorial.
b) Escreva um aplicativo que estima o valor da constante matemática e utilizando
a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular
e = 1 + 1/1! + 1/2! + 1/3! + ...
c) Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir.
Permita ao usuário inserir o número de termos a calcular.
e^x = 1 + x/1! + x^2/2! + x^3/3! + ...
 */
package capitulo4.teste;

import java.util.Scanner;

import capitulo4.FatorialA;

/**
 * @version 1.0
 * @since 2021-10-02
 * @author irion-silva
 */
public class Exer04_37a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        FatorialA fatorial = new FatorialA();
        System.out.println("FATORIAL:");
        System.out.print("A-)");
        do {
            System.out.print("Informe um número inteiro e positivo:");
            n = sc.nextInt();
            if (n < 0 ) {
                System.out.println("Número inválido.Informe um número positivo.");
            }
        } while (n < 0);
        
        System.out.printf("%d! = %d\n", n,fatorial.calcula(n));
        
        
        
    }
}
