/*4.18 (Calculador de limite de crédito) Desenvolva um aplicativo Java que 
determina se um cliente de uma loja de departamentos excedeu o limite de crédito
em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis:
a) Número de conta.
b) Saldo no início do mês.
c) Total de todos os itens cobrados desse cliente no mês.
d) Total de créditos aplicados ao cliente no mês.
e) Limite de crédito autorizado.
O programa deve inserir todos esses dados como inteiros, calcular o novo saldo 
(= saldo inicial + despesas – créditos), exibir o novo saldo e determinar se o 
novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo 
limite de crédito foi excedido, o programa deve exibir a mensagem "Limite de 
crédito excedido".
 */
package capitulo4;

/**
 * @version 1.0
 * @since 2021-08-29
 * @author irion-silva
 */
public class LimiteDeCredito {
    //Atributos
    private int numConta;
    private int saldoInicioMes;
    private int totItensMes;
    private int totCreditosMes;
    private int limiteCredito;
    

    //Métodos Acessores
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getSaldoInicioMes() {
        return saldoInicioMes;
    }

    public void setSaldoInicioMes(int saldoInicioMes) {
        this.saldoInicioMes = saldoInicioMes;
    }

    public int getTotItensMes() {
        return totItensMes;
    }

    public void setTotItensMes(int totItensMes) {
        this.totItensMes = totItensMes;
    }

    public int getTotCreditosMes() {
        return totCreditosMes;
    }

    public void setTotCreditosMes(int totCreditosMes) {
        this.totCreditosMes = totCreditosMes;
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
