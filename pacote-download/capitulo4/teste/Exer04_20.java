/*4.20 (Calculador de salários) Desenvolva um aplicativo Java que determina o 
salário bruto de cada um de três empregados. A empresa paga as horas normais 
pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas
as horas trabalhadas além das 40 horas. Você recebe uma lista de empregados, o 
número de horas trabalhadas por eles na semana passada e o salário-hora de cada 
um. Seu programa deve aceitar a entrada dessas informações para cada empregado 
e, então, determinar e exibir o salário bruto do empregado.
Utilize a classe Scanner para inserir os dados
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-09-04
 * @author irion-silva
 */
public class Exer04_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----SALÁRIO POR HORAS TRABALHADA-----");
        double empregados[] = new double[3];
        int horasTrabalhada[] = new int[3];
        double salarioHora[] = new double[3];
        
        for (int i = 0; i <= 2; i++) {
            System.out.println("Empregado " + i);
            System.out.print("Horas trabalhada:");
            horasTrabalhada[i] = sc.nextInt();
            System.out.print("Salário por hora:");
            salarioHora[i] = sc.nextInt();
        }
        
        for (int i = 0; i <= 2; i++) {
            if (horasTrabalhada[i] <= 40) {
                empregados[i] = horasTrabalhada[i]*salarioHora[i];
            } else {
                empregados[i] = 40*salarioHora[i];
                empregados[i] += (horasTrabalhada[i]-40)*(salarioHora[i]*0.5);
            }
        }
        
        System.out.println("\n\n");
        
        for (int i = 0; i <= 2; i++) {
            System.out.println("Empregado " + i);
            System.out.printf("Salário hora:%.2f%n", salarioHora[i]);
            System.out.printf("Horas trabalhada:%d%n", horasTrabalhada[i]);
            System.out.printf("Salário final:%.2f%n", empregados[i]);
            System.out.println("---------------------");
        }
    }

}
