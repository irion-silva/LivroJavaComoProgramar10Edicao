/*4.22 (Saída no formato de tabela) Escreva um aplicativo Java que utiliza um 
loop para imprimir a seguinte tabela de valores:
N | 10*N | 100*N |  1000*N
1 | 10   | 100   |  1000
2 | 20   | 200   |  2000
3 | 30   | 300   |  3000
4 | 40   | 400   |  4000
5 | 50   | 500   |  5000
 */
package capitulo4.teste;

/**
 * @version 1.0
 * @since 2021-09-05
 * @author irion-silva
 */
public class SaidaFormatoTabelaTest {

    public static void main(String[] args) {
        int contador;
        System.out.println("N\t10*N\t100*N\t1000*N");
        
        for (contador = 1; contador <= 5; contador++) {
            System.out.println(contador*1+"\t"+contador*10+"\t"+contador*100+"\t"+contador*1000+"\t");
        }
    }
}
