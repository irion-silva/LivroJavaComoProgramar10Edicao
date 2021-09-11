/*4.28 (Outro problema do else oscilante) Modifique o código dado para produzir 
a saída mostrada em cada parte do problema. Utilize técnicas de recuo adequadas.
Não faça nenhuma alteração além de inserir chaves e alterar o recuo do código. 
O compilador ignora recuo em um programa Java. Eliminamos o recuo do código 
fornecido para tornar o problema mais desafiador. [Observação: é possível que 
nãoseja necessária nenhuma modificação para algumas das partes.]
if (y == 8)
if (x == 5)
System.out.println("@@@@@");
else
System.out.println("#####");
System.out.println("$$$$$");
System.out.println("&&&&&");
a) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
@@@@@
$$$$$
&&&&&
b) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
@@@@@
c) Supondo que x = 5 e y = 8, a seguinte saída é produzida:
@@@@@
d) Supondo que x = 5 e y = 7, a seguinte saída é produzida. [Observação: todas 
as três últimas instruções de saída depois do else são
partes de um bloco].
#####
$$$$$
&&&&&
 */
package capitulo4.teste;

/**
 * @version 1.0
 * @since 2021-09-10
 * @author irion-silva
 */
public class OutroProblemaDoElseOscilanteTest {

    public static void main(String[] args) {
        int x = 5, y = 8;
        if (y == 8){ 
        if (x == 5) 
        System.out.println("@@@@@");
        } else { 
        System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");
        }
    }

}
