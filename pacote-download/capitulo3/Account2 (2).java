/*3.15 (Removendo código duplicado no método main) Na classe AccountTest da 
Figura 3.9, o método main contém seis instruções (linhas 13 e 14, 15 e 16, 28 e 
29, 30 e 31, 40 e 41 e 42 e 43) e cada uma exibe name e balance do objeto 
Account. Estude essas instruções e você perceberá que elas só diferem no objeto 
Account sendo manipulado — account1 ou account2. Neste exercício, você definirá
um novo método displayAccount que contém uma cópia dessa instrução de saída. 
O parâmetro do método será um objeto Account e o método irá gerar name e balance
dele. Então você substituirá as seis instruções duplicadas em main por chamadas 
para displayAccount passando como argumento o objeto específico Account para 
saída. Modifique a classe AccountTest da Figura 3.9 para declarar o seguinte 
método displayAccount após a chave direita de fechamento de main e antes da 
chave direita de fechamento da classe AccountTest: 
public static void displayAccount(Account accountToDisplay)
{
 coloque aqui a instrução que exibe
 o name e o balance de accountToDisplay
}
Substitua o comentário no corpo do método por uma instrução que exiba name e 
balance de accountToDisplay. Lembre-se de que main é um método static, assim 
pode ser chamado sem antes criar um objeto da classe em que é declarado. Também 
declaramos o método displayAccount como um método static. Quando main tem de 
chamar outro método na mesma classe sem antes criar um objeto dela, o outro 
método também deve ser declarado static. Depois de concluir a declaração de 
displayAccount, modifique main para substituir as instruções que exibem name e 
balance de cada Account pelas chamadas para displayAccount — cada uma recebendo
como seu argumento o objeto account1 ou account2,como apropriado. Então, teste a 
classe AccountTest atualizada para garantir que ela produz a mesma saída como 
mostrado na Figura 3.9.
 */
package capitulo3;

/**
 * @version 1.0
 * @since 2021-07-23
 * @author irion-silva
 */
public class Account2 {

    //Atributos
    private String name;
    private double balance;

    //Construtor
    public Account2(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    //Métodos
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public void withDraw(double withDraw) {
        if (withDraw > balance) {
            System.out.println("Withdrawal amount exceeded account balance ");
        } else {
            balance = balance - withDraw;
            System.out.println("Successfully concluded.");
        }
    }

    //Getters & Setters
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
