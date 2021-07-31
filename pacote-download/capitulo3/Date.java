/*3.14 (Classe Date) Crie uma classe chamada Date que inclua três variáveis de 
instância — mês (tipo int), dia (tipo int) e ano (tipo int).Forneça um construtor
que inicializa as três variáveis de instância supondo que os valores fornecidos 
estejam corretos. Ofereça um método set e um get para cada variável de instância.
Apresente um método displayDate que exiba mês, dia e ano separados por barras 
normais (/). Escreva um aplicativo de teste chamado DateTest que demonstre as 
capacidades da classe Date.
 */
package capitulo3;

/**
 * @version 1.0
 * @since 2021-07-22
 * @author irion.silva
 */
public class Date {
    private int mes;
    private int dia;
    private int ano;
    
    //Construtor
    public Date(int dia, int mes, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }
    
    //Métodos
    public void displayDate(){
        System.out.printf("%d/%d/%d%n", getDia(), getMes(), getAno());
    }
    
    //Getters & Setters
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
