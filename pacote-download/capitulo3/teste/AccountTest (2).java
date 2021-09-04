/*3.11 (Classe Account modificada) Modifique a classe Account (Figura 3.8) para 
fornecer um método chamado withdraw que retira dinheiro de uma Account. Assegure
que o valor de débito não exceda o saldo de Account. Se exceder, o saldo deve ser
deixado inalterado e o método deve imprimir uma mensagem que indica "Withdrawal 
amount exceeded account balance" [Valor de débito excedeu o saldo da conta]. 
Modifique a classe AccountTest (Figura 3.9) para testar o método withdraw.
 */
package capitulo3.teste;

import capitulo3.Account;

/**
 * @version 1.0
 * @since 2021-07-21
 * @author irion-silva
 */
public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account("Caio", 150.00);
        
        account.withDraw(150);
        
        System.out.printf("Account balance: %.2f%n", account.getBalance());
        
    }

}
