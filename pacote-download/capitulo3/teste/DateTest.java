/*3.14 (Classe Date) Crie uma classe chamada Date que inclua três variáveis de 
instância — mês (tipo int), dia (tipo int) e ano (tipo int).Forneça um construtor
que inicializa as três variáveis de instância supondo que os valores fornecidos 
estejam corretos. Ofereça um método set e um get para cada variável de instância.
Apresente um método displayDate que exiba mês, dia e ano separados por barras 
normais (/). Escreva um aplicativo de teste chamado DateTest que demonstre as 
capacidades da classe Date.
 */
package capitulo3.teste;

import capitulo3.Date;

/**
 * @version 1.0
 * @since 2021-07-22
 * @author irion.silva
 */
public class DateTest {

    public static void main(String[] args) {
        Date date = new Date(22, 07, 21);
        
        date.displayDate();
        
    }

}
