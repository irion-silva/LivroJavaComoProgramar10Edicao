/*4.23 (Encontre os dois números maiores) Utilizando uma abordagem semelhante 
àquela do Exercício 4.21, encontre os dois maiores valores entre os 10 valores 
inseridos. [Observação: você só pode inserir cada número uma vez.]
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-09-06
 * @author irion-silva
 */
public class DoisNumerosMaioresTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior1 = 0, maior2 = 0, contador = 1, numero;
        
        for (contador = 0; contador < 10; contador++) {
            System.out.print("Informe um número[Observação: você só pode inserir cada número uma vez.]:");
            numero = sc.nextInt();
            
            if (numero > maior1) {
                maior2 = maior1;
                maior1 = numero;
            } else if (numero > maior2 && numero != maior1) {
                maior2 = numero;
            }
        }
        
        System.out.printf("Os dois maiores números são:%d e %d%n", maior1, maior2);
    }

}
