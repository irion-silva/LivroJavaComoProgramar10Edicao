/*4.17 (Quilometragem de combustível) Os motoristas se preocupam com a 
quilometragem obtida por seus automóveis. Um motorista monitorou várias viagens 
registrando a quilometragem dirigida e a quantidade de combustível em litros 
utilizados para cada tanque cheio.Desenvolva um aplicativo Java que receba como 
entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como 
inteiros)para cada viagem. O programa deve calcular e exibir o consumo em 
quilômetros/litro para cada viagem e imprimir a quilometragem total e a soma 
total de litros de combustível consumidos até esse ponto para todas as viagens. 
Todos os cálculos de média devem produzir resultados de ponto flutuante. Utilize
classe Scanner e repetição controlada por sentinela para obter os dados do 
usuário.
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-08-29
 * @author irion-silva
 */
public class Exer04_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km_dirigido = 1;
        int litros_consumidos = 1;
        int total_km = 0;
        int total_lit = 0;
        double kml = 0;
        String charOpc;
        boolean parar = false;

        while (parar != true) {
            System.out.print("Informe os quilômetros dirigidos:");
            km_dirigido = sc.nextInt();

            System.out.print("Informe os litros de gasolina consumidos:");
            litros_consumidos = sc.nextInt();
            
            total_km += km_dirigido;
            total_lit += litros_consumidos;
            kml = km_dirigido / (double) litros_consumidos;
            
            System.out.print("Deseja sair?[S/N]");
            charOpc = sc.next();
            if (charOpc.equals("S") || charOpc.equals("s")) {
                parar = true;
            } else if (charOpc.equals("N") || charOpc.equals("n")){
                parar = false;
            }
            
        }
        System.out.printf("O consumo é: %.2f km/l%n", kml);
        System.out.println("O total de km dirigidos foi:" + total_km + " km.");
        System.out.println("O total de litros consumidos foi:" + total_lit + " litros.");
    }
}
