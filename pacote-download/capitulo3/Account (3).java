/*3.11 (Classe Account modificada) Modifique a classe Account (Figura 3.8) para 
fornecer um método chamado withdraw que retira dinheiro de uma Account. Assegure
que o valor de débito não exceda o saldo de Account. Se exceder, o saldo deve ser
deixado inalterado e o método deve imprimir uma mensagem que indica "Withdrawal 
amount exceeded account balance" [Valor de débito excedeu o saldo da conta]. 
Modifique a classe AccountTest (Figura 3.9) para testar o método withdraw.
 */
package capitulo3;

/**
 * @version 1.0
 * @since 2021-07-21
 * @author irion-silva
 */
public class Account {
    //Atributos
    private String name;
    private double balance;
    
    //Construtor
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
        this.balance = balance;
    }
    
    //Métodos
    public void deposit(double depositAmount){
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }
    
    public void withDraw(double withDraw){
        if (withDraw > balance){
            System.out.println("Withdrawal amount exceeded account balance ");
        } else {
            balance = balance - withDraw;
            System.out.println("Successfully concluded.");
        }
    }
    
    //Getters & Setters
    public double getBalance(){
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
