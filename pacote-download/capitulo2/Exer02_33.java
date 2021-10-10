/*2.33 (Calculadora de índice de massa corporal) Introduzimos a calculadora de 
índice de massa corporal (IMC) no Exercício 1.10. As fórmulas para calcular o 
IMC são
IMC = pesoEmLibras × 703/alturaEmPolegadas^2
ou
IMC = pesoEmQuilogramas/alturaEmMetros^2
Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a 
altura em polegadas (ou, se preferir, o peso em quilogramas e a altura em metros)
e, então, calcule e exiba o índice de massa corporal dele. Além disso, que exiba
as seguintes informações do Department of Health and Human Services/National 
Institutes of Health, assim o usuário pode avaliar o seu IMC:
BMI VALUES
Underweight: less than 18.5
Normal: between 18.5 and 24.9
Overweight: between 25 and 29.9
Obese: 30 or greater
[Nota: neste capítulo, você aprendeu a utilizar o tipo int para representar 
números inteiros. Os cálculos de IMC, quando feitos com valores int, produzirão 
resultados com números inteiros. No Capítulo 3, você aprenderá a utilizar o tipo
double para representar números com pontos decimais. Quando os cálculos de IMC 
são realizados com doubles, eles produzirão números com pontos decimais — esses
são chamados de números de “ponto flutuante”.]
 */
package capitulo2;

import java.util.Scanner;

public class Exer02_33 {

    public static void main(String[] args) {
        double height, weight, BMI;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("-----BMI Calculator-----");
        System.out.print("Enter your height(meters):");
        height = input.nextDouble();
        System.out.print("Enter your weight(kilograms):");
        weight = input.nextDouble();
        
        BMI = weight/(Math.pow(height, 2));
        
        if (BMI < 18.5){
            System.out.printf("Your BMI is: %f - Underweight%n", BMI);
        }
        
        if (BMI >= 18.5 && BMI <= 24.9){
            System.out.printf("Your BMI is: %f - Normal%n", BMI);
        }
        
        if (BMI >= 25 && BMI <= 29.9){
            System.out.printf("Your BMI is: %f - Overweight%n", BMI);
        }
        
        if (BMI >= 30){
            System.out.printf("Your BMI is: %f - Obese%n", BMI);
        }
        
        

    }

}
