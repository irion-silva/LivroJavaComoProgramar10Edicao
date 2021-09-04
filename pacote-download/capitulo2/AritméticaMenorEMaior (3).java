/*2.17 (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros
digitados pelo usuário e exiba a soma, média, produto e os números menores e 
maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da
média neste exercício deve resultar em uma representação de inteiro. Assim, se a
soma dos valores for 7, a média deverá ser 2, não 2,3333...]
*/
package capitulo2;

import java.util.Scanner;

public class AritméticaMenorEMaior {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3,soma,m,produto,maior,menor;
        
        System.out.println("-----ARITMÉTICA MENOR E MAIOR-----");
        System.out.print("Informe o primeiro número:");
        num1 = teclado.nextInt();
        System.out.print("Informe o segundo número:");
        num2 = teclado.nextInt();
        System.out.print("Informe o terceiro número:");
        num3 = teclado.nextInt();
        
        //Soma.
        soma = num1+num2+num3;
        
        //Média.
        m = (num1+num2+num3)/3;
        
        //Produto.
        produto = num1*num2*num3;
        
        //Comparando o menor número.
        if (num1 < num2 && num1 < num3){
            menor = num1;
        } else if (num2 < num1 && num2 < num3){
            menor = num2;
        } else {
            menor = num3;
        }
        
        //Comparando o maior número.
        if (num1 > num2 && num1 > num3){
            maior = num1;
        } else if (num2 > num1 && num2 > num3){
            maior = num2;
        } else {
            maior = num3;
        }
        
        System.out.printf("%s%d%n","Soma = ",soma);
        System.out.printf("%s%d%n","Média = ",m);
        System.out.printf("%s%d%n","Produto = ",produto);
        System.out.printf("%s%d%n","Menor = ",menor);
        System.out.printf("%s%d%n","Maior = ",maior);
        
        
        
        
    }
    
}
