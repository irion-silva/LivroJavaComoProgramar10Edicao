/*4.24 (Validando entrada de usuário) Modifique o programa na Figura 4.12 para 
validar suas entradas. Para qualquer entrada, se o valor entrado for diferente 
de 1 ou 2, continue o loop até o usuário inserir um valor correto.
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-09-06
 * @author irion-silva
 */
public class ValidandoEntradaTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passou = 0, falhou = 0, contadorEstudantes = 1, resultado;
        
        while (contadorEstudantes <= 10) {
            System.out.print("Informe um número (1 = Passou, 2 = Falhou):");
            resultado = sc.nextInt();
            
            if (resultado == 1) {
                passou++;
                contadorEstudantes++;
            }
            
            if (resultado == 2) {
                falhou++;
                contadorEstudantes++;
            }
            
            if (resultado != 1 && resultado != 2) {
                System.out.println("Número fora do intervalo.");
            }
        }
        
        System.out.printf("Passou:%d%nFalhou:%d%n", passou, falhou);
        
        if (passou > 8) {
            System.out.println("Bônus para o instrutor!");
        }
    }
}
