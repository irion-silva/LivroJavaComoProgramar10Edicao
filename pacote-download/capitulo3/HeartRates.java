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
package capitulo3;

/**
 * @version 1.0
 * @since 2021-07-26
 * @author irion.silva
 */
public class HeartRates {

    private String nome;
    private String sobrenome;
    private int mesNasc;
    private int diaNasc;
    private int anoNasc;
    private int diaAtual;
    private int mesAtual;
    private int anoAtual;
    
    private int idade;
    private int fcm;
    private double fca1;
    private double fca2;

    //Construtor
    public HeartRates(String nome, String sobrenome, int mesNasc, int diaNasc, int anoNasc, int diaAtual, int mesAtual, int anoAtual) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.mesNasc = mesNasc;
        this.diaNasc = diaNasc;
        this.anoNasc = anoNasc;
        this.diaAtual = diaAtual;
        this.mesAtual = mesAtual;
        this.anoAtual = anoAtual;
    }

    //Métodos
    public int calcIdade() {
        if (this.anoAtual > this.anoNasc) {
            if (this.mesAtual > this.mesNasc) {
                this.idade = this.anoAtual - this.anoNasc;
            } else if (this.mesAtual == this.mesNasc){
                if (this.diaAtual >= this.diaNasc){
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
    
    public void calcFCA(){
        this.fca1 = this.fcm * 0.5;
        this.fca2 = this.fcm * 0.85;
        
    }

    //Métodos Acessores
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public int getDiaAtual() {
        return diaAtual;
    }

    public int getMesAtual() {
        return mesAtual;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public int getIdade() {
        return idade;
    }

    public int getFcm() {
        return fcm;
    }

    public double getFca1() {
        return fca1;
    }

    public double getFca2() {
        return fca2;
    }

}
