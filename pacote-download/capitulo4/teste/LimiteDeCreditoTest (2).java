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
package capitulo4.teste;

import capitulo4.LimiteDeCredito;
import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-08-31
 * @author irion-silva
 */
public class LimiteDeCreditoTest {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
		LimiteDeCredito d = new LimiteDeCredito();

		System.out.print("Número da conta:");
		d.setNumConta(input.nextInt());

		System.out.print("Saldo no início do mês:");
		d.setSaldoInicioMes(input.nextInt());

		System.out.print("Total de todos os itens cobrados no mês:");
		d.setTotItensMes(input.nextInt());

		System.out.print("Total de créditos no mês:");
		d.setTotCreditosMes(input.nextInt());

		System.out.print("Limite de crédito autorizado:");
		d.setLimiteCredito(input.nextInt());
		
		d.setSaldoInicioMes(d.getSaldoInicioMes()+d.getTotItensMes()-d.getTotCreditosMes());
		if(d.getTotCreditosMes()>d.getLimiteCredito())
			System.out.println("Limite de crédito excedido.");
	}
}
