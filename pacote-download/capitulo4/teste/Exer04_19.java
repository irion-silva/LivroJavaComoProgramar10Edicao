/*4.19 (Calculador de comissão de vendas) Uma grande empresa paga seu pessoal de
vendas com base em comissões. O pessoal de vendas recebe R$ 200 por semana mais 
9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que 
realiza um total de vendas de mercadorias de R$ 5.000 em uma semana recebe R$ 
200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens
vendidos por cada vendedor. Os valores desses itens são como segue:
Item |Value |
1    |239.99|
2    |129.75|
3    |99.95 |
4    |350.89|
Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um 
vendedor durante a última semana e calcula e exibe os rendimentos do vendedor. 
Não existe nenhum limite para o número de itens que pode ser vendido.
 */
package capitulo4.teste;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-09-01
 * @author irion-silva
 */
public class Exer04_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double item1 = 239.99, item2 = 129.75, item3 = 99.95, item4 = 350.89,
                valorSalario = 200, valorComissao = 0.09, valorMercadoria, totSalario;
        int quantidadeItem1, quantidadeItem2, quantidadeItem3, quantidadeItem4;
        
        System.out.println("-----SALÁRIO DO FUNCIONÁRIO COM COMISSÃO-----");
        System.out.print("Informe a quantidade de Item 1 vendido:");
        quantidadeItem1 = sc.nextInt();
        System.out.print("Informe a quantidade de Item 2 vendido:");
        quantidadeItem2 = sc.nextInt();
        System.out.print("Informe a quantidade de Item 3 vendido:");
        quantidadeItem3 = sc.nextInt();
        System.out.print("Informe a quantidade de Item 4 vendido:");
        quantidadeItem4 = sc.nextInt();
        
        valorMercadoria = item1*quantidadeItem1+item2*quantidadeItem2+item3*
                quantidadeItem3+item4*quantidadeItem4;
        
        totSalario = valorMercadoria*valorComissao;
        totSalario += valorSalario;
        
        System.out.printf("Quantidade de Item 1 vendido:%d%n", quantidadeItem1);
        System.out.printf("Quantidade de Item 2 vendido:%d%n", quantidadeItem2);
        System.out.printf("Quantidade de Item 3 vendido:%d%n", quantidadeItem3);
        System.out.printf("Quantidade de Item 4 vendido:%d%n", quantidadeItem4);
        
        System.out.printf("Salário do funcionário com comissão:%.2f%n", totSalario);
    }

}
