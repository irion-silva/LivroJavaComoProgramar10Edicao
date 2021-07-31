/*3.17 (Computadorização dos registros de saúde) Uma questão relacionada à 
assistência médica discutida ultimamente nos veículos de comunicação é a 
computadorização dos registros de saúde. Essa possibilidade está sendo abordada 
de maneira cautelosa por causa de preocupações quanto à privacidade e à 
segurança de dados sigilosos, entre outros motivos. [Iremos discutir essas 
preocupações em exercícios posteriores.] A computadorização dos registros de 
saúde pode facilitar que pacientes compartilhem seus perfis e históricos de 
saúde entre vários profissionais de saúde. Isso talvez aprimore a qualidade da 
assistência médica, ajude a evitar conflitos e prescrições erradas de 
medicamentos, reduza custos em ambulatórios e salve vidas. Neste exercício, 
você projetará uma classe HealthProfile “inicial” para uma pessoa. Os atributos 
da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo 
em atributos separados para mês, dia e ano de nascimento), altura (em metros) e 
peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba 
esses dados. Para cada atributo, forneça métodos set e get. A classe também deve
incluir métodos que calculem e retornem a idade do usuário em anos, intervalo de
frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), 
além de índice de massa corporal (IMC; veja o Exercício 2.33). Escreva um 
aplicativo Java que solicite as informações da pessoa, instancie um objeto da 
classe HealthProfile para ela e imprima as informações a partir desse objeto — 
incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––,
e então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca
máxima e frequência cardíaca alvo. Ele também deve exibir o gráfico de valores 
IMC do Exercício 2.33.
 */
package capitulo3.teste;

import capitulo3.HealthProfile;
import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-07-29
 * @author irion.silva
 */
public class HealthProfileTest {

    public static void main(String[] args) {
        String nome;
        String sobrenome;
        char sexo;
        int anoNasc;
        int mesNasc;
        int diaNasc;
        int anoAtual;
        int mesAtual;
        int diaAtual;
        double altura;
        double peso;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("\t Health Profile:");
        System.out.println("\n");
        
        
        System.out.print("Informe o nome:");
        nome = input.next();
        System.out.print("Informe o sobrenome:");
        sobrenome = input.next();
        System.out.print("Informe o sexo\nf.Feminino\nm.Masculino:");
        sexo = input.next().charAt(0);
        System.out.print("Informe a altura(m):");
        altura = input.nextDouble();
        System.out.print("Informe o peso(kg):");
        peso = input.nextDouble();
        System.out.print("Informe o ano de nascimento:");
        anoNasc = input.nextInt();
        System.out.print("Informe o mês de nascimento:");
        mesNasc = input.nextInt();
        System.out.print("Informe o dia de nascimento:");
        diaNasc = input.nextInt();
        System.out.print("Informe o ano atual:");
        anoAtual = input.nextInt();
        System.out.print("Informe o mês atual:");
        mesAtual = input.nextInt();
        System.out.print("Informe o dia atual:");
        diaAtual = input.nextInt();
        
        
        HealthProfile hProfile = new HealthProfile(nome, sobrenome, sexo, anoNasc, mesNasc, diaNasc, anoAtual, mesAtual, diaAtual, altura, peso);
        
        //Chamada dos métodos:
        hProfile.calcIdade();
        hProfile.calcFCM();
        hProfile.calcFCA();
        
        //Imprimir resultados:
        System.out.println("\nResultados do HealthProfile \n");
        System.out.printf("Nome: %s %s\n", hProfile.getNome(), hProfile.getSobrenome());
        System.out.printf("Data de nascimento: %d/%d/%d \n", hProfile.getDiaNasc(), hProfile.getMesNasc(), hProfile.getAnoNasc());
        System.out.printf("Idade: %d \n", hProfile.getIdade());
        System.out.printf("Frequência Cardíaca Máxima: %d \n", hProfile.getFcm());
        System.out.printf("Frequência Cardíaca Alvo: %.2f até %.2f \n", hProfile.getFca1(), hProfile.getFca2());
        hProfile.calcIMC();
        System.out.println("\n");
    }

}
