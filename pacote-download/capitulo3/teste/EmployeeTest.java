/*3.13 (Classe Employee) Crie uma classe chamada Employee que inclua três 
variáveis de instância — um primeiro nome (tipo String), um sobrenome 
(tipo String) e um salário mensal (double). Forneça um construtor que inicializa
as três variáveis de instância. Forneça um método set e um get para cada variável
de instância. Se o salário mensal não for positivo, não configure seu valor. 
Escreva um aplicativo de teste chamado EmployeeTest que demonstre as capacidades
da classe Employee. Crie dois objetos Employee e exiba o salário anual
de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o 
salário anual de cada Employee.
 */
package capitulo3.teste;

import capitulo3.Employee;

/**
 * @version 1.0
 * @since 2021-07-22
 * @author irion.silva
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee empregado1 = new Employee("Ian", "Silva", 1.000f);
        Employee empregado2 = new Employee("Pedro", "Costa", 8.500);
        
        System.out.printf("Empregado 1:" + empregado1.getNome() + " " + empregado1.getSobrenome()+"\nSalário Anual:%.3f%n%n", empregado1.getSalario() * 12);
        System.out.printf("Empregado 2:" + empregado2.getNome() + " " + empregado2.getSobrenome()+"\nSalário Anual:%.3f%n%n", empregado2.getSalario() * 12);
        
        System.out.printf("Empregado 1:" + empregado1.getNome() + " " + empregado1.getSobrenome()+"\nSalário Anual com aumento:%.3f%n%n", (empregado1.getSalario() + (10.0/100.0 * empregado1.getSalario())) * 12);
        System.out.printf("Empregado 2:" + empregado2.getNome() + " " + empregado2.getSobrenome()+"\nSalário Anual com aumento:%.3f%n%n", (empregado2.getSalario() + (10.0/100.0 * empregado2.getSalario())) * 12);
    }

}
