/*3.12 (Classe Invoice) Crie uma classe chamada Invoice para que uma loja de 
suprimentos de informática a utilize para representar uma fatura de um item 
vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações 
como variáveis de instância — o número (tipo String), a descrição (tipo String),
a quantidade comprada de um item (tipo int) e o preço por item (double). Sua
classe deve ter um construtor que inicializa as quatro variáveis de instância. 
Forneça um método set e um get para cada variável de instância. Além disso, 
forneça um método chamado getInvoiceAmount que calcula o valor de fatura 
(isto é, multiplica a quantidade pelo preço por item) e depois retorna esse valor
como double. Se a quantidade não for positiva, ela deve ser configurada como 0. 
Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva
um aplicativo de teste chamado InvoiceTest que demonstra as capacidades da classe
Invoice.
 */
package capitulo3;

/**
 * @version 1.0
 * @since 2021-07-21
 * @author irion-silva
 */
public class Invoice {
    //Atributos
    private String numero;
    private String descricao;
    private int qtdItensComprado;
    private double precoItem;
    private double InvoiceAmount;
    
    //Construtor

    public Invoice(String numero, String descricao, int qtdItensComprado, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdItensComprado = qtdItensComprado;
        this.precoItem = precoItem;
    }
    
    //Métodos
    public double getInvoiceAmount(int qtdItensComprado, double precoItem ){
        if (qtdItensComprado < 0){
            qtdItensComprado = 0;
        }
        
        if (precoItem < 0.0) {
            precoItem = 0.0;
        }
        
        InvoiceAmount = qtdItensComprado * precoItem;
        
        return InvoiceAmount;
    }
    
    //Getters & Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdItensComprado() {
        return qtdItensComprado;
    }

    public void setQtdItensComprado(int qtdItensComprado) {
        this.qtdItensComprado = qtdItensComprado;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public double InvoiceAmount() {
        return InvoiceAmount;
    }

    public void GetInvoiceAmount(double InvoiceAmount) {
        this.InvoiceAmount = InvoiceAmount;
    }
    
    //toString

    @Override
    public String toString() {
        return "Invoice{" + "Número=" + numero + ", Descrição=" + descricao + ", Quantidade de Itens comprado=" + qtdItensComprado + ", Preço por Item=" + precoItem + '}';
    }
    
    
    
}
