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
package capitulo3;

/**
 * @version 1.0
 * @since 2021-07-22
 * @author irion.silva
 */
public class Employee {

    //Atributos
    private String nome;
    private String sobrenome;
    private double salario;

    //Construtor
    public Employee(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Salário negativo, não configurado!");
            this.salario = salario;
        } else {
            this.salario = salario;
        }
    }

}
