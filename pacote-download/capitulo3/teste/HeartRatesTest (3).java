/*3.16 (Calculadora de frequência cardíaca alvo) Ao fazer exercícios físicos, 
você pode utilizar um monitor de frequência cardíaca para ver se sua frequência 
permanece dentro de um intervalo seguro sugerido pelos seus treinadores e 
médicos. Segundo a American Heart Association (AHA) 
(www.americanheart.org/presenter.jhtml?identifier=4736), a fórmula para calcular
a frequência cardíaca máxima por minuto é 220 menos a idade em anos. Sua 
frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca
máxima. [Observação: essas fórmulas são estimativas fornecidas pela AHA. As 
frequências cardíacas máximas e alvo podem variar com base na saúde, capacidade 
física e sexo da pessoa. Sempre consulte um médico ou profissional de saúde 
qualificado antes de começar ou modificar um programa de exercícios físicos.] 
Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome,
sobrenome e data de nascimento da pessoa (consistindo em atributos separados 
para mês, dia e ano de nascimento). Sua classe deve ter um construtor que receba
esses dados como parâmetros. Para cada atributo forneça métodos set e get. A 
classe também deve incluir um método que calcule e retorne a idade (em anos), um
que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a 
frequência cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as 
informações da pessoa, instancie um objeto da classe HeartRates e imprima as 
informações a partir desse objeto — incluindo nome, sobrenome e data de 
nascimento da pessoa — calcule e imprima a idade da pessoa (em anos), seu 
intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.
 */
package capitulo3.teste;

import capitulo3.HeartRates;
import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-07-26
 * @author irion.silva
 */
public class HeartRatesTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String pessoaNome;
        String pessoaSobrenome;
        int pessoaDia;
        int pessoaMes;
        int pessoaAno;
        int diaCorrente;
        int mesCorrente;
        int anoCorrente;
        
        System.out.println("\t Frequência cardíaca");
        System.out.println("\n");
        
        System.out.println("Informe a data(hoje):");
        System.out.print("Informe o ano:");
        anoCorrente = input.nextInt();
        System.out.print("Informe o mês:");
        mesCorrente = input.nextInt();
        System.out.print("Informe o dia:");
        diaCorrente = input.nextInt();
        
        System.out.print("\nInforme o nome:");
        pessoaNome = input.next();
        System.out.print("Informe o sobrenome:");
        pessoaSobrenome = input.next();
        System.out.print("Informe o ano de nascimento:");
        pessoaAno = input.nextInt();
        System.out.print("Informe o mês de nascimento:");
        pessoaMes = input.nextInt();
        System.out.print("Informe o dia de nascimento:");
        pessoaDia = input.nextInt();
        
        HeartRates hRates = new HeartRates(pessoaNome, pessoaSobrenome, pessoaAno, diaCorrente, pessoaAno, diaCorrente, pessoaAno, pessoaDia);
        
        //Chamada dos métodos:
        hRates.calcIdade();
        hRates.calcFCM();
        hRates.calcFCA();
        
        //Imprimir resultados:
        System.out.println("\nResultados do HeartRates \n");
        System.out.printf("Nome: %s %s\n", hRates.getNome(), hRates.getSobrenome());
        System.out.printf("Data de nascimento: %d/%d/%d \n", hRates.getDiaNasc(), hRates.getMesNasc(), hRates.getAnoNasc());
        System.out.printf("Idade: %d \n", hRates.getIdade());
        System.out.printf("Frequência Cardíaca Máxima: %d \n", hRates.getFcm());
        System.out.printf("Frequência Cardíaca Alvo: %.2f até %.2f \n", hRates.getFca1(), hRates.getFca2());
        System.out.println("\n");
       
        
        
    }

}
