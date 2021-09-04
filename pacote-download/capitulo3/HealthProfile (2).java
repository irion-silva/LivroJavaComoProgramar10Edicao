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
package capitulo3;

/**
 * @version 1.0
 * @since 2021-07-29
 * @author irion.silva
 */
public class HealthProfile {

    private String nome;
    private String sobrenome;
    private char sexo;
    private int anoNasc;
    private int mesNasc;
    private int diaNasc;
    private int anoAtual;
    private int mesAtual;
    private int diaAtual;
    private int idade;
    private double altura;
    private double peso;
    private int fcm;
    private double fca1;
    private double fca2;
    private double IMC;

    //Construtor
    public HealthProfile(String nome, String sobrenome, char sexo, int anoNasc, int mesNasc, int diaNasc, int anoAtual, int mesAtual, int diaAtual, double altura, double peso) {    
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.anoNasc = anoNasc;
        this.mesNasc = mesNasc;
        this.diaNasc = diaNasc;
        this.anoAtual = anoAtual;
        this.mesAtual = mesAtual;
        this.diaAtual = diaAtual;
        this.altura = altura;
        this.peso = peso;
    }

    //Métodos
    public int calcIdade() {
        if (this.anoAtual > this.anoNasc) {
            if (this.mesAtual > this.mesNasc) {
                this.idade = this.anoAtual - this.anoNasc;
            } else if (this.mesAtual == this.mesNasc) {
                if (this.diaAtual >= this.diaNasc) {
                    this.idade = this.anoAtual - this.anoNasc;
                } else {
                    this.idade = this.anoAtual - this.anoNasc - 1;
                }
            }
        }
        return idade;
    }

    public int calcFCM() {
        this.fcm = 220 - this.idade;

        return fcm;
    }

    public void calcFCA() {
        this.fca1 = this.fcm * 0.5;
        this.fca2 = this.fcm * 0.85;

    }
    
    public void calcIMC(){
        IMC = peso/(Math.pow(altura, 2));
        
        if (IMC < 18.5){
            System.out.printf("Seu IMC é: %f - Abaixo do peso%n", IMC);
        }
        
        if (IMC >= 18.5 && IMC <= 24.9){
            System.out.printf("Seu IMC é: %f - Normal%n", IMC);
        }
        
        if (IMC >= 25 && IMC <= 29.9){
            System.out.printf("Seu IMC é: %f - Acima do peso%n", IMC);
        }
        
        if (IMC >= 30){
            System.out.printf("Seu IMC é: %f - Obeso%n", IMC);
        }
    }

    //Métodos Getters & Setters
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getMesAtual() {
        return mesAtual;
    }

    public void setMesAtual(int mesAtual) {
        this.mesAtual = mesAtual;
    }

    public int getDiaAtual() {
        return diaAtual;
    }

    public void setDiaAtual(int diaAtual) {
        this.diaAtual = diaAtual;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getFcm() {
        return fcm;
    }

    public void setFcm(int fcm) {
        this.fcm = fcm;
    }

    public double getFca1() {
        return fca1;
    }

    public void setFca1(double fca1) {
        this.fca1 = fca1;
    }

    public double getFca2() {
        return fca2;
    }

    public void setFca2(double fca2) {
        this.fca2 = fca2;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }
    

}
