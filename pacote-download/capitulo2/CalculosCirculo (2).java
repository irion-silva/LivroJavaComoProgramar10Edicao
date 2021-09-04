/*2.28 (Diâmetro, circunferência e área de um círculo) Eis uma prévia do que 
veremos mais adiante. Neste capítulo, você aprendeu sobre inteiros e o tipo int.
O Java também pode representar números de pontos flutuantes que contêm pontos de
fração decimal, como 3,14159. Escreva um aplicativo que leia a entrada a partir 
do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
circunferência e área utilizando o valor do ponto flutuante 3,14159 para π. 
Utilize as técnicas mostradas na Figura 2.7. [Observação: você também pode 
empregar a constante Math.PI predefinida para o valor de π. Essa constante é 
mais precisa que o valor 3,14159. A classe Math é definida no pacote java.lang. 
As classes nesse pacote são importadas automaticamente, portanto, você não 
precisa importar a classe Math para utilizá-la.] Adote as seguintes fórmulas 
(r é o raio):
diâmetro = 2r
circunferência = 2πr
área = πr^2
Não armazene os resultados de cada cálculo em uma variável. Em vez disso, 
especifique cada cálculo como o valor de saída em uma instrução System.out.printf.
Os valores produzidos pelos cálculos de circunferência e área são números de 
ponto flutuante. A saída desses valores pode ser gerada com o especificador de 
formato %f em uma instrução System.out.printf. Você aprenderá mais sobre
números de pontos flutuantes no Capítulo 3.
 */
package capitulo2;

import java.util.Scanner;

public class CalculosCirculo {

    public static void main(String[] args) {
        System.out.println("-----CALCULOS DE UM CÍRCULO-----");
        int r;//Raio
        double diametro, circunf, area;//Raio
        
        Scanner teclado = new Scanner(System.in);//Declarando o Scanner
        
        System.out.print("Informe o raio do círculo:");//Informe o raio
        r = teclado.nextInt();//Lendo o raio
        
        diametro = 2*r;//Calculo do Diâmetro
        
        circunf = 2*Math.PI*r;//Calculo da Circunferência
        
        area = Math.PI*(r*r);//Calculo da Área
        
        System.out.printf("%s%.2f\n","O diâmetro é:",diametro);//Exibindo o diâmetro 
        System.out.printf("%s%.2f\n","A circunferência é:",circunf);//Exibindo a circunferência
        System.out.printf("%s%.2f\n","A área é:",area);//Exibindo a área
        
        
        
        
        

    }
}
