/*4.33 (Múltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na janela de comando os múltiplos do inteiro 2
— a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop não deve terminar (isto é, deve criar um loop infinito). O que acontece quando
você executa esse programa?
 */
package capitulo4.teste;

/**
 * @version 1.0
 * @since 2021-09-27
 * @author irion-silva
 */
public class LoopInfinitoForTest {

    public static void main(String[] args) {
    int inteiro = 2;
        for(;;){
            System.out.println(inteiro);
            inteiro *= 2;
        }
    
    }
}

